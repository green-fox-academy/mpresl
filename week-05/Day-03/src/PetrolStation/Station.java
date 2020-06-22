package PetrolStation;

public class Station {
    public int gasAmount = 10000;

    Station(){}

    public void refill(Car car){
        this.gasAmount -= car.capacity;
        car.gasAmount = car.capacity;
    }
    public void remainingGas(){
        System.out.println("There are : "+gasAmount+" gallons remaining!");
    }
}
