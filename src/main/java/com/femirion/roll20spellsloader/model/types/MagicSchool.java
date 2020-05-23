package com.femirion.roll20spellsloader.model.types;

public enum MagicSchool {
    EVOCATION("Воплощение"),
    CONJURATION("Вызов"),
    ILLUSION("Иллюзия"),
    NECROMANCY("Некромантия"),
    ABJURATION("Ограждение"),
    ENCHANTMENT("Очарование"),
    TRANSMUTATION("Преобразование"),
    DIVINATION("Прорицание");

    private final String name;

    MagicSchool(String name) {
        this.name = name;
    }
}
