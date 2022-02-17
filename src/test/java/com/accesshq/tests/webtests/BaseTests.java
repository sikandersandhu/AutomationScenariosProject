package com.accesshq.tests.webtests;

import com.accesshq.tests.ui.Menu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    protected WebDriver driver;
    protected Menu menu;

    @BeforeEach
    void setUp() {

        // setup chrome driver path in system properties
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        // setup chrome driver
        driver = new ChromeDriver();
        // get driver to maximize window size
        driver.manage().window().maximize();
        // driver get AUT homepage
        driver.get("http://the-internet.herokuapp.com/");
        // initialize menu object
        menu = new Menu(driver);

    }

    @AfterEach
    void cleanUp() {

        if (driver != null) {
            driver.quit();
        }

    }
}
