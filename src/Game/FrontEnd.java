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
import javax.swing.JCheckBox;

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

	int players = 0;
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
		
		//pannello a sinistra
		JPanel pnlSetPlayer = new JPanel();
		pnlSetPlayer.setBackground(new Color(255, 255, 255));
		pnlSetPlayer.setBounds(10, 10, 287, 502);
		frame.getContentPane().add(pnlSetPlayer);
		pnlSetPlayer.setLayout(null);
		
		//bottone apertura pannello sinistro, per poter selezionare quanti giocatori parteciperanno
		JButton btnSelezioneGiocatori = new JButton("Seleziona Giocatori"); //bottone centrale, serve per avviare una nuova partita
		btnSelezioneGiocatori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlSetPlayer.setVisible(true);
			}
		});
		btnSelezioneGiocatori.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSelezioneGiocatori.setBounds(311, 51, 191, 52);
		frame.getContentPane().add(btnSelezioneGiocatori);
		
		//checkbox DUE GIOCATORI
		JCheckBox chckbxGiocatori2 = new JCheckBox("2 giocatori");
		chckbxGiocatori2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGiocatori2.setBounds(24, 86, 153, 72);
		pnlSetPlayer.add(chckbxGiocatori2);
		
		//checkbox TRE GIOCATORI
		JCheckBox chckbxGiocatori3 = new JCheckBox("3 giocatori");
		chckbxGiocatori3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGiocatori3.setBounds(24, 176, 153, 72);
		pnlSetPlayer.add(chckbxGiocatori3);
		
		//checkbox QUATTRO GIOCATORI
		JCheckBox chckbxGiocatori4 = new JCheckBox("4 giocatori");
		chckbxGiocatori4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGiocatori4.setBounds(24, 269, 153, 72);
		pnlSetPlayer.add(chckbxGiocatori4);
		
		//label che mostra il numero di giocatori selezionati
		JLabel lblMostraPlayerNum = new JLabel("");
		lblMostraPlayerNum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMostraPlayerNum.setBounds(321, 113, 171, 32);
		frame.getContentPane().add(lblMostraPlayerNum);
		
		//bottone conferma giocatori
		//a seconda della checkbox selezionata
		JButton btnConfermaSetPlayer = new JButton("Conferma");
		btnConfermaSetPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxGiocatori4.isSelected()==true) {
					players = 4;
				}
				if(chckbxGiocatori3.isSelected()==true) {
					players = 3;
				}
				if(chckbxGiocatori2.isSelected()==true) {
					players = 2;
				}
				if(chckbxGiocatori4.isSelected()==false && chckbxGiocatori3.isSelected()==false && chckbxGiocatori2.isSelected()==false) {
					System.out.println("errore, seleziona un numero di giocatori!");
				}
				pnlSetPlayer.setVisible(false);
				lblMostraPlayerNum.setText("Giocatori: "+ players);
			}
		});
		btnConfermaSetPlayer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConfermaSetPlayer.setBounds(24, 378, 153, 57);
		pnlSetPlayer.add(btnConfermaSetPlayer);
		pnlSetPlayer.setVisible(false);
		
		
		
		
		
		
	}
}
