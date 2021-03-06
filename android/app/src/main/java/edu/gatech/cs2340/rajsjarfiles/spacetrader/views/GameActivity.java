package edu.gatech.cs2340.rajsjarfiles.spacetrader.views;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import edu.gatech.cs2340.rajsjarfiles.spacetrader.viewmodels.GameViewModel;
import edu.gatech.cs2340.rajsjarfiles.spacetrader.R;

/**
 * Main activity while playing the game
 */
public class GameActivity extends BaseActivity {

    /**
     * View model for Game activity
     */
    private GameViewModel viewModel;

    private TextView planetNameIndicator;
    private TextView orbitRadiusIndicator;
    private TextView techLevelIndicator;
    private TextView resourceIndicator;
    private TextView eventIndicator;
    private TextView speciesIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        viewModel = ViewModelProviders.of(this).get(GameViewModel.class);
        this.assignViews();

        // Set filter on planet Image
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setColorFilter(
                Color.parseColor(
                        viewModel.getPlanetColorHex()),
                        PorterDuff.Mode.MULTIPLY); //Desert
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateData();
    }

    private void assignViews() {
        this.planetNameIndicator = findViewById(R.id.indicator_planet_name);
        this.orbitRadiusIndicator = findViewById(R.id.indicator_orbit_radius);
        this.techLevelIndicator = findViewById(R.id.indicator_tech_level);
        this.resourceIndicator = findViewById(R.id.indicator_resources);
        this.eventIndicator = findViewById(R.id.indicator_event);
        this.speciesIndicator = findViewById(R.id.indicator_species);
    }

    private void updateData() {

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setColorFilter(Color.parseColor(viewModel.getPlanetColorHex()), PorterDuff.Mode.MULTIPLY); //Desert

        this.planetNameIndicator.setText(viewModel.getPlanetName());
        this.orbitRadiusIndicator.setText("Orbit Radius: " + String.valueOf(viewModel.getPlanetOrbitRadius()));
        this.techLevelIndicator.setText("Tech Level: " + viewModel.getPlanetTechLevel());
        this.resourceIndicator.setText("Resources: " + viewModel.getPlanetResources());
        this.speciesIndicator.setText("Species: " + viewModel.getPlanetSpecies());
        this.eventIndicator.setText("Event: " + viewModel.getPlanetEvent());
    }


    /**
     * Opens the Map activity.
     *
     * @param view the button view
     */
    public void openMap(View view) {
        // TODO start map activity
    }

    /**
     * Opens the Market activity.
     *
     * @param view the button view
     */
    public void openMarket(View view) {
        Intent intent = new Intent(view.getContext(), MarketActivity.class);
        startActivity(intent);
    }

    /**
     * Opens the Ship activity.
     *
     * @param view the button view
     */
    public void openShip(View view) {
        Intent intent = new Intent(view.getContext(), ShipActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        //left blank so the player can't return
    }
}
