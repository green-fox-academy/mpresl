package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class KochSnowFlake {
    public static void mainDraw(Graphics graphics) {
        int x = HEIGHT/2;
        int y = HEIGHT/4;
        int side = HEIGHT/2;
        int d = 4;
        kochTriangle(x,y,side,graphics,d);

    }
    public static void kochLine(Graphics graphics, int startX, int startY, int endX, int endY, int depth) {
        if (depth == 0) {
            graphics.drawLine(startX, startY, endX, endY);
            return;
        }
        int changeX = endX - startX;
        int changeY = endY - startY;
        int x2 = startX + changeX / 3;
        int y2 = startY + changeY / 3;
        int x3 = (int) ((startX + endX) / 2 - (Math.sqrt(3) / 6) * (startY - endY));
        int y3 = (int) ((startY + endY) / 2 - (Math.sqrt(3) / 6) * (endX - startX));
        int x4 = endX - changeX / 3;
        int y4 = endY - changeY / 3;


        kochLine(graphics, startX, startY, x2, y2, (depth - 1));
        kochLine(graphics, x2, y2, x3, y3, (depth - 1));
        kochLine(graphics, x3, y3, x4, y4, (depth - 1));
        kochLine(graphics, x4, y4, endX, endY, (depth - 1));


    }
    public static void kochTriangle(int x, int y, int side, Graphics graphics, int d) {
        kochLine(graphics, x, y, x + (side / 2),y+side, d);
        kochLine(graphics, x - (side / 2),y+side, x, y, d);
        kochLine(graphics, x+(side/2), y+side, x - (side / 2),y+side, d);
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

