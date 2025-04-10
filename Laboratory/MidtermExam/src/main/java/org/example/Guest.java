package org.example;

public class Guest extends Person{
    String guestID;
    String email;

    public Guest() {}

    public Guest(String name, int age, String contactNumber, String guestID, String email) {
        super(name, age, contactNumber);
        this.guestID = Main.formatString(guestID);
        this.email = Main.formatString(email);
    }

    @Override
    public String summary() {
        return "";
    }

    @Override
    public String toString() {
        return super.toString() + " " + guestID + " " + email;
    }
}
