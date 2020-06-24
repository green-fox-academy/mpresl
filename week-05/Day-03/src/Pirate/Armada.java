package Pirate;

import java.util.ArrayList;

public class Armada {
    ArrayList<Ship> armada = new ArrayList<>();
    Armada(){}

    void addShip(Ship ship){
        armada.add(ship);
    }
    void addNewShip(){
        Ship ship = new Ship();
        ship.fillShip();
        armada.add(ship);
    }
    boolean war(Armada otherArmada){
        ArrayList<Ship> armada1 = this.armada;
        ArrayList<Ship> armada2 = otherArmada.armada;

        return true;
    }
}
