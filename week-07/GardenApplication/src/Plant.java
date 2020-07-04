public class Plant {
    String color;
    double waterAmount = 0;




    Plant(){}

    Plant(String c){
        this.color = c;
    }
    public void water(int num){
        waterAmount += num;
    }
    public boolean needsWater() {
        return this.waterAmount<= 5;
    }

    public void checkWater(){
        if (this.needsWater()){
            System.out.println("The "+this.toString()+" needs water." );
        }else {
            System.out.println("The "+this.toString()+" doesn't need water." );
        }
    }



}
