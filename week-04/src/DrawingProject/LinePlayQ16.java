//This is a work in progress... INCOMPLETE!!!

package DrawingProject;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlayQ16 {
    public static void mainDraw(Graphics graphics) {
        int quads = 4; // 16, 64
        int newWidth = WIDTH/quads*(int)Math.sqrt(quads);

        int lines = 16;
        int step = newWidth/lines;
        for (int i = 0; i <= lines; i++) {
            int xEnd = i * step;
            int yEnd = i * step;

            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, yEnd, xEnd, newWidth);

            graphics.setColor(new Color (150,0,205));
            graphics.drawLine(xEnd, 0, newWidth, yEnd);
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