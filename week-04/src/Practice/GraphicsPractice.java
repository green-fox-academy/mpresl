package Practice;

import javax.swing.*;

public class GraphicsPractice {
    public static void main(String[] args){
        JFrame f = new JFrame(("Experiment"));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawingPractice p = new DrawingPractice();
        f.add(p);
        f.setSize(500,350);
        f.setVisible(true);
    }
}
