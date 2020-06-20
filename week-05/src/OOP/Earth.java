package OOP;

public class Earth {
    public static void main(String[] args){
        Human tom;
        tom = new Human();
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Jones";

        tom.speak();

    Human joe;
    joe = new Human();
    joe.age = 5;
    joe.heightInInches = 69;
    joe.eyeColor = "green";
    joe.name = "Joe Maximus";

    joe.speak();
    }
}
