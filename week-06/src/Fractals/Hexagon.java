package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Hexagon {
    public static void mainDraw(Graphics graphics) {
        drawHexagon(HEIGHT/2,WIDTH/2, HEIGHT/2,graphics);

    }

    public static void drawHexagon(int x, int y, int size, Graphics graphics){
        Polygon p = new Polygon();
        for (int i = 0; i < 6; i++)
            p.addPoint((int) (y + size * Math.cos(i * 2 * Math.PI / 6)),
                    (int) (x + size * Math.sin(i * 2 * Math.PI / 6)));
        graphics.drawPolygon(p);

          }





    static int WIDTH = 600;
    static int HEIGHT = 600;


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
