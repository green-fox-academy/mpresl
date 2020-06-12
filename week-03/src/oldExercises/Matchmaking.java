package oldExercises;

import java.util.ArrayList;
import java.util.Arrays;
public class Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
        System.out.println(makingMatches(girls, boys));

    }
    public static ArrayList makingMatches(ArrayList first, ArrayList second){
        ArrayList<String> combined = new ArrayList();
        int bigger;
        if(first.size() > second.size()){
            bigger = first.size();
        }else {
            bigger = second.size();
        }

        for (int i = 0; i < bigger-1; i++) {
            combined.add(first.get(i).toString());
            combined.add(second.get(i).toString());
        }
        if (first.size() > second.size()){
            for (int i = second.size(); i < first.size(); i++) {
                combined.add(first.get(i).toString());
            }
        }else if (first.size() < second.size()) {
            for (int i = first.size(); i < second.size(); i++) {
                combined.add(second.get(i).toString());
            }
        }
        return combined;
    }
}

