package edu.gatech.cs2340.rajsjarfiles.spacetrader.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import edu.gatech.cs2340.rajsjarfiles.spacetrader.entity.player.Ship;
import edu.gatech.cs2340.rajsjarfiles.spacetrader.model.Model;

/**
 * Represents the view model for Ship Activity.
 */
public class ShipViewModel extends AndroidViewModel {

    /**
     * Backing model
     */
    public Model model;

    /**
     * ViewModel constructor with all arguments.
     *
     * @param application represents the application context
     */
    public ShipViewModel(@NonNull Application application) {
        super(application);
    }

    public String getPlayerLocation() {
        return Model.getModel().getPlayer().getLocation().getPlanet().getName();
    }

    public int getFuelRemaining() {
        return Model.getModel().getPlayer().getShip().getFuel();
    }

    public String getCargoHoldUsage() {
        Ship ship = Model.getModel().getPlayer().getShip();
        int total = ship.getCargoCapacity();
        int used = total - ship.getAvailableCargoCapacity();
        return used + "/" + total;
    }

}
