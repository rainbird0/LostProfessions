package net.lostfables.lughgk.lostprofessions.items;

import net.lordofthecraft.itemedit.enums.Rarity;
import net.md_5.bungee.api.ChatColor;

public enum Component {
    BLUEPRINT(ChatColor.STRIKETHROUGH + "Blueprint", Rarity.VCOMMON),
    COPPER("Copper", Rarity.VCOMMON),
    TIN("Tin", Rarity.VCOMMON),
    IRON("Iron", Rarity.COMMON),
    GOLD("Gold", Rarity.UNCOMMON),
    SILVER("Silver", Rarity.UNCOMMON),
    METEORITE("Meteoric Metal", Rarity.RARE),
    PLATINUM("Platinum", Rarity.RARE),
    LUMINIDE("Luminide", Rarity.RARE),
    COBALT("Cobalt", Rarity.WONDROUS),
    LITHER("Lither", Rarity.WONDROUS),
    PALLADIUM("Palladium", Rarity.WONDROUS),
    CALAMITE("Calamite", Rarity.WONDROUS);

    private String name;
    private Rarity rarity;

    Component(String name, Rarity rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public String getName() {
        return name;
    }

    public static Component getFromString(String fromString) {
        Component component = null;
        for(Component c : Component.values()) {
            if(fromString.toUpperCase().contains(c.getName().toUpperCase())) {
                component = c;
            }
        }
        return component;
    }

}
