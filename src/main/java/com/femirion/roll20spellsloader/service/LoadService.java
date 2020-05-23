package com.femirion.roll20spellsloader.service;

import com.femirion.roll20spellsloader.model.Result;
import com.femirion.roll20spellsloader.model.Spell;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Slf4j
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
        Result auth = authService.auth();
        if (auth.isError()) {
            log.error("wrong login/password, try another one");
            throw new RuntimeException("wrong login/password, try another one");
        }
        return loader.load(spells);
    }

}
