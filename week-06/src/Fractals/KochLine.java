package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class KochLine {
    public static void mainDraw(Graphics graphics) {
        kochLine(graphics, 0, HEIGHT/2, WIDTH, HEIGHT/2, 4);
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

//        graphics.drawLine(x2, y2, x3, y3);
//        graphics.drawLine(x3, y3, x4, y4);
//        graphics.drawLine(x4, y4, endX, endY);

            kochLine(graphics, startX, startY, x2, y2, (depth - 1));
            kochLine(graphics, x2, y2, x3, y3, (depth - 1));
            kochLine(graphics, x3, y3, x4, y4, (depth - 1));
            kochLine(graphics, x4, y4, endX, endY, (depth - 1));


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

