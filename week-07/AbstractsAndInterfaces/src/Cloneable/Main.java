package Cloneable;

public class Main {
    public static void main(String[] args) {
        Student john = new Student("John", 20, "Male", "BME");

        Student johnTheClone = john.clone("johnTheClone");

        johnTheClone.setAge(100);
        johnTheClone.introduce();
        john.introduce();


    }
}