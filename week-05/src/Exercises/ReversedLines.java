package Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args){
        String original = "src/Exercises/reversed.txt";
        String corrected = "src/Exercises/unreversed.txt";
        reverse(original, corrected);
    }

    public static void reverse(String original, String decoded){
        if (!Files.exists(Paths.get(decoded))){
            try{
                Files.createFile(Paths.get(decoded));
            }catch (IOException ex){
                System.out.println("Cannot create file");
            }
        }
        try{
            List<String> lines = Files.readAllLines(Paths.get(original));
            List<String> content = new ArrayList<>();

            for (String line: lines) {
                content.add(flipLine(line));
            }
            Files.write(Paths.get(decoded), content);
        }catch (IOException ex){
            System.out.println("Cannot read");
        }

    }

    //Takes in line(String) and flips it then returns the new line
    public static String flipLine(String line){
        String newString = "";
        for (int i = 0; i < line.length(); i++) {
            line.charAt(i);
            newString += line.charAt(line.length()-(i+1));
            }
        return newString;
    }
}

