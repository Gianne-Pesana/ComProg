package org.GiannePesana;

import javax.swing.*;
import java.io.FileReader;
import java.util.Scanner;

public class Displays {
    static String hunterData = "";
    static String gathererData = "";
    static String farmerData = "";

    public static String typeOfRole() {
        String menu = "Current number of roles simulated: " + (Tribemen.rolesCount == 0 ? "None" : Tribemen.rolesCount) +
                "\n\nSelect a role:" +
                "\n  - Hunter" +
                "\n  - Gatherer" +
                "\n  - Farmer" +
                "\n\nEnter your choice: (type \"quit\" to exit)";
        return toProperCase(JOptionPane.showInputDialog(null, menu));
    }

    public static Hunter createHunter() {
        Hunter hunter = new Hunter();
        hunter.setName(JOptionPane.showInputDialog(null, "Enter name:"));
        hunter.setTribe(JOptionPane.showInputDialog(null, "Enter tribe:"));
        hunter.setWeapon(JOptionPane.showInputDialog(null, "Enter hunter weapon:"));
        hunter.setSkillLevel(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter hunter skill level:")));

        hunterData += String.format("%-15s %-15s %-15s %-15d\n",
                hunter.name, hunter.tribe, hunter.weapon, hunter.skillLevel);
        return hunter;
    }

    public static Gatherer createGatherer() {
        Gatherer gatherer = new Gatherer();
        gatherer.setName(JOptionPane.showInputDialog(null, "Enter name:"));
        gatherer.setTribe(JOptionPane.showInputDialog(null, "Enter tribe:"));
        gatherer.setCollectsMedicinalPlants(JOptionPane.showInputDialog(null, "Does it collects medicinal plants? (Yes/No)").equalsIgnoreCase("Yes"));
        gatherer.setPreferredSeason(JOptionPane.showInputDialog(null, "Enter preferred season:"));
        gathererData += String.format("%-15s %-15s %-15s %-15s\n",
                gatherer.name, gatherer.tribe, gatherer.collectsMedicinalPlants, gatherer.preferredSeason);
        return gatherer;
    }

    public static Farmer createFarmer() {
        Farmer farmer = new Farmer();
        farmer.setName(JOptionPane.showInputDialog(null, "Enter name:"));
        farmer.setTribe(JOptionPane.showInputDialog(null, "Enter tribe:"));
        farmer.setFieldSize(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter field size:")));
        farmer.setCropType(JOptionPane.showInputDialog(null, "Enter crop type:"));

        farmerData += String.format("%-15s %-15s %-15.2f %-15s\n",
                farmer.name, farmer.tribe, farmer.fieldSize, farmer.cropType);
        return farmer;
    }

    public static void displayCompleteSummary() {
        String message = "Table Summary\n\n" +
                "============ Hunter ===============\n" +
                String.format("%-18s %-18s %-18s %-12s\n", "Name", "Tribe", "Weapon", "Skill Level") +
                hunterData +
                "============ Gatherer ===============\n" +
                String.format("%-18s %-18s %-25s %-18s\n", "Name", "Tribe", "Collects Medicinal Plants", "Preferred Season") +
                gathererData +
                "============ Farmer ===============\n" +
                String.format("%-18s %-18s %-18s %-18s\n", "Name", "Tribe", "Field Size", "Crop Type") +
                farmerData;

        JOptionPane.showMessageDialog(null, message);
    }




    public static String toProperCase(String input) {
        if(!input.contains(" ")) {
            return input.substring(0, 1).toUpperCase() +
                    input.substring(1).toLowerCase();
        }

        return input.substring(0, 1).toUpperCase() +
                input.substring(1, input.indexOf(" ")).toLowerCase() +
                " " +
                toProperCase(input.substring(input.indexOf(" ") + 1));
    }
}
