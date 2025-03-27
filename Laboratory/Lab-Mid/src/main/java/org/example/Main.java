package org.GiannePesana;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            String choice = Displays.typeOfRole();
            System.out.println(choice);
            switch (choice) {
                case "Hunter" -> {
                    Hunter hunter = Displays.createHunter();
                    showIntroduction(hunter);
                }
                case "Gatherer" -> {
                    Gatherer gatherer = Displays.createGatherer();
                    gatherer.introduction();
                }

                case "Quit" -> isRunning = false;
                default -> showError();
            }
        }

        Displays.displayCompleteSummary();
    }

    public static void showIntroduction(Tribemen role) {
        JOptionPane.showMessageDialog(null, role.introduction());
    }

    public static void showError() {
        JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}