package com.femirion.roll20spellsloader.service;

import com.femirion.roll20spellsloader.config.Roll20Config;
import com.femirion.roll20spellsloader.model.Result;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

import static com.femirion.roll20spellsloader.utils.Utils.waitSeconds;

@AllArgsConstructor
@Service
public class Roll20AuthService {
    private final Roll20Config config;
    private final WebDriver driver;

    public Result auth() {
        driver.get(config.getGameUrl());

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(config.getEmail());
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(config.getPassword());
        WebElement signInButton = driver.findElement(By.id("login"));
        signInButton.click();

        waitSeconds(driver, 5, By.id("playButton"));

        WebElement launchButton = driver.findElement(By.id("playButton"));
        launchButton.click();

        return new Result();
    }

}
