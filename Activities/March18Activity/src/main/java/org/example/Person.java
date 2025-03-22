package org.example;

import javax.swing.*;

public class Person extends Animal{
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String kingdom, double lifeSpan) {
        super(kingdom, lifeSpan);
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String kingdom, double lifeSpan, String name, int age, String address) {
        this(kingdom, lifeSpan);
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String introduction() {
        String formatted = "Kingdom: " + getKingdom() + " Lifespan: " + getLifeSpan() +
                "\n\nHello I am a Person with details" +
                "\nName: " + name +
                "\nAge: " + age +
                "\nAddress: " + address;
        return formatted;
    }

    @Override
    public void noise() {
        JOptionPane.showMessageDialog(null, "Talks a lot");
    }

    @Override
    public void move() {
        JOptionPane.showMessageDialog(null, "Dances");
    }


}
