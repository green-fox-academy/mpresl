package Sharpie;

import java.util.ArrayList;

public class SharpieSet {
    ArrayList<Sharpie> sharpieSet = new ArrayList<>();

    public void addSharpie(Sharpie sharpie) {
        this.sharpieSet.add(sharpie);
    }

    public int countUsable() {
        int count = 0;
        for (Sharpie pen : sharpieSet) {
            if (pen.inkAmount > 0) {
                count++;
            }
        }
        return count;
    }

    public void removeTrash() {
        for (Sharpie pen : sharpieSet) {
            if (pen.inkAmount <= 0) {
                sharpieSet.remove(pen);
            }
        }
    }
}