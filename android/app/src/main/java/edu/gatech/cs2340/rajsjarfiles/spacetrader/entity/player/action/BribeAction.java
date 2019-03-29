package edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.action;

import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.Player;
import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.Ship;

public class BribeAction implements PlayerEncounterAction {

    /**
     * Player bribes the police.
     *
     * @param player the player
     * @param otherShip the other ship
     * @param es the state of the encounter (over or not over)
     * @return
     */
    public String doAction(Player player, Ship otherShip, EncounterState es) {
        String retString = "";

        retString += "You bribe the police with 50% of your money.\n";
        retString += "You had " + player.getCredits() + " credits.\n";
        player.setCredits(player.getCredits() / 2);
        retString += "You now have " + player.getCredits() + " credits.\n";

        es.conclude();

        return retString;
    }
}
