import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        int xCord = 10;
        int yCord = 10;
        for (int i = 0; i < 7; i++) {
            int size = i*10;
            drawSquare(xCord,yCord, size, graphics);
            xCord += size;
            yCord += size;
        }

    }
    public static void drawSquare(int xCord, int yCord, int sqSize, Graphics graphics) {
        graphics.setColor(new Color (150,0,205));
        graphics.fill3DRect(xCord,yCord, sqSize, sqSize, true);

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