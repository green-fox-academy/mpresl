//This is a work in progress... INCOMPLETE!!!

package DrawingProject;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        drawTopLine(0, 0, WIDTH, 20, graphics);
        drawBotLines(0, 0, 20, HEIGHT, graphics);

        drawTopLine(0, 0, WIDTH/2, 10, graphics);
        drawBotLines(0, 0, 10, HEIGHT/2, graphics);

        drawTopLine(0, 0, WIDTH/4, 5, graphics);
        drawBotLines(0, 0, 5, HEIGHT/4, graphics);

        drawTopLine(0, 0, WIDTH/8, 3, graphics);
        drawBotLines(0, 0, 3, HEIGHT/8, graphics);




    }
    public static void drawTopLine(int startX, int startY, int endX, int endY, Graphics graphics){
        graphics.setColor(new Color (150,0,205));
        int plus = endY;

        for (int i = 0; i <= 16; i++) {
            graphics.drawLine(startX, startY, endX, endY);
            startX += plus;
            endY += plus;
        }
    }
    public static void drawBotLines(int startX, int startY, int endX, int endY, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int plus = endX;
        for (int i = 0; i <= 16; i++) {
            graphics.drawLine(startX, startY, endX, endY);

            startY += plus;
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