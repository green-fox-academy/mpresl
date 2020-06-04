import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
        System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));
    }
    public static String bubble(int[] numbers) {
        int[] arr = numbers;
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }
    public static String advancedBubble(int[] arr, boolean advanced) {
        int[] numbers = arr;
        Arrays.sort(numbers);
        if (advanced == true) {
            int temp;
            for (int i = 0; i < numbers.length / 2; i++) {
                temp = numbers[i];
                numbers[i] = numbers[numbers.length - i - 1];
                numbers[numbers.length - i - 1] = temp;
            }
        }
        return Arrays.toString(numbers);
    }
}