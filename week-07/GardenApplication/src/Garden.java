import java.util.ArrayList;

public class Garden {
    ArrayList<Plant> garden = new ArrayList<>();

    Garden(){}

    public void waterPlants(int num){
        System.out.println("Watering with "+num);
        int split = 0;
        for (Plant p :
                garden) {
            if (p.needsWater()){
                split++;
            }
        }
        int waterAmount = num/split;
        for (Plant p :
                garden) {
            if (p.needsWater()){
                p.water(waterAmount);
            }
        }
        this.showWater();
    }

    public void addPlant(Plant plant){
        garden.add(plant);
    }
    public void showWater(){
        for (Plant p :
                this.garden) {
            p.checkWater();
        }
        System.out.println();
    }

    public void showPlants(){
        for (Plant p :
                this.garden) {
            System.out.println(p);
        }
    }


}
