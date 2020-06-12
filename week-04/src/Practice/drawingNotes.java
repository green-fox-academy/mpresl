package Practice;

import javax.swing.*;
//javafx second library for drawing GUI in JAVA
import java.awt.*;
import java.util.Random;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class drawingNotes {
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void mainDraw(Graphics graphics){
        //Calling the drawRandom function
        drawRandom(graphics);

        //Different ways of setting the colors
        graphics.setColor(Color.PINK);
        Color myColor = new Color(0,0,0,128);
        Color myColor2 = new Color(255,100,0);

        //Creating random rdg values for my random color
        Random random = new Random();
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);

        Color myRandomColor = new Color(red,green,blue);

        /*graphics.setColor(myRandomColor);
        graphics.drawLine(0,0,WIDTH/2,HEIGHT/2);
        graphics.setColor(myColor2);
        graphics.drawLine(WIDTH/2,HEIGHT/2,WIDTH,HEIGHT);*/

        //Drawing 10 triangles in a loop, each starts on i*15 position further
        graphics.setColor(myRandomColor);
        for (int i = 0; i < 10; i++) {
            int[] xPoly = {100+i*15,200+i*15,150+i*15};
            int[] yPoly = {100+i*15,100+i*15,150+i*15};
            graphics.drawPolygon(xPoly, yPoly, xPoly.length);
        }

    }

    public static void drawRandom(Graphics graphics) {
        //Creating random start position x and y for an object
        Random random = new Random();
        int x = random.nextInt(WIDTH);
        int y = random.nextInt(HEIGHT);
        //The size of the object will be 50
        int size = 50;

        //Point object for creating a point x and y
        Point point = new Point(20,5);


        //Creating random rgb values for my random color
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);

        Color myRandomColor = new Color(red, green, blue);
        graphics.setColor(myRandomColor);

        //switch statement for choosing random object to draw
        switch (random.nextInt(7)) {
            case 0:
                graphics.drawRect(point.x, point.y, size, size);
                break;
            case 1:
                graphics.fillRect(x, y, size, size);
                break;
            case 2:
                graphics.drawOval(x, y, size, size + 25);
                break;
            case 3:
                graphics.fillOval(x, y, size, size + 25);
                break;
            case 4:
                int[] xPoly = {100, 200, 150};
                int[] yPoly = {100, 100, 150};
                graphics.drawPolygon(xPoly, yPoly, xPoly.length);
                break;
            case 5:
                int[] xPoly2 = {100, 200, 150};
                int[] yPoly3 = {100, 100, 150};
                graphics.fillPolygon(xPoly2, yPoly3, xPoly2.length);
                break;
            case 6:
                graphics.drawLine(0, 0, WIDTH / 2, HEIGHT / 2);
                graphics.setColor(myRandomColor);
                graphics.drawLine(WIDTH / 2, HEIGHT / 2, WIDTH, HEIGHT);
                break;
        }
        System.out.printf("Switch statement ends here");
    }

    // Don't touch the code below
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing"); //creating frame
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE); //closing button
        ImagePanel panel = new ImagePanel(); //creating new panel
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT)); //size
        jFrame.add(panel); //adds panel as a component to frame
        jFrame.setLocationRelativeTo(null); //Not relative to anything else
        jFrame.setVisible(true); //Visible
        jFrame.pack(); //The pack method sizes the frame so that all its contents are at or above their preferred sizes.
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}