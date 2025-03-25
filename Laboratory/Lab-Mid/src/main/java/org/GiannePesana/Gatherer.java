package org.GiannePesana;

public class Gatherer extends Tribemen{
    boolean collectsMedicinalPlants;
    String preferredSeason;

    public Gatherer() {
    }

    public Gatherer(boolean collectsMedicinalPlants, String preferredSeason) {
        this.collectsMedicinalPlants = collectsMedicinalPlants;
        this.preferredSeason = preferredSeason;
    }

    public Gatherer(String name, String tribe, boolean collectsMedicinalPlants, String preferredSeason) {
        super(name, tribe);
        this.collectsMedicinalPlants = collectsMedicinalPlants;
        this.preferredSeason = preferredSeason;
    }

    public boolean isCollectsMedicinalPlants() {
        return collectsMedicinalPlants;
    }

    public void setCollectsMedicinalPlants(boolean collectsMedicinalPlants) {
        this.collectsMedicinalPlants = collectsMedicinalPlants;
    }

    public String getPreferredSeason() {
        return preferredSeason;
    }

    public void setPreferredSeason(String preferredSeason) {
        this.preferredSeason = Displays.toProperCase(preferredSeason);
    }

    @Override
    public String introduction() {
        return "I am a gatherer named " + name + " I belong to a tribe " + tribe +
                ", I " + (collectsMedicinalPlants ? "collect medicine plants" : "do not collect medicine plants") +
                "\nand I prefer the season " + preferredSeason;
    }
}
