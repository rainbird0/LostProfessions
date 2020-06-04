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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        remove(Material.GOLDEN_HELMET);
        remove(Material.GOLDEN_CHESTPLATE);
        remove(Material.GOLDEN_LEGGINGS);
        remove(Material.GOLDEN_BOOTS);
        remove(Material.DIAMOND_BOOTS);
        remove(Material.DIAMOND_CHESTPLATE);
        remove(Material.DIAMOND_LEGGINGS);
        remove(Material.DIAMOND_HELMET);
        remove(Material.GOLD_NUGGET);
        remove(Material.BUCKET);
        remove(Material.IRON_INGOT);
        remove(Material.GOLD_INGOT);
        remove(Material.REDSTONE);
        remove(Material.LAPIS_LAZULI);

        List<Recipe> recipeList = new ArrayList<>();
        NamespacedKey nsKey;
        ShapelessRecipe slR;
        ShapedRecipe r;

        //Furnace Recipes
        nsKey = new NamespacedKey(Lostprofessions.get(), "ironore_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, ironIngot(), Material.IRON_ORE, 0, 1));

        nsKey = new NamespacedKey(Lostprofessions.get(), "goldore_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, goldIngot(), Material.GOLD_ORE, 0, 1));

        nsKey = new NamespacedKey(Lostprofessions.get(), "lapisore_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, cobaltIngot(), Material.LAPIS_ORE, 0, 1));

        nsKey = new NamespacedKey(Lostprofessions.get(), "redstoneore_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, calamiteIngot(), Material.REDSTONE_ORE, 0, 1));

        nsKey = new NamespacedKey(Lostprofessions.get(), "diorite_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, silverIngot(), Material.DIORITE, 0, 1));

        nsKey = new NamespacedKey(Lostprofessions.get(), "coal_ore_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, tungstenIngot(), Material.COAL_ORE, 0, 1));

        nsKey = new NamespacedKey(Lostprofessions.get(), "iron_block_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, platinumIngot(), Material.IRON_BLOCK, 0, 1));

        nsKey = new NamespacedKey(Lostprofessions.get(), "prismarine_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, luminideIngot(), Material.PRISMARINE, 0, 1));

        nsKey = new NamespacedKey(Lostprofessions.get(), "magmablock_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, meteoricMetalIngot(), Material.MAGMA_BLOCK, 0, 1));

        nsKey = new NamespacedKey(Lostprofessions.get(), "orangeterracota_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, copperIngot(), Material.ORANGE_TERRACOTTA, 0, 1));

        nsKey = new NamespacedKey(Lostprofessions.get(), "purple_glazed_terracota_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, litherCoal(), Material.PURPLE_GLAZED_TERRACOTTA, 0, 1));

        nsKey = new NamespacedKey(Lostprofessions.get(), "smoothredsandstone_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, palladiumIngot(), Material.SMOOTH_RED_SANDSTONE, 0, 1));

        nsKey = new NamespacedKey(Lostprofessions.get(), "smoothquartz_smelt");
        recipeList.add(new FurnaceRecipe(nsKey, tinIngot(), Material.SMOOTH_QUARTZ, 0, 1));


        //Shapeless recipes
        nsKey = new NamespacedKey(Lostprofessions.get(), "gold_piece");
        slR = new ShapelessRecipe(nsKey, goldPiece());
        slR.addIngredient(Material.GOLD_INGOT);
        recipeList.add(slR);

        nsKey = new NamespacedKey(Lostprofessions.get(), "iron_ingot");
        slR = new ShapelessRecipe(nsKey, ironIngot());
        slR.addIngredient(Material.STRING);
        recipeList.add(slR);

        //Shaped recipes
        nsKey = new NamespacedKey(Lostprofessions.get(), "cloth_coif");
        r = new ShapedRecipe(nsKey, clothCoif());
        r.shape("SWS", "W W", "   ");
        r.setIngredient('W', Material.WHITE_WOOL);
        r.setIngredient('S', Material.STRING);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "leather_helm");
        r = new ShapedRecipe(nsKey, leatherHelm());
        r.shape("LLL", "L L", "   ");
        r.setIngredient('L', Material.LEATHER);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "hood");
        r = new ShapedRecipe(nsKey, hood());
        r.shape(" W ", "W W", "   ");
        r.setIngredient('W', Material.WHITE_WOOL);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "gambeson");
        r = new ShapedRecipe(nsKey, gambeson());
        r.shape("W W", "WWW", "WWW");
        r.setIngredient('W', Material.WHITE_WOOL);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "robes");
        r = new ShapedRecipe(nsKey, robes());
        r.shape("S S", "SSS", "SSS");
        r.setIngredient('S', Material.STRING);
        recipeList.add(r);

        nsKey = new NamespacedKey(Lostprofessions.get(), "harness");
        r = new ShapedRecipe(nsKey, harness());
        r.shape("L L", "LLL", "LLL");
        r.setIngredient('L', Material.LEATHER);
        recipeList.add(r);

        for(int x = 0; x < recipeList.size(); x++) {
            Lostprofessions.get().getServer().addRecipe(recipeList.get(x));
        }



    }

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

    public static ItemStack clothCoif() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.WHITE);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Quilted Cloth Coif");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc(null, "This coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }

    public static ItemStack leatherHelm() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Leather Helm");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc(null, "This helm is made entirely from layered leather that fits snugly to the scalp of its wearer. It has a strap that loops around the wearer's jaw to keep it in place.");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }

    public static ItemStack hood() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Hood");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc(null, "A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }

    public static ItemStack gambeson() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.WHITE);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Gambeson");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc(null, "A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }

    public static ItemStack robes() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.WHITE);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Robes");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc(null, "A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }

    public static ItemStack harness() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Harness");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc(null, "A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }

    public static ItemStack quiltedChausses() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.WHITE);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Quilted Chausses");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc(null, "A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }

    public static ItemStack leatherTasset() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Hood");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc(null, "A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }

    public static ItemStack braies() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.WHITE);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Braies");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc(null, "A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }

    public static ItemStack leatherBoots() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.WHITE);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Hood");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc(null, "A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }

    public static ItemStack shoes() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta im = (LeatherArmorMeta) item.getItemMeta();
        im.setColor(Color.WHITE);
        item.setItemMeta(im);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Shoes");
        ib.setType(Type.LIGHT_ARMOR);
        ib.applyTags();
        ib.setDesc(null, "A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }

    public static ItemStack goldPiece() {
        ItemStack item = new ItemStack(Material.GOLD_NUGGET);
        item.setAmount(9);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(ChatColor.GREEN + "Gold Piece");
        List<String> loreString = new ArrayList<>();
        loreString.add(ChatColor.translateAlternateColorCodes('&', "&7[&2Uncommon &7| &bModerate &7| &8Mundane &7| &8Currency&7]"));
        loreString.add(ChatColor.translateAlternateColorCodes('&',"&7&oA single Gold Peice. A Gold Peice is the"));
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
        ib.setDesc(null, "This is a uniform ingot of iron. Iron is gray and has a dull metallic sheen. \n\n [*] This ingot weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);
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
        ib.setDesc(null, "Tin is very similar to silver in appearance, though because of its hardness it ends up with a lumpy texture. \n\n [*] This ingot weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);

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
        ib.setDesc(null, "Silver is a brilliant shining metal that has a color the same as its name. It's polished and chromatic. \n\n [*] This ingot weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);

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
        ib.setDesc(null, "Gold is one of the shiniest and most flamboyant metals in existence. Its appearance screams value.  \n\n [*] This ingot weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);

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
        ib.setDesc(null, "Tungsten is jet-black in appearance with a beautifully stark luster. \n\n [*] This ingot weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);

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
        ib.setDesc(null, "Meteorite is a mostly black metal with pulsing red striations that tear through it like a hot knife on butter. \n\n [*] This ingot weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);

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
        ib.setDesc(null, "Platinum is almost identical to silver in every way. There is one difference, it has a slight blue-ish hue. \n\n [*] This ingot weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }

    public static ItemStack cobaltIngot() {
        ItemStack item = new ItemStack(Material.LAPIS_LAZULI);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Cobalt Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.WONDROUS);
        ib.setAura(Aura.ABYSSAL, 0);
        ib.applyTags();
        ib.setDesc(null, "Cobalt is a dark-blue metal that has very little sheen. It has a slight magnetic pull when brought near other metals. \n\n [*] This ingot weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);

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
        ib.setDesc(null, "Calamite is a stark red, pulsating lustrous metal that whispers hate and malice in the ear of anyone who holds it. \n\n [*] This ingot weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);

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
        ib.setDesc(null, "Palladium is a yellow-ish orange metal similar to copper. However when this metal is near the distant roar and blast of Lacerta breathing flames can be heard. \n\n [*] This ingot weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);

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
        ib.setDesc(null, "Lither Coal is made from ancient fallen branches of the World Tree turned to peat, then to coal. \n\n [*] This coal chunk weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);

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
        ib.setDesc(null, "Luminide is the same as iron except for at night. Its true vibrant grayish-blue color and glowing bright luster is revealed under moonlight. \n\n [*] This ingot weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);

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
        ib.setDesc(null, "Copper is an orange, lustrous metal. It is smooth and uniform. \n\n [*] This ingot weighs 1 kg");
        ib.addApproval(null, Approval.PLUGIN);

        return item;
    }
}
