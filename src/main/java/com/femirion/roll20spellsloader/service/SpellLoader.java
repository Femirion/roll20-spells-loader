package com.femirion.roll20spellsloader.service;

import com.femirion.roll20spellsloader.config.Roll20Config;
import com.femirion.roll20spellsloader.model.Result;
import com.femirion.roll20spellsloader.model.Spell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.femirion.roll20spellsloader.utils.Utils.waitSeconds;

@Service
public class SpellLoader {

    private final Roll20Config roll20Config;
    private final WebDriver driver;

    public SpellLoader(Roll20Config roll20Config, WebDriver driver) {
        this.roll20Config = roll20Config;
        this.driver = driver;
    }

    public Result load(List<Spell> spells) {
        openSpellList();
        for (Spell spell : spells) {
            String addButtonXpath = "//div[@data-groupname=\""
                    + spell.getLevel().getButtonName() + "/button[@class=\"btn repcontrol_add\"]";
            waitSeconds(driver, 5, By.xpath(addButtonXpath));
            WebElement addButton = driver.findElement(By.xpath(addButtonXpath));
            addButton.click();

            List<WebElement> elements = driver.findElements(
                    By.xpath("//div[@class=\"sheet-options\"]/div/input[@name=\"attr_spellname\"]"));

            int x = 0 ;
        }


        try {
            Thread.sleep(10000);
        } catch (Exception ex) {
            System.out.println("test!!!  ===> " + ex);
        }


        return new Result();
    }

    private void openSpellList() {
        driver.get(roll20Config.getJournalUrl());
        String heroIdXpath = String.format("//div[contains(text(),\"%s\")]", roll20Config.getHeroId());
        waitSeconds(driver, 5, By.xpath(heroIdXpath));
        WebElement heroButton = driver.findElement(By.xpath(heroIdXpath));
        heroButton.click();

        String charsheetXpath = "//a[@data-tab=\"charsheet\"]";
        waitSeconds(driver, 5, By.xpath(charsheetXpath));
        WebElement charsheet = driver.findElement(By.xpath(charsheetXpath));
        charsheet.click();

        String spellsXpath = "//input[@class=\"sheet-tab-button sheet-spells\"]";
        waitSeconds(driver, 5, By.xpath(charsheetXpath));
        WebElement spells = driver.findElement(By.xpath(spellsXpath));
        spells.click();




    }
}
