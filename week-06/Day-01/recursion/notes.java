public class notes {
    public enum Level{
        HIGH,
        MEDIUM,
        LOW
    }

    public static void main(String[] args) {
        Level lvl = Level.HIGH;

        for (Level level: Level.values()){
            System.out.println(level);
        }

        Level[] arr = Level.values();
        System.out.println("Print 0th constant from enum: " + arr[0]);


        System.out.println(sumUntil(0, 5));
    }

    public static int sumUntil(int start, int end) {
        if (start == end) {
            return start;
        } else {
            int sum = start + sumUntil(start + 1, end);
            return sum;
        }
    }

}