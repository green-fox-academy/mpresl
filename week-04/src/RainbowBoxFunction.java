import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        drawSquare(320,Color.RED,graphics);
        drawSquare((320*6/7),Color.ORANGE,graphics);
        drawSquare((320*5/7),Color.YELLOW,graphics);
        drawSquare((320*4/7),Color.GREEN,graphics);
        drawSquare((320*3/7),Color.BLUE,graphics);
        Color indigo = new Color(75, 0, 130);
        drawSquare((320*2/7),indigo,graphics);
        Color violet = new Color (238,130,238);
        drawSquare((320*1/7),violet,graphics);

    }
    public static void drawSquare(int sqSize, Color color, Graphics graphics){
        int sqWidth = sqSize;
        int sqHeight = sqSize;
        int startingX = (WIDTH/2)-(sqSize/2);
        int startingY = (HEIGHT/2)-(sqSize/2);
        graphics.setColor(color);
        graphics.fillRect(startingX,startingY,sqWidth,sqHeight);
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