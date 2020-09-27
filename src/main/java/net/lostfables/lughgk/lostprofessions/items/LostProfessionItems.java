package net.lostfables.lughgk.lostprofessions.items;

import net.lordofthecraft.itemedit.ItemBuilder;
import net.lordofthecraft.itemedit.enums.*;
import net.lostfables.lughgk.lostprofessions.Lostprofessions;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Furnace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.*;

public class LostProfessionItems implements Listener {

    public LostProfessionItems() {
        remove(Material.LEATHER_HELMET);
        remove(Material.LEATHER_CHESTPLATE);
        remove(Material.LEATHER_LEGGINGS);
        remove(Material.LEATHER_BOOTS);

        remove(Material.IRON_HELMET);
        remove(Material.IRON_CHESTPLATE);
        remove(Material.IRON_LEGGINGS);
        remove(Material.IRON_BOOTS);
        remove(Material.BUCKET);
        remove(Material.IRON_NUGGET);
        remove(Material.IRON_BLOCK);
        remove(Material.IRON_INGOT);
        remove(Material.IRON_BARS);
        remove(Material.IRON_DOOR);
        remove(Material.IRON_TRAPDOOR);
        remove(Material.IRON_AXE);
        remove(Material.IRON_PICKAXE);
        remove(Material.IRON_SWORD);
        remove(Material.IRON_HOE);
        remove(Material.IRON_SHOVEL);
        remove(Material.COMPASS);
        remove(Material.CLOCK);
        remove(Material.SHIELD);
        remove(Material.SHEARS);
        remove(Material.ANVIL);

        remove(Material.GOLDEN_HELMET);
        remove(Material.GOLDEN_CHESTPLATE);
        remove(Material.GOLDEN_LEGGINGS);
        remove(Material.GOLDEN_BOOTS);
        remove(Material.GOLD_NUGGET);
        remove(Material.GOLD_INGOT);
        remove(Material.GOLD_BLOCK);
        remove(Material.GOLDEN_AXE);
        remove(Material.GOLDEN_PICKAXE);
        remove(Material.GOLDEN_SWORD);
        remove(Material.GOLDEN_HOE);
        remove(Material.GOLDEN_SHOVEL);

        remove(Material.DIAMOND_BOOTS);
        remove(Material.DIAMOND_CHESTPLATE);
        remove(Material.DIAMOND_LEGGINGS);
        remove(Material.DIAMOND_HELMET);
        remove(Material.DIAMOND_BLOCK);
        remove(Material.DIAMOND_AXE);
        remove(Material.DIAMOND_PICKAXE);
        remove(Material.DIAMOND_SWORD);
        remove(Material.DIAMOND_HOE);
        remove(Material.DIAMOND_SHOVEL);
        remove(Material.ENCHANTING_TABLE);

        remove(Material.TURTLE_HELMET);

        remove(Material.ENDER_CHEST);
        remove(Material.RESPAWN_ANCHOR);

        List<Recipe> recipeList = new ArrayList<>();
        NamespacedKey nsKey;
        ShapelessRecipe slR;
        ShapedRecipe r;

        //Furnace Recipes
        nsKey = new NamespacedKey(Lostprofessions.get(), "ironore_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, ironIngot(), Material.IRON_ORE, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, ironIngot(), Material.IRON_ORE, 0, 4000));

        nsKey = new NamespacedKey(Lostprofessions.get(), "goldore_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, goldIngot(), Material.GOLD_ORE, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, goldIngot(), Material.GOLD_ORE, 0, 4000));

        nsKey = new NamespacedKey(Lostprofessions.get(), "lapisore_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, cobaltIngot(), Material.LAPIS_ORE, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, cobaltIngot(), Material.LAPIS_ORE, 0, 4000));

        nsKey = new NamespacedKey(Lostprofessions.get(), "redstoneore_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, calamiteIngot(), Material.REDSTONE_ORE, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, calamiteIngot(), Material.REDSTONE_ORE, 0, 4000));

        nsKey = new NamespacedKey(Lostprofessions.get(), "diorite_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, silverIngot(), Material.DIORITE, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, silverIngot(), Material.DIORITE, 0, 4000));

        nsKey = new NamespacedKey(Lostprofessions.get(), "coal_ore_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, tungstenIngot(), Material.COAL_ORE, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, tungstenIngot(), Material.COAL_ORE, 0, 4000));

        nsKey = new NamespacedKey(Lostprofessions.get(), "iron_block_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, platinumIngot(), Material.IRON_BLOCK, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, platinumIngot(), Material.IRON_BLOCK, 0, 4000));

        nsKey = new NamespacedKey(Lostprofessions.get(), "prismarine_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, luminideIngot(), Material.PRISMARINE, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, luminideIngot(), Material.PRISMARINE, 0, 4000));

        nsKey = new NamespacedKey(Lostprofessions.get(), "magmablock_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, meteoricMetalIngot(), Material.MAGMA_BLOCK, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, meteoricMetalIngot(), Material.MAGMA_BLOCK, 0, 4000));

        nsKey = new NamespacedKey(Lostprofessions.get(), "orangeterracota_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, copperIngot(), Material.ORANGE_TERRACOTTA, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, copperIngot(), Material.ORANGE_TERRACOTTA, 0, 4000));

        nsKey = new NamespacedKey(Lostprofessions.get(), "purple_glazed_terracota_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, litherCoal(), Material.PURPLE_GLAZED_TERRACOTTA, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, litherCoal(), Material.PURPLE_GLAZED_TERRACOTTA, 0, 4000));

        nsKey = new NamespacedKey(Lostprofessions.get(), "smoothredsandstone_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, palladiumIngot(), Material.SMOOTH_RED_SANDSTONE, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, palladiumIngot(), Material.SMOOTH_RED_SANDSTONE, 0, 4000));

        nsKey = new NamespacedKey(Lostprofessions.get(), "smoothquartz_smelt");
        Lostprofessions.get().getKeySet().add(nsKey);
        recipeList.add(new FurnaceRecipe(nsKey, tinIngot(), Material.SMOOTH_QUARTZ, 0, 6000));
        recipeList.add(new BlastingRecipe(nsKey, tinIngot(), Material.SMOOTH_QUARTZ, 0, 4000));


        //Shapeless recipes
        nsKey = new NamespacedKey(Lostprofessions.get(), "wool_string");
        Lostprofessions.get().getKeySet().add(nsKey);
        ItemStack item = new ItemStack(Material.STRING);
        item.setAmount(4);
        slR = new ShapelessRecipe(nsKey, item);
        slR.addIngredient(Material.WHITE_WOOL);
        recipeList.add(slR);

        nsKey = new NamespacedKey(Lostprofessions.get(), "metal_chunk");
        Lostprofessions.get().getKeySet().add(nsKey);
        slR = new ShapelessRecipe(nsKey, metalPiece(Component.BLUEPRINT));
        slR.addIngredient(Material.IRON_INGOT);
        recipeList.add(slR);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_metal_chunk");
        Lostprofessions.get().getKeySet().add(nsKey);
        slR = new ShapelessRecipe(nsKey, softMetalPiece(Component.BLUEPRINT));
        slR.addIngredient(Material.BRICK);
        recipeList.add(slR);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_metal_chunk");
        Lostprofessions.get().getKeySet().add(nsKey);
        slR = new ShapelessRecipe(nsKey, hardMetalPiece(Component.BLUEPRINT));
        slR.addIngredient(Material.NETHER_BRICK);
        recipeList.add(slR);

        nsKey = new NamespacedKey(Lostprofessions.get(), "gold_piece");
        Lostprofessions.get().getKeySet().add(nsKey);
        slR = new ShapelessRecipe(nsKey, goldPiece());
        slR.addIngredient(Material.GOLD_INGOT);
        recipeList.add(slR);

        nsKey = new NamespacedKey(Lostprofessions.get(), "ingot");
        Lostprofessions.get().getKeySet().add(nsKey);
        slR = new ShapelessRecipe(nsKey, ironIngot());
        slR.addIngredient(Material.IRON_NUGGET);
        slR.addIngredient(Material.IRON_NUGGET);
        slR.addIngredient(Material.IRON_NUGGET);
        slR.addIngredient(Material.IRON_NUGGET);
        slR.addIngredient(Material.IRON_NUGGET);
        recipeList.add(slR);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_ingot");
        Lostprofessions.get().getKeySet().add(nsKey);
        slR = new ShapelessRecipe(nsKey, ironIngot());
        slR.addIngredient(Material.ACACIA_BUTTON);
        slR.addIngredient(Material.ACACIA_BUTTON);
        slR.addIngredient(Material.ACACIA_BUTTON);
        slR.addIngredient(Material.ACACIA_BUTTON);
        slR.addIngredient(Material.ACACIA_BUTTON);
        recipeList.add(slR);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_ingot");
        Lostprofessions.get().getKeySet().add(nsKey);
        slR = new ShapelessRecipe(nsKey, ironIngot());
        slR.addIngredient(Material.DARK_OAK_BUTTON);
        slR.addIngredient(Material.DARK_OAK_BUTTON);
        slR.addIngredient(Material.DARK_OAK_BUTTON);
        slR.addIngredient(Material.DARK_OAK_BUTTON);
        slR.addIngredient(Material.DARK_OAK_BUTTON);
        recipeList.add(slR);

        //Shaped recipes - Light Armor
        nsKey = new NamespacedKey(Lostprofessions.get(), "cloth_coif");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, clothCoif());
        r.shape("SWS", "W W", "   ");
        r.setIngredient('W', Material.WHITE_WOOL);
        r.setIngredient('S', Material.STRING);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "leather_helm");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, leatherHelm());
        r.shape("LLL", "L L", "   ");
        r.setIngredient('L', Material.LEATHER);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hood");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, hood());
        r.shape(" W ", "W W", "   ");
        r.setIngredient('W', Material.WHITE_WOOL);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "gambeson");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, gambeson());
        r.shape("W W", "WWW", "WWW");
        r.setIngredient('W', Material.WHITE_WOOL);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "robes");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, robes());
        r.shape("S S", "SSS", "SSS");
        r.setIngredient('S', Material.STRING);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "harness");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, harness());
        r.shape("L L", "LLL", "LLL");
        r.setIngredient('L', Material.LEATHER);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "quilted_chausses");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, quiltedChausses());
        r.shape("WSW", "W W", "   ");
        r.setIngredient('W', Material.WHITE_WOOL);
        r.setIngredient('S', Material.STRING);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "leather_tassets");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, leatherTasset());
        r.shape("LSL", "L L", "   ");
        r.setIngredient('L', Material.LEATHER);
        r.setIngredient('S', Material.STRING);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "braies");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, braies());
        r.shape("SSS", "S S", "S S");
        r.setIngredient('S', Material.STRING);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "leather_boots");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, leatherBoots());
        r.shape("   ", "L L", "L L");
        r.setIngredient('L', Material.LEATHER);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "shoes");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, shoes());
        r.shape("   ", "   ", "L L");
        r.setIngredient('L', Material.LEATHER);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "reinforced_boots");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, reinforced_boots(Component.BLUEPRINT));
        r.shape("   ", "L L", "N N");
        r.setIngredient('L', Material.LEATHER);
        r.setIngredient('N', Material.IRON_NUGGET);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_reinforced_boots");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, reinforced_boots(Component.BLUEPRINT));
        r.shape("   ", "L L", "N N");
        r.setIngredient('L', Material.LEATHER);
        r.setIngredient('N', Material.ACACIA_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_reinforced_boots");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, reinforced_boots(Component.BLUEPRINT));
        r.shape("   ", "L L", "N N");
        r.setIngredient('L', Material.LEATHER);
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "nasal_helm");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, nasal_helm(Component.BLUEPRINT));
        r.shape("III", " N ", "   ");
        r.setIngredient('I', Material.IRON_INGOT);
        r.setIngredient('N', Material.IRON_NUGGET);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_nasal_helm");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, nasal_helm(Component.BLUEPRINT));
        r.shape("III", " N ", "   ");
        r.setIngredient('I', Material.BRICK);
        r.setIngredient('N', Material.ACACIA_BUTTON);
        recipeList.add(r);
        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_nasal_helm");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, nasal_helm(Component.BLUEPRINT));
        r.shape("III", " N ", "   ");
        r.setIngredient('I', Material.NETHER_BRICK);
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "maille_coif");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, maille_coif(Component.BLUEPRINT));
        r.shape("III", "I I", "   ");
        r.setIngredient('I', Material.IRON_NUGGET);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_maille_coif");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, maille_coif(Component.BLUEPRINT));
        r.shape("III", "I I", "   ");
        r.setIngredient('I', Material.ACACIA_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_maille_coif");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, maille_coif(Component.BLUEPRINT));
        r.shape("III", "I I", "   ");
        r.setIngredient('I', Material.DARK_OAK_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "barbute");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, barbute(Component.BLUEPRINT));
        r.shape("III", "N N", "   ");
        r.setIngredient('I', Material.IRON_INGOT);
        r.setIngredient('N', Material.IRON_NUGGET);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_barbute");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, barbute(Component.BLUEPRINT));
        r.shape("III", "N N", "   ");
        r.setIngredient('I', Material.BRICK);
        r.setIngredient('N', Material.ACACIA_BUTTON);
        recipeList.add(r);
        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_barbute");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, barbute(Component.BLUEPRINT));
        r.shape("III", "N N", "   ");
        r.setIngredient('I', Material.NETHER_BRICK);
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "brigandine");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, brigandine(Component.BLUEPRINT));
        r.shape("I I", "NIN", "INI");
        r.setIngredient('I', Material.LEATHER);
        r.setIngredient('N', Material.IRON_NUGGET);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_brigandine");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, brigandine(Component.BLUEPRINT));
        r.shape("I I", "NIN", "INI");
        r.setIngredient('I', Material.LEATHER);
        r.setIngredient('N', Material.ACACIA_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_brigandine");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, brigandine(Component.BLUEPRINT));
        r.shape("I I", "NIN", "INI");
        r.setIngredient('I', Material.LEATHER);
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hauberk");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, hauberk(Component.BLUEPRINT));
        r.shape("N N", "NNN", "NNN");
        r.setIngredient('N', Material.IRON_NUGGET);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_hauberk");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, hauberk(Component.BLUEPRINT));
        r.shape("N N", "NNN", "NNN");
        r.setIngredient('N', Material.ACACIA_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_hauberk");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, hauberk(Component.BLUEPRINT));
        r.shape("N N", "NNN", "NNN");
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "maille_chausses");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, maille_chausses(Component.BLUEPRINT));
        r.shape("NNN", "N N", "N N");
        r.setIngredient('N', Material.IRON_NUGGET);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_maille_chausses");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, maille_chausses(Component.BLUEPRINT));
        r.shape("NNN", "N N", "N N");
        r.setIngredient('N', Material.ACACIA_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_maille_chausses");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, maille_chausses(Component.BLUEPRINT));
        r.shape("NNN", "N N", "N N");
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "cuisse");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, cuisse(Component.BLUEPRINT));
        r.shape("III", "N N", "N N");
        r.setIngredient('I', Material.IRON_INGOT);
        r.setIngredient('N', Material.IRON_NUGGET);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_cuisse");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, cuisse(Component.BLUEPRINT));
        r.shape("III", "N N", "N N");
        r.setIngredient('I', Material.BRICK);
        r.setIngredient('N', Material.ACACIA_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_cuisse");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, cuisse(Component.BLUEPRINT));
        r.shape("III", "N N", "N N");
        r.setIngredient('I', Material.NETHER_BRICK);
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "fullplatelegs");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, fullplatelegs(Component.BLUEPRINT));
        r.shape("III", "I I", "I I");
        r.setIngredient('I', Material.IRON_INGOT);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "softfullplatelegs");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, fullplatelegs(Component.BLUEPRINT));
        r.shape("III", "I I", "I I");
        r.setIngredient('I', Material.BRICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hardfullplatelegs");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, fullplatelegs(Component.BLUEPRINT));
        r.shape("III", "I I", "I I");
        r.setIngredient('I', Material.NETHER_BRICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "closehelm");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, close_helm(Component.BLUEPRINT));
        r.shape("III", "I I", " I ");
        r.setIngredient('I', Material.IRON_INGOT);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "softclosehelm");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, close_helm(Component.BLUEPRINT));
        r.shape("III", "I I", " I ");
        r.setIngredient('I', Material.BRICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hardclosehelm");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, close_helm(Component.BLUEPRINT));
        r.shape("III", "I I", " I ");
        r.setIngredient('I', Material.NETHER_BRICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "fullplateboots");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, fullplateboots(Component.BLUEPRINT));
        r.shape("   ", "I I", "I I");
        r.setIngredient('I', Material.IRON_INGOT);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "softfullplateboots");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, fullplateboots(Component.BLUEPRINT));
        r.shape("   ", "I I", "I I");
        r.setIngredient('I', Material.BRICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hardfullplateboots");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, fullplateboots(Component.BLUEPRINT));
        r.shape("   ", "I I", "I I");
        r.setIngredient('I', Material.NETHER_BRICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "fullplatechest");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, fullplatechest(Component.BLUEPRINT));
        r.shape("I I", "III", "III");
        r.setIngredient('I', Material.IRON_INGOT);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "softfullplatechest");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, fullplatechest(Component.BLUEPRINT));
        r.shape("I I", "III", "III");
        r.setIngredient('I', Material.BRICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hardfullplatechest");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, fullplatechest(Component.BLUEPRINT));
        r.shape("I I", "III", "III");
        r.setIngredient('I', Material.NETHER_BRICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "oakroundshield");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, round_shield());
        r.shape(" I ", "IXI", " I ");
        r.setIngredient('I', Material.OAK_PLANKS);
        r.setIngredient('X', Material.LEATHER);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "acroundshield");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, round_shield());
        r.shape(" I ", "IXI", " I ");
        r.setIngredient('I', Material.ACACIA_PLANKS);
        r.setIngredient('X', Material.LEATHER);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "birchroundshield");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, round_shield());
        r.shape(" I ", "IXI", " I ");
        r.setIngredient('I', Material.BIRCH_PLANKS);
        r.setIngredient('X', Material.LEATHER);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "doakroundshield");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, round_shield());
        r.shape(" I ", "IXI", " I ");
        r.setIngredient('I', Material.DARK_OAK_PLANKS);
        r.setIngredient('X', Material.LEATHER);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "jungroundshield");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, round_shield());
        r.shape(" I ", "IXI", " I ");
        r.setIngredient('I', Material.JUNGLE_PLANKS);
        r.setIngredient('X', Material.LEATHER);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "sprucroundshield");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, round_shield());
        r.shape(" I ", "IXI", " I ");
        r.setIngredient('I', Material.SPRUCE_PLANKS);
        r.setIngredient('X', Material.LEATHER);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "heatershield");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, heater_shield(Component.BLUEPRINT));
        r.shape("XXX", "XXX", " X ");
        r.setIngredient('X', Material.IRON_NUGGET);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "softheatershield");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, heater_shield(Component.BLUEPRINT));
        r.shape("XXX", "XXX", " X ");
        r.setIngredient('X', Material.ACACIA_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hardheatershield");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, heater_shield(Component.BLUEPRINT));
        r.shape("XXX", "XXX", " X ");
        r.setIngredient('X', Material.DARK_OAK_BUTTON);
        recipeList.add(r);

        //Shaped Recipes - Weapons

        nsKey = new NamespacedKey(Lostprofessions.get(), "dagger");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, dagger(Component.BLUEPRINT));
        r.shape("   ", " N ", " S ");
        r.setIngredient('N', Material.IRON_NUGGET);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "softdagger");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, dagger(Component.BLUEPRINT));
        r.shape("   ", " N ", " S ");
        r.setIngredient('N', Material.ACACIA_BUTTON);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "harddagger");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, dagger(Component.BLUEPRINT));
        r.shape("   ", " N ", " S ");
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "longsword");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, longsword(Component.BLUEPRINT));
        r.shape(" N ", " M ", " S ");
        r.setIngredient('M', Material.IRON_INGOT);
        r.setIngredient('N', Material.IRON_NUGGET);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "softlongsword");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, longsword(Component.BLUEPRINT));
        r.shape(" N ", " M ", " S ");
        r.setIngredient('M', Material.BRICK);
        r.setIngredient('N', Material.ACACIA_BUTTON);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hardlongsword");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, longsword(Component.BLUEPRINT));
        r.shape(" N ", " M ", " S ");
        r.setIngredient('M', Material.NETHER_BRICK);
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "shortspear");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, shortspear(Component.BLUEPRINT));
        r.shape("  N", " S ", "S  ");
        r.setIngredient('N', Material.IRON_NUGGET);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "softshortspear");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, shortspear(Component.BLUEPRINT));
        r.shape("  N", " S ", "S  ");
        r.setIngredient('N', Material.ACACIA_BUTTON);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hardshortspear");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, shortspear(Component.BLUEPRINT));
        r.shape("  N", " S ", "S  ");
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "spear");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, spear(Component.BLUEPRINT));
        r.shape("  N", " S ", "S  ");
        r.setIngredient('N', Material.IRON_INGOT);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "softspear");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, spear(Component.BLUEPRINT));
        r.shape("  N", " S ", "S  ");
        r.setIngredient('N', Material.BRICK);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hardspear");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, spear(Component.BLUEPRINT));
        r.shape("  N", " S ", "S  ");
        r.setIngredient('N', Material.NETHER_BRICK);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        //Shaped Recipes - Tools

        nsKey = new NamespacedKey(Lostprofessions.get(), "saddle");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, new ItemStack(Material.SADDLE));
        r.shape("NNN", "NSN", "   ");
        r.setIngredient('N', Material.LEATHER);
        r.setIngredient('S', Material.STRING);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "pickaxe");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, pickaxe(Component.BLUEPRINT));
        r.shape("NMN", " S ", " S ");
        r.setIngredient('M', Material.IRON_INGOT);
        r.setIngredient('N', Material.IRON_NUGGET);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_pickaxe");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, pickaxe(Component.BLUEPRINT));
        r.shape("NMN", " S ", " S ");
        r.setIngredient('M', Material.NETHER_BRICK);
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_pickaxe");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, pickaxe(Component.BLUEPRINT));
        r.shape("NMN", " S ", " S ");
        r.setIngredient('M', Material.BRICK);
        r.setIngredient('N', Material.ACACIA_BUTTON);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "shovel");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, shovel(Component.BLUEPRINT));
        r.shape(" M ", " S ", " S ");
        r.setIngredient('M', Material.IRON_INGOT);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "softshovel");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, shovel(Component.BLUEPRINT));
        r.shape(" M ", " S ", " S ");
        r.setIngredient('M', Material.BRICK);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hardshovel");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, shovel(Component.BLUEPRINT));
        r.shape(" M ", " S ", " S ");
        r.setIngredient('M', Material.NETHER_BRICK);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hoe");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, hoe(Component.BLUEPRINT));
        r.shape("NM ", " S ", " S ");
        r.setIngredient('M', Material.IRON_INGOT);
        r.setIngredient('N', Material.IRON_NUGGET);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "softhoe");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, hoe(Component.BLUEPRINT));
        r.shape("NM ", " S ", " S ");
        r.setIngredient('M', Material.BRICK);
        r.setIngredient('N', Material.ACACIA_BUTTON);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hardhoe");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, hoe(Component.BLUEPRINT));
        r.shape("NM ", " S ", " S ");
        r.setIngredient('M', Material.NETHER_BRICK);
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "wcaxe");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, woodcutteraxe(Component.BLUEPRINT));
        r.shape("NM ", "NS ", " S ");
        r.setIngredient('M', Material.IRON_INGOT);
        r.setIngredient('N', Material.IRON_NUGGET);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "softwcaxe");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, woodcutteraxe(Component.BLUEPRINT));
        r.shape("NM ", "NS ", " S ");
        r.setIngredient('M', Material.BRICK);
        r.setIngredient('N', Material.ACACIA_BUTTON);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hardwcaxe");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, woodcutteraxe(Component.BLUEPRINT));
        r.shape("NM ", "NS ", " S ");
        r.setIngredient('M', Material.NETHER_BRICK);
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        r.setIngredient('S', Material.STICK);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "bucket");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, bucket());
        r.shape("   ", "N N", " N ");
        r.setIngredient('N', Material.IRON_NUGGET);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_bucket");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, bucket());
        r.shape("   ", "N N", " N ");
        r.setIngredient('N', Material.ACACIA_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_bucket");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, bucket());
        r.shape("   ", "N N", " N ");
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "bars");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, iron_bars());
        r.shape("   ", "NNN", "NNN");
        r.setIngredient('N', Material.IRON_INGOT);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "compass");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, compass(Component.BLUEPRINT));
        r.shape(" N ", "NRN", " N ");
        r.setIngredient('N', Material.IRON_NUGGET);
        r.setIngredient('R', Material.REDSTONE);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_compass");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, compass(Component.BLUEPRINT));
        r.shape(" N ", "NRN", " N ");
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        r.setIngredient('R', Material.REDSTONE);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_compass");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, compass(Component.BLUEPRINT));
        r.shape(" N ", "NRN", " N ");
        r.setIngredient('N', Material.ACACIA_BUTTON);
        r.setIngredient('R', Material.REDSTONE);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "clock");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, clock(Component.BLUEPRINT));
        r.shape("NNN", " R ", " N ");
        r.setIngredient('N', Material.IRON_NUGGET);
        r.setIngredient('R', Material.REDSTONE);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hard_clock");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, clock(Component.BLUEPRINT));
        r.shape("NNN", " R ", " N ");
        r.setIngredient('N', Material.DARK_OAK_BUTTON);
        r.setIngredient('R', Material.REDSTONE);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_clock");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, clock(Component.BLUEPRINT));
        r.shape("NNN", " R ", " N ");
        r.setIngredient('N', Material.ACACIA_BUTTON);
        r.setIngredient('R', Material.REDSTONE);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "shears");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, shears());
        r.shape("  N", " N ", "   ");
        r.setIngredient('N', Material.IRON_NUGGET);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "soft_shears");
        Lostprofessions.get().getKeySet().add(nsKey);
        r = new ShapedRecipe(nsKey, shears());
        r.shape("  N", " N ", "   ");
        r.setIngredient('N', Material.ACACIA_BUTTON);
        recipeList.add(r);


        for(int x = 0; x < recipeList.size(); x++) {
            Lostprofessions.get().getServer().addRecipe(recipeList.get(x));
        }



    }

    //Recipe handling

    public static void remove(Material m) {
        Iterator<Recipe> IR = Lostprofessions.get().getServer().recipeIterator();
        Recipe R;
        while (IR.hasNext()) {
            R = IR.next();
            if (R != null && R.getResult().getType() == m) {
                IR.remove();
            }
        }
    }

    public static boolean checkItem(ItemStack item, String name, String type) {
        try {
            if(item.getItemMeta().getDisplayName().contains(name) && item.getItemMeta().getLore().get(0).contains(type)) {
                return true;
            }
        } catch(NullPointerException ignored) {

        }

        return false;
    }
    //Mineman Stuff

    public static ItemStack shears() {
        ItemStack item = new ItemStack(Material.SHEARS);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setRarity(Rarity.COMMON);
        ib.setName("Shears");
        ib.setType(Type.TOOL);
        ib.applyTags();
        ib.setDesc("A set of shears, good for acquiring wool and plant goods.");        return item;
    }

    public static ItemStack bucket() {
        ItemStack item = new ItemStack(Material.BUCKET);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setRarity(Rarity.COMMON);
        ib.setName("Bucket");
        ib.setType(Type.TOOL);
        ib.applyTags();
        ib.setDesc("A standard bucket, it can hold many things: Water Not Included.");        return item;
    }

    public static ItemStack iron_bars() {
        ItemStack item = new ItemStack(Material.IRON_BARS);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setRarity(Rarity.COMMON);
        ib.setName("Bars");
        ib.setType(Type.MISC);
        ib.applyTags();
        ib.setDesc("A set of metal bars, good for keeping people out of places.");

        return item;
    }

    //Weapons
    public static ItemStack spear(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Spear");
        ib.setType(Type.HEAVY_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This spear has a shaft of wood that stands at 6 feet 2 inches tall, and is 1 inch in diameter, on top of which a sharpened, 5 inch " + component.getName() + " sharpened point is attached. Slightly below the spearpoint, an eight inch metal crossguard is placed. The spear itself weighs 5 pounds, making it more suited for close-ranged combat than throwing (although the latter is possible as well). The spear is also balanced fairly well, and can be wielded with one or two hands, although two hands will allow far greater control over the weapon as well as stronger strikes. ");
        return item;
    }

    public static ItemStack falchion(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Falchion");
        ib.setType(Type.HEAVY_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This two handed double edged weapon has a " + component.getName() + " blade that measures 34 inches long, positioned on top of a wooden rod, which serves as a handle, that is 12 inches long itself. The blade itself is surprisingly thin, being only 0.2 inches thick, and ends in a curve, similar to that of an umbrella where other swords would have a point, which hangs over the main thrust of the blade. The falchion is particularly effective against padded gambeson as well as cloth due to its thin edge, allowing it to cut through those materials with ease. It is also a surprisingly light weapon, despite its size, weighing only 2.5 pounds. \n ");
        return item;
    }

    public static ItemStack greatsword(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Greatsword");
        ib.setType(Type.HEAVY_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This two handed double edged weapon has a " + component.getName() + " blade that measures 42 inches in length, accompanied by a 7.5 inch " + component.getName() + " handle wrapped in leather, above which is a crossguard, also made of " + component.getName() + ". The blade is 2.5 inches wide at the base, before tapering to a point. The weapon is heavy, weighing 4.5 pounds, although it is fairly well balanced and its massive size allows it crushing blows.");
        return item;
    }

    public static ItemStack greatclub(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SHOVEL);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Greatclub");
        ib.setType(Type.HEAVY_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This massive hunk of carved wood is considerably heavy, weighing in at 10 pounds. The weapon is divided into two parts, a handle, which measures 6 inches and around which a piece of leather is wrapped, and the club itself, a 2 and a half foot carved piece of wood that is 4.5 inches in diameter at its thickest, being slimmest at the handle, then bulking up gradually towards the top, and tapering off again at the top of the club. The weapon itself is poorly balanced and ungainly, meaning that any swing with it is likely to throw its user off balance should they miss, or even, in some cases, hit. Upon a hit, however, thanks to its weight, the club does considerable blunt damage.");
        return item;
    }

    public static ItemStack greataxe(Component component) {
        ItemStack item = new ItemStack(Material.IRON_AXE);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Greataxe");
        ib.setType(Type.HEAVY_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This two handed axe is double bladed, each axe blade being 8.7 inches in length, 13.8 in height and being made of " + component.getName() + ". The axe blades are attached on top of a five foot wooden shaft, at the top of which a small " + component.getName() + " spike is mounted. The weapon itself weighs 5 pounds, but is balanced fairly well, making it still surprisingly maneuverable.");
        return item;
    }

    public static ItemStack longsword(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Longsword");
        ib.setType(Type.MEDIUM_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This sword has an unornamented, 32 inch long double edged " + component.getName() + " blade, at the bottom of which a 5 inch long wooden handle is attached, around which a piece of cloth is wrapped. The blade is 1.5 inches at the base, maintaining this width for the majority of its length before tapering off to a point. It weighs 2.7 pounds. The weapon can be wielded with one or two hands, two hands obviously allowing greater control and power behind the weapon's strikes.");
        return item;
    }

    public static ItemStack shortspear(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Shortspear");
        ib.setType(Type.MEDIUM_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This shortspear has a shaft of oak wood that stands at 4 feet tall, atop which a sharpened " + component.getName() + " point that measures 4 inches tall is affixed. The shaft itself is slender, measuring only half an inch in diameter, the spear only weighing 2.5 pounds.This spear can be thrown easily due to its lightness, but still possess enough heft to be usable in close combat.");
        return item;
    }

    public static ItemStack mace(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SHOVEL);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Mace");
        ib.setType(Type.MEDIUM_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This weapon is composed of two parts, an unornamented " + component.getName() + " handle that's 20 inches long and, on top of it, a slightly larger in diameter " + component.getName() + " rod that's 6 inches long, to which is attached 4 thin " + component.getName() + " flanges, whose shape resembles that of a profile of a valley. On top of the upper rod is attached a metal spike, and the weapon weighs 3 pounds. This weapon is meant to be one-handed, although wielding it with two hands is possible. It's effective against plate, relying on the impact of its strikes to hurt its victim without actually puncturing the garments they are wearing.");
        return item;
    }

    public static ItemStack battleaxe(Component component) {
        ItemStack item = new ItemStack(Material.IRON_AXE);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Handaxe");
        ib.setType(Type.MEDIUM_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This weapon is made of an unornamented wood handle, which measures 28 inches in length, at the top of which a " + component.getName() + " axe-head is attached. This axe-head is unornamented, and is 6.7 inches in length and 10 inches in height. The axe itself weighs 2.2 pounds, and is meant to be wielded in one hand. The axe can also be thrown, and can be wielded with two or one hands, although one is preferable. ");
        return item;
    }

    public static ItemStack scimitar(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Scimitar");
        ib.setType(Type.MEDIUM_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This scimitar is a backwards curved, single-edged sword with an unsharpened back edge. The sword’s " + component.getName() + " blade is 30 inches in length but rather thin, causing the sword itself to weigh just 2 pounds. The handle measures 5 inches in length, and around it a piece of leather is wrapped. Above the handle is a crossguard, which curves upwards on the sword’s blunt edge, and downwards on its sharp one. The scimitar, thanks to its low weight, excels in slashing and cutting at its opponents, its thin edge allowing it to pierce gambeson and cloth easily. ");
        return item;
    }

    public static ItemStack dagger(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Dagger");
        ib.setType(Type.LIGHT_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This dagger has a seven inch double-edged " + component.getName() + " blade, which tapers off to a point. Below the blade is a small, 4 inch long " + component.getName() + " crosspiece and a 4 inch long handle and pommel. This dagger can be thrown thanks to it weighing just 1 pound, while its main utility in close quarters combat is found in stabbing, given its blade’s small size. ");
        return item;
    }

    public static ItemStack light_mace(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SHOVEL);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Light Mace");
        ib.setType(Type.LIGHT_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This mace consists of an unornamented, 12 inch long " + component.getName() + " handle, at the top of which a 3 inch in diameter " + component.getName() + " ball is attached. This ball is covered in half an inch long " + component.getName() + " spikes. The mace itself weighs 2 pounds. This weapon is meant to be wielded with one hand, and is effective against plate, relying on the impact of its strikes to hurt its victim without actually puncturing the garments they are wearing, although its spikes do help puncture its victims as well. ");
        return item;
    }

    public static ItemStack rapier(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Rapier");
        ib.setType(Type.LIGHT_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This rapier has a 39 inch long, thin, 0.7 inch wide thin sharpened " + component.getName() + " blade, which tapers off into a sharpened point. Beneath it, a 4 inch long " + component.getName() + " handle is placed, around which a piece of leather is wrapped. Above the handle, there is a crospiece, which consists of several strands of metal forming the outline of a circle around the handle, at each cardinal point of the circle a strand of metal going back towards the handle itself. This rapier weighs 2.1 pounds, and is a light, somewhat-unwieldy one-handed sword, which is most effective when stabbing. Thanks to the blade being long but very thin it's not that strong, meaning that a good hit from a more bulky weapon has the potential to break it in half. ");
        return item;
    }

    public static ItemStack sickle(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Sickle");
        ib.setType(Type.LIGHT_WEAPON);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This sickle has a 10 inch long, curved single-edged " + component.getName() + " blade, which starts off straight directly above the handle, then curves outward and then curves back, ending up flattening out at the 18 inch mark and reaching back past the handle and ending in a point. The handle itself is made of a 5 inch plain oak piece. The sickle is meant to be wielded with one hand. The sickle is proficient at slashing and cutting thanks to its low weight, and, thanks to its thin edge, at cutting through cloth and gambeson armour. It is also proficient at harvesting plants like wheat and cutting foliage, if its owner intends to use it for farming.  ");
        return item;
    }

    //Shields

    public static ItemStack buckler(Component component) {
        ItemStack item = new ItemStack(Material.SHIELD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Buckler");
        ib.setType(Type.LIGHT_ARMOR);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This very small metal shield is 12 inches in diameter, consisting of a half-sphere of hollow " + component.getName() + ", inside of which the 4 inch handle is placed. An outer circumference of flat " + component.getName() + " surrounds this half-sphere. The shield itself weighs only 2.4 pounds, making it more mobile and easy to maneuver than its larger, more heavy compatriots, accounting for its far smaller size. This shield can protect against arrows, or even bullets, which will cause the shield to dent and hurt the wearer’s arm due to their force, if it is placed in the path of them, as well as deflect most weaponry, although heavy hits from big weapons risks jarring and hurting the user’s buckler-holding arm.");
        return item;
    }

    public static ItemStack round_shield() {
        ItemStack item = new ItemStack(Material.SHIELD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Round Shield");
        ib.setType(Type.LIGHT_ARMOR);
        ib.setRarity(Rarity.COMMON);
        ib.applyTags();
        ib.setDesc("This round shield is made up of two parts, an outer layer of tough, tanned hide and an inner layer of plywood, around which the hide is wrapped. Behind the shield a leather strap is placed, so that it may be attached to the wearer’s forearm or slung over their back. The shield is 20 inches in diameter, and weighs 3.8 pounds. This shield can protect against arrows well, them either bouncing off the hide or getting lodged in the wood underneath it. It also does well against the conventional hack and slash weapons, being particularly effective against blunt weapons thanks to the hide, but being more vulnerable to anything with an edge, especially axes, although these weapons do run the risk of getting stuck in the shield. ");
        return item;
    }

    public static ItemStack heater_shield(Component component) {
        ItemStack item = new ItemStack(Material.SHIELD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Heater Shield");
        ib.setType(Type.MEDIUM_ARMOR);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This heater shield consists of two shapes, a rounded square on the top and a triangle beneath it. It is 22 inches across and 30 inches down, consisting of a layer of plywood which is overlaid with tanned leather, and subsequently braced with " + component.getName() + ". Behind the shield a leather strap is placed, so that it may be attached to the wearer’s forearm or slung over their back.This shield can protect against arrows well, them either bouncing off the hide or getting lodged in the wood underneath it. It also does well against the conventional hack and slash weapons, being particularly effective against blunt weapons thanks to the leather exterior, but being more vulnerable to anything with an edge, especially axes, although these weapons do run the risk of getting stuck in the shield, or bouncing off of its " + component.getName() + " reinforcement. ");
        return item;
    }

    public static ItemStack kite_shield(Component component) {
        ItemStack item = new ItemStack(Material.SHIELD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Kite Shield");
        ib.setType(Type.MEDIUM_ARMOR);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This kite shield consists of a rounded top, which then narrows down to a point in its lower third, causing it to resemble its namesake. It is 26 inches across and 37 inches down, consisting of a layer of plywood which is overlaid with tanned leather, and subsequently braced with " + component.getName() + ". In the center of the upper part of the shield a 6 inch in diameter metal boss is placed. Behind the shield a leather strap is placed, so that it may be attached to the wearer’s forearm or slung over their back.This shield can protect against arrows well, them either bouncing off the hide or getting lodged in the wood underneath it. It also does well against the conventional hack and slash weapons, being particularly effective against blunt weapons thanks to the leather exterior, but being more vulnerable to anything with an edge, especially axes, although these weapons do run the risk of getting stuck in the shield, or bouncing off of its " + component.getName() + " reinforcement. ");
        return item;
    }

    public static ItemStack wardoor_shield(Component component) {
        ItemStack item = new ItemStack(Material.SHIELD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("War Door Shield");
        ib.setType(Type.HEAVY_ARMOR);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This enormous shield is shaped like a rectangle, with curved edges that bend towards the wearer. It is made of metal-reinforced plywood, on top of which a piece of tanned hide is placed. The shield’s dimensions are 30 inches across and 65 inches down, and, at its epicenter, a metal boss is placed.The shield weighs an enormous 29 pounds, making it near impossible to maneuver during combat or move quickly with. On the backside of the shield, a wood handle and leather straps are placed so that the shield might be held by the soldier by the handle or slung over their back with the straps.This shield can protect against arrows well, them either bouncing off the hide or getting lodged in the wood underneath it. It also does well against the conventional hack and slash weapons, being particularly effective against blunt weapons thanks to the leather exterior, but being more vulnerable to anything with an edge, especially axes, although these weapons do run the risk of getting stuck in the shield, or bouncing off of its " + component.getName() + " reinforcement. ");
        return item;
    }

    public static ItemStack tower_shield(Component component) {
        ItemStack item = new ItemStack(Material.SHIELD);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Tower Shield");
        ib.setType(Type.HEAVY_ARMOR);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This massive shield is shaped like a rectangle with curved edges that bend backwards towards the wielder. It is made of metal-reinforced plywood, on top of which a piece of tanned hide is placed. The shield’s dimensions are 30 inches across and 48 inches down, and, at its epicenter, a metal boss is placed.The shield weighs an enormous 22 pounds, making it very hard to maneuver during combat or move quickly with. On the backside of the shield, a wood handle and leather straps are placed so that it might be bound to the wearer’s forearm, or slung over their back.This shield can protect against arrows well, them either bouncing off the hide or getting lodged in the wood underneath it. It also does well against the conventional hack and slash weapons, being particularly effective against blunt weapons thanks to the leather exterior, but being more vulnerable to anything with an edge, especially axes, although these weapons do run the risk of getting stuck in the shield, or bouncing off of its " + component.getName() + " reinforcement. ");
        return item;
    }


    //Tools
    public static ItemStack compass(Component component) {
        ItemStack item = new ItemStack(Material.COMPASS);
        ItemMeta im = item.getItemMeta();
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName(component.getName() + " Compass");
        ib.setType(Type.TOOL);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This " + component.getName().toLowerCase() + " compass fits comfortably in the palm of your hand, generally pointing North unless bound to a lodestone. One may use this tool to determine the direction one is facing for simpler navigation.");
        return item;
    }

    public static ItemStack clock(Component component) {
        ItemStack item = new ItemStack(Material.CLOCK);
        ItemMeta im = item.getItemMeta();
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName(component.getName() + " Clock");
        ib.setType(Type.TOOL);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This " + component.getName().toLowerCase() + " clock has several basic gears and cogs within it for telling the time. It operates on a standard Anoman timescale.");
        return item;
    }

    public static ItemStack pickaxe(Component component) {
        ItemStack item = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Pickaxe");
        ib.setType(Type.TOOL);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This pickaxe consists of a 36 inch wooden handle to which an 18 inch long " + component.getName() + " pickaxe head is attached. This tool weighs 2.5 pounds, and is primarily used to chip at and break stone or claim the ore contained within it.");
        return item;
    }

    public static ItemStack shovel(Component component) {
        ItemStack item = new ItemStack(Material.IRON_SHOVEL);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Shovel");
        ib.setType(Type.TOOL);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This shovel consists of a 37 inch long wooden handle, to which a " + component.getName() + " 10 inch across 7 inch tall shovelhead is attached. It weighs 4.5 pounds. This tool is mainly used to dig at dirt, soil, or similar substances.");
        return item;
    }

    public static ItemStack hoe(Component component) {
        ItemStack item = new ItemStack(Material.IRON_HOE);
        ItemBuilder ib = new ItemBuilder(item);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ib.setName("Hoe");
        ib.setType(Type.TOOL);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This hoe consists of a 60 inch wooden handle, to which a " + component.getName() + " draw head is attached, being 2 inches in width and 5 inches in length. It weighs 3.5 pounds, and is primarily used to dig up soil and create trenches that seeds will be placed in during preparing a field for farming.");
        return item;
    }

    public static ItemStack woodcutteraxe(Component component) {
        ItemStack item = new ItemStack(Material.IRON_AXE);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Woodcutter's Axe");
        ib.setType(Type.TOOL);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This tool is made of an unornamented wooden handle, which measures 31 inches in length, at the top of which a " + component.getName() + " axe-head is attached. This axe-head is unornamented, and is 8.7 inches in length and 13.5 inches in height. The axe itself weighs 3.5 pounds, and is used to cut down trees or split logs.");
        return item;
    }

    //Light Armor

    public static ItemStack clothCoif() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        im.setColor(Color.WHITE);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Quilted Cloth Coif");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc("This coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        return item;
    }

    public static ItemStack leatherHelm() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Leather Helm");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc("This helm is made entirely from layered leather that fits snugly to the scalp of its wearer. It has a strap that loops around the wearer's jaw to keep it in place.");
        return item;
    }

    public static ItemStack hood() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Hood");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc("This hood is made from cloth, and covers the top, back, sides, and forehead of the wearer’s head when worn. The hood is primarily designed to shield its wearer from the harshness of the elements, and may be used to protect the user's face from rain, wind, and snow, amongst other things. ");
        return item;
    }

    public static ItemStack gambeson() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        im.setColor(Color.WHITE);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Gambeson");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc("This padded jacket of gambeson covers the wearer’s arms and chest, made of layers of various forms of cloth, cotton, wool, and linen. It can be worn by itself or underneath armour, and is capable of stopping arrows from bows on the lower end of the draw weight spectrum, as well as direct hits from lighter weapons or maces.");
        return item;
    }

    public static ItemStack robes() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        im.setColor(Color.WHITE);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Robes");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc("This set of cloth robes is very light, and, when worn, cover the wearer’s chest, arms, and legs. They have no straps, and are put on by taking the robes and placing it over the wearer’s head. Almost anything can pierce this garment, and it offers virtually no protection.");
        return item;
    }

    public static ItemStack harness() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);

        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Harness");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc("This piece of armor has a tanned leather chest piece that protects both the back and front of the wearer’s chest, which can be tightened or loosened by tugging at a leather strap placed behind the chestpiece. Leather arm pads are bound with string along the outer part of the wearer’s arms curving with them, leaving only the inner part of his arm unprotected. This string may be tightened or loosened to ensure that the pads fit. ");
        return item;
    }

    public static ItemStack quiltedChausses() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.WHITE);
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Quilted Chausses");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc("These Quilted Chausses are made of layers of various types of cloth, cotton, wool, and linen. They extend from the waist to the ankle, completely covering everything in between those places. It can be worn by itself or underneath armour, and is capable of stopping arrows from bows on the lower end of the draw weight spectrum, as well as hits from lighter weapons or maces, and can dampen the harm that stronger weapons do. ");
        return item;
    }

    public static ItemStack leatherTasset() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Leather Tassets");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc("This piece of armor is made of tanned leather armor pads which are bound with string along the wearer’s legs and curving with them, leaving only the inner thigh and inner calf unprotected. This string may be tightened or loosened to ensure that the pads fit. ");
        return item;
    }

    public static ItemStack braies() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.WHITE);
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Braies");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc("This linen garment is shaped like a pair of pants, and is sometimes worn as underwear. It offers no protection whatsoever against any credible attack, and is very light.");
        return item;
    }

    public static ItemStack leatherBoots() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.WHITE);
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Leather Boots");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc("This pair of boots are made from tanned leather, which is stitched together with string. ");
        return item;
    }

    public static ItemStack shoes() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.WHITE);
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Shoes");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc("This pair of leather shoes are made from plain leather, which is stitched together with string. ");
        return item;
    }

    //MEDIUM ARMOR
    public static ItemStack reinforced_boots(Component component) {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.BLACK);
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Reinforced Boots");
        ib.setType(Type.MEDIUM_ARMOR);
        ib.applyTags();
        ib.setDesc("This pair of boots are made from tanned leather, which is stitched together with string. It is also reinforced, on the sole, heel, and tip of the boot predominantly, with " + component.getName() + ", making it easier to traverse rough terrain in exchange for slowing the wearer down slightly. The reinforcements also add power to the wearer’s kicks.");
        return item;
    }

    public static ItemStack nasal_helm(Component component) {
        ItemStack item = new ItemStack(Material.IRON_HELMET);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Nasal Helmet");
        ib.setRarity(component.getRarity());
        ib.setType(Type.MEDIUM_ARMOR);
        ib.applyTags();
        ib.setDesc("This helmet consists of a 1.5mm " + component.getName() + ", rounded top, which covers the wearer’s head entirely down to their forehead, at which point it stops, and a " + component.getName() + " nose guard, which is a piece of rectangular " + component.getName() + " that extends down from the top of the helmet to protect their nose. The top and nosguard can deflect arrows, as well as weapons that rely on their edge to do damage unless said weapons are wielded by an incredibly strong person. They are more vulnerable to blunt weapons, which cause dents in the armor’s " + component.getName() + " that can similarly hurt their wearer. This helmet is generally worn in conjunction with a chainmail coif.");
        return item;
    }

    public static ItemStack maille_coif(Component component) {
        ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Maille Coif");
        ib.setRarity(component.getRarity());
        ib.setType(Type.MEDIUM_ARMOR);
        ib.applyTags();
        ib.setDesc("This piece of armor is, for all intensive purposes, a hood made of " + component.getName() + " chainmail. It covers the wearer’s throat, forehead, and back and side of head completely. The chainmail links of the armour is designed to protect against and can resist slashing and stabbing weapons, and its non-rigid nature makes it less vulnerable against blunt weapons. This piece of apparel can be worn underneath or in conjunction with many types of head armour. ");
        return item;
    }

    public static ItemStack barbute(Component component) {
        ItemStack item = new ItemStack(Material.IRON_HELMET);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Barbute");
        ib.setRarity(component.getRarity());
        ib.setType(Type.MEDIUM_ARMOR);
        ib.applyTags();
        ib.setDesc("This helmet is made of 1.5mm " + component.getName() + ", which is forged in such a way that it covers the back and sides of the wearer’s head, as well as most of the front, leaving a long, connected gap over where the eyes, nose, and mouth of the helmet’s wearer is. The wearer’s throat is also left unprotected. This helmet can deflect arrows, as well as weapons that rely on their edge to do damage, but is more vulnerable to blunt weapons. ");
        return item;
    }

    public static ItemStack brigandine(Component component) {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.BLACK);
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Brigandine");
        ib.setRarity(component.getRarity());
        ib.setType(Type.MEDIUM_ARMOR);
        ib.applyTags();
        ib.setDesc("This body-armour is made of two parts, a tanned leather cover akin to an armless apron, which covers the front, back, and side of the wearer’s chest, as well as their upper thighs, dipping to cover them much like a skirt would. On top of this leather many tiny " + component.getName() + " squares are attached, reinforcing and strengthening it. This form of construction makes the Brigandine less vulnerable against blunt weapons, although by stabbing through the 2mm cracks in between the " + component.getName() + " boxes one can bypass them completely and only face the tanned leather undergarment. Apart from that, the " + component.getName() + " boxes are quite efficient at repelling both cutting and stabbing strikes. ");
        return item;
    }

    public static ItemStack hauberk(Component component) {
        ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Hauberk");
        ib.setRarity(component.getRarity());
        ib.setType(Type.MEDIUM_ARMOR);
        ib.applyTags();
        ib.setDesc("This Hauberk is made of " + component.getName() + " chainmail, and covers the wearer’s chest and arms completely. From the chest, two sheets of chainmail fall, protecting the wearer’s upper thighs with the exception of their inner thigh. This armour can be worn by itself, or underneath other armors. The chainmail links of this armour are designed to protect against and can resist slashing and stabbing weapons, and its non-rigid nature makes it less vulnerable against blunt weapons. This piece of apparel can be worn underneath or in conjunction with many types of leg armor. ");
        return item;
    }

    public static ItemStack maille_chausses(Component component) {
        ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Maille Chausses");
        ib.setRarity(component.getRarity());
        ib.setType(Type.MEDIUM_ARMOR);
        ib.applyTags();
        ib.setDesc("These maille chausses are made of interlinked " + component.getName() + " chainmail. They extend from the waist to the ankle, completely covering everything in between those places. It can be worn by itself or underneath armour. The chainmail links of this armour are designed to protect against and can resist slashing and stabbing weapons, and its non-rigid nature makes it less vulnerable against blunt weapons. This piece of apparel can be worn underneath or in conjunction with many types of leg armor. ");
        return item;
    }

    public static ItemStack cuisse(Component component) {
        ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Cuisse");
        ib.setRarity(component.getRarity());
        ib.setType(Type.MEDIUM_ARMOR);
        ib.applyTags();
        ib.setDesc(" This piece of plate armor is made of 1.55mm " + component.getName() + ", and, when worn, covers all sides of the user’s thigh, ending right above the knee so that it does not significantly impede its wearer’s movement, which it does to a smaller extent. This cuisse can deflect arrows, as well as weapons that rely on their edge to do damage unless said weapons are wielded by an incredibly strong person.They are more vulnerable to blunt weapons which cause dents in the cuisse’s " + component.getName() + " that can similarly hurt its wearer.");
        return item;
    }

    public static ItemStack close_helm(Component component) {
        ItemStack item = new ItemStack(Material.IRON_HELMET);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Close Helm");
        ib.setRarity(component.getRarity());
        ib.setType(Type.HEAVY_ARMOR);
        ib.applyTags();
        ib.setDesc("This close helm is made of two parts, a 1.5mm " + component.getName() + " frame that covers all of the wearer’s face apart from the parts covered by the visor, as well as the wearer’s neck and everything 3.5 inches from the neck on the wearer’s chest as a gorget. The visor can be opened to the side when needed. It covers the wearer’s eyes, nose, and mouth, a 2.5mm " + component.getName() + " slit being placed horizontally at the wearer’s eye level. The small size of the slit causes the helmet’s wearer to have impaired vision if the visor is covering their face. This close helm can deflect arrows, as well as weapons that rely on their edge to do damage. They are more vulnerable to blunt weapons which cause dents in the close helm’s " + component.getName() + ".");
        return item;
    }

    public static ItemStack fullplatechest(Component component) {
        ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Full Plate Chest");
        ib.setRarity(component.getRarity());
        ib.setType(Type.HEAVY_ARMOR);
        ib.applyTags();
        ib.setDesc("This piece of armor is made of 1.5mm " + component.getName() + ", and consists of two layers, one of gambeson, and then one of plate armor. The layer of gambeson covers the wearer’s entire body and arms, and, on top of it, the plate armor is placed, covering the user’s arms and chest. The only part of the upper layer that is not made of plate is the area covering the user’s joints, where layers of chainmail are placed on top of the gambeson in replacement for the plate, forming a vulnerability in the armour. The wearer’s movement is impeded in this armour, but it can deflect arrows, as well as weapons that rely on their edge to do damage. The plate chest is more vulnerable to blunt weapons, which can cause dents in the plate’s " + component.getName() + ".");
        return item;
    }

    public static ItemStack fullplatelegs(Component component) {
        ItemStack item = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Full Plate Legs");
        ib.setRarity(component.getRarity());
        ib.setType(Type.HEAVY_ARMOR);
        ib.applyTags();
        ib.setDesc(" These full plate legs are made of two layers, one of mail and one of 1.5mm " + component.getName() + ". Both layers extend from the waist to the leg, with the exception of the wearer’s joints, where the upper layer is replaced with chainmail and the lower with gambeson, forming a weak spot. To the sides of the wearer’s upper thigh, two curved " + component.getName() + " protectors are placed, hanging over their upper thigh and protecting it from strikes from the top, leaving the inner thigh exposed. The wearer’s movement is impeded in this armour, but it can deflect arrows, as well as weapons that rely on their edge to do damage. These plate legs are more vulnerable to blunt weapons, which can cause dents in the plate’s " + component.getName() + ".");
        return item;
    }

    public static ItemStack fullplateboots(Component component) {
        ItemStack item = new ItemStack(Material.IRON_BOOTS);
        ItemMeta im = item.getItemMeta();
        im.setUnbreakable(true);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Full Plate Boots");
        ib.setRarity(component.getRarity());
        ib.setType(Type.HEAVY_ARMOR);
        ib.applyTags();
        ib.setDesc("These plate boots are made of 1.5mm " + component.getName() + ", and cover the wearer’s shins and foot. They consist of two layers, one of gambeson and one of plate, which follows the contours of the wearer’s body closely, with the exception of the ankle joint, where the outer layer of " + component.getName() + " is replaced with chainmail. These boots can deflect arrows, as well as weapons that rely on their edge to do damage, unless said weapons are wielded by an incredibly strong person.These boots are more vulnerable to blunt weapons, which can cause dents in the boot’s " + component.getName() + " that can similarly hurt their wearer.");
        return item;
    }
    //METALS

    public static ItemStack metalPiece(Component component) {
        ItemStack item = new ItemStack(Material.IRON_NUGGET);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName(component.getName() + " Chunk");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(component.getRarity());
        ib.applyTags();
        ib.setDesc("This is a small chunk of " + component.getName() + ". \n\n [*] This chunk weighs 0.2 kg");
        return item;
    }

    public static ItemStack softMetalPiece(Component component) {
        ItemStack item = new ItemStack(Material.ACACIA_BUTTON);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName(component.getName() + " Chunk");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(component.getRarity());
        ib.setPlaceable(false);
        ib.applyTags();
        ib.setDesc("This is a small chunk of " + component.getName() + ". \n\n [*] This chunk weighs 0.2 kg");
        return item;
    }

    public static ItemStack hardMetalPiece(Component component) {
        ItemStack item = new ItemStack(Material.DARK_OAK_BUTTON);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName(component.getName() + " Chunk");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(component.getRarity());
        ib.setPlaceable(false);
        ib.applyTags();
        ib.setDesc("This is a small chunk of " + component.getName() + ". \n\n [*] This chunk weighs 0.2 kg");
        return item;
    }

    public static ItemStack goldPiece() {
        ItemStack item = new ItemStack(Material.GOLD_NUGGET);
        item.setAmount(9);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(ChatColor.GREEN + "Gold Piece");
        List<String> loreString = new ArrayList<>();
        loreString.add(ChatColor.translateAlternateColorCodes('&', "&7[&2Uncommon &7| &bModerate &7| &8Mundane &7| &8Currency&7]"));
        loreString.add(ChatColor.translateAlternateColorCodes('&',"&7&oA single Gold Piece. A Gold Piece is the"));
        loreString.add(ChatColor.translateAlternateColorCodes('&',"&7&ostandard money used in the old world."));
        loreString.add(ChatColor.translateAlternateColorCodes('&',"&8&oCreated by a Plugin"));
        im.setLore(loreString);
        item.setItemMeta(im);
        return item;
    }

    public static ItemStack ironIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Iron Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.COMMON);
        ib.applyTags();
        ib.setDesc("This is a uniform ingot of iron. Iron is gray and has a dull metallic sheen. \n\n [*] This ingot weighs 1 kg");
        return item;
    }

    public static ItemStack tinIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Tin Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.VCOMMON);
        ib.applyTags();
        ib.setDesc("Tin is very similar to silver in appearance, though because of its hardness it ends up with a lumpy texture. \n\n [*] This ingot weighs 1 kg");
        return item;
    }

    public static ItemStack silverIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Silver Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.UNCOMMON);
        ib.applyTags();
        ib.setDesc("Silver is a brilliant shining metal that has a color the same as its name. It's polished and chromatic. \n\n [*] This ingot weighs 1 kg");
        return item;
    }

    public static ItemStack goldIngot() {
        ItemStack item = new ItemStack(Material.GOLD_INGOT);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Gold Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.UNCOMMON);
        ib.applyTags();
        ib.setDesc("Gold is one of the shiniest and most flamboyant metals in existence. Its appearance screams value.  \n\n [*] This ingot weighs 1 kg");
        return item;
    }

    public static ItemStack tungstenIngot() {
        ItemStack item = new ItemStack(Material.NETHER_BRICK);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Tungsten Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.UNCOMMON);
        ib.applyTags();
        ib.setDesc("Tungsten is jet-black in appearance with a beautifully stark luster. \n\n [*] This ingot weighs 1 kg");
        return item;
    }

    public static ItemStack meteoricMetalIngot() {
        ItemStack item = new ItemStack(Material.NETHER_BRICK);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Meteoric Metal Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.RARE);
        ib.applyTags();
        ib.setDesc("Meteorite is a mostly black metal with pulsing red striations that tear through it like a hot knife on butter. \n\n [*] This ingot weighs 1 kg");
        return item;
    }

    public static ItemStack platinumIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Platinum Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.RARE);
        ib.applyTags();
        ib.setDesc("Platinum is almost identical to silver in every way. There is one difference, it has a slight blue-ish hue. \n\n [*] This ingot weighs 1 kg");
        return item;
    }

    public static ItemStack cobaltIngot() {
        ItemStack item = new ItemStack(Material.NETHER_BRICK);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Cobalt Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.WONDROUS);
        ib.setAura(Aura.ABYSSAL, 0);
        ib.applyTags();
        ib.setDesc("Cobalt is a dark-blue metal that has very little sheen. It has a slight magnetic pull when brought near other metals. \n\n [*] This ingot weighs 1 kg");
        return item;
    }

    public static ItemStack calamiteIngot() {
        ItemStack item = new ItemStack(Material.BRICK);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Calamite Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.WONDROUS);
        ib.setAura(Aura.ARCANE, 0);
        ib.applyTags();
        ib.setDesc("Calamite is a stark red, pulsating lustrous metal that whispers hate and malice in the ear of anyone who holds it. \n\n [*] This ingot weighs 1 kg");
        return item;
    }

    public static ItemStack palladiumIngot() {
        ItemStack item = new ItemStack(Material.BRICK);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Palladium Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.WONDROUS);
        ib.setAura(Aura.DRACONIC, 1);
        ib.applyTags();
        ib.setDesc("Palladium is a yellow-ish orange metal similar to copper. However when this metal is near the distant roar and blast of Lacerta breathing flames can be heard. \n\n [*] This ingot weighs 1 kg");
        return item;
    }

    public static ItemStack litherCoal() {
        ItemStack item = new ItemStack(Material.COAL);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Lither Coal");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.WONDROUS);
        ib.setAura(Aura.WEBBED, 0);
        ib.applyTags();
        ib.setDesc("Lither Coal is made from ancient fallen branches of the World Tree turned to peat, then to coal. \n\n [*] This coal chunk weighs 1 kg");
        return item;
    }

    public static ItemStack luminideIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Luminide Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.RARE);
        ib.setAura(Aura.MUNDANE, 1);
        ib.applyTags();
        ib.setDesc("Luminide is the same as iron except for at night. Its true vibrant grayish-blue color and glowing bright luster is revealed under moonlight. \n\n [*] This ingot weighs 1 kg");
        return item;
    }

    public static ItemStack copperIngot() {
        ItemStack item = new ItemStack(Material.BRICK);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Copper Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.VCOMMON);
        ib.applyTags();
        ib.setDesc("Copper is an orange, lustrous metal. It is smooth and uniform. \n\n [*] This ingot weighs 1 kg");
        return item;
    }
}
