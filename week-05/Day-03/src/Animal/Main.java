package Animal;

public class Main {
    public static void main(String[] args){
        Animal bird = new Animal();
        Animal dog = new Animal();

        Farm newFarm = new Farm();

        newFarm.breed();
        newFarm.breed();
        newFarm.breed();
        newFarm.breed();
        newFarm.breed();
        newFarm.breed();


        newFarm.slaughter();

    }
}
