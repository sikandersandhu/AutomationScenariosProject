package com.accesshq.tests.ui.disappearing_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DisappearingElementsPageMenu {

    private WebDriver driver;

    public DisappearingElementsPageMenu(WebDriver driver) {
        this.driver = driver;
    }


    public void clickAbout() { driver.findElement(By.cssSelector("a[href=\"/about/\"]")).click(); }

    public String getAboutPageTitle() { return driver.findElement(By.tagName("h1")).getText(); }

    public void clickHome() { driver.findElement(By.cssSelector("a[href=\"/\"]")).click(); }

    public String getHomePageTitle() { return driver.findElement(By.tagName("h1")).getText(); }

    public void clickContactUs() { driver.findElement(By.cssSelector("a[href=\"/contact-us/\"]")).click(); }

    public String getContactUsPageTitle() { return driver.findElement(By.tagName("h1")).getText(); }

    public void clickPortfolio() { driver.findElement(By.cssSelector("a[href=\"/portfolio/\"]")).click(); }

    public String getPortfolioPageTitle() { return driver.findElement(By.tagName("h1")).getText(); }

    public boolean clickGallery() {

        /// disappearing element ///

        // create a list of <li> items to check its size to determine if
        // gallery is visible
        var listMenuItems = driver.findElements(By.tagName("li"));

        // if visible
        if (listMenuItems.size() == 5) {
            // click on element and return true
            driver.findElement(By.cssSelector("a[href=\"/gallery/\"]")).click();
            return true;
        }
        // if not visible, return false
        else  return false;

    }

    public String getGalleryPageTitle() { return driver.findElement(By.tagName("h1")).getText(); }

    public String getDisappearingElementsPageTitle() { return driver.findElement(By.tagName("h3")).getText(); }
}
