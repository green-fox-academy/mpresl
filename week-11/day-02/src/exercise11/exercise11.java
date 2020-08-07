package exercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exercise11 {
    public static void main(String[] args) {
        String filename = "/Users/pres/greenfox/mpresl/week-11/day-02/src/exercise11/nyj.txt";
        try {
            Map<String, Integer> wordCounter = Files.readAllLines(Paths.get(filename)).stream()
                    .flatMap(line -> Arrays.stream(line.split("\\W+")))
//                    .flatMap(line -> Arrays.stream(line.replaceAll("[^a-zA-Z ]", "").split(" ")))
                    .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
            wordCounter.entrySet().removeIf(entry -> entry.getKey().equals(""));
            Map<String, Integer> sortedMap = wordCounter.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue((v1, v2) -> v2.compareTo(v1)))
                    .limit(10)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            System.out.println(sortedMap);
        } catch (IOException e) {
            System.out.println("could not open");

//            try {
//                List<String> lines = Files.readAllLines(Paths.get(filename)).stream()
////                    .flatMap(line -> Arrays.stream(line.split("[\\\\p{Punct}\\\\s]+")))
//                        .flatMap(line -> Arrays.stream(line.replaceAll("[^a-zA-Z ]", "").split(" ")))
//                        .map(w -> w.trim())
//                        .collect(Collectors.toList());
//                System.out.println( lines);
//                Map<String, Integer> wordCounter = lines.stream()
//                        .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
//                wordCounter.entrySet().removeIf( entry -> entry.getKey().equals(""));
//                Map<String, Integer> sortedMap = wordCounter.entrySet().stream()
//                        .sorted(Map.Entry.comparingByValue((v1,v2) -> v2.compareTo(v1)))
//                        .limit(10)
//                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//                System.out.println(sortedMap);
//            } catch (IOException e) {
//                System.out.println("could not open");
//        }
        }
    }
}