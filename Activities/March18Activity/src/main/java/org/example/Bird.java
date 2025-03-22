package org.example;

import javax.swing.*;

public class Bird extends Pet{
    String birdFood;

    public Bird(String birdFood) {
        this.birdFood = birdFood;
    }

    public Bird(String kingdom, double lifeSpan, String birdFood) {
        super(kingdom, lifeSpan);
        this.birdFood = birdFood;
    }

    public Bird(String kingdom, double lifeSpan, boolean hasOwner, String petName, String birdFood) {
        super(kingdom, lifeSpan, hasOwner, petName);
        this.birdFood = birdFood;
    }

    @Override
    public String introduction() {
        String formatted = "Kingdom: " + getKingdom() + " Lifespan: " + getLifeSpan() +
                "\n\nI am bird and I eat " + birdFood;
        return formatted;
    }
    @Override
    public void noise() {
        JOptionPane.showMessageDialog(null, "tweet tweet ");
    }

    public void move() {
        JOptionPane.showMessageDialog(null, "Bird fly ");
    }

    public void adopt() {
        JOptionPane.showMessageDialog(null, "August 14, 2041");
    }

}

