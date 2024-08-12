import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {

    public static void main(String[] args) {
        Main window = new Main();
    }

    class Canvas extends JPanel {
        Grid grid = new Grid();

        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            grid.paint(g, getMousePosition());
            repaint();
        }
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }
}
