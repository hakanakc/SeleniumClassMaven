package SelniumTests;

import SelniumTests.Utility.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        // Reports setup
    }
    @BeforeMethod
    public void beforeMethod(){
        driver= Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void afterMethod(){
        Driver.closeDriver();
    }
    @AfterTest
    public void afterTest(){
        //Closing the report report.flush();
    }

}