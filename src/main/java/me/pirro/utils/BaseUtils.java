package me.pirro.utils;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by @zPirroZ3007 (github.com/zPirroZ3007) on 21 agosto, 2020
 */
public class BaseUtils
{
	// Rimuove i colori da una stringa
	public static String removeColors(String string)
	{
		return string.replaceAll("§a", "").replaceAll("§b", "").replaceAll("§c", "").replaceAll("§d", "").replaceAll("§e", "").replaceAll("§f", "").replaceAll("§l", "").replaceAll("§m", "").replaceAll("§n", "").replaceAll("§k", "").replaceAll("§o", "").replaceAll("§0", "").replaceAll("§1", "").replaceAll("§2", "").replaceAll("§3", "").replaceAll("§4", "").replaceAll("§5", "").replaceAll("§6", "").replaceAll("§7", "").replaceAll("§8", "").replaceAll("§9", "");
	}

	// Genera un numero intero casuale in un intervallo stabilito
	public static int randNumber(int min, int max)
	{
		return (int) ((Math.random() * ((max - min) + 1)) + min);
	}

	// Sostituisce l'ultima parte di una stringa
	// Esempio: dopo aver costruito un elenco con un trattino (1-2-3-)
	//          si può utilizzare per rimuovere l'ultimo trattino presente
	//          replacelast("1-2-3-", "-", "");   -->    Risultato "1-2-3"
	public static String replaceLast(String text, String regex, String replacement)
	{
		return text.replaceFirst("(?s)" + regex + "(?!.*?" + regex + ")", replacement);
	}

	// Arrotonda un valore in base ai {places} dopo la virgola
	public static double round(double value, int places)
	{
		if (places < 0)
			throw new IllegalArgumentException();

		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}

	// Ottiene il Set delle Keys fornendo un valore in una HashMap
	public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value)
	{
		return map.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), value)).map(Map.Entry::getKey).collect(Collectors.toSet());
	}
}
