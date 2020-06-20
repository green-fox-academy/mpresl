package Exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args){
        String original = "src/Exercises/doubled.txt";
        String decodedMessage = "src/Exercises/doubledDecoded.txt";
        decrypt(original, decodedMessage);
    }

    public static void decrypt(String original, String decoded){
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
                content.add(removeDoubles(line));
            }
            Files.write(Paths.get(decoded), content);
        }catch (IOException ex){
            System.out.println("Cannot read");
        }

    }

//Takes in line(String) and removes every other letter and returns the new line
    public static String removeDoubles(String line){
        String newString = "";
        for (int i = 0; i < line.length(); i++) {
            if (i % 2 == 0) {
                newString += line.charAt(i);
            }
        }
        return newString;
    }
}
