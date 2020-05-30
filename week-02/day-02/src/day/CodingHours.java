package day;

public class CodingHours {
    public static void main(String[] args) {
        int daily = 6;
        int semester = 17;
        int days = 5;
        int workWeek = 52;

        int hoursCoding = (daily * days * semester);
        System.out.println("The attendee spends "+ hoursCoding + " hours coding per semester.");

        float timeCoding = (daily*days);
        float percentCoding = (timeCoding / workWeek) * 100;
        System.out.println("Or " + percentCoding + "% of the workweek!");
    }
}
