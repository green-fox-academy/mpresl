package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void mainDraw(Graphics graphics) {

        int size = WIDTH/3;
        int x = (WIDTH/2) ;
        int y = (HEIGHT/2) ;

        drawSquare(graphics, x, y, size);
    }
    public static void drawSquare(Graphics graphics, int x, int y, int size){
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x- size/2,y- size/2,size,size);
        if (size > 2){
            drawSquare(graphics, x - (size), y-(size), size/3);
            drawSquare(graphics, x + (size), y-(size), size/3);
            drawSquare(graphics, x - (size), y+(size), size/3);
            drawSquare(graphics, x + (size), y+(size), size/3);

            drawSquare(graphics, x , y+(size), size/3);
            drawSquare(graphics, x, y-(size), size/3);

            drawSquare(graphics, x - (size), y, size/3);
            drawSquare(graphics, x + (size), y, size/3);

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
