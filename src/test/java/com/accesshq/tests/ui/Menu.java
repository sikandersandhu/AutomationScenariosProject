package com.accesshq.tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu {

    private WebDriver driver;

    public Menu(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String name) {
        String cssSelecExpression = "a[href=\"/" + name + "\"]";
        driver.findElement(By.cssSelector(cssSelecExpression)).click();
    }
}
