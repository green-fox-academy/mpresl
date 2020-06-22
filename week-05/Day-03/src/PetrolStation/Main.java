package PetrolStation;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        Station shell = new Station();

        shell.refill(audi);
        shell.remainingGas();
        System.out.println(audi.gasAmount);
    }

}
