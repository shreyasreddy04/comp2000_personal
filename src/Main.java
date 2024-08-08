import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    class Canvas extends JPanel {
        Stage stage;

        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
            Grid grid = new Grid();
            Actor[] actors = new Actor[]{
                new Cat(grid.cells[2][3]),
                new Dog(grid.cells[4][5]),
                new Bird(grid.cells[6][7])
            };
            stage = new Stage(grid, actors);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            stage.paint(g, getMousePosition());
        }
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(16); // Sleep for 16 ms to achieve ~60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
      }
}
}
