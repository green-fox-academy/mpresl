package DrawingProject;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlayV2 {
    public static void mainDraw(Graphics graphics) {
        int lines = 15;
        int xStep = WIDTH/lines;
        int yStep = HEIGHT/lines;

        for (int i = 0; i <= lines; i++) {
            int xEnd = i * xStep;
            int yEnd = i * yStep;

            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, yEnd, xEnd, HEIGHT);

            graphics.setColor(new Color (150,0,205));
            graphics.drawLine(xEnd, 0, WIDTH, yEnd);

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