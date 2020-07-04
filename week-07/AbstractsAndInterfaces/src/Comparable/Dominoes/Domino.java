package Comparable.Dominoes;

public class Domino implements Comparable<Domino> {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }



    public int compareTo(Domino other) {
        if (this.getLeftSide() == other.getLeftSide()){
            return Integer.compare(this.getRightSide(), other.getRightSide());
        }
        return Integer.compare(this.getLeftSide(), other.getLeftSide());

    }

}