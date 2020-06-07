package DataStructures;

import java.util.HashMap;

public class ProductDatabase2 {
    public static void main(String[] args){
        HashMap<String, Integer> products = new HashMap<String, Integer>();
        products.put("Eggs",200);
        products.put("Milk", 200);
        products.put("Fish",400);
        products.put("Apples",150);
        products.put("Bread",50);
        products.put("Chicken", 550);

        for (String item :
                products.keySet()) {
            if (products.get(item) < 201){
                System.out.println(item);
            }
        }
        for (String item :
                products.keySet()) {
            if (products.get(item) > 150){
                System.out.println(item + ": "+products.get(item));
            }
        }


    }
}
