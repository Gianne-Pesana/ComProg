package org.example;

public abstract class Animal {
    private String kingdom;
    private double lifeSpan;

    public Animal() {}

    public Animal(String kingdom, double lifeSpan) {
        this.kingdom = kingdom;
        this.lifeSpan = lifeSpan;
    }

    abstract public String introduction();

    public void setValues(String kingdom, double lifeSpan) {
        this.kingdom = kingdom;
        this.lifeSpan = lifeSpan;
    }


    public String sayMessage() {
        return "My kingdom is: " + this.kingdom +  " and lifespan is " + this.lifeSpan;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public double getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(double lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    abstract public void noise();
    abstract public void move();
}
