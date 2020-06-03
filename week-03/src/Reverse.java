public class Reverse {
    public static void main(String[] args){
        int[] numbers = new int[] {3,4,5,6,7};
        int temp;

        for (int i = 0; i < numbers.length/2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
