//Walkthru solution with Amy

package DrawingProject;

import javax.swing.*;


import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        int columns = 7;
        int size = 20;
        double edgeLength = (2 * Math.sqrt(size));
        int edgeLen = (int) Math.round(edgeLength);

        for (int i = 0; i < columns; i++) {
            int x = size + i * (size + size / 2);
            int rows = columns - Math.abs(i - columns/2);
            for (int j = 0; j < rows; j++) {
                int y = HEIGHT/2 - rows*edgeLen + j*size;
                drawHexagon(x,y,size,graphics);
            }
        }
    }

    public static void drawHexagon(int x, int y, int size, Graphics graphics){


        int[] xPoly = {x, x+size, x+size+size/2, x+size,x, x-size/2};
        int[] yPoly = {y,y,y+size/2,y+size,y+size,y+size/2};

        graphics.drawPolygon(xPoly,yPoly,xPoly.length);

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