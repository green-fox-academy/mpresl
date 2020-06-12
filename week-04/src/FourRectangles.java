import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        int xStart = 10;
        int yStart = 10;
        for (int i = 0; i < 4; i++) {
            drawRect(xStart,yStart,i,graphics);
            xStart += 75;
            yStart += 75;


        }


    }
    public static void drawRect(int xCord, int yCord, int boxColor, Graphics graphics){
        if (boxColor == 0) {
            graphics.setColor(Color.GREEN);
        }else if (boxColor == 1){
            graphics.setColor(Color.RED);
        }else if (boxColor == 2){
            graphics.setColor(Color.ORANGE);
        }else {
            graphics.setColor(Color.BLUE);
        }
        int boxWidth = 10+(int)(Math.random()*50);
        int boxHeight = 10+(int)(Math.random()*80);
        graphics.fillRect(xCord, yCord, boxWidth, boxHeight );
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