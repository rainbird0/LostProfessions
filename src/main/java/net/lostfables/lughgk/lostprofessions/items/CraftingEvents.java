package net.lostfables.lughgk.lostprofessions.items;

import net.lostfables.lughgk.lostprofessions.Lostprofessions;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CraftingEvents implements Listener {

    public CraftingEvents() {
        Lostprofessions.get().getServer().getPluginManager().registerEvents(this, Lostprofessions.get());
    }

    @EventHandler(ignoreCancelled = true)
    public void onJoinEvent(PlayerJoinEvent event) {
        event.getPlayer().discoverRecipes(Lostprofessions.getKeySet());
    }

    @EventHandler(priority= EventPriority.HIGH)
    public void customCrafting(PrepareItemCraftEvent e) {
        if (e.getInventory().getResult() != null) {

        //METALPIECE
        if (e.getInventory().getResult().equals(LostProfessionItems.metalPiece(Component.BLUEPRINT))) {

            List<Component> metal = new ArrayList<>();


            for (ItemStack item : e.getInventory().getMatrix()) {
                if (item != null && item.getType() == Material.IRON_INGOT) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT)) {
                e.getInventory().setResult(null);
                return;
            }


            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    System.out.println(metal.get(i).equals(metal.get(i - 1)));
                    e.getInventory().setResult(null);
                    return;
                }
            }

            ItemStack item = LostProfessionItems.metalPiece(metal.get(0));
            item.setAmount(5);
            e.getInventory().setResult(item);
            return;
        }

        if (e.getInventory().getResult().equals(LostProfessionItems.softMetalPiece(Component.BLUEPRINT))) {

            List<Component> metal = new ArrayList<>();


            for (ItemStack item : e.getInventory().getMatrix()) {
                if (item != null && item.getType() == Material.BRICK) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT)) {
                e.getInventory().setResult(null);
                return;
            }

            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    System.out.println(metal.get(i).equals(metal.get(i - 1)));
                    e.getInventory().setResult(null);
                    return;
                }
            }

            ItemStack item = LostProfessionItems.softMetalPiece(metal.get(0));
            item.setAmount(5);
            e.getInventory().setResult(item);
            return;
        }

        if (e.getInventory().getResult().equals(LostProfessionItems.hardMetalPiece(Component.BLUEPRINT))) {

            List<Component> metal = new ArrayList<>();


            for (ItemStack item : e.getInventory().getMatrix()) {
                if (item != null && item.getType() == Material.NETHER_BRICK) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT)) {
                e.getInventory().setResult(null);
                return;
            }

            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    System.out.println(metal.get(i).equals(metal.get(i - 1)));
                    e.getInventory().setResult(null);
                    return;
                }
            }

            ItemStack item = LostProfessionItems.hardMetalPiece(metal.get(0));
            item.setAmount(5);
            e.getInventory().setResult(item);
            return;
        }

        //METALINGOT
        if (e.getInventory().getResult().equals(LostProfessionItems.ironIngot())) {
            List<Component> metal = new ArrayList<>();


            for (ItemStack item : e.getInventory().getMatrix()) {
                if (item != null && item.getType() == Material.IRON_NUGGET) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT)) {
                e.getInventory().setResult(null);
                return;
            }

            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    System.out.println(metal.get(i).equals(metal.get(i - 1)));
                    e.getInventory().setResult(null);
                    return;
                }
            }

            e.getInventory().setResult(metal.get(0).getItem());
            return;
        }

            //BUCKET
            if (e.getInventory().getResult().equals(LostProfessionItems.bucket())) {
                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.bucket());
                return;
            }

            //BARS
            if (e.getInventory().getResult().equals(LostProfessionItems.iron_bars())) {
                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_INGOT)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }
                ItemStack item = LostProfessionItems.iron_bars();
                item.setAmount(16);
                e.getInventory().setResult(item);
                return;
            }

            //COMPASS
            if (e.getInventory().getResult().equals(LostProfessionItems.compass(Component.BLUEPRINT))) {
                List<Component> metal = new ArrayList<>();

                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON || item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.compass(metal.get(0)));
                return;
            }

            //SHEARS
            if (e.getInventory().getResult().equals(LostProfessionItems.shears())) {
                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.shears());
                return;
            }

            //SHOVEL
            if (e.getInventory().getResult().equals(LostProfessionItems.shovel(Component.BLUEPRINT))) {

                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.shovel(metal.get(0)));
                return;
            }


        //PICKAXE
        if (e.getInventory().getResult().equals(LostProfessionItems.pickaxe(Component.BLUEPRINT))) {
            List<Component> metal = new ArrayList<>();

            for (ItemStack item : e.getInventory().getMatrix()) {
                if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON || item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                e.getInventory().setResult(null);
                return;
            }

            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    e.getInventory().setResult(null);
                    return;
                }
            }

            e.getInventory().setResult(LostProfessionItems.pickaxe(metal.get(0)));
            return;
        }

        //HOE
        if (e.getInventory().getResult() != null && e.getInventory().getResult().equals(LostProfessionItems.hoe(Component.BLUEPRINT))) {
            List<Component> metal = new ArrayList<>();

            for (ItemStack item : e.getInventory().getMatrix()) {
                if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON || item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                e.getInventory().setResult(null);
                return;
            }

            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    e.getInventory().setResult(null);
                    return;
                }
            }

            e.getInventory().setResult(LostProfessionItems.hoe(metal.get(0)));
            return;
        }

        //WOODCUTTER'S AXE
        if (e.getInventory().getResult().equals(LostProfessionItems.woodcutteraxe(Component.BLUEPRINT))) {
            List<Component> metal = new ArrayList<>();

            for (ItemStack item : e.getInventory().getMatrix()) {
                if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON || item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                    metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                }
            }

            if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                e.getInventory().setResult(null);
                return;
            }

            for (int i = 1; i < metal.size(); i++) {
                if (!metal.get(i).equals(metal.get(i - 1))) {
                    e.getInventory().setResult(null);
                    return;
                }
            }

            e.getInventory().setResult(LostProfessionItems.woodcutteraxe(metal.get(0)));
            return;
        }

            //Reinforced Boot
            if (e.getInventory().getResult().equals(LostProfessionItems.reinforced_boots(Component.BLUEPRINT))) {
                List<Component> metal = new ArrayList<>();

                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.reinforced_boots(metal.get(0)));
                return;
            }

            //Nasal Helmet
            if (e.getInventory().getResult().equals(LostProfessionItems.nasal_helm(Component.BLUEPRINT))) {
                List<Component> metal = new ArrayList<>();

                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON || item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.nasal_helm(metal.get(0)));
                return;
            }

            //Maille Coif
            if (e.getInventory().getResult().equals(LostProfessionItems.maille_coif(Component.BLUEPRINT))) {
                List<Component> metal = new ArrayList<>();

                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.maille_coif(metal.get(0)));
                return;
            }

            //Barbute
            if (e.getInventory().getResult().equals(LostProfessionItems.barbute(Component.BLUEPRINT))) {
                List<Component> metal = new ArrayList<>();

                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON || item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.barbute(metal.get(0)));
                return;
            }

            //Brigandine
            if (e.getInventory().getResult().equals(LostProfessionItems.brigandine(Component.BLUEPRINT))) {
                List<Component> metal = new ArrayList<>();

                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.brigandine(metal.get(0)));
                return;
            }

            //Hauberk
            if (e.getInventory().getResult().equals(LostProfessionItems.hauberk(Component.BLUEPRINT))) {
                List<Component> metal = new ArrayList<>();

                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.hauberk(metal.get(0)));
                return;
            }

            //Maille Chausses
            if (e.getInventory().getResult().equals(LostProfessionItems.maille_chausses(Component.BLUEPRINT))) {
                List<Component> metal = new ArrayList<>();

                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.maille_chausses(metal.get(0)));
                return;
            }

            //cuisse
            if (e.getInventory().getResult().equals(LostProfessionItems.cuisse(Component.BLUEPRINT))) {
                List<Component> metal = new ArrayList<>();

                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON || item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT) || metal.contains(null)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.cuisse(metal.get(0)));
                return;
            }

            //FULL PLATE LEGS
            if (e.getInventory().getResult().equals(LostProfessionItems.fullplatelegs(Component.BLUEPRINT))) {

                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.fullplatelegs(metal.get(0)));
                return;
            }

            //CLOSE HELM
            if (e.getInventory().getResult().equals(LostProfessionItems.close_helm(Component.BLUEPRINT))) {

                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.close_helm(metal.get(0)));
                return;
            }

            //FULL PLATE BOOTS
            if (e.getInventory().getResult().equals(LostProfessionItems.fullplateboots(Component.BLUEPRINT))) {

                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.fullplateboots(metal.get(0)));
                return;
            }

            //FULL PLATE CHEST
            if (e.getInventory().getResult().equals(LostProfessionItems.fullplatechest(Component.BLUEPRINT))) {

                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.fullplatechest(metal.get(0)));
                return;
            }

            //DAGGER
            if (e.getInventory().getResult().equals(LostProfessionItems.dagger(Component.BLUEPRINT))) {

                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.dagger(metal.get(0)));
                return;
            }

            //LONGSWORD
            if (e.getInventory().getResult().equals(LostProfessionItems.longsword(Component.BLUEPRINT))) {

                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON || item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.longsword(metal.get(0)));
                return;
            }

            //SHORTSPEAR
            if (e.getInventory().getResult().equals(LostProfessionItems.shortspear(Component.BLUEPRINT))) {

                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.shortspear(metal.get(0)));
                return;
            }

            //SPEAR
            if (e.getInventory().getResult().equals(LostProfessionItems.spear(Component.BLUEPRINT))) {

                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_INGOT || item.getType() == Material.BRICK || item.getType() == Material.NETHER_BRICK)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.spear(metal.get(0)));
                return;
            }

            //Heater Shield
            if (e.getInventory().getResult().equals(LostProfessionItems.heater_shield(Component.BLUEPRINT))) {

                List<Component> metal = new ArrayList<>();


                for (ItemStack item : e.getInventory().getMatrix()) {
                    if (item != null && (item.getType() == Material.IRON_NUGGET || item.getType() == Material.ACACIA_BUTTON || item.getType() == Material.DARK_OAK_BUTTON)) {
                        metal.add(Component.getFromString(item.getItemMeta().getDisplayName()));
                    }
                }

                if (metal.contains(Component.BLUEPRINT)) {
                    e.getInventory().setResult(null);
                    return;
                }

                for (int i = 1; i < metal.size(); i++) {
                    if (!metal.get(i).equals(metal.get(i - 1))) {
                        e.getInventory().setResult(null);
                        return;
                    }
                }

                e.getInventory().setResult(LostProfessionItems.heater_shield(metal.get(0)));
            }
        }
    }
}
