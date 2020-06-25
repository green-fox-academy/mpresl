package Enums.ParkingLot;

import java.util.Random;

public enum Make {
    FORD, CHEVY, AUDI, BMW;
    private static final Make[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static Make getRandomMake(){
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}

