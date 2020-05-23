package com.femirion.roll20spellsloader.model;

import com.femirion.roll20spellsloader.model.types.GameClass;
import com.femirion.roll20spellsloader.model.types.Level;
import com.femirion.roll20spellsloader.model.types.MagicSchool;
import com.femirion.roll20spellsloader.model.types.SpellcastingAttributes;
import lombok.Data;

import java.util.List;

@Data
public class Spell {
    private String name;
    private Level level;
    private MagicSchool school;
    private String castingTime;
    private boolean ritual;
    private String range;
    private String target;
    private boolean needVerb;
    private boolean needSemantic;
    private boolean needMaterial;
    private String specialComponent;
    private boolean concentration;
    private String duration;
    private SpellcastingAttributes spellcastingAttributes;
    private boolean attack;
    private String damage;
    private String text;
    private List<GameClass> classes;

    public Level getLevel() {
        return level;
    }

}
