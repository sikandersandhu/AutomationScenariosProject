package com.accesshq.tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.function.Predicate;

public class TablePage {

    private final WebDriver driver;

    public TablePage(WebDriver driver) {
        this.driver = driver;
    }

    public TableRowTile getRow(Predicate<TableRowTile> predicate) {

        for (WebElement row: driver.findElements(By.cssSelector("tbody tr"))){

            TableRowTile rowTile = new TableRowTile(row);

            if (predicate.test(rowTile)) {
                return rowTile;
            }
        }
        throw new NotFoundException("Row not found");
    }
}
