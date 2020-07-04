public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");
        Tree orangeTree = new Tree("orange");
        Tree purpleTree = new Tree("purple");

        garden.addPlant(yellowFlower);
        garden.addPlant(purpleTree);
        garden.addPlant(blueFlower);
        garden.addPlant(orangeTree);

        garden.showWater();
        garden.waterPlants(40);
        garden.waterPlants(70);
    }
}
