import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class streamExercises {
    public static void main(String[] args) {

        //exercise One
        System.out.println("Exercise one");
        List<Integer> myList = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        myList.stream().filter(n -> n%2 == 0).forEach(System.out::println);
        //exercise Two
        System.out.println("Exercise two");
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream()
                .filter(n -> n >= 0)
                .map(n -> n*n)
                .forEach(n -> System.out.println(n));

        // Exercise Three
        System.out.println("Exercise Three");
        List<Integer> nums = Arrays.asList(3, 9, 2, 8, 6, 5);
        nums.stream()
                .filter(n -> n*n > 20)
                .forEach(n -> System.out.println(n));

        //Exercise Four
        System.out.println("Exercise Four");

        List<Integer> nums4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        double average = nums4.stream()
                .filter(n -> n%2 != 0)
                .mapToDouble(Integer::doubleValue)
                .average()
                .getAsDouble();
        System.out.println(average);

//long way
        Integer sum1 = nums4.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, Integer :: sum);
        long divisor = nums4.stream()
                .filter(n -> n%2 != 0)
                .count();
        double average2 = (double)sum1/divisor;
        System.out.println(average2);

        //Exercise Five
        System.out.println("Exercise Five");
        List<Integer> nums5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        Integer sumNums5 = nums5.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, Integer :: sum);
        System.out.println(sumNums5);
    }
}
