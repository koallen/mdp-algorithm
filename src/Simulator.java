import javax.swing.*;

/**
 * Simulator
 */

public class Simulator extends JFrame {

    public Simulator() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("MDP Group 16 Simulator");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Simulator simulator = new Simulator();
            simulator.setVisible(true);
        });
        System.out.println("MDP simulator started.");
    }
}
