package com.accesshq.tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableRowTile {

    private WebElement row;

    public TableRowTile(WebElement row) {
        this.row = row;
    }

    public String getLorem() { return row.findElement(By.cssSelector("td:first-child")).getText(); }
    public String getIpsum() { return row.findElement(By.cssSelector("td:nth-child(2)")).getText(); }
    public String getDolor() { return row.findElement(By.cssSelector("td:nth-child(3)")).getText(); }
    public String getSit() { return row.findElement(By.cssSelector("td:nth-child(4)")).getText(); }
    public String getAmet() { return row.findElement(By.cssSelector("td:nth-child(5)")).getText(); }
    public String getDiceret() { return row.findElement(By.cssSelector("td:nth-child(6)")).getText(); }
    public String getEdit() { return row.findElement(By.cssSelector("tbody tr td:last-child a:first-child")).getText(); }
    public String getDelete() { return row.findElement(By.cssSelector("tbody tr td:last-child a:nth-child(2)")).getText(); }
    public void clickEdit() { row.findElement(By.cssSelector("tbody tr td:last-child a:first-child")).click(); }
    public void clickDelete() { row.findElement(By.cssSelector("tbody tr td:last-child a:nth-child(2)")).click(); }
}
