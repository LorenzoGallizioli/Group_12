package Game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

import Images.CustomCellColore;
import Images.Image;
import Images.ImageRenderer;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

/**
 * Definisce l'interfaccia grafica e controlla i componenti del gioco.
 * 
 * @author davidedellanno
 */
public class FrontEnd extends JFrame {

	private JFrame formMyShelfie;
	private JTable tableTavola;
	private JTextField txtNomeP1;
	private JTextField txtNomeP2;
	private JTextField txtNomeP3;
	private JTextField txtNomeP4;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Lancia il programma.
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
	 * Costruttore della classe FrontEnd.
	 */
	public FrontEnd() {
		initialize();
	}

	/**
	 * Inizializza i contenuti della finestra.
	 */
	private void initialize() {
		
		List<Giocatore> giocatori = new ArrayList<Giocatore>();
		
		formMyShelfie = new JFrame();
		formMyShelfie.setTitle("MY SHELFIE");
		formMyShelfie.setBounds(100, 100, 1280, 771);
		formMyShelfie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formMyShelfie.getContentPane().setLayout(null);
		
		// Pannello di sinistra.
		JPanel pnlSetPlayer = new JPanel();
		pnlSetPlayer.setBackground(new Color(255, 255, 255));
		pnlSetPlayer.setBounds(10, 130, 201, 382);
		formMyShelfie.getContentPane().add(pnlSetPlayer);
		
		// Bottone apertura pannello sinistro, dove si sceglie il numero di giocatori.
		JButton btnSelezioneGiocatori = new JButton("Seleziona Giocatori"); // Bottone centrale, avvia una nuova partita.
		btnSelezioneGiocatori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlSetPlayer.setVisible(true);
			}
		});
		btnSelezioneGiocatori.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSelezioneGiocatori.setBounds(10, 67, 191, 52);
		formMyShelfie.getContentPane().add(btnSelezioneGiocatori);
		pnlSetPlayer.setLayout(null);
		
		// Crea checkbox 2 GIOCATORI.
		JCheckBox chckbxGiocatori2 = new JCheckBox("2 giocatori");
		chckbxGiocatori2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGiocatori2.setBounds(3, 5, 113, 27);
		pnlSetPlayer.add(chckbxGiocatori2);
		
		// Crea checkbox 3 GIOCATORI.
		JCheckBox chckbxGiocatori3 = new JCheckBox("3 giocatori");
		chckbxGiocatori3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGiocatori3.setBounds(3, 35, 131, 27);
		pnlSetPlayer.add(chckbxGiocatori3);
		
		// Crea checkbox 4 GIOCATORI.
		JCheckBox chckbxGiocatori4 = new JCheckBox("4 giocatori");
		chckbxGiocatori4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGiocatori4.setBounds(3, 64, 113, 27);
		pnlSetPlayer.add(chckbxGiocatori4);
		
		// Metodi che definiscono i listener delle checkbox.
		chckbxGiocatori2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxGiocatori2.isSelected()) {
		            chckbxGiocatori4.setSelected(false);
		            chckbxGiocatori3.setSelected(false);
		            
		          // Textbox per l'inserimento dei nomi dei giocatori.
					txtNomeP1.setVisible(true);
					txtNomeP2.setVisible(true);
					txtNomeP3.setVisible(false);
					txtNomeP4.setVisible(false);
		        }
		    }
		});
		chckbxGiocatori3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxGiocatori3.isSelected()) {
		            chckbxGiocatori2.setSelected(false);
		            chckbxGiocatori4.setSelected(false);
		            
					txtNomeP1.setVisible(true);
					txtNomeP2.setVisible(true);
					txtNomeP3.setVisible(true);
					txtNomeP4.setVisible(false);
		        }
		    }
		});
		chckbxGiocatori4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (chckbxGiocatori4.isSelected()) {
		            chckbxGiocatori2.setSelected(false);
		            chckbxGiocatori3.setSelected(false);
		            
					txtNomeP1.setVisible(true);
					txtNomeP2.setVisible(true);
					txtNomeP3.setVisible(true);
					txtNomeP4.setVisible(true);
		        }
		    }
		});
		
		// Labels mostranti i nomi dei giocatori.
		JLabel lblNomeP1 = new JLabel("");
		lblNomeP1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeP1.setBounds(254, 602, 110, 27);
		formMyShelfie.getContentPane().add(lblNomeP1);
		
		JLabel lblNomeP2 = new JLabel("");
		lblNomeP2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeP2.setBounds(418, 602, 110, 27);
		formMyShelfie.getContentPane().add(lblNomeP2);
		
		JLabel lblNomeP3 = new JLabel("");
		lblNomeP3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeP3.setBounds(566, 602, 110, 27);
		formMyShelfie.getContentPane().add(lblNomeP3);
		
		JLabel lblNomeP4 = new JLabel("");
		lblNomeP4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeP4.setBounds(756, 602, 110, 27);
		formMyShelfie.getContentPane().add(lblNomeP4);
		
		// Labels punti giocatori.
		JLabel lblPuntiP1 = new JLabel("");
		lblPuntiP1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPuntiP1.setBounds(254, 640, 110, 27);
		formMyShelfie.getContentPane().add(lblPuntiP1);
		
		JLabel lblPuntiP2 = new JLabel("");
		lblPuntiP2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPuntiP2.setBounds(418, 640, 110, 27);
		formMyShelfie.getContentPane().add(lblPuntiP2);
		
		JLabel lblPuntiP3 = new JLabel("");
		lblPuntiP3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPuntiP3.setBounds(566, 640, 110, 27);
		formMyShelfie.getContentPane().add(lblPuntiP3);
		
		JLabel lblPuntiP4 = new JLabel("");
		lblPuntiP4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPuntiP4.setBounds(756, 640, 110, 27);
		formMyShelfie.getContentPane().add(lblPuntiP4);
		
		// Checkbox inizio/fine partita.
		JCheckBox chckbxStartStop = new JCheckBox("Inizia partita");
		chckbxStartStop.setBounds(10, 7, 191, 45);
		formMyShelfie.getContentPane().add(chckbxStartStop);
		chckbxStartStop.setVisible(false);
		
		// Listener della checkbox.
		chckbxStartStop.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if(chckbxStartStop.isSelected() == true && chckbxStartStop.getText() == "Fine partita") {
		        	chckbxStartStop.setText("Inizia partita");
		        	chckbxStartStop.setSelected(false);
		        }
		        else if(chckbxStartStop.isSelected() == true && chckbxStartStop.getText() == "Inizia partita") {
		        	chckbxStartStop.setText("Fine partita");
		        	chckbxStartStop.setSelected(false);
		        }
		    }
		});
		
		// Librerie giocatori.
		table = new JTable(6,5);
		table.setBounds(919, 20, 141, 158);
		formMyShelfie.getContentPane().add(table);
		table.setRowHeight(27);
		table.doLayout();
		
		table_1 = new JTable(6,5);
		table_1.setBounds(919, 191, 141, 158);
		formMyShelfie.getContentPane().add(table_1);
		table_1.setRowHeight(27);
		table_1.doLayout();
		
		table_2 = new JTable(6,5);
		table_2.setBounds(1086, 20, 141, 158);
		formMyShelfie.getContentPane().add(table_2);
		table_2.setRowHeight(27);
		table_2.doLayout();
		
		table_3 = new JTable(6,5);
		table_3.setBounds(1086, 191, 141, 158);
		formMyShelfie.getContentPane().add(table_3);
		table_3.setRowHeight(27);
		table_3.doLayout();

		// Label mostrante il numero di giocatori selezionati.
		JLabel lblMostraPlayerNum = new JLabel("");
		lblMostraPlayerNum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMostraPlayerNum.setBounds(929, 557, 187, 20);
		formMyShelfie.getContentPane().add(lblMostraPlayerNum);
		pnlSetPlayer.setVisible(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(221, 25, 688, 572);
		formMyShelfie.getContentPane().add(scrollPane);
		
		// Tabella che mostra la tavola da gioco.
		JTable tableTavola_1 = new JTable(9,9);
		tableTavola_1.setShowGrid(false);
		scrollPane.setViewportView(tableTavola_1);
		tableTavola_1.setRowHeight(61);
		tableTavola_1.doLayout();
		tableTavola_1.setShowGrid(false);
		
		
		
		Tavola tavola = new Tavola();
		
		// Bottone conferma giocatori.
		JButton btnConfermaSetPlayer = new JButton("Conferma");
		btnConfermaSetPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableCellRenderer obiColora = new CustomCellColore();
				ImageRenderer imageRenderer = new ImageRenderer();
				
				if (chckbxGiocatori4.isSelected() == true) {
					Tavola.numPlayers = 4;
					giocatori.clear(); // Pulisco la lista.
					
					Giocatore g1 = new Giocatore(txtNomeP1.getText(),01,0,true);
					Giocatore g2 = new Giocatore(txtNomeP2.getText(),02,0,false);
					Giocatore g3 = new Giocatore(txtNomeP3.getText(),03,0,false);
					Giocatore g4 = new Giocatore(txtNomeP4.getText(),04,0,false);
					
					giocatori.add(g1);
					giocatori.add(g2);
					giocatori.add(g3);
					giocatori.add(g4);
					
					table.setVisible(true);
					table_1.setVisible(true);
					table_2.setVisible(true);
					table_3.setVisible(true);
					
					for(int i = 0; i<4; i++) {
						JTable tableVar = null;
						
						switch(i) {
							case 0:
								tableVar = table;
								break;
							case 1:
								tableVar = table_1;
								break;
							case 2:
								tableVar = table_2;
								break;
							case 3: 
								tableVar = table_3;
								break;
						}
						
						if(tableVar !=null) {
							for (int row = 0; row < 6; row++) {
							    for (int col = 0; col < 5; col++) {
							        Color cellColor = giocatori.get(i).getObiettivo()[row][col].getColor(); // Prendo il colore di una determinata posizione della matrice.
							        tableVar.setValueAt(cellColor, row, col); // Imposto il colore desiderato alla giusta casella.
							        tableVar.getColumnModel().getColumn(col).setCellRenderer(obiColora); // Applico il colore alla casella utilizzando la classe CustomCellColore.
							        tableVar.getColumnModel().getColumn(col).setCellRenderer(imageRenderer);//cambio da colare alla rispettiva immagine
							    }
							}
						}
						
					}
				}		
					
					
				
				if (chckbxGiocatori3.isSelected() == true) {
					Tavola.numPlayers = 3;
					
					giocatori.clear();// Pulisco la lista.
					
					Giocatore g1 = new Giocatore(txtNomeP1.getText(),01,0,true);
					Giocatore g2 = new Giocatore(txtNomeP2.getText(),02,0,false);
					Giocatore g3 = new Giocatore(txtNomeP3.getText(),03,0,false);
					
					giocatori.add(g1);
					giocatori.add(g2);
					giocatori.add(g3);
					
					table.setVisible(true);
					table_1.setVisible(true);
					table_2.setVisible(true);
					table_3.setVisible(false);
					
					for(int i = 0; i<3; i++) {
						JTable tableVar = null;
						
						switch(i) {
							case 0:
								tableVar = table;
								break;
							case 1:
								tableVar = table_1;
								break;
							case 2:
								tableVar = table_2;
								break;
						}
						if(tableVar !=null) {
							for (int row = 0; row < 6; row++) {
							    for (int col = 0; col < 5; col++) {
							        Color cellColor = giocatori.get(i).getObiettivo()[row][col].getColor(); // Prendo il colore di una determinata posizione della matrice.
							        tableVar.setValueAt(cellColor, row, col); // Imposto il colore desiderato alla giusta casella.
							        tableVar.getColumnModel().getColumn(col).setCellRenderer(obiColora); // Applico il colore alla casella utilizzando la classe CustomCellColore.
							        tableVar.getColumnModel().getColumn(col).setCellRenderer(imageRenderer);//cambio da colare alla rispettiva immagine
							    }
							}
						}
						
					}
				}

				if (chckbxGiocatori2.isSelected() == true) {
					Tavola.numPlayers = 2;

					giocatori.clear(); // Pulisco la lista.

					Giocatore g1 = new Giocatore(txtNomeP1.getText(), 01, 0, true);
					Giocatore g2 = new Giocatore(txtNomeP2.getText(), 02, 0, false);

					giocatori.add(g1);
					giocatori.add(g2);

					table.setVisible(true);
					table_1.setVisible(true);
					table_2.setVisible(false);
					table_3.setVisible(false);

					for (int i = 0; i < 4; i++) {
						JTable tableVar = null;

						switch (i) {
						case 0:
							tableVar = table;
							break;
						case 1:
							tableVar = table_1;
							break;
						}
						if (tableVar != null) {
							for (int row = 0; row < 6; row++) {
								for (int col = 0; col < 5; col++) {
									Color cellColor = giocatori.get(i).getObiettivo()[row][col].getColor(); // Prendo il colore di una determinata posizione della matrice.
									tableVar.setValueAt(cellColor, row, col); // Imposto il colore desiderato alla giusta casella.
									tableVar.getColumnModel().getColumn(col).setCellRenderer(obiColora); // Applico il colore allacasella utilizzando la classe CustomCellColore.
									tableVar.getColumnModel().getColumn(col).setCellRenderer(imageRenderer);//cambio da colare alla rispettiva immagine
								}
							}
						}

					}	
				}
				
					lblNomeP1.setText(giocatori.get(0).getNome());
					lblNomeP2.setText(giocatori.get(1).getNome());				
					lblPuntiP1.setText(""+giocatori.get(0).getPunti());
					lblPuntiP2.setText(""+giocatori.get(1).getPunti());
					
					lblNomeP3.setVisible(false);
					lblNomeP4.setVisible(false);
					lblPuntiP3.setVisible(false);
					lblPuntiP4.setVisible(false);
					
					if (giocatori.size() == 4) {
						lblPuntiP3.setText("" + giocatori.get(2).getPunti());
						lblPuntiP4.setText("" + giocatori.get(3).getPunti());
						lblNomeP3.setText(giocatori.get(2).getNome());
						lblNomeP4.setText(giocatori.get(3).getNome());
						lblNomeP3.setVisible(true);
						lblNomeP4.setVisible(true);
						lblPuntiP3.setVisible(true);
						lblPuntiP4.setVisible(true);
					}
					else if (giocatori.size() == 3){
						lblPuntiP3.setText("" + giocatori.get(2).getPunti());
						lblNomeP3.setText(giocatori.get(2).getNome());
						lblPuntiP3.setVisible(true);
						lblNomeP3.setVisible(true);
					}
					chckbxStartStop.setVisible(true);
					
					
					pnlSetPlayer.setVisible(false);
					lblMostraPlayerNum.setText("Giocatori: " + Tavola.numPlayers);
					tableTavola_1.setVisible(true);
					
					// Inizializzo la matrice tavola da gioco.
					
					TableCellRenderer cellColora = new CustomCellColore();
					Tavola.generaTavola();
					
					// Scansiono tutta la matrice.
					for (int row = 0; row < 9; row++) {
					    for (int col = 0; col < 9; col++) {
					        Color cellColor = tavola.tavolaDaGioco[row][col].getColor(); // Prendo il colore di una determinata posizione della matrice.
					        tableTavola_1.setValueAt(cellColor, row, col); // Imposto il colore desiderato alla giusta casella.
					        tableTavola_1.getColumnModel().getColumn(col).setCellRenderer(cellColora); // Applico il colore alla casella utilizzando la classe CustomCellColore.
					        
					        
					        tableTavola_1.getColumnModel().getColumn(col).setCellRenderer(imageRenderer);//cambio da colare alla rispettiva immagine
					        
					        tableTavola_1.setIntercellSpacing(new Dimension(0, 0));
					    }
					}
				}
			
			
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(919, 370, 178, 176);
		formMyShelfie.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		JLabel lblCellaSelezionata = new JLabel("");
		lblCellaSelezionata.setBounds(34, 50, 115, 115);
		panel.add(lblCellaSelezionata);
		
		JLabel lblTitoloTessera = new JLabel("Tessera selezionata");
		lblTitoloTessera.setBounds(10, 11, 171, 20);
		panel.add(lblTitoloTessera);
		lblTitoloTessera.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
		tableTavola_1.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                // Ottenere l'indice di riga e colonna corrispondente al punto del clic
	            	int row = tableTavola_1.rowAtPoint(e.getPoint());
	                int col = tableTavola_1.columnAtPoint(e.getPoint());


	                if (row != -1 && col != -1) {
	                    // Ottenere il valore della cella selezionata
	                   
	                    System.out.println("Valore della cella selezionata: " + tavola.tavolaDaGioco[row][col].getColor());

	                    // Esempio di utilizzo delle coordinate per ottenere un'immagine
	                    ImageIcon pic = Images.Image.sceltaImmagine(tavola.tavolaDaGioco[row][col].getColor());
	                    lblCellaSelezionata.setText("");
	                    panel.setVisible(true);
	                    ImageIcon picResized = Image.scaleImage(pic, 115, 115);  
	                    lblCellaSelezionata.setIcon(picResized);
	                }
	                
	            }
	        });
		
		btnConfermaSetPlayer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConfermaSetPlayer.setBounds(47, 326, 101, 29);
		pnlSetPlayer.add(btnConfermaSetPlayer);
		
		txtNomeP1 = new JTextField();
		txtNomeP1.setText("P1");
		txtNomeP1.setToolTipText("Giocatore1\n");
		txtNomeP1.setBounds(20, 103, 96, 19);
		pnlSetPlayer.add(txtNomeP1);
		txtNomeP1.setColumns(10);
		
		txtNomeP2 = new JTextField();
		txtNomeP2.setToolTipText("Giocatore2");
		txtNomeP2.setText("P2");
		txtNomeP2.setColumns(10);
		txtNomeP2.setBounds(20, 131, 96, 19);
		pnlSetPlayer.add(txtNomeP2);
		
		txtNomeP3 = new JTextField();
		txtNomeP3.setToolTipText("Giocatore3");
		txtNomeP3.setText("P3");
		txtNomeP3.setColumns(10);
		txtNomeP3.setBounds(20, 160, 96, 19);
		pnlSetPlayer.add(txtNomeP3);
		
		txtNomeP4 = new JTextField();
		txtNomeP4.setToolTipText("Giocatore4");
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
