package Enums.ParkingLot;


import java.util.ArrayList;

public class ParkingLot {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Car> allCars = getAllCars();

        for (int i = 0; i < 256; i++) {
            cars.add(new Car(Make.getRandomMake(),Color.getRandomColor()));
        }
        for (Make m :
                Make.values()) {
            System.out.println(m+" appears "+countMake(m, cars)+" times!");
        }
        for (Color c :
                Color.values()) {
            System.out.println(c + " appears "+ countColor(c, cars)+" times!");
        }

        int mostOccured = 0;
        Car most = null;
        for (Car c :
                allCars) {
            int count = countCars(c, cars);
            if (count > mostOccured){
                mostOccured = count;
                most = c;
            }
            System.out.println("There are "+count+" "+ c+"s");
        }
        System.out.println(most+" appears the most often!");


    }

    public static int countCars(Car car, ArrayList<Car> cars){  // Counts each possible Car combination and returns the count
        int count = 0;
        for (Car c :
                cars) {
            if (c.carColor == car.carColor && c.carMake == car.carMake){
                count++;
            }
        }
        return count;
    }


    public static ArrayList<Car> getAllCars(){          //Creates list of all possible car combinations and returns it
        ArrayList<Car> cars = new ArrayList<>();
        for (Make m :
                Make.values()) {
            for (Color c:
                    Color.values()) {
                cars.add(new Car(m,c));
            }
        }
        return cars;
    }



    public static int countMake(Make make, ArrayList<Car> cars){
        int count = 0;
        for (Car c:
             cars) {
            if (c.carMake == make){
                count++;
            }
        }
        return count;
    }

    public static int countColor(Color color, ArrayList<Car> cars){
        int count = 0;
        for (Car c:
                cars) {
            if (c.carColor == color){
                count++;
            }
        }
        return count;
    }



}

