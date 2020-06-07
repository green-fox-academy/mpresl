package ArraysAndFunctions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;


public class ArrayListPractice {
    public static void main(String[] args){

        ArrayList arrayListOne;
        arrayListOne = new ArrayList();

        ArrayList arrayListTwo = new ArrayList();

        ArrayList<String> names = new ArrayList<String>();
        names.add("Michael");
        names.add("Jason");
        names.add("Phil");

        names.add(2, "Peter");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        names.remove(3);
        System.out.println();
        for (String i : names){
            System.out.println(i);
        }
        System.out.println();
        Iterator indivItems = names.iterator();

        while (indivItems.hasNext()){
            System.out.println(indivItems.next());
        }

        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names);

        String paulYoung = "Paul young";
        names.add(paulYoung);

        if(names.contains(paulYoung)){
            System.out.println("Paul is here");
        }
        if (names.containsAll(nameCopy)){
            System.out.println("Everything is here");
        }//copied names to namecopy but then added to names

        names.clear();
        if(names.isEmpty()){
            System.out.println("Array list is empty");
        }

        Object[] moreNames = new Object[4];
        moreNames = nameCopy.toArray();
        System.out.println(Arrays.toString(moreNames));


//        ArrayList<Integer> grades = new ArrayList<>();
//        grades.add(90);
//        grades.add(85);
//        grades.add(75);
//
//        for (int i = 0; i < grades.size(); i++) {
//            System.out.printf("Grade #%d == %d\n",i,grades.get(i));
//        }
//        grades.remove(1);

    }
}
