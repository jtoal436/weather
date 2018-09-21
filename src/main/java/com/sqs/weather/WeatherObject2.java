package com.sqs.weather;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeatherObject2 {


    WebDriver driver;

    private By cityLocator = By.name("ctl00$WeatherContentHolder$ddlCity");

    private By goButtonLocator = By.xpath("ctl00_WeatherContentHolder_btnGo");

    private By bodyTextLocator = By.tagName("body");


    public WeatherObject2(WebDriver driver) {
        this.driver = driver;
    }


    private By registerButtonLocator = By.xpath("//*[@id=\"changecityform\"]");


    public void populateBook(String Origin, String city) {


        driver.findElement(cityLocator).sendKeys(city);
        driver.findElement(goButtonLocator).click();

    }
}
