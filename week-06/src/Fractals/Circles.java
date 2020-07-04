
package Fractals;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Circles {
    public static void mainDraw(Graphics graphics){

        drawCircle(50, 50, HEIGHT-100, graphics, 5);

    }

    public static void drawCircle(int x, int y, int diameter, Graphics graphics, int level){
        if (level == 0) {
            return;
        }
        graphics.drawOval(x,y,diameter, diameter);

        int xChange = (int) Math.round((diameter/2f) * Math.sqrt(3) / 2);
        int yChange = Math.round((diameter/4f) * 3 / 2);

        drawCircle(x + diameter / 4, y, diameter / 2, graphics, level - 1);
        drawCircle(x+ diameter/4 + xChange/2, y + yChange, diameter/2, graphics, level -1); //right circles
        drawCircle(x+ diameter/4 - xChange/2, y + yChange, diameter/2, graphics, level -1); //left circles




        //width work with cosin and width/6 -

            //height with sin


        }



    static int WIDTH = 600;
    static int HEIGHT = 600;


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
