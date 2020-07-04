package PrintableInterface;

public class Domino implements Printable {
    private int leftSide;
    private int rightSide;

    Domino(int leftSide, int rightSide){
        this.setLeftSide(leftSide);
        this.setRightSide(rightSide);
    }

    public int getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(int leftSide) {
        this.leftSide = leftSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    public void setRightSide(int rightSide) {
        this.rightSide = rightSide;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: "+getLeftSide()+", B Side: "+getRightSide());
    }
}
