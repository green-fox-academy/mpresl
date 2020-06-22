package Pirate;

import java.util.ArrayList;

public class Ship {
    ArrayList<Pirate> ship = new ArrayList<Pirate>();

    Ship(){ }
    void addAlreadyCreatedPirate(Pirate pirate){
        ship.add(pirate);
    }
    void addPirate(String name){
        ship.add(new Pirate(name));
    }
    void addCaptain(){
        if (this.ship.isEmpty()) {
            ship.add(new Pirate("C1", "Captain"));
        }
    }

    void fillShip(){
        int crewSize = (int) (4 + Math.random()* 13);
        addCaptain();
        for (int i = 1; i < crewSize; i++) {
            String name = "p"+ Integer.toString(i);
            addPirate(name);

        }
    }
    void rollCall(){
        int livingCrew = 0;
        for (Pirate pirate: ship) {
            if (pirate.isAlive){
                livingCrew++;
            }
        }
        System.out.println("This ship has "+livingCrew+" living crew members.");
        for (Pirate pirate: ship) {
            System.out.println("Name: "+pirate.name+ ", Rank: "+pirate.rank+", Drinks: "+pirate.drunk+", Alive: "+pirate.isAlive+", Awake: "+ pirate.isAwake);
        }
    }

    Boolean battle(Ship otherShip){
        int thisScore = calculateScore(this.ship);
        int otherScore = calculateOtherScore(otherShip);
        int deathLoses = (int)(Math.random()*5+1);

        if (thisScore > otherScore){
            for (Pirate pirate:otherShip.ship) {
                int deathChance = (int)(Math.random()*2+1);
                if (deathChance == 1){
                    pirate.isAlive = false;
                }

            }
            return true;
        }else {
            for (Pirate pirate:this.ship) {
                int deathChance = (int)(Math.random()*2+1);
                if (deathChance == 1){
                    pirate.isAlive = false;
                }
            }
            System.out.println("You lose...");
            return false;
        }
    }
    int calculateOtherScore(Ship thisShip){
        int score = 0;
        score += this.ship.get(0).drunk;
        for (Pirate pirate: this.ship) {
            if (pirate.isAlive){
                score++;
            }
        }
        return score;
    }
    int calculateScore(ArrayList<Pirate> thisShip){
        int score = 0;
        score += this.ship.get(0).drunk;
        for (Pirate pirate: this.ship) {
            if (pirate.isAlive){
                score++;
            }
        }
        return score;
    }
    void party(){
        for (Pirate pirate: this.ship) {
            int numDrinks = (int)(Math.random() * 5 + 1);
            for (int i = 0; i < numDrinks; i++) {
                pirate.drinkSomeRum();
            }
        }
    }

}
