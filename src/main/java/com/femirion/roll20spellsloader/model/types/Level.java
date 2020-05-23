package com.femirion.roll20spellsloader.model.types;

public enum Level {
    CANTRIP(0, "repeating_spell-cantrip"),
    FIRST(1, "repeating_spell-1"),
    SECOND(2, "repeating_spell-2");

    private final int level;
    private final String buttonName;

    Level(int level, String buttonName) {
        this.level = level;
        this.buttonName = buttonName;
    }

    public int getLevel() {
        return level;
    }

    public String getButtonName() {
        return buttonName;
    }
}
