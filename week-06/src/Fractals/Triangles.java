package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int side = HEIGHT/2;
        int xStart = WIDTH/2;
        int yStart = 0;
        drawTriangle(xStart,yStart, side , graphics);
    }

    public static void drawTriangle(int x, int y, int side, Graphics graphics){
        int[] xPoly = {x, x + (side / 2), x - (side/2)};
        int[] yPoly = {y, y + side, y + side};
        graphics.drawPolygon(xPoly, yPoly, xPoly.length);
        if (side > 1) {
            drawTriangle(x-(side/2),y, side/2, graphics);
            drawTriangle(x+(side/2),y, side/2, graphics);
            drawTriangle(x,y+side, side/2, graphics);

        }
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
