import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i+j) % 2 == 0) {
                    int x = SQUARESIZE * i;
                    int y = SQUARESIZE * j;
                    blackBox(x, y, graphics);
                }
            }
        }


    }
    public static void blackBox(int xCoord, int yCoord, Graphics graphics){
        graphics.fillRect(xCoord,yCoord,SQUARESIZE, SQUARESIZE);
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;
    static int SQUARESIZE = WIDTH/8;


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