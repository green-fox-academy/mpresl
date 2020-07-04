package Reservations;

public class Booking implements Reservations {


    Booking(){ }

    public void showInfo(){
        System.out.println("Booking# "+getCodeBooking()+" for "+ getDowBooking());
    }


    @Override
    public String getDowBooking() {
        return DOW.getRandomDOW().name();
        //generate random weekday
    }

    @Override
    public String getCodeBooking() {
        String ALPHANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String bookingNum = "";
        for (int i = 0; i < 8; i++) {
            int add = (int) (Math.random()*ALPHANUMERIC.length());
            bookingNum += ALPHANUMERIC.charAt(add);
        }
        return bookingNum;
        //generate string
    }
}
