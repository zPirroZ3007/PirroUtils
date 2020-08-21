package me.pirro.utils;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.util.UUID;

public class GameUtils {
	// Verifica se {player} ha {slots} liberi nel suo inventario
	public static boolean hasEmptySlots(Player player, int slots) {
		int i = 0;
		for (ItemStack is : player.getInventory().getStorageContents())
			if (is == null)
				i++;
		return i < slots;
	}

	// Verifica se {player} può aggiungere {item} al suo inventario
	public static boolean canAdd(Player player, ItemStack item) {
		if (item.getMaxStackSize() > 1) {
			for (ItemStack is : player.getInventory().getStorageContents())
				if (is != null)
					if (is.getType() == item.getType())
						if (is.getAmount() + item.getAmount() <= is.getMaxStackSize())
							return true;
		}
		int i = 0;
		for (ItemStack is : player.getInventory().getStorageContents())
			if (is == null)
				i++;
		return i > 0;
	}

	// Crea una testa da un URL
	public static ItemStack createSkull(ItemStack head, String url) {
		if (url.isEmpty())
			return head;

		SkullMeta headMeta = (SkullMeta) head.getItemMeta();
		GameProfile profile = new GameProfile(UUID.randomUUID(), null);

		profile.getProperties().put("textures", new Property("textures", url));

		try {
			Field profileField = headMeta.getClass().getDeclaredField("profile");
			profileField.setAccessible(true);
			profileField.set(headMeta, profile);

		} catch (IllegalArgumentException | NoSuchFieldException | SecurityException | IllegalAccessException error) {
			error.printStackTrace();
		}
		head.setItemMeta(headMeta);
		return head;
	}

	// Spawna un fuoco d'artificio nella location specificata
	public static void spawnFirework(Location location, Color color) {
		Location loc = new Location(location.getWorld(), location.getX(), location.getY() + 2, location.getZ());
		Firework fw = (Firework) location.getWorld().spawnEntity(loc, EntityType.FIREWORK);
		FireworkMeta fwm = fw.getFireworkMeta();

		fwm.setPower(2);
		fwm.addEffect(FireworkEffect.builder()
				.withColor(color)
				.trail(false)
				.build()
		);

		fw.setFireworkMeta(fwm);
		fw.detonate();
	}
}