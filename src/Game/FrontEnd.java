package Game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JCheckBox;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;



public class FrontEnd extends JFrame {

	private JFrame formMyShelfie;
	private JTable tableTavola;
	private JTextField txtNomeP1;
	private JTextField txtNomeP2;
	private JTextField txtNomeP3;
	private JTextField txtNomeP4;

	/**
	 * Launch the application.
	 */
	public static void Finestra(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontEnd window = new FrontEnd();
					window.formMyShelfie.setVisible(true);
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
		List<Giocatore> giocatori = new ArrayList<Giocatore>();
		
		formMyShelfie = new JFrame();
		formMyShelfie.setTitle("MY SHELFIE");
		formMyShelfie.setBounds(100, 100, 1265, 638);
		formMyShelfie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formMyShelfie.getContentPane().setLayout(null);
		
		//pannello a sinistra
		JPanel pnlSetPlayer = new JPanel();
		pnlSetPlayer.setBackground(new Color(255, 255, 255));
		pnlSetPlayer.setBounds(10, 130, 201, 382);
		formMyShelfie.getContentPane().add(pnlSetPlayer);
		
		//bottone apertura pannello sinistro, per poter selezionare quanti giocatori parteciperanno
		JButton btnSelezioneGiocatori = new JButton("Seleziona Giocatori"); //bottone centrale, serve per avviare una nuova partita
		btnSelezioneGiocatori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlSetPlayer.setVisible(true);
			}
		});
		btnSelezioneGiocatori.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSelezioneGiocatori.setBounds(10, 67, 191, 52);
		formMyShelfie.getContentPane().add(btnSelezioneGiocatori);
		pnlSetPlayer.setLayout(null);
		
		
		
		//checkbox DUE GIOCATORI
		JCheckBox chckbxGiocatori2 = new JCheckBox("2 giocatori");
		chckbxGiocatori2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGiocatori2.setBounds(3, 5, 95, 27);
		pnlSetPlayer.add(chckbxGiocatori2);
		
		
		//checkbox TRE GIOCATORI
		JCheckBox chckbxGiocatori3 = new JCheckBox("3 giocatori");
		chckbxGiocatori3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGiocatori3.setBounds(103, 5, 95, 27);
		pnlSetPlayer.add(chckbxGiocatori3);
		
		//checkbox QUATTRO GIOCATORI
		JCheckBox chckbxGiocatori4 = new JCheckBox("4 giocatori");
		chckbxGiocatori4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGiocatori4.setBounds(53, 37, 95, 27);
		pnlSetPlayer.add(chckbxGiocatori4);
		
		//listener checkbox
		// checkbox 2
		chckbxGiocatori2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxGiocatori2.isSelected()) {
		            chckbxGiocatori4.setSelected(false);
		            chckbxGiocatori3.setSelected(false);
		            
		          //mostra i textbox per l'inserimento dei nomi dei players
					txtNomeP1.setVisible(true);
					txtNomeP2.setVisible(true);
		        }
		    }
		});
		// checkbox 3
		chckbxGiocatori3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxGiocatori3.isSelected()) {
		            chckbxGiocatori2.setSelected(false);
		            chckbxGiocatori4.setSelected(false);
		            
		          //mostra i textbox per l'inserimento dei nomi dei players
					txtNomeP1.setVisible(true);
					txtNomeP2.setVisible(true);
					txtNomeP3.setVisible(true);
		        }
		    }
		});
		// checkbox 4
		chckbxGiocatori4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxGiocatori4.isSelected()) {
		            chckbxGiocatori2.setSelected(false);
		            chckbxGiocatori3.setSelected(false);
		            
		          //mostra i textbox per l'inserimento dei nomi dei players
					txtNomeP1.setVisible(true);
					txtNomeP2.setVisible(true);
					txtNomeP3.setVisible(true);
					txtNomeP4.setVisible(true);
					
		        }
		    }
		});
		//labels che mostrano i nomi dei giocatori
		JLabel lblNomeP1 = new JLabel("");
		lblNomeP1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeP1.setBounds(256, 523, 110, 27);
		formMyShelfie.getContentPane().add(lblNomeP1);
		
		JLabel lblNomeP2 = new JLabel("");
		lblNomeP2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeP2.setBounds(420, 523, 110, 27);
		formMyShelfie.getContentPane().add(lblNomeP2);
		
		JLabel lblNomeP3 = new JLabel("");
		lblNomeP3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeP3.setBounds(568, 523, 110, 27);
		formMyShelfie.getContentPane().add(lblNomeP3);
		
		JLabel lblNomeP4 = new JLabel("");
		lblNomeP4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeP4.setBounds(758, 523, 110, 27);
		formMyShelfie.getContentPane().add(lblNomeP4);
		
		//labels punti giocatori
		JLabel lblPuntiP1 = new JLabel("");
		lblPuntiP1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPuntiP1.setBounds(256, 561, 110, 27);
		formMyShelfie.getContentPane().add(lblPuntiP1);
		
		JLabel lblPuntiP2 = new JLabel("");
		lblPuntiP2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPuntiP2.setBounds(420, 561, 110, 27);
		formMyShelfie.getContentPane().add(lblPuntiP2);
		
		JLabel lblPuntiP3 = new JLabel("");
		lblPuntiP3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPuntiP3.setBounds(568, 561, 110, 27);
		formMyShelfie.getContentPane().add(lblPuntiP3);
		
		JLabel lblPuntiP4 = new JLabel("");
		lblPuntiP4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPuntiP4.setBounds(758, 561, 110, 27);
		formMyShelfie.getContentPane().add(lblPuntiP4);
		
		//checkbox inizia/finisce partita
		JCheckBox chckbxStartStop = new JCheckBox("Inizia partita");
		chckbxStartStop.setBounds(10, 7, 191, 45);
		formMyShelfie.getContentPane().add(chckbxStartStop);
		chckbxStartStop.setVisible(false);
		
		chckbxStartStop.addActionListener(new ActionListener() {//listener che "ascolta" l'attivazione della checkbox
		    public void actionPerformed(ActionEvent e) {
		        if(chckbxStartStop.isSelected()==true && chckbxStartStop.getText()=="Fine partita") {
		        	chckbxStartStop.setText("Inizia partita");
		        	chckbxStartStop.setSelected(false);
		        }
		        else if(chckbxStartStop.isSelected()==true && chckbxStartStop.getText()=="Inizia partita") {
		        	chckbxStartStop.setText("Fine partita");
		        	chckbxStartStop.setSelected(false);
		        }
		    }
		});
		
		//label che mostra il numero di giocatori selezionati
		JLabel lblMostraPlayerNum = new JLabel("");
		lblMostraPlayerNum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMostraPlayerNum.setBounds(1001, 25, 187, 20);
		formMyShelfie.getContentPane().add(lblMostraPlayerNum);
		pnlSetPlayer.setVisible(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(256, 25, 610, 487);
		formMyShelfie.getContentPane().add(scrollPane);
		
		//tabella che mostra la tavola da gioco
		JTable tableTavola_1 = new JTable(9,9);
		scrollPane.setViewportView(tableTavola_1);
		tableTavola_1.setRowHeight(51);
		
		tableTavola_1.doLayout();
		
		//bottone conferma giocatori
		//a seconda della checkbox selezionata
		JButton btnConfermaSetPlayer = new JButton("Conferma");
		btnConfermaSetPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxGiocatori4.isSelected()==true) {
					Tavola.numPlayers = 4;
					giocatori.clear(); //pulisco la lista
					
					Giocatore g1 = new Giocatore(txtNomeP1.getText(),01,1,true,false);
					Giocatore g2 = new Giocatore(txtNomeP2.getText(),02,0,false,false);
					Giocatore g3 = new Giocatore(txtNomeP3.getText(),03,0,false,false);
					Giocatore g4 = new Giocatore(txtNomeP4.getText(),04,0,false,false);
					
					giocatori.add(g1);
					giocatori.add(g2);
					giocatori.add(g3);
					giocatori.add(g4);
					
				}
				if(chckbxGiocatori3.isSelected()==true) {
					Tavola.numPlayers = 3;
					
					giocatori.clear();//pulisco la lista
					
					Giocatore g1 = new Giocatore(txtNomeP1.getText(),01,0,true,false);
					Giocatore g2 = new Giocatore(txtNomeP2.getText(),02,0,false,false);
					Giocatore g3 = new Giocatore(txtNomeP3.getText(),03,0,false,false);
					
					giocatori.add(g1);
					giocatori.add(g2);
					giocatori.add(g3);
					
				}
				if(chckbxGiocatori2.isSelected()==true) {
					Tavola.numPlayers = 2;
					
					giocatori.clear();//pulisco la lista
					
					Giocatore g1 = new Giocatore(txtNomeP1.getText(),01,0,true,false);
					Giocatore g2 = new Giocatore(txtNomeP2.getText(),02,0,false,false);
					
					giocatori.add(g1);
					giocatori.add(g2);
				}
				if(chckbxGiocatori4.isSelected()==false && chckbxGiocatori3.isSelected()==false && chckbxGiocatori2.isSelected()==false) {
					System.out.println("errore, seleziona un numero di giocatori!");
				}
				pnlSetPlayer.setVisible(false);
				lblMostraPlayerNum.setText("Giocatori: "+ Tavola.numPlayers);
				tableTavola_1.setVisible(true);
				
				//inizializzo la matrice tavola da gioco
				Tavola tavola = new Tavola();
				TableCellRenderer cellColora = new CustomCellColore();
				Tavola.generaTavola();
				//scansiono tutta la matrice
				for (int row = 0; row < 9; row++) {
				    for (int col = 0; col < 9; col++) {
				    	
				        Color cellColor = tavola.tavolaDaGioco[row][col].getColor();//prendo il colore di una determinata posizione della matrice
				        tableTavola_1.setValueAt(cellColor, row, col);//Imposto il colore desiderato alla giusta casella
				        tableTavola_1.getColumnModel().getColumn(col).setCellRenderer(cellColora);//applico il colore alla casella utilizzando la classe CustomCellColore
				    }
				}
				
				lblNomeP1.setText(giocatori.get(0).getNome());
				lblNomeP2.setText(giocatori.get(1).getNome());				
				
				
				lblPuntiP1.setText(""+giocatori.get(0).getPunti());
				lblPuntiP2.setText(""+giocatori.get(1).getPunti());
				
				if(giocatori.size()==4) {
					lblPuntiP3.setText(""+giocatori.get(2).getPunti());
					lblPuntiP4.setText(""+giocatori.get(3).getPunti());
					lblNomeP3.setText(giocatori.get(2).getNome());
					lblNomeP4.setText(giocatori.get(3).getNome());
				}
				else if(giocatori.size()==3){
					lblPuntiP3.setText(""+giocatori.get(2).getPunti());
					lblNomeP3.setText(giocatori.get(2).getNome());
				}
				chckbxStartStop.setVisible(true);
			}
			
		});
		btnConfermaSetPlayer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConfermaSetPlayer.setBounds(47, 326, 101, 29);
		pnlSetPlayer.add(btnConfermaSetPlayer);
		
		txtNomeP1 = new JTextField();
		txtNomeP1.setText("P1");
		txtNomeP1.setToolTipText("");
		txtNomeP1.setBounds(20, 103, 96, 19);
		pnlSetPlayer.add(txtNomeP1);
		txtNomeP1.setColumns(10);
		
		txtNomeP2 = new JTextField();
		txtNomeP2.setText("P2");
		txtNomeP2.setColumns(10);
		txtNomeP2.setBounds(20, 131, 96, 19);
		pnlSetPlayer.add(txtNomeP2);
		
		txtNomeP3 = new JTextField();
		txtNomeP3.setText("P3");
		txtNomeP3.setColumns(10);
		txtNomeP3.setBounds(20, 160, 96, 19);
		pnlSetPlayer.add(txtNomeP3);
		
		txtNomeP4 = new JTextField();
		txtNomeP4.setText("P4");
		txtNomeP4.setColumns(10);
		txtNomeP4.setBounds(20, 189, 96, 19);
		pnlSetPlayer.add(txtNomeP4);
		
		
		
		
		txtNomeP1.setVisible(false);
		txtNomeP2.setVisible(false);
		txtNomeP3.setVisible(false);
		txtNomeP4.setVisible(false);
		
		
		
		
		
		
	
		
	}
}


