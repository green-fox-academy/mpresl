package Practice;

public class MathPractice {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 50);
            System.out.println(num);
        }
    }
}
// 0 <= Math.Random() < 1
//50 + (int) (Math.random()* 50) --> return integer between 50-99
//
//a + Math.random() * b --> returns random number between a and a+b, excluding a + b