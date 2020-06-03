package net.lostfables.lughgk.lostprofessions.items;

import net.lordofthecraft.itemedit.ItemBuilder;
import net.lordofthecraft.itemedit.enums.Approval;
import net.lordofthecraft.itemedit.enums.Quality;
import net.lordofthecraft.itemedit.enums.Rarity;
import net.lordofthecraft.itemedit.enums.Type;
import net.lostfables.lughgk.lostprofessions.Lostprofessions;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LostProfessionItems implements Listener {

    @EventHandler(priority= EventPriority.HIGH)
    public void customCrafting(PrepareItemCraftEvent e){
        if(e.getInventory().getResult() != null && e.getInventory().getResult().getType() == Material.IRON_NUGGET) {
            for( int i = 0 ; i < e.getInventory().getSize() ; i++ ){
                final ItemStack item = e.getInventory().getItem(i);
                if(e.getInventory().getItem(i) != null) {
                    if(item.getType() == Material.IRON_INGOT) {
                        if(item.getItemMeta().getDisplayName().contains("Iron Ingot")){
                            e.getInventory().setResult(new ItemStack(Material.LEATHER, 1));
                        }
                    }
                }
            }
        }
    }

    @EventHandler(priority= EventPriority.HIGH)
    public void customSmeltEvent(FurnaceSmeltEvent e) {
        if(e.getSource().getType() == Material.IRON_ORE) {
            if (checkItem(e.getSource(), "Iron Ore", "Metal")) {
                e.setResult(ironIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.COAL_ORE) {
            if (checkItem(e.getSource(), "Iron Ore", "Metal")) {
                e.setResult(ironIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.DIORITE) {
            if (checkItem(e.getSource(), "Iron Ore", "Metal")) {
                e.setResult(ironIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.GOLD_ORE) {
            if (checkItem(e.getSource(), "Iron Ore", "Metal")) {
                e.setResult(ironIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.MAGMA_BLOCK) {
            if (checkItem(e.getSource(), "Iron Ore", "Metal")) {
                e.setResult(ironIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.IRON_BLOCK) {
            if (checkItem(e.getSource(), "Iron Ore", "Metal")) {
                e.setResult(ironIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.LAPIS_LAZULI) {
            if (checkItem(e.getSource(), "Iron Ore", "Metal")) {
                e.setResult(ironIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.LAPIS_LAZULI) {
            if (checkItem(e.getSource(), "Iron Ore", "Metal")) {
                e.setResult(ironIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.SMOOTH_RED_SANDSTONE) {
            if (checkItem(e.getSource(), "Iron Ore", "Metal")) {
                e.setResult(ironIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.PURPLE_GLAZED_TERRACOTTA) {
            if (checkItem(e.getSource(), "Iron Ore", "Metal")) {
                e.setResult(ironIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.SMOOTH_QUARTZ) {
            if (checkItem(e.getSource(), "Iron Ore", "Metal")) {
                e.setResult(ironIngot());
                return;
            }
            e.setCancelled(true);
            return;
        }

    }


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

        List<Recipe> recipeList = new ArrayList<>();
        NamespacedKey nsKey;
        ShapelessRecipe slR;
        ShapedRecipe r;
        FurnaceRecipe fR;

        //fR = new FurnaceRecipe();


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

        Lostprofessions.get().getServer().getPluginManager().registerEvents(this, Lostprofessions.get());

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
        ib.setDesc("This coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

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
        ib.setDesc("This helm is made entirely from layered leather that fits snugly to the scalp of its wearer. It has a strap that loops around the wearer's jaw to keep it in place.");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

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
        ib.setDesc("A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

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
        ib.setDesc("A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

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
        ib.setDesc("A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

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
        ib.setDesc("A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

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
        ib.setDesc("A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

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
        ib.setDesc("A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

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
        ib.setDesc("A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

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
        ib.setDesc("A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

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
        ib.setDesc("A cloth coif is a close fitting cap made from quilted linen that is worn by both men and women that covers the top, back, and sides of the head.");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

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
        ib.setDesc("This is a chunky piece of iron ore. It's overall the color of an average stone, however, there are extruding points of a tan colored mineral. \n\n [*] This ore chunk weighs 1 kg");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

        return item;
    }

    public static ItemStack tinIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemBuilder ib = new ItemBuilder(item);
        ib.setName("Iron Ingot");
        ib.setType(Type.METAL);
        ib.setQuality(Quality.NATURAL);
        ib.setRarity(Rarity.COMMON);
        ib.applyTags();
        ib.setDesc("This is a chunky piece of iron ore. It's overall the color of an average stone, however, there are extruding points of a tan colored mineral. \n\n [*] This ore chunk weighs 1 kg");
        ib.addApproval(new PlaceHolderPlayer(), Approval.PLUGIN);

        return item;
    }
}
