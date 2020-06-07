package DataStructures;

public class ShoppingList {
    public static void main(String[] args) {
        String[] shopping = {"Eggs", "milk", "fish", "apples", "bread", "chicken"};
        for (String item:
             shopping) {
            if (item == "milk"){
                System.out.println("Shopping list contains milk");
            }
            if (item == "bananas"){
                System.out.println("Shopping list contains bananas");
            }
        }
    }
}
