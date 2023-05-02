package Game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

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
		
		JPanel pnlSetPlayer = new JPanel();
		pnlSetPlayer.setBackground(new Color(255, 255, 0));
		pnlSetPlayer.setBounds(10, 10, 287, 502);
		frame.getContentPane().add(pnlSetPlayer);
		pnlSetPlayer.setVisible(false);
		
		JButton btnNuovaPartita = new JButton("Nuova partita"); //bottone centrale, serve per avviare una nuova partita
		btnNuovaPartita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlSetPlayer.setVisible(true);
			}
		});
		btnNuovaPartita.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNuovaPartita.setBounds(307, 68, 161, 52);
		frame.getContentPane().add(btnNuovaPartita);
		
		
		
	}
	
	
}
