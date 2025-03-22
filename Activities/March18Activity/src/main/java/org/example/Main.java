package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // logic here
        Person person = new Person("Mammal", 100, "Gianne", 19, "addu");
        JOptionPane.showMessageDialog(null, person.introduction());
        person.noise();
        person.move();


        Pet dog = new Dog("mammal", 20, true, "Dino", "Husky");
        JOptionPane.showMessageDialog(null, dog.introduction());
        dog.noise();
        dog.move();
        dog.adopt();

        Pet cat = new Cat("mammal", 9, true, "Garfield", "Orange");
        JOptionPane.showMessageDialog(null, cat.introduction());
        cat.noise();
        cat.move();
        cat.adopt();

        Pet bird = new Bird("Something ", 5, true, "Pag asa", "Worms");
        JOptionPane.showMessageDialog(null, bird.introduction());
        bird.noise();
        bird.move();
        bird.adopt();


    }
}