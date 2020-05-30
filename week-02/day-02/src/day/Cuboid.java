package day;

public class Cuboid {
    public static void main(String[] args) {
        double l = 10;
        double w = 10;
        double h = 10;
        double volume = (l * w * h);
        double surfaceArea =  ((2*l*w) + (2*l*h) + (2*h*w));
        System.out.println("Surface area: " + surfaceArea);
        System.out.println(("Volume: " + volume));
    }
}
