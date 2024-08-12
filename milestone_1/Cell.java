import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Cell {
    int x;
    int y;
    static int size = 35;

    public Cell(int inX, int inY) {
        x = inX;
        y = inY;
    }

    public void paint(Graphics g, Point mousePos) {
        if (contains(mousePos)) {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x, y, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }

    public boolean contains(Point mousePointer) {
        if (mousePointer != null) {
            return x < mousePointer.x && x + size > mousePointer.x && y < mousePointer.y && y + size > mousePointer.y;
        } else {
            return false;
        }
    }
}