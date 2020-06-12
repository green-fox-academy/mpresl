package DrawingProject;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        drawBotLines(graphics);
        drawTopLine(graphics);




    }
    public static void drawTopLine(Graphics graphics){
        graphics.setColor(new Color (150,0,205));
        int startX = 40;
        int startY = 5;
        int endX = WIDTH - 5;
        int endY = 20;
        for (int i = 0; i < 14; i++) {
            graphics.drawLine(startX, startY, endX, endY);
            startX += 20;
            endY += 20;
        }
    }
    public static void drawBotLines(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int startX = 5;
        int startY = 40;
        int endX = 20;
        int endY = HEIGHT-5;
        for (int i = 0; i < 14; i++) {
            graphics.drawLine(startX, startY, endX, endY);
            startY += 20;
            endX += 20;

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