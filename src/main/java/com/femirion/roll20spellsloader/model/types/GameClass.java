package com.femirion.roll20spellsloader.model.types;

public enum GameClass {
    BARD("бард"),
    DRUID("друид"),
    WARLOCK("колдун"),
    RANGER("следопыт"),
    BARBARIAN("варвар"),
    MONK("монах"),
    WIZARD("волшебник"),
    CLERIC("жрец"),
    PALADIN("паладин"),
    SORCERER("чародей"),
    FIGHTER("воин"),
    ROGUE("плут");

    private final String name;

    GameClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
