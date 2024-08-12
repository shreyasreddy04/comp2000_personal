import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class Grid {

    Cell[][] cells = new Cell[20][20];
    Queue<Point> mouseTrail = new LinkedList<>();

    public Grid() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(10 + Cell.size * i, 10 + Cell.size * j);
            }
        }
    }

    public void paint(Graphics g, Point mousePointer) {
        if (mousePointer != null) {
            if (mouseTrail.size() >= 100) {
                mouseTrail.poll(); // Remove last
            }
            mouseTrail.offer(new Point(mousePointer)); // Add to first 
        }

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j].paint(g, mousePointer);
            }
        }

        for (int i = 0; i < mouseTrail.size(); i++) {
            Point point = mouseTrail.toArray(new Point[0])[i];
            g.setColor(new Color(50,50,50, 100)); 
            g.fillOval(point.x - 5, point.y - 5, 15, 15); 
        }        
    }
}