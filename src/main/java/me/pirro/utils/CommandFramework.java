package me.pirro.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Wrapper for the default command executor.
 */
public abstract class CommandFramework implements Listener, CommandExecutor {
	protected JavaPlugin plugin;
	protected String label;

	public CommandFramework(JavaPlugin plugin, String label) {
		this.plugin = plugin;
		this.label = label;
		PluginCommand pluginCommand = plugin.getCommand(label);
		if (pluginCommand == null) {
			try {
				CommandMap commandMap = (CommandMap)ReflectionUtils.getPrivateField(Bukkit.getPluginManager(), "commandMap");
				Constructor<PluginCommand> commandConstructor = PluginCommand.class.getDeclaredConstructor(String.class, Plugin.class);
				commandConstructor.setAccessible(true);
				pluginCommand = commandConstructor.newInstance(label, plugin);

				if (!commandMap.register(plugin.getName(), pluginCommand)) {
					throw new RuntimeException("Impossibile sovrascrivere un comando esistente.");
				}
			} catch (Exception var11) {
				var11.printStackTrace();
				Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Impossibile registrare al volo il comando " + label + "");
				return;
			}
		}

		pluginCommand.setExecutor(this);

	}

	public CommandFramework(JavaPlugin plugin, String label, String... aliases) {
		this.plugin = plugin;
		this.label = label;
		PluginCommand pluginCommand = plugin.getCommand(label);
		if (pluginCommand == null) {
			try {
				CommandMap commandMap = (CommandMap)ReflectionUtils.getPrivateField(Bukkit.getPluginManager(), "commandMap");
				Constructor<PluginCommand> commandConstructor = PluginCommand.class.getDeclaredConstructor(String.class, Plugin.class);
				commandConstructor.setAccessible(true);
				pluginCommand = commandConstructor.newInstance(label, plugin);
				if (aliases != null && aliases.length > 0) {
					int var8 = aliases.length;
					int var9 = 0;

					while(true) {
						if (var9 >= var8) {
							pluginCommand.setAliases(Arrays.asList(aliases));
							break;
						}

						String alias = aliases[var9];
						if (alias == null || alias.isEmpty()) {
							throw new RuntimeException("Alias vuoto o nullo.");
						}

						if (alias.contains(":")) {
							throw new RuntimeException("Caratteri illegali presenti negli alias.");
						}

						++var9;
					}
				}

				if (!commandMap.register(plugin.getName(), pluginCommand)) {
					throw new RuntimeException("Impossibile sovrascrivere un comando esistente");
				}
			} catch (Exception var11) {
				var11.printStackTrace();
				Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Impossibile registrare al volo il comando " + label + "");
				return;
			}
		}

		pluginCommand.setExecutor(this);

	}

	public final boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		try {
			this.execute(sender, label, args);
		} catch (CommandFramework.ExecuteException var6) {
			if (var6.getMessage() != null && !var6.getMessage().isEmpty()) {
				sender.sendMessage(ChatColor.RED + var6.getMessage());
			}
		}

		return true;
	}
	public abstract void execute(CommandSender var1, String var2, String[] var3);

	public static class Validator {

		// Verifica che un oggetto sia uguale a null
		public static void notNull(Object o, String msg) {
			if (o == null) {
				throw new CommandFramework.ExecuteException(msg);
			}
		}

		// Verifica una condizione specificata
		public static void Condition(boolean condition, String errorMessage) {
			if (condition) {
				throw new CommandFramework.ExecuteException(errorMessage);
			}
		}

		// Verifica una condizione specificata, negandola
		public static void notCondition(boolean condition, String errorMessage) {
			if (!condition) {
				throw new CommandFramework.ExecuteException(errorMessage);
			}
		}

		// Verifica una condizione specificata inviando un messaggio in JSON
		public static void ConditionJson(boolean condition, String json, Player player) {
			if (condition) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "tellraw " + player.getName() + " " + json);
				throw new CommandFramework.ExecuteException((String)null);
			}
		}

		// Verifica che il CommandSender sia un'istanza Player
		public static Player getPlayerSender(CommandSender sender) {
			if (sender instanceof Player) {
				return (Player)sender;
			} else {
				throw new CommandFramework.ExecuteException("Questo comando non è eseguibile da CONSOLE.");
			}
		}

		// Verifica che una stringa sia convertibile in intero e faccia parte di un intervallo
		public static double getDoubleInterval(String input, double min, double max) {
			try {
				double a = Double.parseDouble(input);
				if(a >= min && a <= max) return a;
				else throw new CommandFramework.ExecuteException("Il numero inserito deve appartenere all'intervallo " + min + " - " + max + ".");
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il numero inserito non è valido.");
			}
		}

		// Verifica che una stringa sia convertibile in double e in caso lo ritorna
		public static double getDouble(String input) {
			try {
				return Double.parseDouble(input);
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il numero inserito non è valido.");
			}
		}

		// Verifica che una stringa sia convertibile in double e in caso lo ritorna
		public static double getDouble(String input, String campo) {
			try {
				return Double.parseDouble(input);
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il campo <" + campo + "> deve contenere un valore numerico valido.");
			}
		}

		// Verifica che una stringa sia convertibile in intero e faccia parte di un intervallo
		public static int getIntegerInterval(String input, int min, int max) {
			try {
				int a = Integer.parseInt(input);
				if(a >= min && a <= max) return a;
				else throw new CommandFramework.ExecuteException("Il numero inserito deve appartenere all'intervallo " + min + " - " + max + ".");
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il numero inserito non è valido.");
			}
		}

		// Verifica che una stringa sia convertibile in intero e in caso lo ritorna
		public static int getInteger(String input) {
			try {
				return Integer.parseInt(input);
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il numero inserito non è valido.");
			}
		}

		// Verifica che una stringa sia convertibile in intero e in caso lo ritorna
		public static int getInteger(String input, String campo) {
			try {
				return Integer.parseInt(input);
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il campo <" + campo + "> deve contenere un valore numerico valido.");
			}
		}

		/** @deprecated **/
		// Verifica che una stringa sia convertibile in intero
		public static void isInteger(String input) {
			try {
				Integer.parseInt(input);
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il campo deve contenere un valore numerico valido.");
			}
		}

		/** @deprecated **/
		// Verifica che una stringa sia convertibile in intero
		public static void isInteger(String input, String campo) {
			try {
				Integer.parseInt(input);
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il campo " + campo + " deve contenere un valore numerico valido.");
			}
		}

		/** @deprecated **/
		// Verifica che una stringa sia convertibile in double
		public static void isDouble(String input) {
			try {
				Double.parseDouble(input);
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il campo deve contenere un valore numerico valido.");
			}
		}

		/** @deprecated **/
		// Verifica che una stringa sia convertibile in double
		public static void isDouble(String input, String campo) {
			try {
				Double.parseDouble(input);
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il campo " + campo + " deve contenere un valore numerico valido.");
			}
		}

		// Verifica che una stringa sia convertibile in intero e sia positivo e in caso lo ritorna
		public static int getPositiveInteger(String input) {
			try {
				int i = Integer.parseInt(input);
				if (i < 0) {
					throw new CommandFramework.ExecuteException("Devi inserire un numero positivo.");
				} else {
					return i;
				}
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il numero inserito non è valido.");
			}
		}

		// Verifica che una stringa sia convertibile in intero e sia positivo e in caso lo ritorna
		public static int getPositiveInteger(String input, String campo) {
			try {
				int i = Integer.parseInt(input);
				if (i < 0) {
					throw new CommandFramework.ExecuteException("Il campo <" + campo + "> deve contenere un valore positivo.");
				} else {
					return i;
				}
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il campo <" + campo + "> deve contenere un valore numerico valido.");
			}
		}

		// Verifica che una stringa sia convertibile in intero e sia positivo e diverso da zero e in caso lo ritorna
		public static int getPositiveIntegerNotZero(String input) {
			try {
				int i = Integer.parseInt(input);
				if (i <= 0) {
					throw new CommandFramework.ExecuteException("Devi inserire un numero positivo.");
				} else {
					return i;
				}
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il numero inserito non è valido.");
			}
		}

		// Verifica che una stringa sia convertibile in intero e sia positivo e diverso da zero e in caso lo ritorna
		public static int getPositiveIntegerNotZero(String input, String campo) {
			try {
				int i = Integer.parseInt(input);
				if (i <= 0) {
					throw new CommandFramework.ExecuteException("Il campo <" + campo + "> deve contenere un valore positivo.");
				} else {
					return i;
				}
			} catch (NumberFormatException var2) {
				throw new CommandFramework.ExecuteException("Il campo <" + campo + "> deve contenere un valore numerico valido.");
			}
		}

		// Verifica che un array abbia una determinata lunghezza
		public static void minLength(Object[] array, int minLength, String msg) {
			if (array.length < minLength) {
				throw new CommandFramework.ExecuteException(msg);
			}
		}

		// Verifica che un Player abbia un determinato permesso
		public static void Permission(Player player, String permission) {
			if (!player.hasPermission(permission)) {
				if(player.hasPermission("tecnoutils.admin")) throw new CommandFramework.ExecuteException("Non hai il permesso §7" + permission + "§c!");
				throw new CommandFramework.ExecuteException("Non hai il permesso per eseguire questo comando!");
			}
		}

		// Verifica che un Sender abbia un determinato permesso
		public static void Permission(CommandSender sender, String permission) {
			if (!sender.hasPermission(permission)) {
				if(sender.hasPermission("tecnoutils.admin")) throw new CommandFramework.ExecuteException("Non hai il permesso §7" + permission + "§c!");
				throw new CommandFramework.ExecuteException("Non hai il permesso per eseguire questo comando!");
			}
		}

		// Verifica che il blocco guardato dal player sia di Material {type} e in caso lo ritorna
		public static Block getTargetBlock(Player player, Material type) {
			Block targetBlock = player.getTargetBlock((Set<Material>) null, 64);
			Validator.notCondition(targetBlock != null && targetBlock.getType() == type, ChatColor.RED + "Devi guardare " + type + " per eseguire questo comando!");
			return targetBlock;
		}

		// Verifica che Player stia guardando un blocco e in caso lo ritorna
		public static Block getTargetBlock(Player player) {
			Block targetBlock = player.getTargetBlock((Set<Material>) null, 64);
			Validator.notCondition(targetBlock != null, ChatColor.RED + "Devi guardare un blocco per eseguire questo comando!");
			return targetBlock;
		}

		// Verifica da una stringa che il player esista e sia online e in caso lo ritorna
		public static Player getOnlinePlayer(String player) {
			if(Bukkit.getPlayer(player) != null) {
				return Bukkit.getPlayer(player);
			} else {
				throw new CommandFramework.ExecuteException("Il giocatore " + player + " non è attualmente online.");
			}
		}

		// Verifica che il carattere sia corrispondente ad un colore e in caso lo ritorna
		public static ChatColor getColor(String arg) {
			try {
				return ChatColor.getByChar(arg);
			} catch (CommandFramework.ExecuteException ex) {
				throw new CommandFramework.ExecuteException("Il colore specificato non è valido.");
			}
		}

		// Verifica che un giocatore abbia {num} slot liberi nell'inventario
		public static void hasEmptySlot(Player player, int slots) {
			if(GameUtils.hasEmptySlots(player, slots))
				throw new CommandFramework.ExecuteException("Non hai abbastanza spazio nel tuo inventario! (" + slots + " slot)");
		}

		// Verifica che un giocatore possa aggiungere un oggetto al suo inventario
		public static void canAdd(Player player, ItemStack item) {
			if(!GameUtils.canAdd(player, item))
				throw new CommandFramework.ExecuteException("Non hai abbastanza spazio nel tuo inventario!");
		}

	}

	public static class ExecuteException extends RuntimeException {
		private static final long serialVersionUID = 7052164163215272979L;
		public String getMessage() {
			return super.getMessage();
		}
		public ExecuteException(String msg) {
			super(msg);
		}
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE})
	public @interface NoPermissionMessage {
		String value();
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE})
	public @interface Permission {
		String value();
	}
}