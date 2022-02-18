package com.accesshq.tests.ui.dynamic_content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DynamicContentPageRowTile {

    private WebElement row;

    public DynamicContentPageRowTile(WebElement row) {
        this.row = row;
    }

    public String getImage() {
        if (row.findElement(By.cssSelector("div img:not([alt*='Fork me on GitHub'])")).getAttribute("src").contains("http://the-internet.herokuapp.com/img/avatars/")) {
            return "http://the-internet.herokuapp.com/img/avatars/";
        }
        else return "";
    }
    public String getText() { return row.findElement(By.cssSelector(".large-10:not([id*=content])")).getText(); }
}
