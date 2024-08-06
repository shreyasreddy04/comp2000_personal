import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Main extends JFrame {

    public static void main(String[] args) {
        Main window = new Main();
    }

    class Canvas extends JPanel {
        public int width = 720;
        public int height = 720;
        public Grid grid;

        public Canvas() {
            setPreferredSize(new Dimension(width, height));

            // Initialize the grid with the number of rows and columns
            int cellSize = 35;
            int rows = (width - 20) / cellSize;
            int cols = (height - 20) / cellSize;
            grid = new Grid(rows, cols, cellSize);

            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseMoved(MouseEvent e) {
                    Point mousePosition = e.getPoint();
                    grid.updateHighlight(mousePosition);
                    repaint();
                }
            });
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            grid.draw(g);
        }
    }

    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }
}