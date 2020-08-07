package exercise12;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StarWars {
    public static void main(String[] args) {
        String filename = "/Users/pres/greenfox/mpresl/week-11/day-02/src/exercise12/swcharacters.csv";
        ArrayList<SWcharacter> allChars = new ArrayList<>();
        try{
            List<String[]> characters = Files.readAllLines(Paths.get(filename)).stream()
                    .map(line -> line.split(";"))
                    .collect(Collectors.toList());
            characters.stream()
                    .forEach(sw -> {
                        try {
                            allChars.add(new SWcharacter(sw[0], sw[1] ,sw[2], sw[6],sw[7]));
                        } catch (ParseException e) {
                            System.out.println("could not parse");
                        }
                    });

        }catch (IOException e){
            System.out.println("Cannot open");
        }

        List<SWcharacter> heaviestChars = allChars.stream()
                .filter(sw -> sw.getWeight() > 0)
                .sorted(Comparator.comparingDouble((SWcharacter::getWeight)).reversed())
                .collect(Collectors.toList());
        System.out.println("The heaviest character is " + heaviestChars.get(0).getName());


    }
}
