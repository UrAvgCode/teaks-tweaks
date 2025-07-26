package me.teakivy.teakstweaks.packs.oldmoremobheads.mobs;

import me.teakivy.teakstweaks.packs.oldmoremobheads.BaseMobHead;
import org.bukkit.Sound;
import org.bukkit.entity.Cat;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Objects;

public class CatHead extends BaseMobHead {

    public CatHead() {
        super(EntityType.CAT, "cat", Sound.ENTITY_CAT_HISS);

        addHeadTexture("calico", "Calico Cat Head", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQwMDk3MjcxYmI2ODBmZTk4MWU4NTllOGJhOTNmZWEyOGI4MTNiMTA0MmJkMjc3ZWEzMzI5YmVjNDkzZWVmMyJ9fX0");
        addHeadTexture("jellie", "Jellie Cat Head", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTBkYjQxMzc2Y2E1N2RmMTBmY2IxNTM5ZTg2NjU0ZWVjZmQzNmQzZmU3NWU4MTc2ODg1ZTkzMTg1ZGYyODBhNSJ9fX0");
        addHeadTexture("siamese", "Siamese Cat Head", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDViM2Y4Y2E0YjNhNTU1Y2NiM2QxOTQ0NDk4MDhiNGM5ZDc4MzMyNzE5NzgwMGQ0ZDY1OTc0Y2M2ODVhZjJlYSJ9fX0");
        addHeadTexture("persian", "Persian Cat Head", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmY0MGM3NDYyNjBlZjkxYzk2YjI3MTU5Nzk1ZTg3MTkxYWU3Y2UzZDVmNzY3YmY4Yzc0ZmFhZDk2ODlhZjI1ZCJ9fX0");
        addHeadTexture("british_shorthair", "British Shorthair Cat Head", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTM4OWUwZDVkM2U4MWY4NGI1NzBlMjk3ODI0NGIzYTczZTVhMjJiY2RiNjg3NGI0NGVmNWQwZjY2Y2EyNGVlYyJ9fX0");
        addHeadTexture("tabby", "Tabby Cat Head", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGUyOGQzMGRiM2Y4YzNmZTUwY2E0ZjI2ZjMwNzVlMzZmMDAzYWU4MDI4MTM1YThjZDY5MmYyNGM5YTk4YWUxYiJ9fX0");
        addHeadTexture("tuxedo", "Tuxedo Cat Head", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGZkMTBjOGU3NWY2NzM5OGM0NzU4N2QyNWZjMTQ2ZjMxMWMwNTNjYzVkMGFlYWI4NzkwYmNlMzZlZTg4ZjVmOCJ9fX0");
        addHeadTexture("ginger", "Ginger Cat Head", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjExM2RiZDNjNmEwNzhhMTdiNGVkYjc4Y2UwN2Q4MzZjMzhkYWNlNTAyN2Q0YjBhODNmZDYwZTdjYTdhMGZjYiJ9fX0");
        addHeadTexture("ragdoll", "Ragdoll Cat Head", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM3YTQ1ZDI1ODg5ZTNmZGY3Nzk3Y2IyNThlMjZkNGU5NGY1YmMxM2VlZjAwNzk1ZGFmZWYyZTgzZTBhYjUxMSJ9fX0");
        addHeadTexture("white", "White Cat Head", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjFkMTVhYzk1NThlOThiODlhY2E4OWQzODE5NTAzZjFjNTI1NmMyMTk3ZGQzYzM0ZGY1YWFjNGQ3MmU3ZmJlZCJ9fX0");
        addHeadTexture("black", "Black Cat Head", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjJjMWU4MWZmMDNlODJhM2U3MWUwY2Q1ZmJlYzYwN2UxMTM2MTA4OWFhNDdmMjkwZDQ2YzhhMmMwNzQ2MGQ5MiJ9fX0");
    }

    @Override
    public String getTexture(EntityDeathEvent event) {
        Cat cat = (Cat) event.getEntity();

        String key = switch (Objects.requireNonNull(CatType.fromType(cat.getCatType()))) {
            case CALICO -> "calico";
            case JELLIE -> "jellie";
            case SIAMESE -> "siamese";
            case PERSIAN -> "persian";
            case BRITISH_SHORTHAIR -> "british_shorthair";
            case TABBY -> "tabby";
            case BLACK -> "tuxedo";
            case RED -> "ginger";
            case RAGDOLL -> "ragdoll";
            case WHITE -> "white";
            case ALL_BLACK -> "black";
        };

        return textures.get(key);
    }

    @Override
    public String getName(EntityDeathEvent event) {
        Cat cat = (Cat) event.getEntity();

        String name = "";

        switch (Objects.requireNonNull(CatType.fromType(cat.getCatType()))) {
            case CALICO -> name = "Calico";
            case JELLIE -> name = "Jellie";
            case SIAMESE -> name = "Siamese";
            case PERSIAN -> name = "Persian";
            case BRITISH_SHORTHAIR -> name = "British Shorthair";
            case TABBY -> name = "Tabby";
            case BLACK -> name = "Tuxedo";
            case RED -> name = "Ginger";
            case RAGDOLL -> name = "Ragdoll";
            case WHITE -> name = "White";
            case ALL_BLACK -> name = "Black";
        }

        return name + " Cat";
    }

    protected enum CatType {
        CALICO(Cat.Type.CALICO),
        JELLIE(Cat.Type.JELLIE),
        SIAMESE(Cat.Type.SIAMESE),
        PERSIAN(Cat.Type.PERSIAN),
        BRITISH_SHORTHAIR(Cat.Type.BRITISH_SHORTHAIR),
        TABBY(Cat.Type.TABBY),
        BLACK(Cat.Type.BLACK),
        RED(Cat.Type.RED),
        RAGDOLL(Cat.Type.RAGDOLL),
        WHITE(Cat.Type.WHITE),
        ALL_BLACK(Cat.Type.ALL_BLACK);

        private final Cat.Type type;

        CatType(Cat.Type type) {
            this.type = type;
        }

        public Cat.Type getType() {
            return type;
        }

        public static CatType fromType(Cat.Type type) {
            for (CatType value : values()) {
                if (value.type == type) return value;
            }
            return null;
        }
    }
}
