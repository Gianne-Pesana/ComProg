package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person;
        boolean isRunning = true;
        while(true) {
            String choice = JOptionPane.showInputDialog(null, "Enter your choice");
            switch (choice) {
                case "1" -> {
                    String name = JOptionPane.showInputDialog(null, "Enter name");
                    int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter age"));
                    String address = JOptionPane.showInputDialog(null, "Enter address");
                    String ID = JOptionPane.showInputDialog(null, "Enter ID");
                    String program = JOptionPane.showInputDialog(null, "Enter program");
                    person = new Student(name, age, address, ID, program);
                    System.out.println(person.introduction());
                }
            }
        }

    }
}