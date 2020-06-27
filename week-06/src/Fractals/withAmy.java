package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class withAmy {
    public static void mainDraw(Graphics graphics){
        drawTriangle(graphics, HEIGHT/2,WIDTH/2 ,0, 0);
    }

    public static void drawTriangle(Graphics graphics, int height, int topX, int topY, int level){

        int rightX = (int) Math.round((topX + height * Math.tan(Math.toRadians(30))));
        int rightY = (int) height + topY;

        int leftX = (int) Math.round((topX - height * Math.tan(Math.toRadians(30))));
        int leftY = (int) height + topY;

        graphics.drawLine(topX, topY, rightX, rightY);
        graphics.drawLine(rightX, rightY, leftX, leftY);
        graphics.drawLine(leftX,leftY,topX,topY);

        if (level < 8) {
            drawTriangle(graphics, height / 2, rightX, topY, level+1);
            drawTriangle(graphics, height / 2, topX, topY + height, level+1);
            drawTriangle(graphics, height / 2, leftX, topY, level+1);
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
