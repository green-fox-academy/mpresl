import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fox {
    private String name;
    private String color;
    private int age;


    public Fox(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>();
        Fox f1 = new Fox("Mike", "green", 4);
        foxes.add(f1);
        Fox f2 = new Fox("Nelly", "pink", 8);
        foxes.add(f2);
        Fox f3 = new Fox("Phil", "green", 3);
        foxes.add(f3);
        Fox f4 = new Fox("Kate", "blue", 6);
        foxes.add(f4);
        Fox f5 = new Fox("Ola", "green", 9);
        foxes.add(f5);

        List<Fox> greenFoxes = foxes.stream()
                .filter(n -> n.color.equals("green"))
                .collect(Collectors.toList());
        greenFoxes.stream()
                .filter(n -> n.age < 5)
                .forEach(n -> System.out.println(n.name));

        System.out.println(        foxes.stream()
                        .collect(Collectors.groupingBy((Fox f) -> f.color, Collectors.counting())));
    }
}
