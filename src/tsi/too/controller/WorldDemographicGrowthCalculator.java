package tsi.too.controller;

import tsi.too.model.WorldDemographicGrowth;
import tsi.too.util.InputDialog;
import tsi.too.util.MessageDialog;

import static tsi.too.util.Constants.*;

public class WorldDemographicGrowthCalculator {

    private WorldDemographicGrowth worldDemographicGrowth;

    public void readData() {
        Long worldPopulation = InputDialog.showLongInputDialog(DATA, WORLD_POPULATION, input -> input > 0);

        if (worldPopulation == null) {
            worldDemographicGrowth = null;
            return;
        }

        Double growthRate = InputDialog.showDoubleInputDialog(DATA, GROWTH_RATE, input -> input >= 0);

        if (growthRate == null) {
            worldDemographicGrowth = null;
            return;
        }

        worldDemographicGrowth = new WorldDemographicGrowth(worldPopulation, growthRate);
    }

    public void showEstimate() {

        if (worldDemographicGrowth == null)
            MessageDialog.showAlertDialog(ESTIMATED_POPULATION, NO_DATA_TO_SHOW);
        else {
            StringBuilder message = new StringBuilder();
            for (int i = 1; i <= 5; i++)
                message.append(String.format("%s %d %s(s) %d\n", IN, i, YEAR, worldDemographicGrowth.estimateGrowth(i)));

            MessageDialog.showInformationDialog(ESTIMATED_POPULATION, message.toString());
        }
    }

    @SuppressWarnings("unused")
    public WorldDemographicGrowth getWorldDemographicGrowth() {
        return worldDemographicGrowth;
    }
}