package com.accesshq.tests.webtests;

import com.accesshq.tests.ui.dynamic_content.DynamicContentPageRowsBlock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
* - create enum for all home page menu items instead of having to type in names
*       - why enum? typing names can cause exception to be thrown
*       - using enum ensures only pre-coded values are used
*
* Dynamic content | element selection strategy
*
* rows - css ("div#content > .row")
*
* images 3 - find element by css | "div img:not([alt*='Fork me on GitHub'])" |
* get the attribute "src"
* and check it contains("http://the-internet.herokuapp.com/img/avatars/")
*
* paragraphs 3 - css | ".large-10:not([id*=content])"
*
* */
public class DynamicContentTests extends BaseTests{

    @Test
    void verifyImageTest() {

        // setup    // open "dynamic content" page
        menu.open("dynamic_content");
        // initialize Dynamic Content page object
        var dynamicContentRow = new DynamicContentPageRowsBlock(driver);

        // act      // if the image "src" contains "http://the-internet.herokuapp.com/img/avatars/", save tile
        var image = dynamicContentRow.getRow(p -> p.getImage().contains("http://the-internet.herokuapp.com/img/avatars/"));

        // assert       // assert one of the image avatars is displayed
        Assertions.assertEquals("http://the-internet.herokuapp.com/img/avatars/", image.getImage());
    }
    @Test
    void verifyTextTest() {

        // setup    // open "dynamic content" page
        menu.open("dynamic_content");
        // initialize Dynamic Content page object
        var dynamicContentRow = new DynamicContentPageRowsBlock(driver);

        // act      // if the text contains for than 10 character, the content is displayed, save tile
        var text = dynamicContentRow.getRow(p -> p.getText().length() > 10);

        // assert       // assert content is displayed
        Assertions.assertTrue(text.getText().length() > 10);
    }
}
