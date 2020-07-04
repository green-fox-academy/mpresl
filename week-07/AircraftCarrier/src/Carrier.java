import java.util.ArrayList;

public class Carrier {
    ArrayList<Aircraft> carrier = new ArrayList<>();
    private int ammunition;
    private int health;


    Carrier(int ammo, int health){
        this.ammunition = ammo;
        this.health = health;
    }

    public void addAircraft(Aircraft a){
        carrier.add(a);
    }
    public void getStatus(){
        System.out.println("Carrier Health: "+ this.health+ ", Carrier Ammo: "+this.ammunition);
        for (Aircraft a :
                carrier) {
            System.out.println(a.getStatus());
        }
    }

    public void fill(){
        for (Aircraft a :
                carrier) {
            if (a.refillPriority) {
                this.ammunition = a.refill(this.ammunition);
                if (this.ammunition <= 0) {
                    break;
                }
            }
            for (Aircraft b :
                    carrier) {
                if (!b.refillPriority) {
                    if (this.ammunition <= 0) {
                        break;
                    }
                }
                this.ammunition = b.refill(this.ammunition);
            }
        }
    }
    public void fight(Carrier enemy){

        health = health - enemy.calculateDamage();

        enemy.health -= this.calculateDamage();
        System.out.println(health);
    }
    public int calculateDamage(){
        int dmg = 0;
        for (Aircraft a :
                carrier) {
            dmg += a.totalDamage;
        }
        return dmg;
    }

}
