//This is a work in progress... INCOMPLETE!!!

package DrawingProject;

import javax.swing.*;


import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        drawTrianglesTop(graphics);
        drawTrianglesRight(graphics);
        drawTrianglesLeft(graphics);

    }
    public static void drawTrianglesLeft(Graphics graphics){
        int xTop = 0;
        int xLeft = 0;
        int xRight = 0;
        int yBot = HEIGHT;
        int yTop = HEIGHT;

        for (int i = 0; i <= HEIGHT/10; i++) {
            int[] xPoly = {xTop, xLeft, xRight};
            int[] yPoly = {yTop, yBot, yBot};
            graphics.drawPolygon(xPoly, yPoly, xPoly.length);

            xTop += 5;
            xRight += 10;
            yTop -= 10;
        }
    }public static void drawTrianglesRight(Graphics graphics){
        int xTop = WIDTH;
        int xLeft = (WIDTH);
        int xRight = (WIDTH);
        int yBot = HEIGHT;
        int yTop = HEIGHT;

        for (int i = 0; i <= HEIGHT/10; i++) {
            int[] xPoly = {xTop, xLeft, xRight};
            int[] yPoly = {yTop, yBot, yBot};
            graphics.drawPolygon(xPoly, yPoly, xPoly.length);
            xTop -= 5;
            xLeft -= 10;
            yTop -= 10;
        }
    }
    public static void drawTrianglesTop(Graphics graphics){
        int xTop = WIDTH/2;
        int xLeft = (WIDTH/2);
        int xRight = (WIDTH/2);
        int yBot = 0;

        for (int i = 0; i <= WIDTH/10; i++) {
            int[] xPoly = {xTop, xLeft, xRight};
            int[] yPoly = {0, yBot, yBot};
            graphics.drawPolygon(xPoly, yPoly, xPoly.length);

            xLeft -= 5;
            xRight += 5;
            yBot += 10;
        }
    }



    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}