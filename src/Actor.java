import java.awt.Graphics;

public class Actor {
    protected Cell cell;

    public Actor(Cell cell) {
        this.cell = cell;
    }

    public void paint(Graphics g) {
        // Default implementation or empty method
        // Subclasses will override this method
    }
}
