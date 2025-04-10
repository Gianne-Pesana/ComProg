package org.example;

public class Booking extends Room{
    String bookingID;
    Guest guest;
    int numberOfNights;

    public Booking() {
    }

    public Booking(int roomNumber, String roomType, double pricePerNight, boolean isAvailable, String bookingID, Guest guest, int numberOfNights) {
        super(roomNumber, roomType, pricePerNight, isAvailable);
        this.bookingID = bookingID;
        this.guest = guest;
        this.numberOfNights = numberOfNights;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double calculateTotalCost(double price) {
        return 0;
    }

    @Override
    public String toString() {
        return bookingID + " " + guest + " " + numberOfNights;
    }
}
