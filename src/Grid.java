import java.awt.Graphics;
import java.awt.Point;

public class Grid {
    public Cell[][] cells;
    int rows;
    int cols;

    public Grid(int rows, int cols, int cellSize) {
        this.rows = rows;
        this.cols = cols;
        cells = new Cell[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell(i * cellSize + 10, j * cellSize + 10, cellSize);
            }
        }
    }

    public void draw(Graphics g) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j].draw(g);
            }
        }
    }

    public void updateHighlight(Point mousePosition) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j].setHighlighted(cells[i][j].contains(mousePosition));
            }
        }
    }
}