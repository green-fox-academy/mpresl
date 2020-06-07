package DataStructures;

import java.util.HashMap;

public class ShoppingList2 {
    public static void main(String[] args){
        HashMap<String, Double> products = new HashMap<String, Double>();
        products.put("Milk", 1.07);
        products.put("Rice", 1.59);
        products.put("Eggs", 3.14);
        products.put("Cheese", 12.60);
        products.put("Chicken Breasts", 9.40);
        products.put("Apples",2.31);
        products.put("Tomato", 2.58);
        products.put("Potato", 1.75);
        products.put("Onion", 1.10);

        HashMap<String, Integer> bobShopping = new HashMap<String, Integer>();
        bobShopping.put("Milk", 3);
        bobShopping.put("Rice", 2);
        bobShopping.put("Eggs", 2);
        bobShopping.put("Cheese", 1);
        bobShopping.put("Chicken Breasts", 4);
        bobShopping.put("Apples", 1);
        bobShopping.put("Tomato", 2);
        bobShopping.put("Potato", 1);

        HashMap<String, Integer> aliceShop = new HashMap<String, Integer>();
        aliceShop.put("Rice", 1);
        aliceShop.put("Eggs", 5);
        aliceShop.put("Chicken Breasts", 2);
        aliceShop.put("Apples", 1);
        aliceShop.put("Tomato", 10);
        
        double totalPaid = 0;
        for (String item :
                bobShopping.keySet()) {
            double price = bobShopping.get(item)*products.get(item);
            totalPaid += price;
        }
        System.out.println("Bob pays "+totalPaid+ " in total.");

        double aliceTotal = 0;
        for (String item :
                aliceShop.keySet()) {
            aliceTotal += aliceShop.get(item)*products.get(item);
        }
        System.out.println("Alice pays: "+aliceTotal);

        if (aliceShop.get("Rice") > bobShopping.get("Rice")){
            System.out.println("Alice buys more Rice");
        }else {
            System.out.println("Bob buys more Rice");
        }

        if (aliceShop.containsKey("Potato") && bobShopping.containsKey("Potato")){
            if (aliceShop.get("Potato") > bobShopping.get("Potato")){
                System.out.println("Alice buys more Potatoes");
            }else {
                System.out.println("Bob buys more Potatoes");
            }
        }else if (aliceShop.containsKey("Potato")){
            System.out.println("Alice buys more Potatoes");
        }else {
            System.out.println("Bob buys more potatoes");
        }


        if (aliceShop.size() > bobShopping.size()){
            System.out.println("Alice buys more differnt items");
        }else {
            System.out.println("Bob buys more different items");
        }

        int itemsBob = 0;
        for (String item :
                bobShopping.keySet()) {
            itemsBob += bobShopping.get(item);
        }
        int itemsAlice = 0;
        for (String item :
                aliceShop.keySet()) {
            itemsAlice += aliceShop.get(item);
        }
        if (itemsAlice > itemsBob){
            System.out.println("Alice has more products");
        }else {
            System.out.println("Bob buys more products");
        }
    }
}
        

//        How much does Bob pay?
//        How much does Alice pay?
//        Who buys more Rice?
//        Who buys more Potato?
//        Who buys more different products?
//        Who buys more products? (piece)