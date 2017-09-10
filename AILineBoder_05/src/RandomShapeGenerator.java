import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;

public class RandomShapeGenerator {

    int width, height;
    Random ran = new Random();

    public RandomShapeGenerator(int i, int j)
    {
        int width = i;
        int height = j;
    }

    public void paintComponent(Graphics g)
    {
        switch(ran.nextInt(10)) {
            default:
            case 0:   g.drawOval(10, 20, 10, 20);
            case 1:   g.drawLine(100, 100, 150, 150);
            case 2:   g.drawRect(30,40,30,40);
        }
    }


}