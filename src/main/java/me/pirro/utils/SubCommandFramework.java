package me.pirro.utils;

import com.google.common.collect.Lists;
import lombok.Getter;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.server.TabCompleteEvent;
import org.bukkit.permissions.Permissible;
import org.bukkit.plugin.java.JavaPlugin;

import java.beans.ConstructorProperties;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.logging.Level;

public abstract class SubCommandFramework extends CommandFramework
{
	private Map<String, SubCommandPiece> subCommands;

	public SubCommandFramework(JavaPlugin plugin, String label)
	{
		super(plugin, label);
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	public SubCommandFramework(JavaPlugin plugin, String label, String... aliases)
	{
		super(plugin, label, aliases);
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		this.subCommands = new TreeMap(String.CASE_INSENSITIVE_ORDER);
		Method[] var7;
		int var6 = (var7 = this.getClass().getDeclaredMethods()).length;

		for (int var5 = 0; var5 < var6; ++var5)
		{
			Method method = var7[var5];
			if (method.getAnnotation(SubCommandFramework.SubCommand.class) != null)
			{
				String subCommandName = ((SubCommandFramework.SubCommand) method.getAnnotation(SubCommandFramework.SubCommand.class)).value();
				String subCommandDescription = method.getAnnotation(SubCommandFramework.SubCommandDescription.class) != null ? ((SubCommandFramework.SubCommandDescription) method.getAnnotation(SubCommandFramework.SubCommandDescription.class)).value() : null;
				String subCommandPermission = method.getAnnotation(SubCommandFramework.SubCommandPermission.class) != null ? ((SubCommandFramework.SubCommandPermission) method.getAnnotation(SubCommandFramework.SubCommandPermission.class)).value() : null;
				String subCommandNoPermissionMessage = method.getAnnotation(SubCommandFramework.SubCommandNoPermissionMessage.class) != null ? ((SubCommandFramework.SubCommandNoPermissionMessage) method.getAnnotation(SubCommandFramework.SubCommandNoPermissionMessage.class)).value() : null;
				String subCommandUsage = method.getAnnotation(SubCommandFramework.SubCommandUsage.class) != null ? ((SubCommandFramework.SubCommandUsage) method.getAnnotation(SubCommandFramework.SubCommandUsage.class)).value() : null;
				int minArgs = method.getAnnotation(SubCommandFramework.SubCommandMinArgs.class) != null ? ((SubCommandFramework.SubCommandMinArgs) method.getAnnotation(SubCommandFramework.SubCommandMinArgs.class)).value() : 0;

				try
				{
					method.setAccessible(true);
					Class[] params = method.getParameterTypes();
					if (params == null || params.length != 3 || params[0] != CommandSender.class || params[1] != String.class || params[2] != String[].class)
					{
						throw new IllegalArgumentException("I parametri del sottocomando devono essere 3, in ordine: CommandSender (sender), String (label), String[] (args)");
					}

					SubCommandFramework.SubCommandPiece piece = new SubCommandFramework.SubCommandPiece(subCommandName, method, subCommandPermission, subCommandNoPermissionMessage, subCommandUsage, minArgs, subCommandDescription);
					this.subCommands.put(subCommandName.toLowerCase(), piece);
				}
				catch (Exception var15)
				{
					plugin.getLogger().log(Level.SEVERE, "Impossibile aggiungere il sottocomando " + subCommandName, var15);
				}
			}
		}

	}

	public final void execute(CommandSender sender, String label, String[] args)
	{
		if (args.length == 0)
		{
			this.noArgs(sender);
		}
		else
		{
			String subCommandName = args[0].toLowerCase();
			SubCommandFramework.SubCommandPiece piece = (SubCommandFramework.SubCommandPiece) this.subCommands.get(subCommandName);
			if (piece != null)
			{
				try
				{
					if (piece.permission != null && !sender.hasPermission(piece.permission))
					{
						if (piece.noPermissionMessage != null)
						{
							sender.sendMessage(piece.noPermissionMessage);
						}
						else
						{
							sender.sendMessage(org.bukkit.ChatColor.RED + "Non hai il permesso per usare questo sotto-comando.");
						}

						return;
					}

					String[] subArgs = (String[]) Arrays.copyOfRange(args, 1, args.length);
					if (subArgs.length < piece.minArgs)
					{
						sender.sendMessage(ChatColor.RED + "Parametri errati! Utilizza: " + ChatColor.GRAY + "/" + label + " " + subCommandName + (piece.usage != null ? " " + piece.usage : ""));
						return;
					}

					piece.method.invoke(this, sender, label, Arrays.copyOfRange(args, 1, args.length));
				}
				catch (InvocationTargetException var7)
				{
					if (var7.getTargetException() instanceof ExecuteException)
					{
						throw (ExecuteException) var7.getTargetException();
					}

					throw new RuntimeException(var7.getTargetException());
				}
				catch (Exception var8)
				{
					throw new RuntimeException(var8);
				}
			}
			else
			{
				this.tellUnknownSubCommand(sender, label);
			}

		}
	}

	public abstract void noArgs(CommandSender var1);

	public void tellUnknownSubCommand(CommandSender sender, String label)
	{
		sender.sendMessage(ChatColor.RED + "Sotto-comando sconosciuto. Scrivi /" + label + " per ottenere aiuto.");
	}

	protected final List<SubCommandDetails> getSubCommands()
	{
		List<SubCommandFramework.SubCommandDetails> list = com.google.common.collect.Lists.newArrayList();
		Iterator var3 = this.subCommands.values().iterator();

		while (var3.hasNext())
		{
			SubCommandFramework.SubCommandPiece subCommand = (SubCommandFramework.SubCommandPiece) var3.next();
			list.add(new SubCommandFramework.SubCommandDetails(subCommand.name, subCommand.permission, subCommand.usage, subCommand.description));
		}

		return list;
	}

	protected final List<SubCommandFramework.SubCommandDetails> getAccessibleSubCommands(Permissible permissible)
	{
		List<SubCommandFramework.SubCommandDetails> list = Lists.newArrayList();
		Iterator var4 = this.subCommands.values().iterator();

		while (true)
		{
			SubCommandFramework.SubCommandPiece subCommand;
			do
			{
				if (!var4.hasNext())
				{
					return list;
				}

				subCommand = (SubCommandFramework.SubCommandPiece) var4.next();
			}
			while (subCommand.permission != null && !permissible.hasPermission(subCommand.permission));

			list.add(new SubCommandFramework.SubCommandDetails(subCommand.name, subCommand.permission, subCommand.usage, subCommand.description));
		}
	}

	public void sendHelp(CommandSender sender)
	{

		boolean has = false;

		for (SubCommandDetails sub : this.getAccessibleSubCommands(sender))
		{
			if (sub.getPermission() == null || sender.hasPermission(sub.getPermission()))
			{
				has = true;
				break;
			}
		}

		Validator.notCondition(has, "Non hai il permesso per eseguire questo comando!");

		sender.sendMessage("");
		sender.sendMessage(ChatColor.GOLD + " " + ChatColor.BOLD + "Lista comandi" + ChatColor.RESET + " " + ChatColor.GOLD + "(/" + this.label + ")");
		for (SubCommandDetails sub : this.getAccessibleSubCommands(sender))
		{
			if (sub.getPermission() == null || sender.hasPermission(sub.getPermission()))
				sender.spigot().sendMessage(new TextComponent(" " + ChatColor.DARK_GRAY + " ▪ " + ChatColor.AQUA), new TextComponentBuilder().setText("/" + this.label + " " + sub.getName() + (sub.getUsage() != null ? " " + sub.getUsage() : "")).setColor(net.md_5.bungee.api.ChatColor.AQUA).setHover(ChatColor.AQUA + "/" + this.label + " " + sub.getName() + (sub.getUsage() != null ? " " + sub.getUsage() : "") + "\n" + ChatColor.GRAY + sub.getDescription()).setSuggestCommand("/" + this.label + " " + sub.getName() + " ").build());
		}
		sender.sendMessage(ChatColor.GRAY + " Passa la freccia per più informazioni.");
		sender.sendMessage("");
	}

	@Retention(RetentionPolicy.RUNTIME) @Target({ ElementType.METHOD }) public @interface SubCommand
	{
		String value();
	}

	public static class SubCommandDetails
	{
		@Getter private String name;
		@Getter private String permission;
		@Getter private String usage;
		@Getter private String description;

		@ConstructorProperties({ "name", "permission", "usage", "description" }) public SubCommandDetails(String name, String permission, String usage, String description)
		{
			this.name = name;
			this.permission = permission;
			this.usage = usage;
			this.description = description;
		}
	}

	@Retention(RetentionPolicy.RUNTIME) @Target({ ElementType.METHOD }) public @interface SubCommandMinArgs
	{
		int value();
	}

	@Retention(RetentionPolicy.RUNTIME) @Target({ ElementType.METHOD }) public @interface SubCommandNoPermissionMessage
	{
		String value();
	}

	@Retention(RetentionPolicy.RUNTIME) @Target({ ElementType.METHOD }) public @interface SubCommandPermission
	{
		String value();
	}

	private static class SubCommandPiece
	{
		private String name;
		private Method method;
		private String permission;
		private String noPermissionMessage;
		private String usage;
		private String description;
		private int minArgs;

		@ConstructorProperties({ "name", "method", "permission", "noPermissionMessage", "usage", "minArgs" }) public SubCommandPiece(String name, Method method, String permission, String noPermissionMessage, String usage, int minArgs, String description)
		{
			this.name = name;
			this.method = method;
			this.permission = permission;
			this.noPermissionMessage = noPermissionMessage;
			this.usage = usage;
			this.minArgs = minArgs;
			this.description = description;
		}
	}

	@Retention(RetentionPolicy.RUNTIME) @Target({ ElementType.METHOD }) public @interface SubCommandUsage
	{
		String value();
	}

	@Retention(RetentionPolicy.RUNTIME) @Target({ ElementType.METHOD }) public @interface SubCommandDescription
	{
		String value();
	}

	@EventHandler(priority = EventPriority.MONITOR) public void registerSuggestions(TabCompleteEvent event)
	{
		String[] a = event.getBuffer().split(" ");
		CommandSender sender = event.getSender();
		if (a.length > 2)
			return;
		List<String> labels = new ArrayList<>(plugin.getCommand(label).getAliases());
		labels.add(label);

		for (String l : labels)
			if (event.getBuffer().toLowerCase().startsWith("/" + l + " "))
			{
				List<String> completions = new ArrayList<>();
				event.getCompletions().clear();
				for (SubCommandDetails sub : this.getAccessibleSubCommands(sender))
					if (sub.getPermission() == null || sender.hasPermission(sub.getPermission()))
						completions.add(sub.getName());
				event.setCompletions(getCompletions(event.getBuffer(), completions));
				return;
			}

	}

	private List<String> getCompletions(String label, String... completions)
	{
		List<String> suggest = new ArrayList<>();

		for (String query : completions)
		{
			String[] x = label.toLowerCase().split(" ");

			if (x.length == 1)
			{
				suggest.addAll(Arrays.asList(completions));
				break;
			}
			if (x.length > 2)
				return suggest;

			if (query.toLowerCase().equals(x[1].toLowerCase()))
				return suggest;

			if (x[1].equals(""))
				suggest.addAll(Arrays.asList(completions));

			if (query.toLowerCase().startsWith(x[1].toLowerCase()))
				suggest.add(query);
		}
		return suggest;
	}

	private List<String> getCompletions(String label, List<String> completions)
	{
		List<String> suggest = new ArrayList<>();

		for (String query : completions)
		{
			String[] x = label.toLowerCase().split(" ");

			if (x.length == 1)
			{
				suggest.addAll(completions);
				break;
			}
			if (x.length > 2)
				return suggest;

			if (query.toLowerCase().equals(x[1].toLowerCase()))
				return suggest;

			if (x[1].equals(""))
				suggest.addAll(completions);

			if (query.toLowerCase().startsWith(x[1].toLowerCase()))
				suggest.add(query);
		}
		return suggest;
	}
}