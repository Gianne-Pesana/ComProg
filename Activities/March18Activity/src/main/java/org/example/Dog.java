package org.example;

import javax.swing.*;

public class Dog extends Pet{
    String breed;

    public Dog() {}

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String kingdom, double lifeSpan, String breed) {
        super(kingdom, lifeSpan);
        this.breed = breed;
    }

    public Dog(String kingdom, double lifeSpan, boolean hasOwner, String petName, String breed) {
        super(kingdom, lifeSpan, hasOwner, petName);
        this.breed = breed;
    }

    @Override
    public String introduction() {
        String formatted = "Kingdom: " + getKingdom() + " Lifespan: " + getLifeSpan() +
                "\n\nI am dog with a breed " + breed;
        return formatted;
    }

    @Override
    public void noise() {
        JOptionPane.showMessageDialog(null, "arf arf");
    }

    public void move() {
        JOptionPane.showMessageDialog(null, "Run dog run");
    }

    public void adopt() {
        JOptionPane.showMessageDialog(null, "June 23, 1976");
    }
}

