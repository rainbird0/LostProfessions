package net.lostfables.lughgk.lostprofessions.items;

import net.lordofthecraft.itemedit.enums.Rarity;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.inventory.ItemStack;

public enum Component {
    BLUEPRINT(ChatColor.STRIKETHROUGH + "Blueprint", Rarity.VCOMMON, null),
    COPPER("Copper", Rarity.VCOMMON, LostProfessionItems.copperIngot()),
    TIN("Tin", Rarity.VCOMMON, LostProfessionItems.tinIngot()),
    IRON("Iron", Rarity.COMMON, LostProfessionItems.ironIngot()),
    GOLD("Gold", Rarity.UNCOMMON, LostProfessionItems.goldIngot()),
    SILVER("Silver", Rarity.UNCOMMON, LostProfessionItems.silverIngot()),
    METEORITE("Meteoric Metal", Rarity.RARE, LostProfessionItems.meteoricMetalIngot()),
    PLATINUM("Platinum", Rarity.RARE, LostProfessionItems.platinumIngot()),
    LUMINIDE("Luminide", Rarity.RARE, LostProfessionItems.luminideIngot()),
    COBALT("Cobalt", Rarity.WONDROUS, LostProfessionItems.cobaltIngot()),
    LITHER("Lither", Rarity.WONDROUS, LostProfessionItems.litherCoal()),
    PALLADIUM("Palladium", Rarity.WONDROUS, LostProfessionItems.palladiumIngot()),
    CALAMITE("Calamite", Rarity.WONDROUS, LostProfessionItems.calamiteIngot());

    private String name;
    private Rarity rarity;
    private ItemStack item;

    Component(String name, Rarity rarity, ItemStack item) {
        this.name = name;
        this.rarity = rarity;
        this.item = item;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public String getName() {
        return name;
    }

    public ItemStack getItem() {
        return item;
    }

    public static Component getFromString(String fromString) {
        Component component = BLUEPRINT;
        for(Component c : Component.values()) {
            if(fromString.toUpperCase().contains(c.getName().toUpperCase())) {
                component = c;
            }
        }
        return component;
    }

}
