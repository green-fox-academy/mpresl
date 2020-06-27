package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Circles {
    public static void mainDraw(Graphics graphics){

        drawCircle(HEIGHT/2, WIDTH/2, (HEIGHT/2)+150, graphics);
    }

    public static void drawCircle(int x, int y, int radius, Graphics graphics){
        graphics.drawOval(x-(radius/2),y-(radius/2),radius, radius);
        if (radius > 20) {

            drawCircle(x, y - radius/4, radius/2, graphics);
//            drawCircle(x - radius/4, y, radius/2, graphics);
//            drawCircle(x + radius/4, y, radius/2, graphics);

        }
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
