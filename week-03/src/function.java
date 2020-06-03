import java.util.Scanner;

public class function {
    static double myPI = 3.14159;//class variable

    public static void main(String[] args){
//        accessModifier static returnType methodName()
        System.out.println(addThem(1,2));
        for (int i = 0; i < 10; i++) {


            int randomNum = (int) (Math.random()*5);
            System.out.println(randomNum);
        }

    }
    public static int addThem(int a,int b){ //returns int
        int c = a + b;
        return c;

    }
}