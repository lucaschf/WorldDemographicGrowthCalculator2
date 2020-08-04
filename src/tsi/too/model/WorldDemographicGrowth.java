package tsi.too.model;

public class WorldDemographicGrowth {
    private long worldPopulation;
    private double growthRate;

    public WorldDemographicGrowth(long worldPopulation, double growthRate) {
        this.worldPopulation = worldPopulation;
        this.growthRate = growthRate;
    }

    public long getWorldPopulation() {
        return worldPopulation;
    }

    public void setWorldPopulation(long worldPopulation) {
        this.worldPopulation = worldPopulation;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    /**
     * Estimates the world population in <code>yearsAhead</code>
     *
     * @param yearsAhead years from now.
     * @return the estimated population.
     */
    public long estimateGrowth(int yearsAhead) {
        long estimate = this.worldPopulation;

        for (int i = 1; i <= yearsAhead; i++) {
            estimate += estimate * growthRate;
        }

        return estimate;
    }

    @Override
    public String toString() {
        return "WorldDemographicGrowthCalculator{" +
                "worldPopulation=" + worldPopulation +
                ", growthRate=" + growthRate +
                '}';
    }
}
