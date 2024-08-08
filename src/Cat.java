import java.awt.Color;
import java.awt.Graphics;

public class Cat extends Actor {
    public Cat(Cell cell) {
        super(cell);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(cell.x, cell.y, cell.size, cell.size); // Drawing a blue square
    }
}
