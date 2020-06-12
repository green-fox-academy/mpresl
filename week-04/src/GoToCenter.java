import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics){
        for (int i = 0; i < 10; i++) {
            int x = (int)(Math.random()*WIDTH);
            int y = (int)(Math.random()*HEIGHT);
            singleLine(x,y, graphics);
        }
    }
    public static void singleLine(int xcord, int ycord, Graphics drawing){
        drawing.setColor(Color.GREEN);
        drawing.drawLine(xcord,ycord,WIDTH/2,HEIGHT/2);
    }


    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args){
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH,HEIGHT));
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
