package day;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remSecofHour = 60 - currentSeconds;
        int remSecMinutes = ((60 - currentMinutes)*60);
        int remSecHour = (((24-currentHours)*60)*60);

        int remainingSeconds = (remSecHour + remSecMinutes + remSecofHour);
        System.out.println("There are "+remainingSeconds+" seconds remaining in the day!");
    }
}
