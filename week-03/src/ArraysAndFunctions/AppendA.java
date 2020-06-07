package ArraysAndFunctions;

public class AppendA {
    public static void main(String[] args){
        String[] animals = new String[] {"koal", "pand", "zebr"};
        for (int i = 0; i < animals.length; i++) {
            animals[i] = animals[i]+"a";
        }
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}
