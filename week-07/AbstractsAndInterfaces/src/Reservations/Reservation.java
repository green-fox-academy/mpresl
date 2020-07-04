package Reservations;

import java.util.ArrayList;

public class Reservation {
    public static void main(String[] args) {
        ArrayList<Booking> reservations = new ArrayList<>();
        reservations.add(new Booking());
        reservations.add(new Booking());
        reservations.add(new Booking());
        reservations.add(new Booking());
        reservations.add(new Booking());

        for (Booking b :
                reservations) {
            b.showInfo();
        }

    }
}
