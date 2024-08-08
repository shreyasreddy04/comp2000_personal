import java.awt.Graphics;
import java.awt.Point;

class Stage {
    Grid grid;
    Actor[] actors;

    public Stage(Grid grid, Actor[] actors) {
        this.grid = grid;
        this.actors = actors;
    }

    public void paint(Graphics g, Point mousePosition) {
        grid.paint(g, mousePosition);
        for (Actor actor : actors) {
            actor.paint(g);
        }
    }
}