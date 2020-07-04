package Reservations;

import java.util.Random;

public enum DOW {
    SUN, MON, TUE, WED, THU, FRI, SAT;

    private static final DOW[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static DOW getRandomDOW(){
        return VALUES[RANDOM.nextInt(SIZE)];

    }

}
