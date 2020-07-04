public class Tree extends Plant {
    String type = "Tree";


    Tree(){}

    Tree(String c){
        super(c);
    }

    @Override
    public boolean needsWater(){
        return this.waterAmount <= 10;
    }
    public void checkWater(){
        if (needsWater()){
            System.out.println("The "+this.toString()+" needs water." );
        }else {
            System.out.println("The "+this.toString()+" doesn't need water." );

        }
    }

    public void water(int water){
        double w = water * .4;
        this.waterAmount += w;
    }

    @Override
    public String toString(){
        return this.color + " " + this.type;
    }
}
