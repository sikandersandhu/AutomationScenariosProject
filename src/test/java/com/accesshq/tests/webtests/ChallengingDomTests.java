package com.accesshq.tests.webtests;

import com.accesshq.tests.ui.TablePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengingDomTests extends BaseTests{

    @Test
    void testLorem() {

        // setup  // go to challenging dom page
        menu.open("challenging_dom");

        // act
        // find the table row tile
        TablePage tablePage = new TablePage(driver);
        // find the data corresponding to the desired Lorem row
        var tableRowTile = tablePage.getRow(p -> p.getLorem().equalsIgnoreCase("iuvaret3"));

        //assert   // the data at the row is as expected
        Assertions.assertEquals("iuvaret3", tableRowTile.getLorem().toLowerCase());
    }
    @Test
    void testIpsum() {

        // setup  // go to challenging dom page
        menu.open("challenging_dom");

        // act
        // find the table row tile
        TablePage tablePage = new TablePage(driver);
        // find the data corresponding to the desired Lorem row
        var tableRowTile = tablePage.getRow(p -> p.getIpsum().equalsIgnoreCase("apeirian1"));

        //assert   // the data at the row is as expected
        Assertions.assertEquals("apeirian1", tableRowTile.getIpsum().toLowerCase());
    }
    @Test
    void testDolor() {

        // setup  // go to challenging dom page
        menu.open("challenging_dom");

        // act
        // find the table row tile
        TablePage tablePage = new TablePage(driver);
        // find the data corresponding to the desired Lorem row
        var tableRowTile = tablePage.getRow(p -> p.getDolor().equalsIgnoreCase("adipisci2"));

        //assert   // the data at the row is as expected
        Assertions.assertEquals("adipisci2", tableRowTile.getDolor().toLowerCase());
    }
    @Test
    void testSit() {

        // setup  // go to challenging dom page
        menu.open("challenging_dom");

        // act
        // find the table row tile
        TablePage tablePage = new TablePage(driver);
        // find the data corresponding to the desired Lorem row
        var tableRowTile = tablePage.getRow(p -> p.getSit().equalsIgnoreCase("Definiebas3"));

        //assert   // the data at the row is as expected
        Assertions.assertEquals("definiebas3", tableRowTile.getSit().toLowerCase());
    }
    @Test
    void testAmet() {

        // setup  // go to challenging dom page
        menu.open("challenging_dom");

        // act
        // find the table row tile
        TablePage tablePage = new TablePage(driver);
        // find the data corresponding to the desired Lorem row
        var tableRowTile = tablePage.getRow(p -> p.getAmet().equalsIgnoreCase("Consequuntur4"));

        //assert   // the data at the row is as expected
        Assertions.assertEquals("consequuntur4", tableRowTile.getAmet().toLowerCase());
    }
    @Test
    void testDiceret() {

        // setup  // go to challenging dom page
        menu.open("challenging_dom");

        // act
        // find the table row tile
        TablePage tablePage = new TablePage(driver);
        // find the data corresponding to the desired Lorem row
        var tableRowTile = tablePage.getRow(p -> p.getDiceret().equalsIgnoreCase("Phaedrum5"));

        //assert   // the data at the row is as expected
        Assertions.assertEquals("phaedrum5", tableRowTile.getDiceret().toLowerCase());
    }
    @Test
    void testEdit() {

        // setup  // go to challenging dom page
        menu.open("challenging_dom");

        // act
        // find the table row tile
        TablePage tablePage = new TablePage(driver);
        // find the data corresponding to the desired Lorem row
        var tableRowTile = tablePage.getRow(p -> p.getEdit().equalsIgnoreCase("edit"));

        //assert   // the data at the row is as expected
        Assertions.assertEquals("edit", tableRowTile.getEdit().toLowerCase());
    }
    @Test
    void testDelete() {

        // setup  // go to challenging dom page
        menu.open("challenging_dom");

        // act
        // find the table row tile
        TablePage tablePage = new TablePage(driver);
        // find the data corresponding to the desired Lorem row
        var tableRowTile = tablePage.getRow(p -> p.getDelete().equalsIgnoreCase("delete"));

        //assert   // the data at the row is as expected
        Assertions.assertEquals("delete", tableRowTile.getDelete().toLowerCase());
    }
}
