package com.femirion.roll20spellsloader.service;

import com.femirion.roll20spellsloader.model.Result;
import com.femirion.roll20spellsloader.model.Spell;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Service
public class LoadService {

    private final SpellLoader loader;
    private final Roll20AuthService authService;

    public LoadService(SpellLoader loader, Roll20AuthService authService) {
        this.loader = loader;
        this.authService = authService;
    }

    @PostConstruct
    private void init() {
        load(Collections.singletonList(new Spell()));
    }

    public Result load(List<Spell> spells) {
        authService.auth();
        return loader.load(spells);
    }

}
