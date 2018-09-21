package com.sqs.weather;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WeatherA {


    static WebDriver driver;
    private String forecastSuccessful = "FORECAST";
    private By bodyTextLocator = By.tagName("body");
    private String forecastHeader = "FORECAST";

    @Before
    public void testSetup() throws InterruptedException {
        System.out.println("In testSetup ");
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        String baseUrl = "https://www.weathersa.co.za";

        //String expectedTitle = "FORECAST";
        driver.get(baseUrl);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title is: " + actualTitle);
//        Assert.assertEquals(actualTitle, expectedTitle);
        Thread.sleep(5000);
    }




    @BeforeClass
    public static void browserSetup()
    {



    }








    @Test
    public void selectCity()
    {
        // Click the register tab on the login screen (Login screen is entry into system)
        //driver.findElement(By.linkText("FORECAST")).click();

        WeatherObject weatherPage;
        weatherPage = new WeatherObject(driver);
        driver.findElement(By.name("changecityform")).click();
        weatherPage.populateCity("Cape Town city");

    }


/*
    @Test
    public void shouldRegisterNewCustomer() throws InterruptedException {
        //driver.findElement(By.xpath("/html/body/div/form/center/a")).click();
        //driver.findElement(By.name("firstname")).sendKeys("James");
        //driver.findElement(By.name("lastname")).sendKeys("Toal");
        //driver.findElement(By.name("email")).sendKeys("jtoal4368@sqs.com");
        //driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.xpath("html/body/div/form/button")).click();

        String bodyText = driver.findElement(bodyTextLocator).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(forecastSuccessful));

        Thread.sleep(10000);

    }


*/






/*
    @Test
    public void shouldRegisterNewCustomer() {

        driver.findElement(By.linkText("Register")).click();

        WeatherObject WeatherPage;
        WeatherPage = new WeatherObject(driver);

    }
*/



}