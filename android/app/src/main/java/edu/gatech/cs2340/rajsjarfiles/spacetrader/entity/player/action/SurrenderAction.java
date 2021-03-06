package edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.action;

import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.Player;
import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.Ship;

public class SurrenderAction implements PlayerEncounterAction {

    /**
     * Player surrenders to a pirate.
     *
     * @param player the player
     * @param otherShip the other ship
     * @param es the state of the encounter (over or not over)
     * @return a description of what's happening
     */
    public String doAction(Player player, Ship otherShip, EncounterState es) {
        String retString = "";

        //You lose cargo, and if you don't have cargo, you lose 80% of your cash

        Ship playerShip = player.getShip();
        if (playerShip.hasGoods()) {
            retString += "The pirate crew plunders all of your cargo.\n";
            playerShip.emptyCargo();
        } else {
            retString += "The pirate crew is angry at your lack of goods and"
                    + " takes your credits instead.\n";
            retString += "You had "
                    + player.getWallet().getCredits() + " credits.\n";
            player.getWallet().setCredits(0.8f);
            retString += "You now have "
                    + player.getWallet().getCredits() + " credits.\n";
        }
        es.conclude();

        return retString;
    }
}
