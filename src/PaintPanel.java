import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class PaintPanel extends JPanel {
    ArrayList<Point> pointsToBeDrawn = new ArrayList<>();


    public PaintPanel() {
        this.setPreferredSize(new Dimension(500,600));
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        int[] xPoints = {250, 0, 500}; //hardcoded x coordinates to make a equilateral triangle
        int[] yPoints = {0, 433, 433}; //hardcoded y coordinates to make a equilateral triangle

        int xOffset = 100; // shifting triangle by this x value
        int yOffset = 30; // shifting triangle by this y value

        for (int i = 0; i < xPoints.length; i++) {
            xPoints[i] += xOffset;
            yPoints[i] += yOffset;
        }

        int vertexRadius = 5; // vertex to be displayed as tiny circle

        for (int i = 0; i < 3; i++) {
            drawCenteredCircle(graphics2D, xPoints[i], yPoints[i], vertexRadius);
        }

        Random random = new Random();


        //TODO add point to arraylist and iterate thru arraylist to redraw those points.

        for (int i = 0; i < GUI.numToAdd; i++) {
            if (GUI.buttonClicked) {
                int randVertex = random.nextInt(3);
                int numPointsAdded = pointsToBeDrawn.size();
                if (numPointsAdded == 0) {
                    pointsToBeDrawn.add(new Point(random.nextInt(500), random.nextInt(600))); // adding initial point
                } else {
                    pointsToBeDrawn.add(findMidPoint(xPoints[randVertex], yPoints[randVertex], pointsToBeDrawn.get(numPointsAdded - 1)));
                }
            }
        }

        for (Point pt : pointsToBeDrawn) {
            drawCenteredCircle(graphics2D, pt.getX(), pt.getY(), 2);

        }



    }

    private Point findMidPoint(int xVertex, int yVertex, Point prevPoint) {
        return new Point((xVertex + prevPoint.getX())/2, (yVertex +prevPoint.getY())/2);
    }


    public void drawCenteredCircle(Graphics2D g, int x, int y, int r) {
        x = x-(r/2);
        y = y-(r/2);
        g.fillOval(x,y,r,r);
    }
}
