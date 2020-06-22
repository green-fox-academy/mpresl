package Animal;

import java.util.ArrayList;

public class Farm {
    ArrayList<Animal> farm = new ArrayList<>();

    public int farmCapacity = 5;

    public void breed(){
        if (farm.size() < farmCapacity) {
            farm.add(new Animal());
            System.out.println("A new animal has been created");
            }
        else{
            System.out.println("No space for animals");
        }
    }

    public void slaughter(){
        int toKill = 0;
        int hunger = 100;
        for (int i = 0; i < farm.size(); i++) {
            if (farm.get(i).hunger < hunger) {
                toKill = i;
                hunger = farm.get(i).hunger;
            }

        }
        System.out.println(farm.get(toKill) + " will be killed");
        farm.remove(toKill);
    }


}
