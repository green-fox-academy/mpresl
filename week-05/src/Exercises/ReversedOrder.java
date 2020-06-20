package Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {public static void main(String[] args){
    String original = "src/Exercises/ReversedOrder.txt";
    String corrected = "src/Exercises/ReversedOrderCorrected.txt";
    reverse(original, corrected);
}

    public static void reverse(String original, String corrected){
        if (!Files.exists(Paths.get(corrected))){
            try{
                Files.createFile(Paths.get(corrected));
            }catch (IOException ex){
                System.out.println("Cannot create file");
            }
        }
        try{
            List<String> lines = Files.readAllLines(Paths.get(original));
            List<String> content = new ArrayList<>();

            for (int i = 0; i < lines.size(); i++) {
                content.add(lines.get(lines.size()-(i+1)));
            }
            Files.write(Paths.get(corrected), content);
        }catch (IOException ex){
            System.out.println("Cannot read");
        }
    }
}

