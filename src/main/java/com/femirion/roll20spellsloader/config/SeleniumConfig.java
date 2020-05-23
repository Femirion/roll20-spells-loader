package com.femirion.roll20spellsloader.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("selenium")
public class SeleniumConfig {

    @Value("${selenium.web-driver-path}")
    private String webDriverPath;

    @Bean
    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        return new ChromeDriver();
    }

}
