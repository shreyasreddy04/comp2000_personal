import java.util.*;

public class GridIterator implements Iterator<Cell> {
    Cell[][] cells;
    int row = 0;
    int col = 0;

    public GridIterator(Cell[][] cells) {
        this.cells = cells;
    }

    @Override
    public boolean hasNext() {
        return row < cells.length && col < cells[row].length;
    }

    @Override
    public Cell next() {
        Cell cell = cells[row][col];
        col++;
        if (col >= cells[row].length) {
            col = 0;
            row++;
        }
        return cell;
    }
}

