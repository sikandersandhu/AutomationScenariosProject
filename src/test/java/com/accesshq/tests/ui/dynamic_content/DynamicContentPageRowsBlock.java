package com.accesshq.tests.ui.dynamic_content;

import com.accesshq.tests.ui.challenging_dom.TableRowTile;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.function.Predicate;

public class DynamicContentPageRowsBlock {

    private final WebDriver driver;

    public DynamicContentPageRowsBlock(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicContentPageRowTile getRow(Predicate<DynamicContentPageRowTile> predicate) {

        for (WebElement row: driver.findElements(By.cssSelector("div#content > .row"))){

            var rowTile = new DynamicContentPageRowTile(row);

            if (predicate.test(rowTile)) {
                return rowTile;
            }
        }
        throw new NotFoundException("Row not found");
    }
}
