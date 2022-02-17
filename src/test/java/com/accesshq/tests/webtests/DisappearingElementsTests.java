package com.accesshq.tests.webtests;

import com.accesshq.tests.ui.DisappearingElementsPageMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DisappearingElementsTests extends BaseTests{

    @Test
    void homeMenuTest() {

        // setup   // open "Disappearing Elements" page
        menu.open("disappearing_elements");

        // act     // find menu item
        DisappearingElementsPageMenu menu = new DisappearingElementsPageMenu(driver);
        // click on menu item
        menu.clickHome();

        // assert  // that menuItem is "about" menu
        Assertions.assertEquals("welcome to the-internet", menu.getHomePageTitle().toLowerCase());

    }
    @Test
    void aboutMenuTest() {

        // setup   // open "Disappearing Elements" page
        menu.open("disappearing_elements");

        // act     // find menu item
        DisappearingElementsPageMenu menu = new DisappearingElementsPageMenu(driver);
        // click on menu item
        menu.clickAbout();

        // assert  // that menuItem is "about" menu
        Assertions.assertEquals("not found", menu.getAboutPageTitle().toLowerCase());

    }
    @Test
    void contactUsMenuTest() {

        // setup   // open "Disappearing Elements" page
        menu.open("disappearing_elements");

        // act     // find menu item
        DisappearingElementsPageMenu menu = new DisappearingElementsPageMenu(driver);
        // click on menu item
        menu.clickContactUs();

        // assert  // that menuItem is "about" menu
        Assertions.assertEquals("not found", menu.getContactUsPageTitle().toLowerCase());

    }
    @Test
    void portfolioMenuTest() {

        // setup   // open "Disappearing Elements" page
        menu.open("disappearing_elements");

        // act     // find menu item
        DisappearingElementsPageMenu menu = new DisappearingElementsPageMenu(driver);
        // click on menu item
        menu.clickPortfolio();

        // assert  // that menuItem is "about" menu
        Assertions.assertEquals("not found", menu.getPortfolioPageTitle().toLowerCase());

    }
    @Test
    void galleryMenuTest() {

        /// Disappearing element ///

        // setup   // open "Disappearing Elements" page
        menu.open("disappearing_elements");

        // act     // find menu item
        DisappearingElementsPageMenu menu = new DisappearingElementsPageMenu(driver);
        // click on menu item
        var isVisible = menu.clickGallery();

        // assert

        // if Gallery menu is visible, then assert:
        if (isVisible) Assertions.assertEquals("not found", menu.getGalleryPageTitle().toLowerCase());
        // if gallery menu is not visible, then assert:
        else Assertions.assertEquals("disappearing elements", menu.getDisappearingElementsPageTitle().toLowerCase());

    }
}
