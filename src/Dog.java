import java.awt.Color;
import java.awt.Graphics;

public class Dog extends Actor {
    public Dog(Cell cell) {
        super(cell);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(cell.x, cell.y, cell.size, cell.size); // Drawing a yellow square
    }
}
