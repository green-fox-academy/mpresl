import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStreamExercises {
    public static void main(String[] args) {
        //Exercise Six
        System.out.println("Exercise Six");
        Stream<String> myString = Stream.of("MadIasdaKasdaEasdaIasdaSasdaAasdaWasdaEasdSasdOasdMasdE".split(""));

        myString.filter(n -> n.equals(n.toUpperCase()))
                .forEach(n -> System.out.println(n));

        //Exercise Seven
        System.out.println("Exercise Seven");
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        cities.stream()
                .filter(c -> c.startsWith("N"))
                .forEach(c -> System.out.println(c));

        //Exercise Eight
        System.out.println("Exercise Eight");
        List<Character> charsList = new ArrayList<Character>();
        for (char c :
                "Mike is awesome".toCharArray()) {
            charsList.add(c);
        }
        StringBuilder word = new StringBuilder();
        charsList.stream()
                .forEach(l -> word.append(l));
        System.out.println(word);

        //Exercise Nine
        System.out.println("Exercise Nine");
        Map<Character, Long> frequency =
                "MMMMMiiikkkkeeeeeee".toLowerCase().chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);

//        Map<Character, Long> charFreq =
        System.out.println(charsList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

//        System.out.println(charFreq);



    }
}
