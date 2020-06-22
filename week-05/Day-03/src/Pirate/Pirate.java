package Pirate;

public class Pirate {
    int drunk = 0;
    String name = "Pirate";
    Boolean isAlive = true;
    String rank = "Crew Member";
    Boolean isAwake = true;
    Boolean isDrunk = false;

    Pirate(){}

    Pirate(String name){
        this.name = name;
    }
    Pirate(String name, String rank){
        this.name = name;
        this.rank = rank;
    }


    void drinkSomeRum(){
        if (isAlive) {
            this.drunk++;
            if (this.drunk > 4){
                isDrunk = true;
                isAwake = false;
            }
        }else {
            System.out.println(this.name+" is dead...");
        }
    }
    void howsItGoingMate(){
        if (!isAlive){
            System.out.println(this.name+" is dead...");
        } else if(this.drunk <= 4){
            System.out.println("Pour me anudder!");
        }else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its going?");
            System.out.println("Pirate Passes out to sleep it off...");
            this.isAwake = false;
            this.drunk = 0;
        }
    }
    void die(){
        this.isAlive = false;
    }
    void brawl(Pirate otherPirate){
        int num = (int)(Math.random()*3 +1);
        if (!otherPirate.isAlive){
            System.out.println(otherPirate.name+ " is dead.");
        } else if (num == 1){
            this.die();
            System.out.println(this.name+" was killed by "+ otherPirate.name);
        } else if (num == 2){
            otherPirate.die();
            System.out.println(this.name+" has killed "+ otherPirate.name);
        }else {
            System.out.println(this.name+" and "+otherPirate.name+" have both passed out...");
            this.isAwake = false;
            otherPirate.isAwake = false;
            this.drunk = 0;
            otherPirate.drunk = 0;
        }
    }
}
