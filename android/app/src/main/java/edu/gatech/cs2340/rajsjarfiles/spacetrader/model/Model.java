package edu.gatech.cs2340.rajsjarfiles.spacetrader.model;

import android.util.Log;

import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.game.Game;
import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.game.GameDifficulty;
import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.PlayerBuilder;
import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.Player;
import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.Ship;

/**
 * Creates a player and model with the valid inputs.
 */
public class Model {
    private Player player;
    private Game game;

    /**
     * Constructor for creating a player and model with the valid inputs.
     *
     * @param name The player name the user has chosen.
     * @param points The allocation of skill points the user has chosen
     * @param credits The amount of credit the user has.
     * @param ship The ship the user has chosen
     * @param difficulty The Game Difficulty the user has chosen
     */
    public Model(
            String name,
            int[] points,
            int credits,
            Ship ship,
            GameDifficulty difficulty) {
        player = new PlayerBuilder(name, points, credits, ship).build();
        game = new Game(difficulty);
        Log.i("Model", player.toString());
        Log.i("Model", game.toString());
    }
}