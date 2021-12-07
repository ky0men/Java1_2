package testSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainApp {

    private JFrame frmTestSwing;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainApp window = new MainApp();
                    window.frmTestSwing.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public MainApp() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmTestSwing = new JFrame();
        frmTestSwing.setTitle("Test Swing");
        frmTestSwing.setBounds(100, 100, 450, 300);
        frmTestSwing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
