import java.util.List;

public class LeftMostMovementStrategy implements MovementStrategy {
    @Override
    public void move(Actor actor, List<Cell> movementLoc) {
        if (movementLoc.isEmpty()) return;
        Cell leftCell = movementLoc.get(0);
        for (Cell cell : movementLoc) {
            if (cell.col < leftCell.col) {
                leftCell = cell;
            }
        }
        actor.setLocation(leftCell);
    }
}
