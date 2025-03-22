package org.GiannePesana;

public class Chicken extends Food {
    String part;

    public Chicken(String part) {
        this.part = part;
    }

    public Chicken(String foodName, double calories, String part) {
        super(foodName, calories);
        this.part = part;
    }
}
