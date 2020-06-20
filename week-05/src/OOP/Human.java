package OOP;

public class Human {
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(){ //constructor method

    }

    public void speak(){
        System.out.println("Hello, my name is "+name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am "+ age+ " years old");
        System.out.println("My eye color is " + eyeColor);
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void walk(){
        System.out.println("walking...");
    }
    public void work(){
        System.out.println("working...");
    }
}
