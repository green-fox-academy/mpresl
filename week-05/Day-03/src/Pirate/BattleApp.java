package Pirate;

public class BattleApp {
    public static void main(String[] args){
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        Pirate mike = new Pirate("Mike", "Captain");
        mike.howsItGoingMate();
        ship1.addAlreadyCreatedPirate(mike);

        ship1.fillShip();
        ship1.rollCall();
        ship2.fillShip();
        ship2.ship.get(0).drinkSomeRum();

        if(ship1.battle(ship2)){
            ship1.party();
        }else {
            ship2.party();
        }
        ship1.rollCall();
        ship2.rollCall();
        mike.howsItGoingMate();
        mike.howsItGoingMate();
        mike.howsItGoingMate();
        mike.howsItGoingMate();
        mike.howsItGoingMate();
        mike.howsItGoingMate();

    }
    }

