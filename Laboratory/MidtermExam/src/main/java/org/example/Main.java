package org.example;

import javax.swing.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String message =
                "Welcome to CS Hotel!\n" +
                "Looking for a room?\n\n" +
                "Available rooms:\n" +
                getAvailableRooms() + "\n" +
                "Enter what room number do you want: ";

        int roomChoice = Integer.parseInt(JOptionPane.showInputDialog(null, message));
        String bookingID = "BOOK2025" + generateRandomNumber();

        String name = JOptionPane.showInputDialog(null, "Enter your name:");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age:"));
        String contactNumber = JOptionPane.showInputDialog(null, "Enter your contact number:");
        String guestID = "GUEST2025" + generateRandomNumber();
        String email = JOptionPane.showInputDialog(null, "Enter your email:");
        int nights = Integer.parseInt(JOptionPane.showInputDialog(null, "How many nights are you staying?"));

        Guest guest = new Guest(name, age, contactNumber, guestID, email);
        Room room = getRoomFromNumber(roomChoice);
        Booking booking = new Booking(roomChoice, room.roomType, room.pricePerNight, room.isAvailable, bookingID, guest, nights);

        System.out.println(guest);
        System.out.println(room);
        System.out.println(booking);

        updateStatus(room, roomChoice);

    }

    static void displayWelcome() throws IOException {

    }

    public static String getAvailableRooms() throws IOException {
        String availableRooms = "";
        Scanner inFile = new Scanner(new FileReader("room.txt"));
        while (inFile.hasNextLine()) {
            String line = inFile.nextLine();
            Room room = getRoomFromStr(line);
            if (room.isAvailable) {
                availableRooms += "Room " + room.roomNumber + " - " + room.roomType + " - " + "$" + room.pricePerNight + " per night\n";
            }
        }

        return availableRooms;
    }

    public static Room getRoomFromStr(String str) throws IOException {
        Scanner scanner = new Scanner(str);
        scanner.useDelimiter("\\|");
        int roomNumber = scanner.nextInt();
        String roomType = scanner.next();
        double pricePerNight = scanner.nextDouble();
        boolean isAvailable = scanner.nextBoolean();

        return new Room(roomNumber, roomType, pricePerNight, isAvailable);
    }

    public static Room getRoomFromNumber(int roomNumber) throws IOException {
        Scanner inFile = new Scanner(new FileReader("room.txt"));
        inFile.useDelimiter("\\|");
        while (true) {
            String line = inFile.nextLine();
            Room room = getRoomFromStr(line);
            if (roomNumber == room.getRoomNumber()) {
                return room;
            }

            if (!inFile.hasNextLine())
                return null;
        }
    }

    public static String generateRandomNumber() {
        int pin = (int)(Math.random() * 10000);
        String formattedPin = String.format("%04d", pin);
        return formattedPin;
    }

    public static String formatString(String input) {
        input = input.trim();
        if(!input.contains(" ")) {
            return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        }

        return input.substring(0, 1).toUpperCase()
                + input.substring(1, input.indexOf(" ")).toLowerCase()
                + " "
                + formatString(input.substring(input.indexOf(" ") + 1));
    }

    public static void updateStatus(Room room, int roomNumber) throws IOException {
        Scanner inFileTemp = new Scanner(new FileReader("room.txt"));
        FileWriter outFileTemp = new FileWriter("temp.txt");

        while (inFileTemp.hasNextLine()) {
            String line = inFileTemp.nextLine();
            if (roomNumber == room.roomNumber) {
                outFileTemp.append(room.roomNumber + "|" + room.roomType + "|" +
                        room.pricePerNight + "|" + room.isAvailable + "\n");
            }

            outFileTemp.append(line + "\n");
        }

        inFileTemp.close();
        outFileTemp.close();

        Scanner inFile = new Scanner(new FileReader("temp.txt"));
        FileWriter outFile = new FileWriter("room.txt");

        while (inFile.hasNextLine()) {
            String line = inFile.nextLine();
            int roomNum = Integer.parseInt(line.substring(0, line.indexOf("|")));
            if (roomNum == roomNumber) {
                outFile.append(room.roomNumber + "|" + room.roomType + "|" +
                        room.pricePerNight + "|" + "false" + "\n");
                continue;
            }

            outFile.append(line + "\n");
        }

        inFile.close();
        outFile.close();

    }

}