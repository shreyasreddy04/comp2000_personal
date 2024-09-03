import java.util.List;
import java.util.Random;

public class RandomMovementStrategy implements MovementStrategy {
    @Override
    public void move(Actor actor, List<Cell> movementLoc) {
        int moveEach = (new Random()).nextInt(movementLoc.size());
        actor.setLocation(movementLoc.get(moveEach));
    }
}
