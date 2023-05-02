package Game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

public class FrontEnd {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=73,14
	 */
	private final JLabel lblMyShelfie = new JLabel("MY SHELFIE");

	/**
	 * Launch the application.
	 */
	public static void Finestra(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontEnd window = new FrontEnd();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrontEnd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		lblMyShelfie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame = new JFrame();
		frame.setBounds(100, 100, 854, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
}
