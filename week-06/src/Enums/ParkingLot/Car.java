package Enums.ParkingLot;


import java.util.ArrayList;

public class Car {
    Make carMake;
    Color carColor;

    Car(Make carMake, Color carColor){
        this.carColor = carColor;
        this.carMake = carMake;
    }



    @Override
    public String toString() {
        return this.carColor + " "+this.carMake ;
    }
}
