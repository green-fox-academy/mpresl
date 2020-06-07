package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args){
        ArrayList <String> listA = new ArrayList<String>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList <String> listB = new ArrayList<String>();
        listB.addAll(listA);

        System.out.println(listA.contains("Durian"));

        listB.remove("Durian");
        listA.add(4, "Kiwi Fruit");
        System.out.println(listA.size()==listB.size());

        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        listB.addAll(Arrays.asList("Passsion Fruit","Pomelo"));

        System.out.println(listA.get(2));

    }
}
