package edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.action;

import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.Player;
import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.Ship;

public class SubmitAction implements PlayerEncounterAction {

    /**
     * Player submits to a police inspection.
     *
     * @param player the player
     * @param otherShip the other ship
     * @param es the state of the encounter (over or not over)
     * @return
     */
    public String doAction(Player player, Ship otherShip, EncounterState es) {
        String retString = "";

        //police check your stuff
        Ship playerShip = player.getShip();
        if (playerShip.hasIllegalGoods()) {
            retString += "The police find illegal goods in your cargo hold "
                    + "and confiscate all your goods.\n"; //all or just illegal?
            retString += "You pay a fine.\n";

            retString += "Your ship was: \n";
            retString += playerShip.toString() + "\n\n";
            playerShip.removeIllegalGoods();

            retString += "Your ship is now: \n";
            retString += playerShip.toString() + "\n\n";
        } else {
            retString += "The police find nothing illegal in your cargo hold "
                    + "and bid you a nice day.";
        }

        es.conclude();
        return retString;
    }
}
