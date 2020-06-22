package Animal;

public class Animal {
    int hunger;
    int thirst;

    public Animal(){
        this.hunger = 50;
        this.thirst = 50;
    }
    public void eat(){
        System.out.println("eating...");
        this.hunger -= 1;
        System.out.println("Hunger = "+this.hunger+". Thirst = "+this.thirst);
    }
    public void drink(){
        this.thirst -= 1;
        System.out.println("drinking...");
        System.out.println("Hunger = "+this.hunger+". Thirst = "+this.thirst);
    }
    public void play(){
        this.hunger += 1;
        this.thirst += 1;
        System.out.println("playing...");
        System.out.println("Hunger = "+this.hunger+". Thirst = "+this.thirst);
    }
    @Override
    public String toString() {
        return "Doggo";
    }
}
