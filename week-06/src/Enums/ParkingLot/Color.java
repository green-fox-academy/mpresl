package Enums.ParkingLot;

import java.util.Random;

public enum Color {
    GREEN, BLUE, RED, WHITE, BLACK, GRAY;
    private static final Color[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static Color getRandomColor(){
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
