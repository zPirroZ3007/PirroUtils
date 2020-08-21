package me.pirro.utils;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.command.CommandSender;

import java.util.Arrays;
import java.util.List;

public abstract class SubCommand {

	@Getter private final String name;
	@Getter	private final String[] nameParts;
	@Getter	private List<String> description;

	@Getter @Setter private String usage;
	@Getter @Setter	private int minArgs;
	@Getter @Setter private String permission;

	@Getter @Setter private boolean hideFromHelp;

	protected SubCommand(String name) {
		this.name = name;
		this.nameParts = name.split(" ");
	}

	protected void setDescription(String... description) {
		this.description = Arrays.asList(description);
	}

	public abstract void execute(CommandSender sender, String label, String[] args);

}
