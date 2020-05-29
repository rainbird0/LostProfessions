package net.lostfables.lughgk.lostprofessions.items;

import net.lordofthecraft.itemedit.ItemBuilder;
import net.lordofthecraft.itemedit.enums.Approval;
import net.lordofthecraft.itemedit.enums.Type;
import net.lostfables.lughgk.lostprofessions.Lostprofessions;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LostProfessionItems {

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

        List<Recipe> recipeList = new ArrayList<>();
        NamespacedKey nsKey = new NamespacedKey(Lostprofessions.get(), "cloth_coif");
        ShapedRecipe r = new ShapedRecipe(nsKey, clothCoif());
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
}
