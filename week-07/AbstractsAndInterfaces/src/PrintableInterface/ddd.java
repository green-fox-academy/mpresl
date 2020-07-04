package PrintableInterface;

import java.util.ArrayList;

public class ddd {
    public static void main(String[] args) {
        ArrayList<toDo> todos = new ArrayList<>();
        todos.add(new toDo("Milk", "High", true));
        todos.add(new toDo("eggs", "High", true));
        todos.add(new toDo("bread", "High", true));
        todos.add(new toDo("bananas", "High", true));

        for (toDo t :
                todos) {
            t.printAllFields();
        }


        ArrayList<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(3, 5));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(3, 3));
        dominoes.add(new Domino(1, 2));

        for (Domino d :
                dominoes) {
            d.printAllFields();
        }

    }
}
