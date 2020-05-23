package com.femirion.roll20spellsloader.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration("roll20")
public class Roll20Config {
    @Value("${roll20.gameUrl}")
    private String gameUrl;
    @Value("${roll20.email}")
    private String email;
    @Value("${roll20.password}")
    private String password;
    @Value("${roll20.journalUrl}")
    private String journalUrl;
    @Value("${roll20.heroId}")
    private String heroId;

    public String getGameUrl() {
        return gameUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getJournalUrl() {
        return journalUrl;
    }

    public String getHeroId() {
        return heroId;
    }
}
