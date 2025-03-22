package org.example;

import javax.swing.*;

public class Cat extends Pet{
    String catFood;

    public Cat(String catFood) {
        this.catFood = catFood;
    }

    public Cat(String kingdom, double lifeSpan, String catFood) {
        super(kingdom, lifeSpan);
        this.catFood = catFood;
    }

    public Cat(String kingdom, double lifeSpan, boolean hasOwner, String petName, String catFood) {
        super(kingdom, lifeSpan, hasOwner, petName);
        this.catFood = catFood;
    }

    @Override
    public String introduction() {
        String formatted = "Kingdom: " + getKingdom() + " Lifespan: " + getLifeSpan() +
                "\n\nI am cat and I eat " + catFood;
        return formatted;
    }

    @Override
    public void noise() {
        JOptionPane.showMessageDialog(null, "meow mwoe");
    }

    public void move() {
        JOptionPane.showMessageDialog(null, "climb cat climb");
    }

    public void adopt() {
        JOptionPane.showMessageDialog(null, "January 2, 2006");
    }
}
