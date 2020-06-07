package DataStructures;

import java.util.HashMap;

public class ProductDatabase {
    public static void main(String[] args){
        HashMap<String, Integer> products = new HashMap<String, Integer>();
        products.put("Eggs",200);
        products.put("Milk", 200);
        products.put("Fish",400);
        products.put("Apples",150);
        products.put("Bread",50);
        products.put("Chicken", 550);

        System.out.println("Fish cost: "+products.get("Fish"));
        String mostExpensive = "";
        int expensiveValue = 0;
        for (String item :
                products.keySet()) {
            if (products.get(item) > expensiveValue){
                mostExpensive = item;
                expensiveValue = products.get(item);
            }
        }
        System.out.println(mostExpensive + " is the most expensive Item");


        int total = 0;
        for (String item :
                products.keySet()) {
            total += products.get(item);
        }
        int average = total/products.size();
        System.out.println("Average cost: "+average);

        int less300 = 0;
        for (String item:
                products.keySet()){
            if (products.get(item)< 300){
                less300 ++;
            }
        }
        System.out.println("There are "+less300+" items under 300");

        if (products.containsValue(125)){
            System.out.println("Something costs 125");
        }else{
            System.out.println("Nothing costs 125");
        }

        String leastExpensive = "";
        int expenseValue = 10000;
        for (String item :
                products.keySet()) {
            if (products.get(item) < expenseValue){
                leastExpensive = item;
                expenseValue = products.get(item);
            }
        }
        System.out.println(leastExpensive + " is the least expensive Item");
    }
}