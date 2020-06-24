package Pirate;

public class Main {
    public static void main(String[] args){
        Armada armada1 = new Armada();
        armada1.addNewShip();
        armada1.addNewShip();
        armada1.armada.get(0).rollCall();
        armada1.armada.get(1).rollCall();

    }
}
