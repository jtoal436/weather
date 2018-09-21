package com.sqs.weather;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.security.krb5.internal.crypto.Des;

import javax.print.attribute.standard.Destination;

public class WeatherObject {

    WebDriver driver;

    private By OriginLocator = By.name("changecityform");

    public WeatherObject(WebDriver driver) {
        this.driver = driver;
    }



    private By registerButtonLocator = By.xpath("//*[@id=\"changecityform\"]");





    public void populateCity(String city){


        //assertBookHeader();
        driver.findElement(OriginLocator).sendKeys(city);
        //clickBook(driver);
        //assertBookSuccessful();

    }







}
