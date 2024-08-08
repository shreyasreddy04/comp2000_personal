import java.awt.Color;
import java.awt.Graphics;

public class Bird extends Actor {
    public Bird(Cell cell) {
        super(cell);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(cell.x, cell.y, cell.size, cell.size); // Drawing a green square
    }
}
