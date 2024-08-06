import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Cell {
    public int x;
    public int y;
    public int size;
    private boolean highlighted;

    public Cell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.highlighted = false;
    }

    public void draw(Graphics g) {
        if (highlighted) {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x, y, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }

    public boolean contains(Point mousePosition) {
        return mousePosition != null && mousePosition.x >= x && mousePosition.x < x + size && mousePosition.y >= y && mousePosition.y < y + size;
    }

    public void setHighlighted(boolean highlighted) {
        this.highlighted = highlighted;
    }
}