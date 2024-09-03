import java.util.List;

public interface MovementStrategy {
    void move(Actor actor, List<Cell> movementLoc);
}
