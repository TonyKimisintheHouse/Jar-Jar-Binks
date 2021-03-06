package edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.market;

import org.junit.Test;

//import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.universe.Events;
import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.universe.Habitats;
import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.universe.ResourceClassification;
import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.universe.TechLevel;

import static org.junit.Assert.*;


/**
 * Tester for testing market
 */
public class MarketTester {
    private static final int TIMEOUT = 1000;

//    PRE_AGRICULTURE,
//    AGRICULTURE,
//    MEDIEVAL,
//    RENAISSANCE,
//    EARLY_INDUSTRIAL,
//    INDUSTRIAL,
//    POST_INDUSTRIAL,
//    HI_TECH;

//    @Test(timeout = TIMEOUT)
//    public void MarketCreationTest() {
//
//        TechLevel tl = TechLevel.PRE_AGRICULTURE;
//        Events event = Events.getRandomEvent();
//        ResourceClassification rc = ResourceClassification.getRandomResourceClass(
//                Habitats.getRandomHabitat()
//        );
//        Marketplace marketplace = new Marketplace("Bob", tl, event, rc);
//        assertEquals(tl, marketplace.getTechLevel());
//
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.WATER));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FURS));
//
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FOOD));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ORE));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.GAMES));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FIREARMS));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.MEDICINE));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.NARCOTICS));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ROBOTS));
//
//    }
//
//    @Test(timeout = TIMEOUT)
//    public void MarketCreationTest2() {
//
//        TechLevel tl = TechLevel.AGRICULTURE;
//        Events event = Events.getRandomEvent();
//        ResourceClassification rc = ResourceClassification.getRandomResourceClass(
//                Habitats.getRandomHabitat()
//        );
//        Marketplace marketplace = new Marketplace("Bob", tl, event, rc);
//        assertEquals(tl, marketplace.getTechLevel());
//
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.WATER));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FURS));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FOOD));
//
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ORE));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.GAMES));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FIREARMS));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.MEDICINE));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.NARCOTICS));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ROBOTS));
//    }
//
//    @Test(timeout = TIMEOUT)
//    public void MarketCreationTest3() {
//
//        TechLevel tl = TechLevel.MEDIEVAL;
//        Events event = Events.getRandomEvent();
//        ResourceClassification rc = ResourceClassification.getRandomResourceClass(
//                Habitats.getRandomHabitat()
//        );
//        Marketplace marketplace = new Marketplace("Bob", tl, event, rc);
//        assertEquals(tl, marketplace.getTechLevel());
//
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.WATER));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FURS));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FOOD));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ORE));
//
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.GAMES));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FIREARMS));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.MEDICINE));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.NARCOTICS));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ROBOTS));
//    }
//
//    @Test(timeout = TIMEOUT)
//    public void MarketCreationTest4() {
//
//        TechLevel tl = TechLevel.RENAISSANCE;
//        Events event = Events.getRandomEvent();
//        ResourceClassification rc = ResourceClassification.getRandomResourceClass(
//                Habitats.getRandomHabitat()
//        );
//        Marketplace marketplace = new Marketplace("Bob", tl, event, rc);
//        assertEquals(tl, marketplace.getTechLevel());
//
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.WATER));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FURS));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FOOD));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ORE));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.GAMES));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FIREARMS));
//
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.MEDICINE));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.NARCOTICS));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ROBOTS));
//    }
//
//    @Test(timeout = TIMEOUT)
//    public void MarketCreationTest5() {
//
//        TechLevel tl = TechLevel.EARLY_INDUSTRIAL;
//        Events event = Events.getRandomEvent();
//        ResourceClassification rc = ResourceClassification.getRandomResourceClass(
//                Habitats.getRandomHabitat()
//        );
//        Marketplace marketplace = new Marketplace("Bob", tl, event, rc);
//        assertEquals(tl, marketplace.getTechLevel());
//
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.WATER));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FURS));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FOOD));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ORE));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.GAMES));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FIREARMS));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.MEDICINE));
//
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.NARCOTICS));
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ROBOTS));
//    }
//
//    @Test(timeout = TIMEOUT)
//    public void MarketCreationTest6() {
//
//        TechLevel tl = TechLevel.INDUSTRIAL;
//        Events event = Events.getRandomEvent();
//        ResourceClassification rc = ResourceClassification.getRandomResourceClass(
//                Habitats.getRandomHabitat()
//        );
//        Marketplace marketplace = new Marketplace("Bob", tl, event, rc);
//        assertEquals(tl, marketplace.getTechLevel());
//
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.WATER));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FURS));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FOOD));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ORE));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.GAMES));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FIREARMS));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.MEDICINE));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.NARCOTICS));
//
//        assertFalse(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ROBOTS));
//    }
//
//    @Test(timeout = TIMEOUT)
//    public void MarketCreationTest7() {
//
//        TechLevel tl = TechLevel.POST_INDUSTRIAL;
//        Events event = Events.getRandomEvent();
//        ResourceClassification rc = ResourceClassification.getRandomResourceClass(
//                Habitats.getRandomHabitat()
//        );
//        Marketplace marketplace = new Marketplace("Bob", tl, event, rc);
//        assertEquals(tl, marketplace.getTechLevel());
//
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.WATER));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FURS));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FOOD));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ORE));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.GAMES));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.FIREARMS));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.MEDICINE));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.NARCOTICS));
//        assertTrue(marketplace.getTradeGoodsInMarket().containsKey(TradeGoods.ROBOTS));
//    }


}
