package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FractalTree {
    public static void mainDraw(Graphics graphics) {
        drawTree(graphics, 400, 500, -90, 9);
    }
    public static void drawTree(Graphics g, int x1, int y1, double angle, int level){
        if (level == 0){
            return;
        }
        int x2 = (int) (x1 + Math.cos(Math.toRadians(angle)) * 10 * level);
        int y2 = (int) (y1 + Math.sin(Math.toRadians(angle)) * 10 * level); //9 = line length
        g.setColor(Color.blue);
        g.drawLine(x1,y1, x2, y2);

        drawTree(g, x2, y2, angle+25, level - 1);
        drawTree(g, x2, y2, angle-25, level - 1);
        drawTree(g, x2, y2, angle, level - 1);
    }


    static int WIDTH = 800;
    static int HEIGHT = 800;


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics){
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
