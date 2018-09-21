package com.sqs.weather;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Weather2 {


    static WebDriver driver;
    private String forecastSuccessful = "FORECAST";
    private By bodyTextLocator = By.tagName("body");
    private String forecastHeader = "FORECAST";



    private By minTempLocator = By.name("");

    @Before
    public void testSetup() throws InterruptedException {
        System.out.println("In testSetup ");
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        String baseUrl = "http://weather.news24.com/sa/cape-town";

        //String expectedTitle = "FORECAST";
        driver.get(baseUrl);
        // String actualTitle = driver.getTitle();
        //System.out.println("Actual Title is: " + actualTitle);
//        Assert.assertEquals(actualTitle, expectedTitle);
        Thread.sleep(5000);
    }


    @BeforeClass
    public static void browserSetup() {





    }

/*


    @Test
    public void selectCity()
    {

        driver.findElement(By.linkText("7 DAY EXPANDED FORECAST")).click();

        // Click the register tab on the login screen (Login screen is entry into system)
        //driver.findElement(By.linkText("FORECAST")).click();

        //WeatherObject2 weatherPage;
        //weatherPage = new WeatherObject2(driver);
      //  driver.findElement(By.name("changecityform")).click();
      //  weatherPage.("Cape Town city");
    }

*/


    @Test
    public void getTableData() throws InterruptedException {


        driver.findElement(By.id("ext-gen32")).click();
        WebElement table = driver.findElement(By.xpath("//*[@id=\"sa_weather\"]/div[1]/div[3]/div[2]/div/div/table"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        List<WebElement> column = table.findElements(By.tagName("td"));


        List<String> value = new ArrayList<String>();

//       System.out.println(driver.findElement(By.xpath("//*[@id=\"forecastContent\"]/table/tbody/tr[3]/td[5]")));



        String value2 = driver.findElement(By.xpath("//*[@id=\"forecastContent\"]/table/tbody/tr[3]/td[5]")).getText();
        System.out.println(By.xpath(value2));







        for (int j = 0; j < column.size(); j++) {
            //System.out.println(column.get("tr")("td";
            System.out.println(column.get(j).getText());



            Thread.sleep(10000);
        }


    }
}