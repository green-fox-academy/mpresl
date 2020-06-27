package Fractals;
//still need to set line thickness
import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SquareGrid {
    public static void mainDraw(Graphics graphics) {

        int size = WIDTH/2;
        int x = (WIDTH/2) ;
        int y = (HEIGHT/2) ;

        drawSquare(graphics, x, y, size);
    }
    public static void drawSquare(Graphics graphics, int x, int y, int size){

        graphics.drawRect(x- size/2,y- size/2,size,size);
        if (size > 50){
            drawSquare(graphics, x - (size/2), y-(size/2), size/2);
            drawSquare(graphics, x + (size/2), y-(size/2), size/2);

            drawSquare(graphics, x - (size/2), y+(size/2), size/2);
            drawSquare(graphics, x + (size/2), y+(size/2), size/2);

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
