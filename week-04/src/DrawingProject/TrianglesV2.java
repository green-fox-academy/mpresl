package DrawingProject;

import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TrianglesV2 {
    public static void mainDraw(Graphics graphics) {
        int side = 20;
        int pyramidHeight = 20;
        int startX = (WIDTH/2) - (side*pyramidHeight)/2;
        int startY = (HEIGHT/2) + (pyramidHeight*side)/2;

        for (int i = 0; i < pyramidHeight; i++) {
            drawRow(startX+(i*side/2), startY-(side*i), side, pyramidHeight-i, graphics);
        }
    }

    public static void drawRow(int startX, int startY, int side, int rowNum, Graphics graphics) {
        for (int i = 0; i < rowNum; i++) {
            drawTriangle(startX + (side * i), startY, side, graphics);
        }
    }

    public static void drawTriangle(int x, int y, int side, Graphics graphics){
        int[] xPoly = {x, x+(side/2), x+side};
        int[] yPoly = {y, y-side, y};
        graphics.drawPolygon(xPoly, yPoly, xPoly.length);
    }


    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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