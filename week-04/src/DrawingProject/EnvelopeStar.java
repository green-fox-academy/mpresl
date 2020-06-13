package DrawingProject;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {


//        int lines = 15; //    Trying to use for loop instead of function
//        int xStep = WIDTH/lines;
//        int yStep = HEIGHT/lines;
//
//        for (int i = 0; i <= lines; i++) {
//            int xEnd = i * xStep;
//            int yEnd = i * yStep;
//            int shift = HEIGHT/2;
//
//            graphics.setColor(Color.GREEN);
//            graphics.drawLine(shift, yEnd/2, xEnd/2+shift, HEIGHT/2);
//            graphics.drawLine(xEnd/2, shift, WIDTH/2, shift + yEnd/2);
//        }
//


        drawTopLeft(0, HEIGHT/2, WIDTH/2, (WIDTH/2), graphics);
        drawBotLeft(0, HEIGHT/2, WIDTH/2, (HEIGHT/2), graphics);
        drawTopRight(WIDTH/2, 0, WIDTH/2, (HEIGHT/2), graphics);
        drawBotRight(WIDTH/2, HEIGHT, WIDTH/2, (HEIGHT/2), graphics);
    }





    public static void drawBotLeft(int startX, int startY, int endX, int endY, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int plus = 10;

        for (int i = 0; i <= 16; i++) {
            graphics.drawLine(startX, startY, endX, endY);
            startX += plus;
            endY += plus;
        }
    }
    public static void drawTopLeft(int startX, int startY, int endX, int endY, Graphics graphics){
        graphics.setColor(Color.GREEN);
        int plus = 10;

        for (int i = 0; i <= 16; i++) {
            graphics.drawLine(startX, startY, endX, endY);
            startX += plus;
            endY -= plus;
        }
    }
    public static void drawTopRight(int startX, int startY, int endX, int endY, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int plus = 10;
        for (int i = 0; i <= 16; i++) {
            graphics.drawLine(startX, startY, endX, endY);

            startY += plus;
            endX += plus;
        }
    }public static void drawBotRight(int startX, int startY, int endX, int endY, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int plus = 10;
        for (int i = 0; i <= 16; i++) {
            graphics.drawLine(startX, startY, endX, endY);
            startY -= plus;
            endX += plus;
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