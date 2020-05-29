package net.lostfables.lughgk.lostprofessions.itemManagement;

public enum Category {
    FLORA(   "Flora", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWRiYTM4ZTlmYzY3ZjcyYzQ1OGZkYWM4ZWNkN2NhYmFlZDNlYjgzNzM3MTQzYTAxMjgzNTBhMWFiMzgxZTNlIn19fQ=="),
    FAUNA(   "Fauna", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIxNjY4ZWY3Y2I3OWRkOWMyMmNlM2QxZjNmNGNiNmUyNTU5ODkzYjZkZjRhNDY5NTE0ZTY2N2MxNmFhNCJ9fX0="),
    CREATURE("Creature", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTZmYzg1NGJiODRjZjRiNzY5NzI5Nzk3M2UwMmI3OWJjMTA2OTg0NjBiNTFhNjM5YzYwZTVlNDE3NzM0ZTExIn19fQ=="),
    WOOD(    "Wood", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmQyZTMxMDg3OWE2NDUwYWY1NjI1YmNkNDUwOTNkZDdlNWQ4ZjgyN2NjYmZlYWM2OWM4MTUzNzc2ODQwNmIifX19"),
    METAL(   "Metal", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTAxODQzZWM0M2YwODhjOTYzZmZjM2UyZjcxYzY2ZTMxNTU5NDNiMTc3YTFhMzU5ODJiMTIwZjZmNjQ4MjJiYyJ9fX0="),
    GEM(     "Gem", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTM5OWU0N2U1NWMxNWQzZTI2NTI1YzVhNDcwZjI0OGUzMzVkMmZhYTNhNjM0MTBjNGRkZjQyZGEzNmFkMmYifX19"),
    ALCHEMY( "Alchemical", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjNmMzYzk1MzM3MzY1Nzk5YzZjNTAyZDZmYzM0YTViMTk3NWNmNzM2NGJhMmRlOGZkYjBhZjUxZTZhMjhjIn19fQ=="),
    CLOTH(   "Cloth", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjk2YzBjYjQyNTY0N2ViOWQ1OWIwMGNiNzE3NjE5ZjAzODE2NDA4YmM1OGM1ZTY5ZjQ5ZDZjMDg1MDllMmVmMyJ9fX0="),
    FOOD(    "Food", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTIxZDhkOWFlNTI3OGUyNmJjNDM5OTkyM2QyNWNjYjkxNzNlODM3NDhlOWJhZDZkZjc2MzE0YmE5NDM2OWUifX19"),
    TOOL(    "Tool", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzViNmU0MWY2NmExNzBlYTIzZTg1YjI3NDk2OTRlMjUyNTA2MTgyMTY4NmNiYjFmNjE1Y2VhODEwMmRiYTRmYyJ9fX0="),
    APPAREL( "Apparel", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjdjMTc4NjVjMjc5MzRmOGM4ZWM2YzYyN2UxZmUyZDk5Zjc4M2VjOGFlNDE0Y2EyZDRmZDM2NDBhN2YzYyJ9fX0="),
    MISC(    "Miscellanea", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGNiM2FjZGMxMWNhNzQ3YmY3MTBlNTlmNGM4ZTliM2Q5NDlmZGQzNjRjNjg2OTgzMWNhODc4ZjA3NjNkMTc4NyJ9fX0=");

    String name;
    String skullTexture;

    Category(String category, String skullTexture) {
        this.name = category;
        this.skullTexture = skullTexture;
    }

    public static Category getCategory(String name) {
        for (Category category : values()) {
            if (category.name.equalsIgnoreCase(name)) {
                return category;
            }
        }
        return null;
    }

}
