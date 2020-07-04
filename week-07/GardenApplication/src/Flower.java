public class Flower extends Plant {
    String type = "Flower";


    Flower(){}

    Flower(String c){
        super(c);
    }
    public void water(int water){
        double w = water * .75;
        this.waterAmount += w;
    }


    @Override
    public String toString(){
        return this.color+" "+this.type;
    }

}
