//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package me.pirro.utils;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.WordUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum XMaterial {
    ACACIA_BOAT(new String[]{"BOAT_ACACIA"}),
    ACACIA_BUTTON(new String[]{"WOOD_BUTTON"}),
    ACACIA_DOOR(new String[]{"ACACIA_DOOR_ITEM", "ACACIA_DOOR"}),
    ACACIA_FENCE,
    ACACIA_FENCE_GATE,
    ACACIA_LEAVES(new String[]{"LEAVES_2"}),
    ACACIA_LOG(new String[]{"LOG_2"}),
    ACACIA_PLANKS(4, new String[]{"WOOD"}),
    ACACIA_PRESSURE_PLATE(new String[]{"WOOD_PLATE"}),
    ACACIA_SAPLING(4, new String[]{"SAPLING"}),
    ACACIA_SIGN(new String[]{"SIGN"}),
    ACACIA_SLAB(4, new String[]{"WOOD_STEP", "WOODEN_SLAB", "WOOD_DOUBLE_STEP"}),
    ACACIA_STAIRS,
    ACACIA_TRAPDOOR(new String[]{"TRAP_DOOR"}),
    ACACIA_WALL_SIGN(new String[]{"SIGN_POST", "WALL_SIGN"}),
    ACACIA_WOOD(new String[]{"LOG_2"}),
    ACTIVATOR_RAIL,
    AIR,
    ALLIUM(2, new String[]{"RED_ROSE"}),
    ANCIENT_DEBRIS(new String[]{"1.16"}),
    ANDESITE(5, new String[]{"STONE"}),
    ANDESITE_SLAB,
    ANDESITE_STAIRS,
    ANDESITE_WALL,
    ANVIL,
    APPLE,
    ARMOR_STAND,
    ARROW,
    ATTACHED_MELON_STEM(7, new String[]{"MELON_STEM"}),
    ATTACHED_PUMPKIN_STEM(7, new String[]{"PUMPKIN_STEM"}),
    AZURE_BLUET(3, new String[]{"RED_ROSE"}),
    BAKED_POTATO,
    BAMBOO(new String[]{"1.14", "SUGAR_CANE", ""}),
    BAMBOO_SAPLING(new String[]{"1.14"}),
    BARREL(new String[]{"1.14", "CHEST", ""}),
    BARRIER,
    BASALT(new String[]{"1.16"}),
    BAT_SPAWN_EGG(65, new String[]{"MONSTER_EGG"}),
    BEACON,
    BEDROCK,
    BEEF(new String[]{"RAW_BEEF"}),
    BEEHIVE(new String[]{"1.15"}),
    BEETROOT(new String[]{"BEETROOT_BLOCK"}),
    BEETROOTS(new String[]{"BEETROOT"}),
    BEETROOT_SEEDS,
    BEETROOT_SOUP,
    BEE_NEST(new String[]{"1.15"}),
    BEE_SPAWN_EGG(new String[]{"1.15"}),
    BELL(new String[]{"1.14"}),
    BIRCH_BOAT(new String[]{"BOAT_BIRCH"}),
    BIRCH_BUTTON(new String[]{"WOOD_BUTTON"}),
    BIRCH_DOOR(new String[]{"BIRCH_DOOR_ITEM", "BIRCH_DOOR"}),
    BIRCH_FENCE,
    BIRCH_FENCE_GATE,
    BIRCH_LEAVES(2, new String[]{"LEAVES"}),
    BIRCH_LOG(2, new String[]{"LOG"}),
    BIRCH_PLANKS(2, new String[]{"WOOD"}),
    BIRCH_PRESSURE_PLATE(new String[]{"WOOD_PLATE"}),
    BIRCH_SAPLING(2, new String[]{"SAPLING"}),
    BIRCH_SIGN(new String[]{"SIGN"}),
    BIRCH_SLAB(2, new String[]{"WOOD_STEP", "WOODEN_SLAB", "WOOD_DOUBLE_STEP"}),
    BIRCH_STAIRS(new String[]{"BIRCH_WOOD_STAIRS"}),
    BIRCH_TRAPDOOR(new String[]{"TRAP_DOOR"}),
    BIRCH_WALL_SIGN(new String[]{"SIGN_POST", "WALL_SIGN"}),
    BIRCH_WOOD(2, new String[]{"LOG"}),
    BLACKSTONE(new String[]{"1.16"}),
    BLACKSTONE_SLAB(new String[]{"1.16"}),
    BLACKSTONE_STAIRS(new String[]{"1.16"}),
    BLACKSTONE_WALL(new String[]{"1.16"}),
    BLACK_BANNER(new String[]{"BANNER", "STANDING_BANNER"}),
    BLACK_BED(15, new String[]{"BED_BLOCK", "BED"}),
    BLACK_CARPET(15, new String[]{"CARPET"}),
    BLACK_CONCRETE(15, new String[]{"CONCRETE"}),
    BLACK_CONCRETE_POWDER(15, new String[]{"CONCRETE_POWDER"}),
    BLACK_DYE(new String[]{"1.14", "INK_SACK", "INK_SAC"}),
    BLACK_GLAZED_TERRACOTTA(15, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "BLACK_TERRACOTTA"}),
    BLACK_SHULKER_BOX,
    BLACK_STAINED_GLASS(15, new String[]{"STAINED_GLASS"}),
    BLACK_STAINED_GLASS_PANE(15, new String[]{"STAINED_GLASS_PANE"}),
    BLACK_TERRACOTTA(15, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    BLACK_WALL_BANNER(new String[]{"WALL_BANNER"}),
    BLACK_WOOL(15, new String[]{"WOOL"}),
    BLAST_FURNACE(new String[]{"1.14", "FURNACE", ""}),
    BLAZE_POWDER,
    BLAZE_ROD,
    BLAZE_SPAWN_EGG(61, new String[]{"MONSTER_EGG"}),
    BLUE_BANNER(4, new String[]{"BANNER", "STANDING_BANNER"}),
    BLUE_BED(11, new String[]{"BED_BLOCK", "BED"}),
    BLUE_CARPET(11, new String[]{"CARPET"}),
    BLUE_CONCRETE(11, new String[]{"CONCRETE"}),
    BLUE_CONCRETE_POWDER(11, new String[]{"CONCRETE_POWDER"}),
    BLUE_DYE(4, new String[]{"INK_SACK", "LAPIS_LAZULI"}),
    BLUE_GLAZED_TERRACOTTA(11, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "BLUE_TERRACOTTA"}),
    BLUE_ICE(new String[]{"1.13", "PACKED_ICE", ""}),
    BLUE_ORCHID(1, new String[]{"RED_ROSE"}),
    BLUE_SHULKER_BOX,
    BLUE_STAINED_GLASS(11, new String[]{"STAINED_GLASS"}),
    BLUE_STAINED_GLASS_PANE(11, new String[]{"THIN_GLASS", "STAINED_GLASS_PANE"}),
    BLUE_TERRACOTTA(11, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    BLUE_WALL_BANNER(4, new String[]{"WALL_BANNER"}),
    BLUE_WOOL(11, new String[]{"WOOL"}),
    BONE,
    BONE_BLOCK,
    BONE_MEAL(15, new String[]{"INK_SACK"}),
    BOOK,
    BOOKSHELF,
    BOW,
    BOWL,
    BRAIN_CORAL(new String[]{"1.13"}),
    BRAIN_CORAL_BLOCK(new String[]{"1.13"}),
    BRAIN_CORAL_FAN(new String[]{"1.13"}),
    BRAIN_CORAL_WALL_FAN,
    BREAD,
    BREWING_STAND(new String[]{"BREWING_STAND_ITEM"}),
    BRICK(new String[]{"CLAY_BRICK"}),
    BRICKS(new String[]{"BRICK"}),
    BRICK_SLAB(4, new String[]{"STEP"}),
    BRICK_STAIRS,
    BRICK_WALL,
    BROWN_BANNER(3, new String[]{"BANNER", "STANDING_BANNER"}),
    BROWN_BED(12, new String[]{"BED_BLOCK", "BED"}),
    BROWN_CARPET(12, new String[]{"CARPET"}),
    BROWN_CONCRETE(12, new String[]{"CONCRETE"}),
    BROWN_CONCRETE_POWDER(12, new String[]{"CONCRETE_POWDER"}),
    BROWN_DYE(3, new String[]{"INK_SACK", "COCOA", "COCOA_BEANS"}),
    BROWN_GLAZED_TERRACOTTA(12, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "BROWN_TERRACOTTA"}),
    BROWN_MUSHROOM,
    BROWN_MUSHROOM_BLOCK(new String[]{"BROWN_MUSHROOM", "HUGE_MUSHROOM_1"}),
    BROWN_SHULKER_BOX,
    BROWN_STAINED_GLASS(12, new String[]{"STAINED_GLASS"}),
    BROWN_STAINED_GLASS_PANE(12, new String[]{"THIN_GLASS", "STAINED_GLASS_PANE"}),
    BROWN_TERRACOTTA(12, new String[]{"STAINED_CLAY"}),
    BROWN_WALL_BANNER(3, new String[]{"WALL_BANNER"}),
    BROWN_WOOL(12, new String[]{"WOOL"}),
    BUBBLE_COLUMN(new String[]{"1.13"}),
    BUBBLE_CORAL(new String[]{"1.13"}),
    BUBBLE_CORAL_BLOCK(new String[]{"1.13"}),
    BUBBLE_CORAL_FAN(new String[]{"1.13"}),
    BUBBLE_CORAL_WALL_FAN,
    BUCKET,
    CACTUS,
    CAKE(new String[]{"CAKE_BLOCK"}),
    CAMPFIRE(new String[]{"1.14"}),
    CARROT(new String[]{"CARROT_ITEM"}),
    CARROTS(new String[]{"CARROT"}),
    CARROT_ON_A_STICK(new String[]{"CARROT_STICK"}),
    CARTOGRAPHY_TABLE(new String[]{"1.14", "CRAFTING_TABLE", ""}),
    CARVED_PUMPKIN(1, new String[]{"1.13", "PUMPKIN", ""}),
    CAT_SPAWN_EGG,
    CAULDRON(new String[]{"CAULDRON_ITEM"}),
    CAVE_AIR(new String[]{"AIR"}),
    CAVE_SPIDER_SPAWN_EGG(59, new String[]{"MONSTER_EGG"}),
    CHAIN(new String[]{"1.16"}),
    CHAINMAIL_BOOTS,
    CHAINMAIL_CHESTPLATE,
    CHAINMAIL_HELMET,
    CHAINMAIL_LEGGINGS,
    CHAIN_COMMAND_BLOCK(new String[]{"COMMAND", "COMMAND_CHAIN"}),
    CHARCOAL(1, new String[]{"COAL"}),
    CHEST(new String[]{"LOCKED_CHEST"}),
    CHEST_MINECART(new String[]{"STORAGE_MINECART"}),
    CHICKEN(new String[]{"RAW_CHICKEN"}),
    CHICKEN_SPAWN_EGG(93, new String[]{"MONSTER_EGG"}),
    CHIPPED_ANVIL(1, new String[]{"ANVIL"}),
    CHISELED_NETHER_BRICKS(1, new String[]{"NETHER_BRICKS"}),
    CHISELED_POLISHED_BLACKSTONE(new String[]{"1.16", "POLISHED_BLACKSTONE"}),
    CHISELED_QUARTZ_BLOCK(1, new String[]{"QUARTZ_BLOCK"}),
    CHISELED_RED_SANDSTONE(1, new String[]{"RED_SANDSTONE"}),
    CHISELED_SANDSTONE(1, new String[]{"SANDSTONE"}),
    CHISELED_STONE_BRICKS(3, new String[]{"SMOOTH_BRICK"}),
    CHORUS_FLOWER(new String[]{"1.9"}),
    CHORUS_FRUIT(new String[]{"1.9"}),
    CHORUS_PLANT(new String[]{"1.9"}),
    CLAY,
    CLAY_BALL,
    CLOCK(new String[]{"WATCH"}),
    COAL,
    COAL_BLOCK,
    COAL_ORE,
    COARSE_DIRT(1, new String[]{"DIRT"}),
    COBBLESTONE,
    COBBLESTONE_SLAB(3, new String[]{"STEP"}),
    COBBLESTONE_STAIRS,
    COBBLESTONE_WALL(new String[]{"COBBLE_WALL"}),
    COBWEB(new String[]{"WEB"}),
    COCOA(new String[]{"1.15"}),
    COCOA_BEANS(3, new String[]{"INK_SACK", "COCOA"}),
    COD(new String[]{"RAW_FISH"}),
    COD_BUCKET(new String[]{"1.13", "BUCKET", "WATER_BUCKET", ""}),
    COD_SPAWN_EGG(new String[]{"1.13", "MONSTER_EGG", ""}),
    COMMAND_BLOCK(new String[]{"COMMAND"}),
    COMMAND_BLOCK_MINECART(new String[]{"COMMAND_MINECART"}),
    COMPARATOR(new String[]{"REDSTONE_COMPARATOR_OFF", "REDSTONE_COMPARATOR_ON", "REDSTONE_COMPARATOR"}),
    COMPASS,
    COMPOSTER(new String[]{"1.14", "CAULDRON", ""}),
    CONDUIT(new String[]{"1.13", "BEACON"}),
    COOKED_BEEF,
    COOKED_CHICKEN,
    COOKED_COD(new String[]{"COOKED_FISH"}),
    COOKED_MUTTON,
    COOKED_PORKCHOP(new String[]{"PORK", "GRILLED_PORK"}),
    COOKED_RABBIT,
    COOKED_SALMON(1, new String[]{"COOKED_FISH"}),
    COOKIE,
    CORNFLOWER(4, new String[]{"1.14", "BLUE_DYE", ""}),
    COW_SPAWN_EGG(92, new String[]{"MONSTER_EGG"}),
    CRACKED_NETHER_BRICKS(2, new String[]{"NETHER_BRICKS"}),
    CRACKED_POLISHED_BLACKSTONE_BRICKS(new String[]{"1.16", "POLISHED_BLACKSTONE_BRICKS"}),
    CRACKED_STONE_BRICKS(2, new String[]{"SMOOTH_BRICK"}),
    CRAFTING_TABLE(new String[]{"WORKBENCH"}),
    CREEPER_BANNER_PATTERN,
    CREEPER_HEAD(4, new String[]{"SKULL", "SKULL_ITEM"}),
    CREEPER_SPAWN_EGG(50, new String[]{"MONSTER_EGG"}),
    CREEPER_WALL_HEAD(4, new String[]{"SKULL", "SKULL_ITEM"}),
    CRIMSON_BUTTON(new String[]{"1.16"}),
    CRIMSON_DOOR(new String[]{"1.16"}),
    CRIMSON_FENCE(new String[]{"1.16"}),
    CRIMSON_FENCE_GATE(new String[]{"1.16"}),
    CRIMSON_FUNGUS(new String[]{"1.16"}),
    CRIMSON_HYPHAE(new String[]{"1.16"}),
    CRIMSON_NYLIUM(new String[]{"1.16"}),
    CRIMSON_PLANKS(new String[]{"1.16"}),
    CRIMSON_PRESSURE_PLATE(new String[]{"1.16"}),
    CRIMSON_ROOTS(new String[]{"1.16"}),
    CRIMSON_SIGN(new String[]{"1.16"}),
    CRIMSON_SLAB(new String[]{"1.16"}),
    CRIMSON_STAIRS(new String[]{"1.16"}),
    CRIMSON_STEM(new String[]{"1.16"}),
    CRIMSON_TRAPDOOR(new String[]{"1.16"}),
    CRIMSON_WALL_SIGN(new String[]{"1.16"}),
    CROSSBOW,
    CRYING_OBSIDIAN(new String[]{"1.16"}),
    CUT_RED_SANDSTONE(new String[]{"1.13"}),
    CUT_RED_SANDSTONE_SLAB(new String[]{"STONE_SLAB2"}),
    CUT_SANDSTONE(new String[]{"1.13"}),
    CUT_SANDSTONE_SLAB(new String[]{"STEP"}),
    CYAN_BANNER(6, new String[]{"BANNER", "STANDING_BANNER"}),
    CYAN_BED(9, new String[]{"BED_BLOCK", "BED"}),
    CYAN_CARPET(9, new String[]{"CARPET"}),
    CYAN_CONCRETE(9, new String[]{"CONCRETE"}),
    CYAN_CONCRETE_POWDER(9, new String[]{"CONCRETE_POWDER"}),
    CYAN_DYE(6, new String[]{"INK_SACK"}),
    CYAN_GLAZED_TERRACOTTA(9, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "CYAN_TERRACOTTA"}),
    CYAN_SHULKER_BOX,
    CYAN_STAINED_GLASS(9, new String[]{"STAINED_GLASS"}),
    CYAN_STAINED_GLASS_PANE(9, new String[]{"STAINED_GLASS_PANE"}),
    CYAN_TERRACOTTA(9, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    CYAN_WALL_BANNER(6, new String[]{"WALL_BANNER"}),
    CYAN_WOOL(9, new String[]{"WOOL"}),
    DAMAGED_ANVIL(2, new String[]{"ANVIL"}),
    DANDELION(new String[]{"YELLOW_FLOWER"}),
    DARK_OAK_BOAT(new String[]{"BOAT_DARK_OAK"}),
    DARK_OAK_BUTTON(new String[]{"WOOD_BUTTON"}),
    DARK_OAK_DOOR(new String[]{"DARK_OAK_DOOR_ITEM", "DARK_OAK_DOOR"}),
    DARK_OAK_FENCE,
    DARK_OAK_FENCE_GATE,
    DARK_OAK_LEAVES(4, new String[]{"LEAVES", "LEAVES_2"}),
    DARK_OAK_LOG(1, new String[]{"LOG", "LOG_2"}),
    DARK_OAK_PLANKS(5, new String[]{"WOOD"}),
    DARK_OAK_PRESSURE_PLATE(new String[]{"WOOD_PLATE"}),
    DARK_OAK_SAPLING(5, new String[]{"SAPLING"}),
    DARK_OAK_SIGN(new String[]{"SIGN"}),
    DARK_OAK_SLAB(5, new String[]{"WOOD_STEP", "WOODEN_SLAB", "WOOD_DOUBLE_STEP"}),
    DARK_OAK_STAIRS,
    DARK_OAK_TRAPDOOR(new String[]{"TRAP_DOOR"}),
    DARK_OAK_WALL_SIGN(new String[]{"SIGN_POST", "WALL_SIGN"}),
    DARK_OAK_WOOD(1, new String[]{"LOG", "LOG_2"}),
    DARK_PRISMARINE(1, new String[]{"PRISMARINE"}),
    DARK_PRISMARINE_SLAB(new String[]{"1.13"}),
    DARK_PRISMARINE_STAIRS(new String[]{"1.13"}),
    DAYLIGHT_DETECTOR(new String[]{"DAYLIGHT_DETECTOR_INVERTED"}),
    DEAD_BRAIN_CORAL(new String[]{"1.13"}),
    DEAD_BRAIN_CORAL_BLOCK(new String[]{"1.13"}),
    DEAD_BRAIN_CORAL_FAN(new String[]{"1.13"}),
    DEAD_BRAIN_CORAL_WALL_FAN(new String[]{"1.13"}),
    DEAD_BUBBLE_CORAL(new String[]{"1.13"}),
    DEAD_BUBBLE_CORAL_BLOCK(new String[]{"1.13"}),
    DEAD_BUBBLE_CORAL_FAN(new String[]{"1.13"}),
    DEAD_BUBBLE_CORAL_WALL_FAN(new String[]{"1.13"}),
    DEAD_BUSH,
    DEAD_FIRE_CORAL(new String[]{"1.13"}),
    DEAD_FIRE_CORAL_BLOCK(new String[]{"1.13"}),
    DEAD_FIRE_CORAL_FAN(new String[]{"1.13"}),
    DEAD_FIRE_CORAL_WALL_FAN(new String[]{"1.13"}),
    DEAD_HORN_CORAL(new String[]{"1.13"}),
    DEAD_HORN_CORAL_BLOCK(new String[]{"1.13"}),
    DEAD_HORN_CORAL_FAN(new String[]{"1.13"}),
    DEAD_HORN_CORAL_WALL_FAN(new String[]{"1.13"}),
    DEAD_TUBE_CORAL(new String[]{"1.13"}),
    DEAD_TUBE_CORAL_BLOCK(new String[]{"1.13"}),
    DEAD_TUBE_CORAL_FAN(new String[]{"1.13"}),
    DEAD_TUBE_CORAL_WALL_FAN(new String[]{"1.13"}),
    DEBUG_STICK(new String[]{"1.13", "STICK", ""}),
    DETECTOR_RAIL,
    DIAMOND,
    DIAMOND_AXE,
    DIAMOND_BLOCK,
    DIAMOND_BOOTS,
    DIAMOND_CHESTPLATE,
    DIAMOND_HELMET,
    DIAMOND_HOE,
    DIAMOND_HORSE_ARMOR(new String[]{"DIAMOND_BARDING"}),
    DIAMOND_LEGGINGS,
    DIAMOND_ORE,
    DIAMOND_PICKAXE,
    DIAMOND_SHOVEL(new String[]{"DIAMOND_SPADE"}),
    DIAMOND_SWORD,
    DIORITE(3, new String[]{"STONE"}),
    DIORITE_SLAB,
    DIORITE_STAIRS,
    DIORITE_WALL,
    DIRT,
    DISPENSER,
    DOLPHIN_SPAWN_EGG(new String[]{"1.13", "MONSTER_EGG", ""}),
    DONKEY_SPAWN_EGG(32, new String[]{"MONSTER_EGG"}),
    DRAGON_BREATH(new String[]{"DRAGONS_BREATH"}),
    DRAGON_EGG,
    DRAGON_HEAD(5, new String[]{"1.9", "SKULL", "SKULL_ITEM"}),
    DRAGON_WALL_HEAD(5, new String[]{"SKULL", "SKULL_ITEM"}),
    DRIED_KELP(new String[]{"1.13"}),
    DRIED_KELP_BLOCK(new String[]{"1.13"}),
    DROPPER,
    DROWNED_SPAWN_EGG(new String[]{"1.13", "MONSTER_EGG", ""}),
    EGG,
    ELDER_GUARDIAN_SPAWN_EGG(4, new String[]{"MONSTER_EGG"}),
    ELYTRA,
    EMERALD,
    EMERALD_BLOCK,
    EMERALD_ORE,
    ENCHANTED_BOOK,
    ENCHANTED_GOLDEN_APPLE(1, new String[]{"GOLDEN_APPLE"}),
    ENCHANTING_TABLE(new String[]{"ENCHANTMENT_TABLE"}),
    ENDERMAN_SPAWN_EGG(58, new String[]{"MONSTER_EGG"}),
    ENDERMITE_SPAWN_EGG(67, new String[]{"MONSTER_EGG"}),
    ENDER_CHEST,
    ENDER_EYE(new String[]{"EYE_OF_ENDER"}),
    ENDER_PEARL,
    END_CRYSTAL,
    END_GATEWAY(new String[]{"1.9"}),
    END_PORTAL(new String[]{"ENDER_PORTAL"}),
    END_PORTAL_FRAME(new String[]{"ENDER_PORTAL_FRAME"}),
    END_ROD(new String[]{"1.9", "BLAZE_ROD", ""}),
    END_STONE(new String[]{"ENDER_STONE"}),
    END_STONE_BRICKS(new String[]{"END_BRICKS"}),
    END_STONE_BRICK_SLAB(6, new String[]{"STEP"}),
    END_STONE_BRICK_STAIRS(new String[]{"SMOOTH_STAIRS"}),
    END_STONE_BRICK_WALL,
    EVOKER_SPAWN_EGG(34, new String[]{"MONSTER_EGG"}),
    EXPERIENCE_BOTTLE(new String[]{"EXP_BOTTLE"}),
    FARMLAND(new String[]{"SOIL"}),
    FEATHER,
    FERMENTED_SPIDER_EYE,
    FERN(2, new String[]{"LONG_GRASS"}),
    FILLED_MAP(new String[]{"MAP"}),
    FIRE,
    FIREWORK_ROCKET(new String[]{"FIREWORK"}),
    FIREWORK_STAR(new String[]{"FIREWORK_CHARGE"}),
    FIRE_CHARGE(new String[]{"FIREBALL"}),
    FIRE_CORAL(new String[]{"1.13"}),
    FIRE_CORAL_BLOCK(new String[]{"1.13"}),
    FIRE_CORAL_FAN(new String[]{"1.13"}),
    FIRE_CORAL_WALL_FAN,
    FISHING_ROD,
    FLETCHING_TABLE(new String[]{"1.14", "CRAFTING_TABLE", ""}),
    FLINT,
    FLINT_AND_STEEL,
    FLOWER_BANNER_PATTERN,
    FLOWER_POT(new String[]{"FLOWER_POT_ITEM"}),
    FOX_SPAWN_EGG(new String[]{"1.14"}),
    FROSTED_ICE(new String[]{"1.9", "PACKED_ICE", ""}),
    FURNACE(new String[]{"BURNING_FURNACE"}),
    FURNACE_MINECART(new String[]{"POWERED_MINECART"}),
    GHAST_SPAWN_EGG(56, new String[]{"MONSTER_EGG"}),
    GHAST_TEAR,
    GILDED_BLACKSTONE(new String[]{"1.16"}),
    GLASS,
    GLASS_BOTTLE,
    GLASS_PANE(new String[]{"THIN_GLASS"}),
    GLISTERING_MELON_SLICE(new String[]{"SPECKLED_MELON"}),
    GLOBE_BANNER_PATTERN,
    GLOWSTONE,
    GLOWSTONE_DUST,
    GOLDEN_APPLE,
    GOLDEN_AXE(new String[]{"GOLD_AXE"}),
    GOLDEN_BOOTS(new String[]{"GOLD_BOOTS"}),
    GOLDEN_CARROT,
    GOLDEN_CHESTPLATE(new String[]{"GOLD_CHESTPLATE"}),
    GOLDEN_HELMET(new String[]{"GOLD_HELMET"}),
    GOLDEN_HOE(new String[]{"GOLD_HOE"}),
    GOLDEN_HORSE_ARMOR(new String[]{"GOLD_BARDING"}),
    GOLDEN_LEGGINGS(new String[]{"GOLD_LEGGINGS"}),
    GOLDEN_PICKAXE(new String[]{"GOLD_PICKAXE"}),
    GOLDEN_SHOVEL(new String[]{"GOLD_SPADE"}),
    GOLDEN_SWORD(new String[]{"GOLD_SWORD"}),
    GOLD_BLOCK,
    GOLD_INGOT,
    GOLD_NUGGET,
    GOLD_ORE,
    GRANITE(1, new String[]{"STONE"}),
    GRANITE_SLAB,
    GRANITE_STAIRS,
    GRANITE_WALL,
    GRASS(1, new String[]{"LONG_GRASS"}),
    GRASS_BLOCK(new String[]{"GRASS"}),
    POTTED_CRIMSON_ROOTS(new String[]{"1.16"}),
    POTTED_WARPED_FUNGUS(new String[]{"1.16"}),
    POTTED_WARPED_ROOTS(new String[]{"1.16"}),
    GRASS_PATH,
    GRAVEL,
    GRAY_BANNER(8, new String[]{"BANNER", "STANDING_BANNER"}),
    GRAY_BED(7, new String[]{"BED_BLOCK", "BED"}),
    GRAY_CARPET(7, new String[]{"CARPET"}),
    GRAY_CONCRETE(7, new String[]{"CONCRETE"}),
    GRAY_CONCRETE_POWDER(7, new String[]{"CONCRETE_POWDER"}),
    GRAY_DYE(8, new String[]{"INK_SACK"}),
    GRAY_GLAZED_TERRACOTTA(7, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "GRAY_TERRACOTTA"}),
    GRAY_SHULKER_BOX,
    GRAY_STAINED_GLASS(7, new String[]{"STAINED_GLASS"}),
    GRAY_STAINED_GLASS_PANE(7, new String[]{"THIN_GLASS", "STAINED_GLASS_PANE"}),
    GRAY_TERRACOTTA(7, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    GRAY_WALL_BANNER(8, new String[]{"WALL_BANNER"}),
    GRAY_WOOL(7, new String[]{"WOOL"}),
    GREEN_BANNER(2, new String[]{"BANNER", "STANDING_BANNER"}),
    GREEN_BED(13, new String[]{"BED_BLOCK", "BED"}),
    GREEN_CARPET(13, new String[]{"CARPET"}),
    GREEN_CONCRETE(13, new String[]{"CONCRETE"}),
    GREEN_CONCRETE_POWDER(13, new String[]{"CONCRETE_POWDER"}),
    GREEN_DYE(2, new String[]{"INK_SACK", "CACTUS_GREEN"}),
    GREEN_GLAZED_TERRACOTTA(13, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "GREEN_TERRACOTTA"}),
    GREEN_SHULKER_BOX,
    GREEN_STAINED_GLASS(13, new String[]{"STAINED_GLASS"}),
    GREEN_STAINED_GLASS_PANE(13, new String[]{"THIN_GLASS", "STAINED_GLASS_PANE"}),
    GREEN_TERRACOTTA(13, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    GREEN_WALL_BANNER(2, new String[]{"WALL_BANNER"}),
    GREEN_WOOL(13, new String[]{"WOOL"}),
    GRINDSTONE(new String[]{"1.14", "ANVIL", ""}),
    GUARDIAN_SPAWN_EGG(68, new String[]{"MONSTER_EGG"}),
    GUNPOWDER(new String[]{"SULPHUR"}),
    HAY_BLOCK,
    HEART_OF_THE_SEA(new String[]{"1.13"}),
    HEAVY_WEIGHTED_PRESSURE_PLATE(new String[]{"IRON_PLATE"}),
    HOGLIN_SPAWN_EGG(new String[]{"1.16", "MONSTER_EGG"}),
    HONEYCOMB(new String[]{"1.15"}),
    HONEYCOMB_BLOCK(new String[]{"1.15"}),
    HONEY_BLOCK(new String[]{"1.15", "SLIME_BLOCK", ""}),
    HONEY_BOTTLE(new String[]{"1.15", "GLASS_BOTTLE", ""}),
    HOPPER,
    HOPPER_MINECART,
    HORN_CORAL(new String[]{"1.13"}),
    HORN_CORAL_BLOCK(new String[]{"1.13"}),
    HORN_CORAL_FAN(new String[]{"1.13"}),
    HORN_CORAL_WALL_FAN,
    HORSE_SPAWN_EGG(100, new String[]{"MONSTER_EGG"}),
    HUSK_SPAWN_EGG(23, new String[]{"MONSTER_EGG"}),
    ICE,
    INFESTED_CHISELED_STONE_BRICKS(5, new String[]{"MONSTER_EGGS", "SMOOTH_BRICK"}),
    INFESTED_COBBLESTONE(1, new String[]{"MONSTER_EGGS"}),
    INFESTED_CRACKED_STONE_BRICKS(4, new String[]{"MONSTER_EGGS", "SMOOTH_BRICK"}),
    INFESTED_MOSSY_STONE_BRICKS(3, new String[]{"MONSTER_EGGS"}),
    INFESTED_STONE(new String[]{"MONSTER_EGGS"}),
    INFESTED_STONE_BRICKS(2, new String[]{"MONSTER_EGGS", "SMOOTH_BRICK"}),
    INK_SAC(new String[]{"INK_SACK"}),
    IRON_AXE,
    IRON_BARS(new String[]{"IRON_FENCE"}),
    IRON_BLOCK,
    IRON_BOOTS,
    IRON_CHESTPLATE,
    IRON_DOOR(new String[]{"IRON_DOOR_BLOCK"}),
    IRON_HELMET,
    IRON_HOE,
    IRON_HORSE_ARMOR(new String[]{"IRON_BARDING"}),
    IRON_INGOT,
    IRON_LEGGINGS,
    IRON_NUGGET,
    IRON_ORE,
    IRON_PICKAXE,
    IRON_SHOVEL(new String[]{"IRON_SPADE"}),
    IRON_SWORD,
    IRON_TRAPDOOR,
    ITEM_FRAME,
    JACK_O_LANTERN,
    JIGSAW(new String[]{"1.14", "COMMAND_BLOCK", "STRUCTURE_BLOCK", ""}),
    JUKEBOX,
    JUNGLE_BOAT(new String[]{"BOAT_JUNGLE"}),
    JUNGLE_BUTTON(new String[]{"WOOD_BUTTON"}),
    JUNGLE_DOOR(new String[]{"JUNGLE_DOOR_ITEM", "JUNGLE_DOOR"}),
    JUNGLE_FENCE,
    JUNGLE_FENCE_GATE,
    JUNGLE_LEAVES(3, new String[]{"LEAVES"}),
    JUNGLE_LOG(3, new String[]{"LOG"}),
    JUNGLE_PLANKS(3, new String[]{"WOOD"}),
    JUNGLE_PRESSURE_PLATE(new String[]{"WOOD_PLATE"}),
    JUNGLE_SAPLING(3, new String[]{"SAPLING"}),
    JUNGLE_SIGN(new String[]{"SIGN"}),
    JUNGLE_SLAB(3, new String[]{"WOOD_STEP", "WOODEN_SLAB", "WOOD_DOUBLE_STEP"}),
    JUNGLE_STAIRS(new String[]{"JUNGLE_WOOD_STAIRS"}),
    JUNGLE_TRAPDOOR(new String[]{"TRAP_DOOR"}),
    JUNGLE_WALL_SIGN(new String[]{"SIGN_POST", "WALL_SIGN"}),
    JUNGLE_WOOD(3, new String[]{"LOG"}),
    KELP(new String[]{"1.13"}),
    KELP_PLANT(new String[]{"1.13"}),
    KNOWLEDGE_BOOK(new String[]{"1.12", "BOOK"}),
    LADDER,
    LANTERN(new String[]{"1.14", "SEA_LANTERN", ""}),
    LAPIS_BLOCK,
    LAPIS_LAZULI(4, new String[]{"INK_SACK"}),
    LAPIS_ORE,
    LARGE_FERN(3, new String[]{"DOUBLE_PLANT"}),
    LAVA(new String[]{"STATIONARY_LAVA"}),
    LAVA_BUCKET,
    LEAD(new String[]{"LEASH"}),
    LEATHER,
    LEATHER_BOOTS,
    LEATHER_CHESTPLATE,
    LEATHER_HELMET,
    LEATHER_HORSE_ARMOR(new String[]{"1.14", "IRON_HORSE_ARMOR", ""}),
    LEATHER_LEGGINGS,
    LECTERN(new String[]{"1.14", "BOOKSHELF", ""}),
    LEVER,
    LIGHT_BLUE_BANNER(12, new String[]{"BANNER", "STANDING_BANNER"}),
    LIGHT_BLUE_BED(3, new String[]{"BED_BLOCK", "BED"}),
    LIGHT_BLUE_CARPET(3, new String[]{"CARPET"}),
    LIGHT_BLUE_CONCRETE(3, new String[]{"CONCRETE"}),
    LIGHT_BLUE_CONCRETE_POWDER(3, new String[]{"CONCRETE_POWDER"}),
    LIGHT_BLUE_DYE(12, new String[]{"INK_SACK"}),
    LIGHT_BLUE_GLAZED_TERRACOTTA(3, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "LIGHT_BLUE_TERRACOTTA"}),
    LIGHT_BLUE_SHULKER_BOX,
    LIGHT_BLUE_STAINED_GLASS(3, new String[]{"STAINED_GLASS"}),
    LIGHT_BLUE_STAINED_GLASS_PANE(3, new String[]{"THIN_GLASS", "STAINED_GLASS_PANE"}),
    LIGHT_BLUE_TERRACOTTA(3, new String[]{"STAINED_CLAY"}),
    LIGHT_BLUE_WALL_BANNER(12, new String[]{"WALL_BANNER", "BANNER", "STANDING_BANNER"}),
    LIGHT_BLUE_WOOL(3, new String[]{"WOOL"}),
    LIGHT_GRAY_BANNER(7, new String[]{"BANNER", "STANDING_BANNER"}),
    LIGHT_GRAY_BED(8, new String[]{"BED_BLOCK", "BED"}),
    LIGHT_GRAY_CARPET(8, new String[]{"CARPET"}),
    LIGHT_GRAY_CONCRETE(8, new String[]{"CONCRETE"}),
    LIGHT_GRAY_CONCRETE_POWDER(8, new String[]{"CONCRETE_POWDER"}),
    LIGHT_GRAY_DYE(7, new String[]{"INK_SACK"}),
    LIGHT_GRAY_GLAZED_TERRACOTTA(new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "LIGHT_GRAY_TERRACOTTA", "SILVER_GLAZED_TERRACOTTA"}),
    LIGHT_GRAY_SHULKER_BOX(new String[]{"SILVER_SHULKER_BOX"}),
    LIGHT_GRAY_STAINED_GLASS(8, new String[]{"STAINED_GLASS"}),
    LIGHT_GRAY_STAINED_GLASS_PANE(8, new String[]{"THIN_GLASS", "STAINED_GLASS_PANE"}),
    LIGHT_GRAY_TERRACOTTA(8, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    LIGHT_GRAY_WALL_BANNER(7, new String[]{"WALL_BANNER"}),
    LIGHT_GRAY_WOOL(8, new String[]{"WOOL"}),
    LIGHT_WEIGHTED_PRESSURE_PLATE(new String[]{"GOLD_PLATE"}),
    LILAC(1, new String[]{"DOUBLE_PLANT"}),
    LILY_OF_THE_VALLEY(15, new String[]{"1.14", "WHITE_DYE", ""}),
    LILY_PAD(new String[]{"WATER_LILY"}),
    LIME_BANNER(10, new String[]{"BANNER", "STANDING_BANNER"}),
    LIME_BED(5, new String[]{"BED_BLOCK", "BED"}),
    LIME_CARPET(5, new String[]{"CARPET"}),
    LIME_CONCRETE(5, new String[]{"CONCRETE"}),
    LIME_CONCRETE_POWDER(5, new String[]{"CONCRETE_POWDER"}),
    LIME_DYE(10, new String[]{"INK_SACK"}),
    LIME_GLAZED_TERRACOTTA(5, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "LIME_TERRACOTTA"}),
    LIME_SHULKER_BOX,
    LIME_STAINED_GLASS(5, new String[]{"STAINED_GLASS"}),
    LIME_STAINED_GLASS_PANE(5, new String[]{"STAINED_GLASS_PANE"}),
    LIME_TERRACOTTA(5, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    LIME_WALL_BANNER(10, new String[]{"WALL_BANNER"}),
    LIME_WOOL(5, new String[]{"WOOL"}),
    LINGERING_POTION,
    LLAMA_SPAWN_EGG(103, new String[]{"MONSTER_EGG"}),
    LODESTONE(new String[]{"1.16"}),
    LOOM(new String[]{"1.14"}),
    MAGENTA_BANNER(13, new String[]{"BANNER", "STANDING_BANNER"}),
    MAGENTA_BED(2, new String[]{"BED_BLOCK", "BED"}),
    MAGENTA_CARPET(2, new String[]{"CARPET"}),
    MAGENTA_CONCRETE(2, new String[]{"CONCRETE"}),
    MAGENTA_CONCRETE_POWDER(2, new String[]{"CONCRETE_POWDER"}),
    MAGENTA_DYE(13, new String[]{"INK_SACK"}),
    MAGENTA_GLAZED_TERRACOTTA(2, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "MAGENTA_TERRACOTTA"}),
    MAGENTA_SHULKER_BOX,
    MAGENTA_STAINED_GLASS(2, new String[]{"STAINED_GLASS"}),
    MAGENTA_STAINED_GLASS_PANE(2, new String[]{"THIN_GLASS", "STAINED_GLASS_PANE"}),
    MAGENTA_TERRACOTTA(2, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    MAGENTA_WALL_BANNER(13, new String[]{"WALL_BANNER"}),
    MAGENTA_WOOL(2, new String[]{"WOOL"}),
    MAGMA_BLOCK(new String[]{"1.10", "MAGMA"}),
    MAGMA_CREAM,
    MAGMA_CUBE_SPAWN_EGG(62, new String[]{"MONSTER_EGG"}),
    MAP(new String[]{"EMPTY_MAP"}),
    MELON(new String[]{"MELON_BLOCK"}),
    MELON_SEEDS,
    MELON_SLICE(new String[]{"MELON"}),
    MELON_STEM,
    MILK_BUCKET,
    MINECART,
    MOJANG_BANNER_PATTERN,
    MOOSHROOM_SPAWN_EGG(96, new String[]{"MONSTER_EGG"}),
    MOSSY_COBBLESTONE,
    MOSSY_COBBLESTONE_SLAB(3, new String[]{"STEP"}),
    MOSSY_COBBLESTONE_STAIRS,
    MOSSY_COBBLESTONE_WALL(1, new String[]{"COBBLE_WALL", "COBBLESTONE_WALL"}),
    MOSSY_STONE_BRICKS(1, new String[]{"SMOOTH_BRICK"}),
    MOSSY_STONE_BRICK_SLAB(5, new String[]{"STEP"}),
    MOSSY_STONE_BRICK_STAIRS(new String[]{"SMOOTH_STAIRS"}),
    MOSSY_STONE_BRICK_WALL,
    MOVING_PISTON(new String[]{"PISTON_BASE", "PISTON_MOVING_PIECE"}),
    MULE_SPAWN_EGG(32, new String[]{"MONSTER_EGG"}),
    MUSHROOM_STEM(new String[]{"BROWN_MUSHROOM"}),
    MUSHROOM_STEW(new String[]{"MUSHROOM_SOUP"}),
    MUSIC_DISC_11(new String[]{"GOLD_RECORD"}),
    MUSIC_DISC_13(new String[]{"GREEN_RECORD"}),
    MUSIC_DISC_BLOCKS(new String[]{"RECORD_3"}),
    MUSIC_DISC_CAT(new String[]{"RECORD_4"}),
    MUSIC_DISC_CHIRP(new String[]{"RECORD_5"}),
    MUSIC_DISC_FAR(new String[]{"RECORD_6"}),
    MUSIC_DISC_MALL(new String[]{"RECORD_7"}),
    MUSIC_DISC_MELLOHI(new String[]{"RECORD_8"}),
    MUSIC_DISC_PIGSTEP(new String[]{"1.16"}),
    MUSIC_DISC_STAL(new String[]{"RECORD_9"}),
    MUSIC_DISC_STRAD(new String[]{"RECORD_10"}),
    MUSIC_DISC_WAIT(new String[]{"RECORD_11"}),
    MUSIC_DISC_WARD(new String[]{"RECORD_12"}),
    MUTTON,
    MYCELIUM(new String[]{"MYCEL"}),
    NAME_TAG,
    NAUTILUS_SHELL(new String[]{"1.13"}),
    NETHERITE_AXE(new String[]{"1.16"}),
    NETHERITE_BLOCK(new String[]{"1.16"}),
    NETHERITE_BOOTS(new String[]{"1.16"}),
    NETHERITE_CHESTPLATE(new String[]{"1.16"}),
    NETHERITE_HELMET(new String[]{"1.16"}),
    NETHERITE_HOE(new String[]{"1.16"}),
    NETHERITE_INGOT(new String[]{"1.16"}),
    NETHERITE_LEGGINGS(new String[]{"1.16"}),
    NETHERITE_PICKAXE(new String[]{"1.16"}),
    NETHERITE_SCRAP(new String[]{"1.16"}),
    NETHERITE_SHOVEL(new String[]{"1.16"}),
    NETHERITE_SWORD(new String[]{"1.16"}),
    NETHERRACK,
    NETHER_BRICK(new String[]{"NETHER_BRICK_ITEM"}),
    NETHER_BRICKS(new String[]{"NETHER_BRICK"}),
    NETHER_BRICK_FENCE(new String[]{"NETHER_FENCE"}),
    NETHER_BRICK_SLAB(6, new String[]{"STEP"}),
    NETHER_BRICK_STAIRS,
    NETHER_BRICK_WALL,
    NETHER_GOLD_ORE(new String[]{"1.16"}),
    NETHER_PORTAL(new String[]{"PORTAL"}),
    NETHER_QUARTZ_ORE(new String[]{"QUARTZ_ORE"}),
    NETHER_SPROUTS(new String[]{"1.16"}),
    NETHER_STAR,
    NETHER_WART(new String[]{"NETHER_WARTS", "NETHER_STALK"}),
    NETHER_WART_BLOCK,
    NOTE_BLOCK,
    OAK_BOAT(new String[]{"BOAT"}),
    OAK_BUTTON(new String[]{"WOOD_BUTTON"}),
    OAK_DOOR(new String[]{"WOOD_DOOR", "WOODEN_DOOR"}),
    OAK_FENCE(new String[]{"FENCE"}),
    OAK_FENCE_GATE(new String[]{"FENCE_GATE"}),
    OAK_LEAVES(new String[]{"LEAVES"}),
    OAK_LOG(new String[]{"LOG"}),
    OAK_PLANKS(new String[]{"WOOD"}),
    OAK_PRESSURE_PLATE(new String[]{"WOOD_PLATE"}),
    OAK_SAPLING(new String[]{"SAPLING"}),
    OAK_SIGN(new String[]{"SIGN"}),
    OAK_SLAB(new String[]{"WOOD_STEP", "WOODEN_SLAB", "WOOD_DOUBLE_STEP"}),
    OAK_STAIRS(new String[]{"WOOD_STAIRS"}),
    OAK_TRAPDOOR(new String[]{"TRAP_DOOR"}),
    OAK_WALL_SIGN(new String[]{"SIGN_POST", "WALL_SIGN"}),
    OAK_WOOD(new String[]{"LOG"}),
    OBSERVER,
    OBSIDIAN,
    OCELOT_SPAWN_EGG(98, new String[]{"MONSTER_EGG"}),
    ORANGE_BANNER(14, new String[]{"BANNER", "STANDING_BANNER"}),
    ORANGE_BED(1, new String[]{"BED_BLOCK", "BED"}),
    ORANGE_CARPET(1, new String[]{"CARPET"}),
    ORANGE_CONCRETE(1, new String[]{"CONCRETE"}),
    ORANGE_CONCRETE_POWDER(1, new String[]{"CONCRETE_POWDER"}),
    ORANGE_DYE(14, new String[]{"INK_SACK"}),
    ORANGE_GLAZED_TERRACOTTA(1, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "ORANGE_TERRACOTTA"}),
    ORANGE_SHULKER_BOX,
    ORANGE_STAINED_GLASS(1, new String[]{"STAINED_GLASS"}),
    ORANGE_STAINED_GLASS_PANE(1, new String[]{"STAINED_GLASS_PANE"}),
    ORANGE_TERRACOTTA(1, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    ORANGE_TULIP(5, new String[]{"RED_ROSE"}),
    ORANGE_WALL_BANNER(14, new String[]{"WALL_BANNER"}),
    ORANGE_WOOL(1, new String[]{"WOOL"}),
    OXEYE_DAISY(8, new String[]{"RED_ROSE"}),
    PACKED_ICE,
    PAINTING,
    PANDA_SPAWN_EGG(new String[]{"1.14"}),
    PAPER,
    PARROT_SPAWN_EGG(105, new String[]{"MONSTER_EGG"}),
    PEONY(5, new String[]{"DOUBLE_PLANT"}),
    PETRIFIED_OAK_SLAB(new String[]{"WOOD_STEP"}),
    PHANTOM_MEMBRANE(new String[]{"1.13"}),
    PHANTOM_SPAWN_EGG(new String[]{"1.13", "MONSTER_EGG", ""}),
    PIGLIN_BANNER_PATTERN(new String[]{"1.16"}),
    PIGLIN_SPAWN_EGG(57, new String[]{"MONSTER_EGG"}),
    PIG_SPAWN_EGG(90, new String[]{"MONSTER_EGG"}),
    PILLAGER_SPAWN_EGG(new String[]{"1.14"}),
    PINK_BANNER(9, new String[]{"BANNER", "STANDING_BANNER"}),
    PINK_BED(6, new String[]{"BED_BLOCK", "BED"}),
    PINK_CARPET(6, new String[]{"CARPET"}),
    PINK_CONCRETE(6, new String[]{"CONCRETE"}),
    PINK_CONCRETE_POWDER(6, new String[]{"CONCRETE_POWDER"}),
    PINK_DYE(9, new String[]{"INK_SACK"}),
    PINK_GLAZED_TERRACOTTA(6, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "PINK_TERRACOTTA"}),
    PINK_SHULKER_BOX,
    PINK_STAINED_GLASS(6, new String[]{"STAINED_GLASS"}),
    PINK_STAINED_GLASS_PANE(6, new String[]{"THIN_GLASS", "STAINED_GLASS_PANE"}),
    PINK_TERRACOTTA(6, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    PINK_TULIP(7, new String[]{"RED_ROSE"}),
    PINK_WALL_BANNER(9, new String[]{"WALL_BANNER"}),
    PINK_WOOL(6, new String[]{"WOOL"}),
    PISTON(new String[]{"PISTON_BASE"}),
    PISTON_HEAD(new String[]{"PISTON_EXTENSION"}),
    PLAYER_HEAD(3, new String[]{"SKULL", "SKULL_ITEM"}),
    PLAYER_WALL_HEAD(3, new String[]{"SKULL", "SKULL_ITEM"}),
    PODZOL(2, new String[]{"DIRT"}),
    POISONOUS_POTATO,
    POLAR_BEAR_SPAWN_EGG(102, new String[]{"MONSTER_EGG"}),
    POLISHED_ANDESITE(6, new String[]{"STONE"}),
    POLISHED_ANDESITE_SLAB,
    POLISHED_ANDESITE_STAIRS,
    POLISHED_BASALT(new String[]{"1.16"}),
    POLISHED_BLACKSTONE(new String[]{"1.16"}),
    POLISHED_BLACKSTONE_BRICKS(new String[]{"1.16"}),
    POLISHED_BLACKSTONE_BRICK_SLAB(new String[]{"1.16"}),
    POLISHED_BLACKSTONE_BRICK_STAIRS(new String[]{"1.16"}),
    POLISHED_BLACKSTONE_BRICK_WALL(new String[]{"1.16"}),
    POLISHED_BLACKSTONE_BUTTON(new String[]{"1.16"}),
    POLISHED_BLACKSTONE_PRESSURE_PLATE(new String[]{"1.16"}),
    POLISHED_BLACKSTONE_SLAB(new String[]{"1.16"}),
    POLISHED_BLACKSTONE_STAIRS(new String[]{"1.16"}),
    POLISHED_BLACKSTONE_WALL(new String[]{"1.16"}),
    POLISHED_DIORITE(4, new String[]{"STONE"}),
    POLISHED_DIORITE_SLAB,
    POLISHED_DIORITE_STAIRS,
    POLISHED_GRANITE(2, new String[]{"STONE"}),
    POLISHED_GRANITE_SLAB,
    POLISHED_GRANITE_STAIRS,
    POPPED_CHORUS_FRUIT(new String[]{"CHORUS_FRUIT_POPPED"}),
    POPPY(new String[]{"RED_ROSE"}),
    PORKCHOP(new String[]{"PORK"}),
    POTATO(new String[]{"POTATO_ITEM"}),
    POTATOES(new String[]{"POTATO"}),
    POTION,
    POTTED_ACACIA_SAPLING(4, new String[]{"SAPLING", "FLOWER_POT"}),
    POTTED_ALLIUM(2, new String[]{"RED_ROSE", "FLOWER_POT"}),
    POTTED_AZURE_BLUET(3, new String[]{"RED_ROSE", "FLOWER_POT"}),
    POTTED_BAMBOO,
    POTTED_BIRCH_SAPLING(2, new String[]{"SAPLING", "FLOWER_POT"}),
    POTTED_BLUE_ORCHID(1, new String[]{"RED_ROSE", "FLOWER_POT"}),
    POTTED_BROWN_MUSHROOM(new String[]{"FLOWER_POT"}),
    POTTED_CACTUS(new String[]{"FLOWER_POT"}),
    POTTED_CORNFLOWER,
    POTTED_CRIMSON_FUNGUS(new String[]{"1.16"}),
    POTTED_DANDELION(new String[]{"YELLOW_FLOWER", "FLOWER_POT"}),
    POTTED_DARK_OAK_SAPLING(5, new String[]{"SAPLING", "FLOWER_POT"}),
    POTTED_DEAD_BUSH(new String[]{"FLOWER_POT"}),
    POTTED_FERN(2, new String[]{"LONG_GRASS", "FLOWER_POT"}),
    POTTED_JUNGLE_SAPLING(3, new String[]{"SAPLING", "FLOWER_POT"}),
    POTTED_LILY_OF_THE_VALLEY,
    POTTED_OAK_SAPLING(new String[]{"SAPLING", "FLOWER_POT"}),
    POTTED_ORANGE_TULIP(5, new String[]{"RED_ROSE", "FLOWER_POT"}),
    POTTED_OXEYE_DAISY(8, new String[]{"RED_ROSE", "FLOWER_POT"}),
    POTTED_PINK_TULIP(7, new String[]{"RED_ROSE", "FLOWER_POT"}),
    POTTED_POPPY(new String[]{"RED_ROSE", "FLOWER_POT"}),
    POTTED_RED_MUSHROOM(new String[]{"FLOWER_POT"}),
    POTTED_RED_TULIP(4, new String[]{"RED_ROSE", "FLOWER_POT"}),
    POTTED_SPRUCE_SAPLING(1, new String[]{"SAPLING", "FLOWER_POT"}),
    POTTED_WHITE_TULIP(6, new String[]{"RED_ROSE", "FLOWER_POT"}),
    POTTED_WITHER_ROSE,
    POWERED_RAIL,
    PRISMARINE,
    PRISMARINE_BRICKS(2, new String[]{"PRISMARINE"}),
    PRISMARINE_BRICK_SLAB(4, new String[]{"STEP"}),
    PRISMARINE_BRICK_STAIRS(new String[]{"1.13"}),
    PRISMARINE_CRYSTALS,
    PRISMARINE_SHARD,
    PRISMARINE_SLAB(new String[]{"1.13"}),
    PRISMARINE_STAIRS(new String[]{"1.13"}),
    PRISMARINE_WALL,
    PUFFERFISH(3, new String[]{"RAW_FISH"}),
    PUFFERFISH_BUCKET(new String[]{"1.13", "BUCKET", "WATER_BUCKET", ""}),
    PUFFERFISH_SPAWN_EGG(new String[]{"1.13", "MONSTER_EGG", ""}),
    PUMPKIN,
    PUMPKIN_PIE,
    PUMPKIN_SEEDS,
    PUMPKIN_STEM,
    PURPLE_BANNER(5, new String[]{"BANNER", "STANDING_BANNER"}),
    PURPLE_BED(10, new String[]{"BED_BLOCK", "BED"}),
    PURPLE_CARPET(10, new String[]{"CARPET"}),
    PURPLE_CONCRETE(10, new String[]{"CONCRETE"}),
    PURPLE_CONCRETE_POWDER(10, new String[]{"CONCRETE_POWDER"}),
    PURPLE_DYE(5, new String[]{"INK_SACK"}),
    PURPLE_GLAZED_TERRACOTTA(10, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "PURPLE_TERRACOTTA"}),
    PURPLE_SHULKER_BOX,
    PURPLE_STAINED_GLASS(10, new String[]{"STAINED_GLASS"}),
    PURPLE_STAINED_GLASS_PANE(10, new String[]{"THIN_GLASS", "STAINED_GLASS_PANE"}),
    PURPLE_TERRACOTTA(10, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    PURPLE_WALL_BANNER(5, new String[]{"WALL_BANNER"}),
    PURPLE_WOOL(10, new String[]{"WOOL"}),
    PURPUR_BLOCK,
    PURPUR_PILLAR,
    PURPUR_SLAB(new String[]{"PURPUR_DOUBLE_SLAB"}),
    PURPUR_STAIRS,
    QUARTZ,
    QUARTZ_BLOCK,
    QUARTZ_BRICKS(new String[]{"1.16"}),
    QUARTZ_PILLAR(2, new String[]{"QUARTZ_BLOCK"}),
    QUARTZ_SLAB(7, new String[]{"STEP"}),
    QUARTZ_STAIRS,
    RABBIT,
    RABBIT_FOOT,
    RABBIT_HIDE,
    RABBIT_SPAWN_EGG(101, new String[]{"MONSTER_EGG"}),
    RABBIT_STEW,
    RAIL(new String[]{"RAILS"}),
    RAVAGER_SPAWN_EGG(new String[]{"1.14"}),
    REDSTONE,
    REDSTONE_BLOCK,
    REDSTONE_LAMP(new String[]{"REDSTONE_LAMP_ON", "REDSTONE_LAMP_OFF"}),
    REDSTONE_ORE(new String[]{"GLOWING_REDSTONE_ORE"}),
    REDSTONE_TORCH(new String[]{"REDSTONE_TORCH_OFF", "REDSTONE_TORCH_ON"}),
    REDSTONE_WALL_TORCH,
    REDSTONE_WIRE,
    RED_BANNER(1, new String[]{"BANNER", "STANDING_BANNER"}),
    RED_BED(0, new String[]{"BED_BLOCK", "BED"}),
    RED_CARPET(14, new String[]{"CARPET"}),
    RED_CONCRETE(14, new String[]{"CONCRETE"}),
    RED_CONCRETE_POWDER(14, new String[]{"CONCRETE_POWDER"}),
    RED_DYE(1, new String[]{"INK_SACK", "ROSE_RED"}),
    RED_GLAZED_TERRACOTTA(14, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "RED_TERRACOTTA"}),
    RED_MUSHROOM,
    RED_MUSHROOM_BLOCK(new String[]{"RED_MUSHROOM", "HUGE_MUSHROOM_2"}),
    RED_NETHER_BRICKS(new String[]{"RED_NETHER_BRICK"}),
    RED_NETHER_BRICK_SLAB(4, new String[]{"STEP"}),
    RED_NETHER_BRICK_STAIRS,
    RED_NETHER_BRICK_WALL,
    RED_SAND(1, new String[]{"SAND"}),
    RED_SANDSTONE,
    RED_SANDSTONE_SLAB(new String[]{"STONE_SLAB2", "DOUBLE_STONE_SLAB2"}),
    RED_SANDSTONE_STAIRS,
    RED_SANDSTONE_WALL,
    RED_SHULKER_BOX,
    RED_STAINED_GLASS(14, new String[]{"STAINED_GLASS"}),
    RED_STAINED_GLASS_PANE(14, new String[]{"THIN_GLASS", "STAINED_GLASS_PANE"}),
    RED_TERRACOTTA(14, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    RED_TULIP(4, new String[]{"RED_ROSE"}),
    RED_WALL_BANNER(1, new String[]{"WALL_BANNER"}),
    RED_WOOL(14, new String[]{"WOOL"}),
    REPEATER(new String[]{"DIODE", "DIODE_BLOCK_ON", "DIODE_BLOCK_OFF"}),
    REPEATING_COMMAND_BLOCK(new String[]{"COMMAND", "COMMAND_REPEATING"}),
    RESPAWN_ANCHOR(new String[]{"1.16"}),
    ROSE_BUSH(4, new String[]{"DOUBLE_PLANT"}),
    ROTTEN_FLESH,
    SADDLE,
    SALMON(1, new String[]{"RAW_FISH"}),
    SALMON_BUCKET(new String[]{"1.13", "BUCKET", "WATER_BUCKET", ""}),
    SALMON_SPAWN_EGG(new String[]{"1.13", "MONSTER_EGG", ""}),
    SAND,
    SANDSTONE,
    SANDSTONE_SLAB(1, new String[]{"STEP", "STONE_SLAB", "DOUBLE_STEP"}),
    SANDSTONE_STAIRS,
    SANDSTONE_WALL,
    SCAFFOLDING(new String[]{"1.14", "SLIME_BLOCK", ""}),
    SCUTE(new String[]{"1.13"}),
    SEAGRASS(new String[]{"1.13", "GRASS", ""}),
    SEA_LANTERN,
    SEA_PICKLE(new String[]{"1.13"}),
    SHEARS,
    SHEEP_SPAWN_EGG(91, new String[]{"MONSTER_EGG"}),
    SHIELD,
    SHROOMLIGHT(new String[]{"1.16"}),
    SHULKER_BOX(new String[]{"PURPLE_SHULKER_BOX"}),
    SHULKER_SHELL,
    SHULKER_SPAWN_EGG(69, new String[]{"MONSTER_EGG"}),
    SILVERFISH_SPAWN_EGG(60, new String[]{"MONSTER_EGG"}),
    SKELETON_HORSE_SPAWN_EGG(28, new String[]{"MONSTER_EGG"}),
    SKELETON_SKULL(new String[]{"SKULL", "SKULL_ITEM"}),
    SKELETON_SPAWN_EGG(51, new String[]{"MONSTER_EGG"}),
    SKELETON_WALL_SKULL(new String[]{"SKULL", "SKULL_ITEM"}),
    SKULL_BANNER_PATTERN,
    SLIME_BALL,
    SLIME_BLOCK,
    SLIME_SPAWN_EGG(55, new String[]{"MONSTER_EGG"}),
    SMITHING_TABLE,
    SMOKER(new String[]{"1.14", "FURNACE", ""}),
    SMOOTH_QUARTZ(new String[]{"1.13", "QUARTZ", ""}),
    SMOOTH_QUARTZ_SLAB(7, new String[]{"STEP"}),
    SMOOTH_QUARTZ_STAIRS,
    SMOOTH_RED_SANDSTONE(2, new String[]{"RED_SANDSTONE"}),
    SMOOTH_RED_SANDSTONE_SLAB(new String[]{"STONE_SLAB2"}),
    SMOOTH_RED_SANDSTONE_STAIRS,
    SMOOTH_SANDSTONE(2, new String[]{"SANDSTONE"}),
    SMOOTH_SANDSTONE_SLAB(new String[]{"STEP"}),
    SMOOTH_SANDSTONE_STAIRS,
    SMOOTH_STONE(new String[]{"STEP"}),
    SMOOTH_STONE_SLAB(new String[]{"STEP"}),
    SNOW,
    SNOWBALL(new String[]{"SNOW_BALL"}),
    SNOW_BLOCK,
    SOUL_CAMPFIRE(new String[]{"1.16"}),
    SOUL_FIRE(new String[]{"1.16"}),
    SOUL_LANTERN(new String[]{"1.16"}),
    SOUL_SAND,
    SOUL_SOIL(new String[]{"1.16"}),
    SOUL_TORCH(new String[]{"1.16"}),
    SOUL_WALL_TORCH(new String[]{"1.16"}),
    SPAWNER(new String[]{"MOB_SPAWNER"}),
    SPECTRAL_ARROW(new String[]{"1.9", "ARROW", ""}),
    SPIDER_EYE,
    SPIDER_SPAWN_EGG(52, new String[]{"MONSTER_EGG"}),
    SPLASH_POTION,
    SPONGE,
    SPRUCE_BOAT(new String[]{"BOAT_SPRUCE"}),
    SPRUCE_BUTTON(new String[]{"WOOD_BUTTON"}),
    SPRUCE_DOOR(new String[]{"SPRUCE_DOOR_ITEM", "SPRUCE_DOOR"}),
    SPRUCE_FENCE,
    SPRUCE_FENCE_GATE,
    SPRUCE_LEAVES(1, new String[]{"LEAVES"}),
    SPRUCE_LOG(1, new String[]{"LOG"}),
    SPRUCE_PLANKS(1, new String[]{"WOOD"}),
    SPRUCE_PRESSURE_PLATE(new String[]{"WOOD_PLATE"}),
    SPRUCE_SAPLING(1, new String[]{"SAPLING"}),
    SPRUCE_SIGN(new String[]{"SIGN"}),
    SPRUCE_SLAB(1, new String[]{"WOOD_STEP", "WOODEN_SLAB", "WOOD_DOUBLE_STEP"}),
    SPRUCE_STAIRS(new String[]{"SPRUCE_WOOD_STAIRS"}),
    SPRUCE_TRAPDOOR(new String[]{"TRAP_DOOR"}),
    SPRUCE_WALL_SIGN(new String[]{"SIGN_POST", "WALL_SIGN"}),
    SPRUCE_WOOD(1, new String[]{"LOG"}),
    SQUID_SPAWN_EGG(94, new String[]{"MONSTER_EGG"}),
    STICK,
    STICKY_PISTON(new String[]{"PISTON_BASE", "PISTON_STICKY_BASE"}),
    STONE,
    STONECUTTER(new String[]{"1.14"}),
    STONE_AXE,
    STONE_BRICKS(new String[]{"SMOOTH_BRICK"}),
    STONE_BRICK_SLAB(4, new String[]{"STEP", "STONE_SLAB", "DOUBLE_STEP"}),
    STONE_BRICK_STAIRS(new String[]{"SMOOTH_STAIRS"}),
    STONE_BRICK_WALL,
    STONE_BUTTON,
    STONE_HOE,
    STONE_PICKAXE,
    STONE_PRESSURE_PLATE(new String[]{"STONE_PLATE"}),
    STONE_SHOVEL(new String[]{"STONE_SPADE"}),
    STONE_SLAB(new String[]{"STEP", "DOUBLE_STEP"}),
    STONE_STAIRS,
    STONE_SWORD,
    STRAY_SPAWN_EGG(6, new String[]{"MONSTER_EGG"}),
    STRIDER_SPAWN_EGG(new String[]{"1.16"}),
    STRING,
    STRIPPED_ACACIA_LOG(new String[]{"LOG_2"}),
    STRIPPED_ACACIA_WOOD(new String[]{"LOG_2"}),
    STRIPPED_BIRCH_LOG(2, new String[]{"LOG"}),
    STRIPPED_BIRCH_WOOD(2, new String[]{"LOG"}),
    STRIPPED_CRIMSON_HYPHAE(new String[]{"1.16"}),
    STRIPPED_CRIMSON_STEM(new String[]{"1.16"}),
    STRIPPED_DARK_OAK_LOG(new String[]{"LOG"}),
    STRIPPED_DARK_OAK_WOOD(new String[]{"LOG"}),
    STRIPPED_JUNGLE_LOG(3, new String[]{"LOG"}),
    STRIPPED_JUNGLE_WOOD(3, new String[]{"LOG"}),
    STRIPPED_OAK_LOG(new String[]{"LOG"}),
    STRIPPED_OAK_WOOD(new String[]{"LOG"}),
    STRIPPED_SPRUCE_LOG(1, new String[]{"LOG"}),
    STRIPPED_SPRUCE_WOOD(1, new String[]{"LOG"}),
    STRIPPED_WARPED_HYPHAE(new String[]{"1.16"}),
    STRIPPED_WARPED_STEM(new String[]{"1.16"}),
    STRUCTURE_BLOCK,
    STRUCTURE_VOID(new String[]{"1.10", "", "BARRIER"}),
    SUGAR,
    SUGAR_CANE(new String[]{"SUGAR_CANE_BLOCK"}),
    SUNFLOWER(new String[]{"DOUBLE_PLANT"}),
    SUSPICIOUS_STEW(new String[]{"1.14", "MUSHROOM_STEW", ""}),
    SWEET_BERRIES(new String[]{"1.14"}),
    SWEET_BERRY_BUSH(new String[]{"1.14", "GRASS", ""}),
    TALL_GRASS(2, new String[]{"DOUBLE_PLANT"}),
    TALL_SEAGRASS(2, new String[]{"1.13", "TALL_GRASS", ""}),
    TARGET(new String[]{"1.16"}),
    TERRACOTTA(new String[]{"HARD_CLAY"}),
    TIPPED_ARROW(new String[]{"1.9", "ARROW", ""}),
    TNT,
    TNT_MINECART(new String[]{"EXPLOSIVE_MINECART"}),
    TORCH,
    TOTEM_OF_UNDYING(new String[]{"TOTEM"}),
    TRADER_LLAMA_SPAWN_EGG(103, new String[]{"1.14", "MONSTER_EGG", ""}),
    TRAPPED_CHEST,
    TRIDENT(new String[]{"1.13"}),
    TRIPWIRE,
    TRIPWIRE_HOOK,
    TROPICAL_FISH(2, new String[]{"RAW_FISH"}),
    TROPICAL_FISH_BUCKET(new String[]{"1.13", "BUCKET", "WATER_BUCKET"}),
    TROPICAL_FISH_SPAWN_EGG(new String[]{"1.13", "MONSTER_EGG"}),
    TUBE_CORAL(new String[]{"1.13"}),
    TUBE_CORAL_BLOCK(new String[]{"1.13"}),
    TUBE_CORAL_FAN(new String[]{"1.13"}),
    TUBE_CORAL_WALL_FAN,
    TURTLE_EGG(new String[]{"1.13", "EGG", ""}),
    TURTLE_HELMET(new String[]{"1.13", "IRON_HELMET", ""}),
    TURTLE_SPAWN_EGG(new String[]{"1.13", "CHICKEN_SPAWN_EGG", ""}),
    TWISTING_VINES(new String[]{"1.16"}),
    TWISTING_VINES_PLANT(new String[]{"1.16"}),
    VEX_SPAWN_EGG(35, new String[]{"MONSTER_EGG"}),
    VILLAGER_SPAWN_EGG(120, new String[]{"MONSTER_EGG"}),
    VINDICATOR_SPAWN_EGG(36, new String[]{"MONSTER_EGG"}),
    VINE,
    VOID_AIR(new String[]{"AIR"}),
    WALL_TORCH(new String[]{"TORCH"}),
    WANDERING_TRADER_SPAWN_EGG(new String[]{"1.14", "VILLAGER_SPAWN_EGG", ""}),
    WARPED_BUTTON(new String[]{"1.16"}),
    WARPED_DOOR(new String[]{"1.16"}),
    WARPED_FENCE(new String[]{"1.16"}),
    WARPED_FENCE_GATE(new String[]{"1.16"}),
    WARPED_FUNGUS(new String[]{"1.16"}),
    WARPED_FUNGUS_ON_A_STICK(new String[]{"1.16"}),
    WARPED_HYPHAE(new String[]{"1.16"}),
    WARPED_NYLIUM(new String[]{"1.16"}),
    WARPED_PLANKS(new String[]{"1.16"}),
    WARPED_PRESSURE_PLATE(new String[]{"1.16"}),
    WARPED_ROOTS(new String[]{"1.16"}),
    WARPED_SIGN(new String[]{"1.16"}),
    WARPED_SLAB(new String[]{"1.16"}),
    WARPED_STAIRS(new String[]{"1.16"}),
    WARPED_STEM(new String[]{"1.16"}),
    WARPED_TRAPDOOR(new String[]{"1.16"}),
    WARPED_WALL_SIGN(new String[]{"1.16"}),
    WARPED_WART_BLOCK(new String[]{"1.16"}),
    WATER(new String[]{"STATIONARY_WATER"}),
    WATER_BUCKET,
    WEEPING_VINES(new String[]{"1.16"}),
    WEEPING_VINES_PLANT(new String[]{"1.16"}),
    WET_SPONGE(1, new String[]{"SPONGE"}),
    WHEAT(new String[]{"CROPS"}),
    WHEAT_SEEDS(new String[]{"SEEDS"}),
    WHITE_BANNER(15, new String[]{"BANNER", "STANDING_BANNER"}),
    WHITE_BED(new String[]{"BED_BLOCK", "BED"}),
    WHITE_CARPET(new String[]{"CARPET"}),
    WHITE_CONCRETE(new String[]{"CONCRETE"}),
    WHITE_CONCRETE_POWDER(new String[]{"CONCRETE_POWDER"}),
    WHITE_DYE(15, new String[]{"1.14", "INK_SACK", "BONE_MEAL"}),
    WHITE_GLAZED_TERRACOTTA(new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY"}),
    WHITE_SHULKER_BOX,
    WHITE_STAINED_GLASS(new String[]{"STAINED_GLASS"}),
    WHITE_STAINED_GLASS_PANE(new String[]{"THIN_GLASS", "STAINED_GLASS_PANE"}),
    WHITE_TERRACOTTA(new String[]{"HARD_CLAY", "STAINED_CLAY", "TERRACOTTA"}),
    WHITE_TULIP(6, new String[]{"RED_ROSE"}),
    WHITE_WALL_BANNER(15, new String[]{"WALL_BANNER"}),
    WHITE_WOOL(new String[]{"WOOL"}),
    WITCH_SPAWN_EGG(66, new String[]{"MONSTER_EGG"}),
    WITHER_ROSE(new String[]{"1.14", "BLACK_DYE", ""}),
    WITHER_SKELETON_SKULL(1, new String[]{"SKULL", "SKULL_ITEM"}),
    WITHER_SKELETON_SPAWN_EGG(5, new String[]{"MONSTER_EGG"}),
    WITHER_SKELETON_WALL_SKULL(1, new String[]{"SKULL", "SKULL_ITEM"}),
    WOLF_SPAWN_EGG(95, new String[]{"MONSTER_EGG"}),
    WOODEN_AXE(new String[]{"WOOD_AXE"}),
    WOODEN_HOE(new String[]{"WOOD_HOE"}),
    WOODEN_PICKAXE(new String[]{"WOOD_PICKAXE"}),
    WOODEN_SHOVEL(new String[]{"WOOD_SPADE"}),
    WOODEN_SWORD(new String[]{"WOOD_SWORD"}),
    WRITABLE_BOOK(new String[]{"BOOK_AND_QUILL"}),
    WRITTEN_BOOK,
    YELLOW_BANNER(11, new String[]{"BANNER", "STANDING_BANNER"}),
    YELLOW_BED(4, new String[]{"BED_BLOCK", "BED"}),
    YELLOW_CARPET(4, new String[]{"CARPET"}),
    YELLOW_CONCRETE(4, new String[]{"CONCRETE"}),
    YELLOW_CONCRETE_POWDER(4, new String[]{"CONCRETE_POWDER"}),
    YELLOW_DYE(11, new String[]{"INK_SACK", "DANDELION_YELLOW"}),
    YELLOW_GLAZED_TERRACOTTA(4, new String[]{"1.12", "HARD_CLAY", "STAINED_CLAY", "YELLOW_TERRACOTTA"}),
    YELLOW_SHULKER_BOX,
    YELLOW_STAINED_GLASS(4, new String[]{"STAINED_GLASS"}),
    YELLOW_STAINED_GLASS_PANE(4, new String[]{"THIN_GLASS", "STAINED_GLASS_PANE"}),
    YELLOW_TERRACOTTA(4, new String[]{"HARD_CLAY", "STAINED_CLAY"}),
    YELLOW_WALL_BANNER(11, new String[]{"WALL_BANNER"}),
    YELLOW_WOOL(4, new String[]{"WOOL"}),
    ZOGLIN_SPAWN_EGG(new String[]{"1.16"}),
    ZOMBIE_HEAD(2, new String[]{"SKULL", "SKULL_ITEM"}),
    ZOMBIE_HORSE_SPAWN_EGG(29, new String[]{"MONSTER_EGG"}),
    ZOMBIE_SPAWN_EGG(54, new String[]{"MONSTER_EGG"}),
    ZOMBIE_VILLAGER_SPAWN_EGG(27, new String[]{"MONSTER_EGG"}),
    ZOMBIE_WALL_HEAD(2, new String[]{"SKULL", "SKULL_ITEM"}),
    ZOMBIFIED_PIGLIN_SPAWN_EGG(57, new String[]{"MONSTER_EGG", "ZOMBIE_PIGMAN_SPAWN_EGG"});

    public static final EnumSet<XMaterial> VALUES = EnumSet.allOf(XMaterial.class);
    private static final Map<String, XMaterial> NAMES;
    private static final ImmutableSet<String> DAMAGEABLE = ImmutableSet.of("HELMET", "CHESTPLATE", "LEGGINGS", "BOOTS", "SWORD", "AXE", new String[]{"PICKAXE", "SHOVEL", "HOE", "ELYTRA", "TRIDENT", "HORSE_ARMOR", "BARDING", "SHEARS", "FLINT_AND_STEEL", "BOW", "FISHING_ROD", "CARROT_ON_A_STICK", "CARROT_STICK", "SPADE", "SHIELD"});
    private static final EnumMap<XMaterial, XMaterial> DUPLICATED = new EnumMap<XMaterial, XMaterial>(XMaterial.class) {
        {
            this.put(XMaterial.MELON, XMaterial.MELON_SLICE);
            this.put(XMaterial.CARROT, XMaterial.CARROTS);
            this.put(XMaterial.POTATO, XMaterial.POTATOES);
            this.put(XMaterial.BEETROOT, XMaterial.BEETROOTS);
            this.put(XMaterial.BROWN_MUSHROOM, XMaterial.BROWN_MUSHROOM_BLOCK);
            this.put(XMaterial.BRICK, XMaterial.BRICKS);
            this.put(XMaterial.NETHER_BRICK, XMaterial.NETHER_BRICKS);
            this.put(XMaterial.DARK_OAK_DOOR, XMaterial.DARK_OAK_DOOR);
            this.put(XMaterial.ACACIA_DOOR, XMaterial.ACACIA_DOOR);
            this.put(XMaterial.BIRCH_DOOR, XMaterial.BIRCH_DOOR);
            this.put(XMaterial.JUNGLE_DOOR, XMaterial.JUNGLE_DOOR);
            this.put(XMaterial.SPRUCE_DOOR, XMaterial.SPRUCE_DOOR);
            this.put(XMaterial.CAULDRON, XMaterial.CAULDRON);
        }
    };
    private static final Cache<String, XMaterial> NAME_CACHE = CacheBuilder.newBuilder().softValues().expireAfterAccess(15L, TimeUnit.MINUTES).build();
    private static final Cache<XMaterial, Optional<Material>> PARSED_CACHE = CacheBuilder.newBuilder().softValues().expireAfterAccess(10L, TimeUnit.MINUTES).build();
    private static final Pattern FORMAT_PATTERN = Pattern.compile("\\W+");
    private static final int VERSION = Integer.parseInt(getMajorVersion(Bukkit.getVersion()).substring(2));
    private static final boolean ISFLAT = supports(13);
    private final byte data;
    private final String[] legacy;

    private XMaterial(int data, String... legacy) {
        this.data = (byte)data;
        this.legacy = legacy;
    }

    private XMaterial() {
        this(0);
    }

    private XMaterial(String... legacy) {
        this(0, legacy);
    }

    public static boolean isNewVersion() {
        return ISFLAT;
    }

    public static boolean isOneEight() {
        return !supports(9);
    }

    @Nonnull
    private static Optional<XMaterial> getIfPresent(@Nonnull String name) {
        return Optional.ofNullable((XMaterial)NAMES.get(name));
    }

    public static double getVersion() {
        return (double)VERSION;
    }

    @Nullable
    private static XMaterial requestOldXMaterial(@Nonnull String name, byte data) {
        String holder = name + data;
        XMaterial cache = (XMaterial)NAME_CACHE.getIfPresent(holder);
        if (cache != null) {
            return cache;
        } else {
            Iterator var4 = VALUES.iterator();

            XMaterial material;
            do {
                do {
                    if (!var4.hasNext()) {
                        return null;
                    }

                    material = (XMaterial)var4.next();
                } while(data != -1 && data != material.data);
            } while(!material.anyMatchLegacy(name));

            NAME_CACHE.put(holder, material);
            return material;
        }
    }

    public static boolean contains(@Nonnull String name) {
        Validate.notEmpty(name, "Cannot check for null or empty material name");
        name = format(name);
        Iterator var1 = VALUES.iterator();

        XMaterial materials;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            materials = (XMaterial)var1.next();
        } while(!materials.name().equals(name));

        return true;
    }

    @Nonnull
    public static Optional<XMaterial> matchXMaterial(@Nonnull String name) {
        Validate.notEmpty(name, "Cannot match a material with null or empty material name");
        Optional<XMaterial> oldMatch = matchXMaterialWithData(name);
        return oldMatch.isPresent() ? oldMatch : matchDefinedXMaterial(format(name), (byte)-1);
    }

    @Nonnull
    private static Optional<XMaterial> matchXMaterialWithData(String name) {
        char[] var1 = new char[]{',', ':'};
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            char separator = var1[var3];
            int index = name.indexOf(separator);
            if (index != -1) {
                String mat = format(name.substring(0, index));
                byte data = Byte.parseByte(StringUtils.deleteWhitespace(name.substring(index + 1)));
                return matchDefinedXMaterial(mat, data);
            }
        }

        return Optional.empty();
    }

    @Nonnull
    public static XMaterial matchXMaterial(@Nonnull Material material) {
        Objects.requireNonNull(material, "Cannot match null material");
        return (XMaterial)matchDefinedXMaterial(material.name(), (byte)-1).orElseThrow(() -> {
            return new IllegalArgumentException("Unsupported Material With No Bytes: " + material.name());
        });
    }

    @Nonnull
    public static XMaterial matchXMaterial(@Nonnull ItemStack item) {
        Objects.requireNonNull(item, "Cannot match null ItemStack");
        String material = item.getType().name();
        byte data = (byte)(!ISFLAT && !isDamageable(material) ? item.getDurability() : 0);
        return (XMaterial)matchDefinedXMaterial(material, data).orElseThrow(() -> {
            return new IllegalArgumentException("Unsupported Material: " + material + " (" + data + ')');
        });
    }

    @Nonnull
    private static Optional<XMaterial> matchDefinedXMaterial(@Nonnull String name, byte data) {
        boolean duplicated = isDuplicated(name);
        Optional<XMaterial> xMaterial = null;
        if (data <= 0 && (ISFLAT || !duplicated)) {
            xMaterial = getIfPresent(name);
            if (xMaterial.isPresent()) {
                return xMaterial;
            }
        }

        XMaterial xMat = requestOldXMaterial(name, data);
        if (xMat == null) {
            return data > 0 && name.endsWith("MAP") ? Optional.of(FILLED_MAP) : Optional.empty();
        } else if (!ISFLAT && duplicated && xMat.name().charAt(xMat.name().length() - 1) == 'S') {
            return xMaterial == null ? getIfPresent(name) : xMaterial;
        } else {
            return Optional.ofNullable(xMat);
        }
    }

    private static boolean isDuplicated(@Nonnull String name) {
        Iterator var1 = DUPLICATED.entrySet().iterator();

        XMaterial material;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            Entry<XMaterial, XMaterial> duplicated = (Entry)var1.next();
            material = (XMaterial)duplicated.getKey();
        } while(!material.name().equals(name) && !material.anyMatchLegacy(name));

        return true;
    }

    @Nonnull
    public static Optional<XMaterial> matchXMaterial(int id, byte data) {
        if (id >= 0 && data >= 0) {
            Iterator var2 = VALUES.iterator();

            XMaterial materials;
            do {
                if (!var2.hasNext()) {
                    return Optional.empty();
                }

                materials = (XMaterial)var2.next();
            } while(materials.data != data || materials.getId() != id);

            return Optional.of(materials);
        } else {
            return Optional.empty();
        }
    }

    @Nonnull
    private static String format(@Nonnull String name) {
        return FORMAT_PATTERN.matcher(name.trim().replace('-', '_').replace(' ', '_')).replaceAll("").toUpperCase(Locale.ENGLISH);
    }

    public static boolean supports(int version) {
        return VERSION >= version;
    }

    @Nonnull
    public static String toWord(@Nonnull Material material) {
        Objects.requireNonNull(material, "Cannot translate a null material to a word");
        return toWord(material.name());
    }

    @Nonnull
    private static String toWord(@Nonnull String name) {
        return WordUtils.capitalize(name.replace('_', ' ').toLowerCase(Locale.ENGLISH));
    }

    @Nonnull
    public static String getMajorVersion(@Nonnull String version) {
        Validate.notEmpty(version, "Cannot get major Minecraft version from null or empty string");
        int index = version.lastIndexOf("MC:");
        if (index != -1) {
            version = version.substring(index + 4, version.length() - 1);
        } else if (version.endsWith("SNAPSHOT")) {
            index = version.indexOf(45);
            version = version.substring(0, index);
        }

        int lastDot = version.lastIndexOf(46);
        if (version.indexOf(46) != lastDot) {
            version = version.substring(0, lastDot);
        }

        return version;
    }

    public static boolean isDamageable(@Nonnull String name) {
        Objects.requireNonNull(name, "Material name cannot be null");
        UnmodifiableIterator var1 = DAMAGEABLE.iterator();

        String damageable;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            damageable = (String)var1.next();
        } while(!name.contains(damageable));

        return true;
    }

    public static boolean isOneOf(@Nonnull Material material, @Nullable List<String> materials) {
        if (materials != null && !materials.isEmpty()) {
            Objects.requireNonNull(material, "Cannot match materials with a null material");
            String name = material.name();
            Iterator var3 = materials.iterator();

            while(var3.hasNext()) {
                String comp = (String)var3.next();
                comp = comp.toUpperCase();
                if (comp.startsWith("CONTAINS:")) {
                    comp = format(comp.substring(9));
                    if (name.contains(comp)) {
                        return true;
                    }
                } else if (comp.startsWith("REGEX:")) {
                    comp = comp.substring(6);
                    if (name.matches(comp)) {
                        return true;
                    }
                } else {
                    Optional<XMaterial> mat = matchXMaterial(comp);
                    if (mat.isPresent()) {
                        Optional<Material> xmat = ((XMaterial)mat.get()).parseMaterial();
                        if (xmat.isPresent() && xmat.get() == material) {
                            return true;
                        }
                    }
                }
            }

            return false;
        } else {
            return false;
        }
    }

    public int getMaterialVersion() {
        if (this.legacy.length == 0) {
            return 0;
        } else {
            String version = this.legacy[0];
            return version.charAt(1) != '.' ? 0 : Integer.parseInt(version.substring(2));
        }
    }

    @Nonnull
    public ItemStack setType(@Nonnull ItemStack item) {
        Objects.requireNonNull(item, "Cannot set material for null ItemStack");
        Optional<Material> opt = this.parseMaterial();
        Validate.isTrue(opt.isPresent(), "Unsupported material: " + this.name());
        item.setType((Material)opt.get());
        if (!ISFLAT && !this.isDamageable()) {
            item.setDurability((short)this.data);
        }

        return item;
    }

    public boolean isOneOf(@Nullable List<String> materials) {
        Optional<Material> material = this.parseMaterial();
        return material.filter((value) -> {
            return isOneOf(value, materials);
        }).isPresent();
    }

    private boolean anyMatchLegacy(@Nonnull String name) {
        String[] var2 = this.legacy;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String legacy = var2[var4];
            if (legacy.isEmpty()) {
                break;
            }

            if (name.equals(legacy)) {
                return true;
            }
        }

        return false;
    }

    public String toString() {
        return toWord(this.name());
    }

    public int getId() {
        if (this.data == 0 && (this.legacy.length == 0 || Integer.parseInt(this.legacy[0].substring(2)) < 13)) {
            Optional<Material> opt = this.parseMaterial();
            return (Integer)opt.map(Material::getId).orElse(-1);
        } else {
            return -1;
        }
    }

    public boolean isDuplicated() {
        return DUPLICATED.containsKey(this);
    }

    public boolean isDamageable() {
        return isDamageable(this.name());
    }

    public byte getData() {
        return this.data;
    }

    @Nonnull
    public String[] getLegacy() {
        return this.legacy;
    }

    @Nullable
    public ItemStack parseItem() {
        return this.parseItem(false);
    }

    @Nullable
    public ItemStack parseItem(boolean suggest) {
        Optional<Material> opt = this.parseMaterial(suggest);
        if (!opt.isPresent()) {
            return null;
        } else {
            Material material = (Material)opt.get();
            return ISFLAT ? new ItemStack(material) : new ItemStack(material, 1, (short)this.data);
        }
    }

    @Nonnull
    public Optional<Material> parseMaterial() {
        return this.parseMaterial(false);
    }

    @Nonnull
    public Optional<Material> parseMaterial(boolean suggest) {
        Optional<Material> cache = (Optional)PARSED_CACHE.getIfPresent(this);
        if (cache != null) {
            return cache;
        } else {
            Material mat;
            if (!ISFLAT && this.isDuplicated()) {
                mat = this.requestOldMaterial(suggest);
            } else {
                mat = Material.getMaterial(this.name());
                if (mat == null) {
                    mat = this.requestOldMaterial(suggest);
                }
            }

            Optional<Material> opt = Optional.ofNullable(mat);
            PARSED_CACHE.put(this, opt);
            return opt;
        }
    }

    @Nullable
    private Material requestOldMaterial(boolean suggest) {
        for(int i = this.legacy.length - 1; i >= 0; --i) {
            String legacy = this.legacy[i];
            if (i == 0 && legacy.charAt(1) == '.') {
                return null;
            }

            if (legacy.isEmpty()) {
                if (!suggest) {
                    break;
                }
            } else {
                Material material = Material.getMaterial(legacy);
                if (material != null) {
                    return material;
                }
            }
        }

        return null;
    }

    public boolean isSimilar(@Nonnull ItemStack item) {
        Objects.requireNonNull(item, "Cannot compare with null ItemStack");
        if (item.getType() != this.parseMaterial().orElse(null)) {
            return false;
        } else {
            return ISFLAT || this.isDamageable() || item.getDurability() == this.data;
        }
    }

    @Nonnull
    public List<String> getSuggestions() {
        if (this.legacy.length != 0 && this.legacy[0].charAt(1) == '.') {
            List<String> suggestions = new ArrayList();
            String[] var2 = this.legacy;
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                String legacy = var2[var4];
                if (legacy.isEmpty()) {
                    break;
                }

                suggestions.add(legacy);
            }

            return suggestions;
        } else {
            return new ArrayList();
        }
    }

    public boolean isSupported() {
        int version = this.getMaterialVersion();
        if (version != 0) {
            return supports(version);
        } else {
            Material material = Material.getMaterial(this.name());
            if (material != null) {
                return true;
            } else {
                return this.requestOldMaterial(false) != null;
            }
        }
    }

    public boolean isFromNewSystem() {
        return this.legacy.length != 0 && Integer.parseInt(this.legacy[0].substring(2)) > 13;
    }

    static {
        Builder<String, XMaterial> builder = ImmutableMap.builder();
        Iterator var1 = VALUES.iterator();

        while(var1.hasNext()) {
            XMaterial material = (XMaterial)var1.next();
            builder.put(material.name(), material);
        }

        NAMES = builder.build();
    }
}
