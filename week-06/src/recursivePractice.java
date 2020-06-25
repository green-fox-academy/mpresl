import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.*;

public class recursivePractice {
    public static void mainDraw(Graphics graphics){

        drawCircle(HEIGHT/2, WIDTH/2, 400, graphics);
    }

    public static void drawCircle(int x, int y, int circleW, Graphics graphics){
        graphics.drawOval(x-(circleW/2),y-(circleW/2),circleW, circleW);
        if (circleW > 20) {
            drawCircle(x+ circleW/2 , y, circleW/2, graphics);
            drawCircle(x - circleW/2 , y, circleW/2, graphics);
            drawCircle(x, y + circleW/2, circleW/2, graphics);
            drawCircle(x , y - circleW/2, circleW/2, graphics);
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
