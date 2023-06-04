package Game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.TransferHandler;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import Images.*;
import ObbiettiviComuni.*;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.DropMode;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

import java.util.Random;
import java.util.stream.IntStream;
import javax.swing.border.BevelBorder;

/**
 * Definisce l'interfaccia grafica e controlla i componenti del gioco.
 * Gestice i turni, punti e giocatori
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

	int turno = 1;
	int player = 0;
	int countTessera=0;
	int row, col; // Coordinate della tessera.
	int row2, col2;
	ObiettivoComune obc1 = null;
	ObiettivoComune obc2 = null;

	private JTable table_4;
	private JTable tableLibreria;
	private JTable tableLibreria_1;
	private JTable tableLibreria_2;
	private JTable tableLibreria_3;
	private JTable tableLibreria_4;
	private JTable table_5;

	/**
	 * Inizializza i contenuti della finestra.
	 */
	private void initialize() {

		List<Giocatore> giocatori = new ArrayList<Giocatore>(); // Inizializza la lista dei giocatori.
		CustomCellColore obiColora = new CustomCellColore();
		ImageRenderer imageRenderer = new ImageRenderer();
		
		// La form principale.
		formMyShelfie = new JFrame();
		formMyShelfie.setTitle("MY SHELFIE");
		formMyShelfie.setBounds(100, 100, 1423, 845);
		formMyShelfie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formMyShelfie.setLocationRelativeTo(null);

		// Crea il pannello personalizzato con l'immagine di sfondo.
		SfondoImage backgroundPanel = new SfondoImage();
		backgroundPanel.setLayout(null);

		// Carica l'immagine di sfondo.
		ImageIcon imageIcon = new ImageIcon("./src/pics/base_pagina.jpg");
		java.awt.Image backgroundImage = imageIcon.getImage();
		backgroundPanel.setBackgroundImage(backgroundImage);        


		// Aggiungi il pannello personalizzato alla finestra.
		formMyShelfie.setContentPane(backgroundPanel);
		formMyShelfie.setVisible(true);

		// Label fine turno.     
		JLabel lblFineTurno = new JLabel("");
		lblFineTurno.setForeground(new Color(255, 255, 255));
		lblFineTurno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFineTurno.setBounds(20, 712, 210, 20);
		backgroundPanel.add(lblFineTurno);

		// Tavola da gioco.
		JTable tableTavola_1 = new JTable(9, 9);
		tableTavola_1.setShowGrid(false);
		tableTavola_1.setRowHeight(61);
		tableTavola_1.setBounds(249, 11, 715, 630);
		formMyShelfie.getContentPane().add(tableTavola_1);
		tableTavola_1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tableTavola_1.setRowHeight(70);
		tableTavola_1.setVisible(false);

		// Pannello destro.
		JPanel pnlDx = new JPanel();
		pnlDx.setBounds(974, 0, 428, 800);
		backgroundPanel.add(pnlDx);
		pnlDx.setLayout(null);
		pnlDx.setOpaque(false);

		// Pannello che mostra la tessera selezionata.
		SfondoImage pnlMostraTessera = new SfondoImage();
		pnlMostraTessera.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlMostraTessera.setBounds(919, 320, 178, 277);
		pnlMostraTessera.setLayout(null);
		pnlMostraTessera.setBackgroundImage(new ImageIcon("./src/pics/parquet.jpg").getImage());

		// Label che contiene l'immagine della cella selezionata.
		JLabel lblCellaSelezionata = new JLabel("");
		lblCellaSelezionata.setBounds(10, 42, 181, 181);
		pnlMostraTessera.add(lblCellaSelezionata);

		// Label che contiene l'immagine della tessera selezionata.
		JLabel lblTesseraLibreria = new JLabel("");
		lblTesseraLibreria.setBounds(10, 272, 75, 75);
		pnlMostraTessera.add(lblTesseraLibreria);

		// Label indicante cosa fare.
		JLabel lblStatoTesseraLibreria = new JLabel("Seleziona una casella della libreria");
		lblStatoTesseraLibreria.setBounds(10, 345, 181, 30);
		pnlMostraTessera.add(lblStatoTesseraLibreria);
		lblStatoTesseraLibreria.setFont(new Font("Tahoma", Font.PLAIN, 12));

		// Bottone "AGGIUNGI ALLA TUA LIBRERIA".
		ImageIcon imgBtnAggTessera = new ImageIcon("./src/pics/btnAggTessera.png");
		JButton btnAggTessera = new JButton("Aggiungi alla tua libreria");
		btnAggTessera.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAggTessera.setBounds(10, 376, 181, 56);
		pnlMostraTessera.add(btnAggTessera);
		btnAggTessera.setEnabled(false);
		btnAggTessera.setIcon(imgBtnAggTessera);

		// Pannello sinistro.
		JPanel pnlSx = new JPanel();
		pnlSx.setBounds(10, 11, 226, 690);
		backgroundPanel.add(pnlSx);
		pnlSx.setLayout(null);
		pnlSx.setOpaque(false);

		// Pannello selezione giocatori.
		SfondoImage pnlSetPlayer = new SfondoImage();
		pnlSetPlayer.setBounds(10, 130, 201, 382);
		pnlSetPlayer.setBackgroundImage(new ImageIcon("./src/pics/parquet.jpg").getImage());

		// Bottone inizia partita.
		ImageIcon imgBtn = new ImageIcon("./src/pics/btnIniziaPartita.png");				
		JButton btnIniziaPartita = new JButton("Inizia Partita");
		btnIniziaPartita.setBounds(10, 11, 201, 47);
		pnlSx.add(btnIniziaPartita);
		btnIniziaPartita.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIniziaPartita.setIcon(imgBtn);

		// Listener del bottone prossimo turno.
		ImageIcon imgBtnProxTurno = new ImageIcon("./src/pics/btnProxTurno.png");
		JButton btnProxTurno = new JButton("Finisci il turno");
		btnProxTurno.setBounds(10, 518, 201, 75);
		pnlSx.add(btnProxTurno);
		btnProxTurno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnProxTurno.setIcon(imgBtnProxTurno);

		// Label che indica cosa fare.
		JLabel lblStatoTessera = new JLabel("");
		lblStatoTessera.setBounds(10, 232, 158, 31);
		pnlMostraTessera.add(lblStatoTessera);

		// Obiettivi personali giocatori.
		table = new JTable(6,5);
		table.setBounds(80, 11, 335, 336);
		pnlDx.add(table);
		table.setShowGrid(false);
		table.setRowHeight(56);
		table.doLayout();
		table.setRowSelectionAllowed(false);
		table.setIntercellSpacing(new Dimension(0, 0));
		
		table_1 = new JTable(6,5);
		table_1.setBounds(80, 11, 335, 336);
		pnlDx.add(table_1);
		table_1.setShowGrid(false);
		table_1.setRowHeight(56);
		table_1.doLayout();
		table_1.setRowSelectionAllowed(false);
		table_1.setIntercellSpacing(new Dimension(0, 0));

		table_2 = new JTable(6,5);
		table_2.setBounds(80, 11, 335, 336);
		pnlDx.add(table_2);
		table_2.setShowGrid(false);
		table_2.setRowHeight(56);
		table_2.doLayout();
		table_2.setRowSelectionAllowed(false);
		table_2.setIntercellSpacing(new Dimension(0, 0));

		table_3 = new JTable(6,5);
		table_3.setBounds(80, 11, 335, 336);
		pnlDx.add(table_3);
		table_3.setShowGrid(false);
		table_3.setRowHeight(56);
		table_3.doLayout();
		table_3.setRowSelectionAllowed(false);
		table_3.setIntercellSpacing(new Dimension(0, 0));

		// Librerie giocatori.
		tableLibreria_1 = new JTable(6,5);
		tableLibreria_1.setBounds(20, 378, 396, 396);
		pnlDx.add(tableLibreria_1);
		tableLibreria_1.setShowGrid(false);
		tableLibreria_1.setRowHeight(66);
		tableLibreria_1.setIntercellSpacing(new Dimension(0, 0));

		tableLibreria_2 = new JTable(6,5);
		tableLibreria_2.setBounds(20, 378, 396, 396);
		pnlDx.add(tableLibreria_2);
		tableLibreria_2.setShowGrid(false);
		tableLibreria_2.setRowHeight(66);
		tableLibreria_1.setIntercellSpacing(new Dimension(0, 0));

		tableLibreria_3 = new JTable(6,5);
		tableLibreria_3.setBounds(20, 378, 396, 396);
		pnlDx.add(tableLibreria_3);
		tableLibreria_3.setShowGrid(false);
		tableLibreria_3.setRowHeight(66);
		tableLibreria_1.setIntercellSpacing(new Dimension(0, 0));

		tableLibreria_4 = new JTable(6,5);
		tableLibreria_4.setBounds(20, 378, 396, 396);
		pnlDx.add(tableLibreria_4);
		tableLibreria_4.setShowGrid(false);
		tableLibreria_4.setRowHeight(66);
		tableLibreria_1.setIntercellSpacing(new Dimension(0, 0));
		
		// Pannello contenente i punteggi.
		JPanel pnlPunteggi = new JPanel();
		pnlPunteggi.setBounds(249, 652, 268, 80);
		backgroundPanel.add(pnlPunteggi);
		pnlPunteggi.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlPunteggi.setLayout(null);
		pnlPunteggi.setVisible(false);
		pnlPunteggi.setOpaque(false);
		
		// Labels mostranti i nomi dei giocatori.
		JLabel lblNomeP1 = new JLabel("");
		lblNomeP1.setForeground(new Color(255, 255, 255));
		lblNomeP1.setBounds(16, 11, 53, 27);
		pnlPunteggi.add(lblNomeP1);
		lblNomeP1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeP1.setOpaque(false);

		// Labels punti giocatori.
		JLabel lblPuntiP1 = new JLabel("");
		lblPuntiP1.setForeground(new Color(255, 255, 255));
		lblPuntiP1.setBounds(16, 49, 53, 27);
		pnlPunteggi.add(lblPuntiP1);
		lblPuntiP1.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblNomeP2 = new JLabel("");
		lblNomeP2.setForeground(new Color(255, 255, 255));
		lblNomeP2.setBounds(79, 11, 53, 27);
		pnlPunteggi.add(lblNomeP2);
		lblNomeP2.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblPuntiP2 = new JLabel("");
		lblPuntiP2.setForeground(new Color(255, 255, 255));
		lblPuntiP2.setBounds(79, 49, 53, 27);
		pnlPunteggi.add(lblPuntiP2);
		lblPuntiP2.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblNomeP3 = new JLabel("");
		lblNomeP3.setForeground(new Color(255, 255, 255));
		lblNomeP3.setBounds(142, 11, 53, 27);
		pnlPunteggi.add(lblNomeP3);
		lblNomeP3.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblPuntiP3 = new JLabel("");
		lblPuntiP3.setForeground(new Color(255, 255, 255));
		lblPuntiP3.setBounds(142, 49, 53, 27);
		pnlPunteggi.add(lblPuntiP3);
		lblPuntiP3.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblNomeP4 = new JLabel("");
		lblNomeP4.setForeground(new Color(255, 255, 255));
		lblNomeP4.setBounds(205, 11, 53, 27);
		pnlPunteggi.add(lblNomeP4);
		lblNomeP4.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblPuntiP4 = new JLabel("");
		lblPuntiP4.setForeground(new Color(255, 255, 255));
		lblPuntiP4.setBounds(205, 49, 53, 27);
		pnlPunteggi.add(lblPuntiP4);
		lblPuntiP4.setFont(new Font("Tahoma", Font.PLAIN, 16));

		// Label indicante il turno e il giocatore corrente.
		JTextArea lblTurnoPlayer = new JTextArea();
		lblTurnoPlayer.setForeground(new Color(255, 255, 255));
		lblTurnoPlayer.setBounds(20, 352, 396, 26);
		pnlDx.add(lblTurnoPlayer);
		lblTurnoPlayer.setText("");
		lblTurnoPlayer.setLineWrap(true);
		lblTurnoPlayer.setWrapStyleWord(true);
		lblTurnoPlayer.setEditable(false);
		lblTurnoPlayer.setOpaque(false);
		lblTurnoPlayer.setBorder(null);
		
		tableLibreria_4.setVisible(false);

		// Gestione board.
		tableTavola_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// Ottenere l'indice di riga e colonna corrispondente al punto del clic.
				row = tableTavola_1.rowAtPoint(e.getPoint());
				col = tableTavola_1.columnAtPoint(e.getPoint());

				if (row != -1 && col != -1) {	              
					ImageIcon pic = Images.Image.sceltaImmagine(Tavola.tavolaDaGioco[row][col].getColor());
					lblCellaSelezionata.setText("");
					pnlMostraTessera.setVisible(true);
					ImageIcon picResized = Image.scaleImage(pic, 200, 200);  
					lblCellaSelezionata.setIcon(picResized);
					if(Tavola.tavolaDaGioco[row][col].getDisponibile()==true) {
						lblStatoTessera.setText("Può essere raccolta");    	
					}
					else {
						lblStatoTessera.setText("Non può essere raccolta");
					}
					if (Tavola.tavolaDaGioco[row][col].getDisponibile()==true && countTessera<3 && giocatori.get(0).getLibreria()[row2][col2].getDisponibile()==true) {
						btnAggTessera.setEnabled(true);
					}
					if(countTessera==3) {
						lblFineTurno.setText("HAI FINITO IL TUO TURNO!");
					}
				}
			}
		});

		// Gestione libreria player 4.
		tableLibreria_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				row2 = tableLibreria_4.rowAtPoint(e.getPoint());
				col2 = tableLibreria_4.columnAtPoint(e.getPoint());

				if (row2 != -1 && col2 != -1) {
					ImageIcon pic = Images.Image.sceltaImmagine(giocatori.get(3).getLibreria()[row2][col2].getColor());
					lblCellaSelezionata.setText("");
					pnlMostraTessera.setVisible(true);		                                 
					if(giocatori.get(3).getLibreria()[row2][col2].getDisponibile()==true) {
						lblStatoTesseraLibreria.setText("Può essere impostata qui");    	
					}
					else {
						lblStatoTesseraLibreria.setText("Non può essere impostata qui");
						Image.scurisciImage(pic);
					}
					ImageIcon picResized = Image.scaleImage(pic, 70, 70);  
					lblTesseraLibreria.setIcon(picResized);
					if (Tavola.tavolaDaGioco[row][col].getDisponibile()==true && countTessera<3 && giocatori.get(3).getLibreria()[row2][col2].getDisponibile()==true) {
						btnAggTessera.setEnabled(true);
					}
				}      	
			}
		});		
		tableLibreria_3.setVisible(false);

		// Gestione libreria player 3.
		tableLibreria_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				row2 = tableLibreria_3.rowAtPoint(e.getPoint());
				col2 = tableLibreria_3.columnAtPoint(e.getPoint());

				if (row2 != -1 && col2 != -1) {
					// Ottenere il valore della cella selezionata.            
					System.out.println("Valore della cella libreria del player: "+ player + "selezionata: " + giocatori.get(2).getLibreria()[row2][col2].getColor());

					// Esempio di utilizzo delle coordinate per ottenere un'immagine.
					ImageIcon pic = Images.Image.sceltaImmagine(giocatori.get(2).getLibreria()[row2][col2].getColor());
					lblCellaSelezionata.setText("");
					pnlMostraTessera.setVisible(true);

					if(giocatori.get(2).getLibreria()[row2][col2].getDisponibile()==true) {
						lblStatoTesseraLibreria.setText("Può essere impostata qui");    	
					}	         
					else {
						lblStatoTesseraLibreria.setText("Non può essere impostata qui");
						Image.scurisciImage(pic);
					}
					ImageIcon picResized = Image.scaleImage(pic, 70, 70);  
					lblTesseraLibreria.setIcon(picResized); 

					if (Tavola.tavolaDaGioco[row][col].getDisponibile()==true && countTessera<3 && giocatori.get(2).getLibreria()[row2][col2].getDisponibile()==true) {
						btnAggTessera.setEnabled(true);
					}
				}
			}
		});
		tableLibreria_2.setVisible(false);

		// Gestione libreria player 2.
		tableLibreria_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				row2 = tableLibreria_2.rowAtPoint(e.getPoint());
				col2 = tableLibreria_2.columnAtPoint(e.getPoint());

				if (row2 != -1 && col2 != -1) {
					// Ottenere il valore della cella selezionata.
					System.out.println("Valore della cella libreria del player: "+ player + "selezionata: " + giocatori.get(1).getLibreria()[row2][col2].getColor());

					// Esempio di utilizzo delle coordinate per ottenere un'immagine.
					ImageIcon pic = Images.Image.sceltaImmagine(giocatori.get(1).getLibreria()[row2][col2].getColor());
					lblCellaSelezionata.setText("");
					pnlMostraTessera.setVisible(true);



					if(giocatori.get(1).getLibreria()[row2][col2].getDisponibile()==true) {
						lblStatoTesseraLibreria.setText("Può essere impostata qui");    	
					}
					else {
						lblStatoTesseraLibreria.setText("Non può essere impostata qui");
						Image.scurisciImage(pic);
					}
					ImageIcon picResized = Image.scaleImage(pic, 70, 70);  
					lblTesseraLibreria.setIcon(picResized);

					if (Tavola.tavolaDaGioco[row][col].getDisponibile()==true && countTessera<3 && giocatori.get(1).getLibreria()[row2][col2].getDisponibile()==true) {
						btnAggTessera.setEnabled(true);
					}
				}
			}
		});
		tableLibreria_1.setVisible(false);

		// Gestione libreria player 1.
		tableLibreria_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				row2 = tableLibreria_1.rowAtPoint(e.getPoint());
				col2 = tableLibreria_1.columnAtPoint(e.getPoint());

				if (row2 != -1 && col2 != -1) {
					ImageIcon pic = Images.Image.sceltaImmagine(giocatori.get(0).getLibreria()[row2][col2].getColor());
					lblCellaSelezionata.setText("");
					pnlMostraTessera.setVisible(true);
					if(giocatori.get(0).getLibreria()[row2][col2].getDisponibile()==true) {
						lblStatoTesseraLibreria.setText("Può essere impostata qui");    	
					}
					else {
						lblStatoTesseraLibreria.setText("Non può essere impostata qui");
						Image.scurisciImage(pic);
					}
					ImageIcon picResized = Image.scaleImage(pic, 70, 70);  
					lblTesseraLibreria.setIcon(picResized);
					if (Tavola.tavolaDaGioco[row][col].getDisponibile()==true && countTessera<3 && giocatori.get(0).getLibreria()[row2][col2].getDisponibile()==true) {
						btnAggTessera.setEnabled(true);
					}
				}
			}
		});
		table_3.setVisible(false);
		table_2.setVisible(false);
		table_1.setVisible(false);
		table.setVisible(false);

		// Renderer immagini obiettivi personali.
		ImageRendererLibOb imageRendObi = new ImageRendererLibOb();

		int[][] coppieValori = new int[3][2];

		// Label "tessera selezionata".
		JLabel lblTitoloTessera = new JLabel("Tessera selezionata");
		lblTitoloTessera.setBounds(10, 11, 158, 20);
		pnlMostraTessera.add(lblTitoloTessera);
		lblTitoloTessera.setFont(new Font("Tahoma", Font.PLAIN, 18));

		// Label contenente l'immagine del primo obiettivo comune.
		JLabel lblObiCom1 = new JLabel("");
		lblObiCom1.setBounds(568, 652, 190, 121);
		backgroundPanel.add(lblObiCom1);

		// Label contenente l'immagine del secondo obiettivo comune.
		JLabel lblObiCom2 = new JLabel("");
		lblObiCom2.setBounds(774, 652, 190, 119);
		backgroundPanel.add(lblObiCom2);

		// Pannello di sinistra che contiene mostra tessera e selezione giocatori.
		CardLayout cardLayout = new CardLayout();
		JPanel pnlMainSx = new JPanel(cardLayout);
		pnlMainSx.setBounds(10, 69, 201, 443);
		pnlSx.add(pnlMainSx);
		pnlMainSx.add(pnlSetPlayer, "pnlSetPlayer");
		pnlMainSx.add(pnlMostraTessera, "pnlMostraTessera");
		pnlMainSx.setVisible(false);

		// Crea checkbox 2 GIOCATORI.
		JCheckBox chckbxGiocatori2 = new JCheckBox("2 GIOCATORI");
		chckbxGiocatori2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGiocatori2.setBounds(20, 7, 148, 27);
		pnlSetPlayer.add(chckbxGiocatori2);
		chckbxGiocatori2.setOpaque(false);

		// Crea checkbox 3 GIOCATORI.
		JCheckBox chckbxGiocatori3 = new JCheckBox("3 GIOCATORI");
		chckbxGiocatori3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGiocatori3.setBounds(20, 37, 131, 27);
		pnlSetPlayer.add(chckbxGiocatori3);
		chckbxGiocatori3.setOpaque(false);

		// Crea checkbox 4 GIOCATORI.
		JCheckBox chckbxGiocatori4 = new JCheckBox("4 GIOCATORI");
		chckbxGiocatori4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGiocatori4.setBounds(20, 66, 131, 27);
		pnlSetPlayer.add(chckbxGiocatori4);
		chckbxGiocatori4.setOpaque(false);

		// Metodi che definiscono i listener delle checkbox.
		chckbxGiocatori2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tavola.numPlayers = 2;
				if (chckbxGiocatori2.isSelected()) {
					chckbxGiocatori4.setSelected(false);
					chckbxGiocatori3.setSelected(false);
					// Textbox per l'inserimento dei nomi dei giocatori.
					txtNomeP1.setVisible(true);
					txtNomeP2.setVisible(true);
					txtNomeP3.setVisible(false);
					txtNomeP4.setVisible(false);
					Tavola.generaTavola(); // Genero la tavola da gioco.
					Tavola.aggiornaTavola(tableTavola_1, obiColora, imageRenderer); // Mostro a schermo la tavola da gioco.
					tableTavola_1.setVisible(true);
				}
			}
		});
		chckbxGiocatori3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tavola.numPlayers = 3;
				if (chckbxGiocatori3.isSelected()) {
					chckbxGiocatori2.setSelected(false);
					chckbxGiocatori4.setSelected(false);
					txtNomeP1.setVisible(true);
					txtNomeP2.setVisible(true);
					txtNomeP3.setVisible(true);
					txtNomeP4.setVisible(false);
					Tavola.generaTavola();// Genero la tavola da gioco.
					Tavola.aggiornaTavola(tableTavola_1, obiColora, imageRenderer);// Mostro a schermo la tavola da gioco.
					tableTavola_1.setVisible(true);
				}
			}
		});
		chckbxGiocatori4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tavola.numPlayers = 4;
				if (chckbxGiocatori4.isSelected()) {
					chckbxGiocatori2.setSelected(false);
					chckbxGiocatori3.setSelected(false);
					txtNomeP1.setVisible(true);
					txtNomeP2.setVisible(true);
					txtNomeP3.setVisible(true);
					txtNomeP4.setVisible(true);
					Tavola.generaTavola();// Genero la tavola da gioco.
					Tavola.aggiornaTavola(tableTavola_1, obiColora, imageRenderer);// Mostro a schermo la tavola da gioco.
					tableTavola_1.setVisible(true);
				}
			}
		});
		pnlSetPlayer.setVisible(false);
		pnlSetPlayer.setLayout(null);

		// Bottone conferma giocatori.
		ImageIcon imgBtnConferma = new ImageIcon("./src/pics/btnConferma.png");
		JButton btnConfermaSetPlayer = new JButton("Conferma");
		btnConfermaSetPlayer.setIcon(imgBtnConferma);
		
		// Listener bottone "CONFERMA GIOCATORI".
		btnConfermaSetPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Genero 2 obiettivi comuni.
				obc1 = generaObiettivoCollettivo();
				do {
					obc2 = generaObiettivoCollettivo();
				} while(obc1.getClass().equals(obc2.getClass()));	// Provo a generare un secondo obiettivo comune finché non sono diversi.

				// Ricavo le immagini degli obiettivi estratti.
				ImageIcon imgObc1 = obc1.getImage();
				ImageIcon imgObc2 = obc2.getImage();

				// Mostro le immagini degli obiettivi.
				lblObiCom1.setIcon(Image.scaleImage(imgObc1, 190, 121));
				lblObiCom2.setIcon(Image.scaleImage(imgObc2, 190, 121));

				// Mostro le tabelle obiettivi, librerie e punteggi.
				table.setVisible(true);
				table_1.setVisible(true);
				table_2.setVisible(true);
				table_3.setVisible(true);

				tableLibreria_1.setVisible(true);
				tableLibreria_2.setVisible(true);
				tableLibreria_3.setVisible(true);
				tableLibreria_4.setVisible(true);

				pnlPunteggi.setVisible(true);
				
				// 4 GIOCATORI.
				if (chckbxGiocatori4.isSelected() == true) {	
					giocatori.clear();

					// Inserisco i giocatori nella lista.
					Giocatore g1 = new Giocatore(txtNomeP1.getText(),01,0,true);
					Giocatore g2 = new Giocatore(txtNomeP2.getText(),02,0,false);
					Giocatore g3 = new Giocatore(txtNomeP3.getText(),03,0,false);
					Giocatore g4 = new Giocatore(txtNomeP4.getText(),04,0,false);

					giocatori.add(g1);
					giocatori.add(g2);
					giocatori.add(g3);
					giocatori.add(g4);

					// Tabelle obiettivi personali.
					table.setVisible(false);
					table_1.setVisible(false);
					table_2.setVisible(false);
					table_3.setVisible(false);

					// Librerie.
					tableLibreria_1.setVisible(false);
					tableLibreria_2.setVisible(false);
					tableLibreria_3.setVisible(false);
					tableLibreria_4.setVisible(false);

					// Generazione degli obiettivi personali per ogni player (in questo caso 4).
					for(int i = 0; i<4; i++) {
						JTable tableVarObiettivo = null;
						JTable tableVarLibreria = null;
						imageRendObi.setGiocatori(giocatori.get(i));
						switch(i) {
						case 0:
							tableVarObiettivo = table;
							tableVarLibreria = tableLibreria_1;
							break;
						case 1:
							tableVarObiettivo = table_1;
							tableVarLibreria = tableLibreria_2;
							break;
						case 2:
							tableVarObiettivo = table_2;
							tableVarLibreria = tableLibreria_3;
							break;
						case 3: 
							tableVarObiettivo = table_3;
							tableVarLibreria = tableLibreria_4;
							break;
						}

						if(tableVarObiettivo !=null) {
							for (int row = 0; row < 6; row++) {
								for (int col = 0; col < 5; col++) {
									Color cellColor = giocatori.get(i).getObiettivo()[row][col].getColor(); // Prendo il colore di una determinata posizione della matrice.
									tableVarObiettivo.setValueAt(cellColor, row, col); // Imposto il colore desiderato alla giusta casella.
									tableVarObiettivo.getColumnModel().getColumn(col).setCellRenderer(obiColora); // Applico il colore alla casella utilizzando la classe CustomCellColore.


									tableVarObiettivo.getColumnModel().getColumn(col).setCellRenderer(imageRendObi); // Sostituisco il colore con la rispettiva immagine.
								}
							}
						}
						if(tableVarLibreria !=null) {
							for(int row = 0; row<6;row++) {
								for(int col = 0; col<5;col++) {
									Color cellColor2 = giocatori.get(i).getLibreria()[row][col].getColor();
									tableVarLibreria.setValueAt(cellColor2, row, col);
									tableVarLibreria.getColumnModel().getColumn(col).setCellRenderer(obiColora);
									imageRendObi.setGiocatori(giocatori.get(i));
									tableVarLibreria.getColumnModel().getColumn(col).setCellRenderer(imageRendObi);
								}
							}
						}
					}		
				}		

				// 3 GIOCATORI.
				if (chckbxGiocatori3.isSelected() == true) {
					giocatori.clear();

					Giocatore g1 = new Giocatore(txtNomeP1.getText(),01,0,true);
					Giocatore g2 = new Giocatore(txtNomeP2.getText(),02,0,false);
					Giocatore g3 = new Giocatore(txtNomeP3.getText(),03,0,false);

					giocatori.add(g1);
					giocatori.add(g2);
					giocatori.add(g3);

					table.setVisible(false);
					table_1.setVisible(false);
					table_2.setVisible(false);
					table_3.setVisible(false);

					for (int i = 0; i<3; i++) {
						JTable tableVarObiettivo = null;
						JTable tableVarLibreria = null;
						switch(i) {
						case 0:
							tableVarObiettivo = table;
							tableVarLibreria = tableLibreria_1;
							break;
						case 1:
							tableVarObiettivo = table_1;
							tableVarLibreria = tableLibreria_2;
							break;
						case 2:
							tableVarObiettivo = table_2;
							tableVarLibreria = tableLibreria_3;
							break;
						}
						imageRendObi.setGiocatori(giocatori.get(i));
						if (tableVarLibreria !=null) {
							for (int row = 0; row < 6; row++) {
								for (int col = 0; col < 5; col++) {
									Color cellColor = giocatori.get(i).getObiettivo()[row][col].getColor();
									tableVarObiettivo.setValueAt(cellColor, row, col); 
									tableVarObiettivo.getColumnModel().getColumn(col).setCellRenderer(obiColora); 
									tableVarObiettivo.getColumnModel().getColumn(col).setCellRenderer(imageRendObi);
								}
							}
						}
						if (tableVarLibreria !=null) {
							for(int row = 0; row<6;row++) {
								for(int col = 0; col<5;col++) {
									Color cellColor2 = giocatori.get(i).getLibreria()[row][col].getColor();
									tableVarLibreria.setValueAt(cellColor2, row, col);
									tableVarLibreria.getColumnModel().getColumn(col).setCellRenderer(obiColora); // Applico il colore alla casella utilizzando la classe CustomCellColore.


									tableVarLibreria.getColumnModel().getColumn(col).setCellRenderer(imageRendObi);//cambio da colare alla rispettiva immagine
								}
							}
						}
					}
				}

				// 2 GIOCATORI.
				if (chckbxGiocatori2.isSelected() == true) {					
					giocatori.clear();

					Giocatore g1 = new Giocatore(txtNomeP1.getText(), 01, 0, true);
					Giocatore g2 = new Giocatore(txtNomeP2.getText(), 02, 0, false);

					giocatori.add(g1);
					giocatori.add(g2);

					table.setVisible(false);
					table_1.setVisible(false);
					table_2.setVisible(false);
					table_3.setVisible(false);

					for (int i = 0; i < 2; i++) {
						JTable tableVarObiettivo = null;
						JTable tableVarLibreria = null;

						switch (i) {
						case 0:
							tableVarObiettivo = table;
							tableVarLibreria = tableLibreria_1;
							break;
						case 1:
							tableVarObiettivo = table_1;
							tableVarLibreria = tableLibreria_2;
							break;
						}
						imageRendObi.setGiocatori(giocatori.get(i));
						if (tableVarLibreria != null) {
							for (int row = 0; row < 6; row++) {
								for (int col = 0; col < 5; col++) {
									Color cellColor = giocatori.get(i).getObiettivo()[row][col].getColor(); // Prendo il colore di una determinata posizione della matrice.
									tableVarObiettivo.setValueAt(cellColor, row, col); // Imposto il colore desiderato alla giusta casella.
									tableVarObiettivo.getColumnModel().getColumn(col).setCellRenderer(obiColora); // Applico il colore allacasella utilizzando la classe CustomCellColore.


									tableVarObiettivo.getColumnModel().getColumn(col).setCellRenderer(imageRendObi);//cambio da colare alla rispettiva immagine
								}
							}
						}
						if (tableVarLibreria !=null) {
							for (int row = 0; row<6;row++) {
								for (int col = 0; col<5;col++) {
									Color cellColor2 = giocatori.get(i).getLibreria()[row][col].getColor();
									tableVarLibreria.setValueAt(cellColor2, row, col);
									tableVarLibreria.getColumnModel().getColumn(col).setCellRenderer(obiColora); // Applico il colore alla casella utilizzando la classe CustomCellColore.


									tableVarLibreria.getColumnModel().getColumn(col).setCellRenderer(imageRendObi);//cambio da colare alla rispettiva immagine
								}
							}
						}

					}	
				}

				btnIniziaPartita.setVisible(true);
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

				pnlSetPlayer.setVisible(false);
				tableTavola_1.setVisible(true);				

				cardLayout.show(pnlMainSx, "pnlMostraTessera");

				player = 0;
				turno = 1;

				// Mostro l'obiettivo personale del primo player.
				table.setVisible(true);
				table_1.setVisible(false);
				table_2.setVisible(false);
				table_3.setVisible(false);

				// Mostro la libreria del primo player.
				tableLibreria_1.setVisible(true);
				tableLibreria_2.setVisible(false);
				tableLibreria_3.setVisible(false);
				tableLibreria_4.setVisible(false);

				// Label che mostra il turno e il giocatore corrente.
				lblTurnoPlayer.setText("Turno nr." + turno + " di: " + giocatori.get(player).getNome());
				btnProxTurno.setVisible(true);
				lblTurnoPlayer.setVisible(true);	
			}
		});

		// Listener bottone "aggiungi alla tua libreria".
		btnAggTessera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Tavola.tavolaDaGioco[row][col].getDisponibile()==true && countTessera<3 && giocatori.get(player).getLibreria()[row2][col2].getDisponibile()==true) {
					Tavola.tavolaDaGioco[row][col].setDisponibile(false);
					giocatori.get(player).getLibreria()[row2][col2] = Tavola.tavolaDaGioco[row][col];

					if(row2-1>=0) {
						giocatori.get(player).getLibreria()[row2-1][col2].setDisponibile(true);
					}

					Tavola.tavolaDaGioco[row][col] = new Tessera(Color.black, false);
					Tavola.aggiornaTavola(tableTavola_1, obiColora, imageRenderer); // Aggiorno la tavola ogni volta che prelevo una tessera.

					coppieValori[countTessera][0] = row; // Salvataggio del valore di row nella posizione corretta del vettore.
					coppieValori[countTessera][1] = col; // Salvataggio del valore di col nella posizione corretta del vettore.

					ImageIcon pic = Images.Image.sceltaImmagine(Tavola.tavolaDaGioco[row][col].getColor());
					ImageIcon picResized = Image.scaleImage(pic, 200, 200);  
					lblCellaSelezionata.setIcon(picResized);

					giocatori.get(0).aggiornaLibreria(tableLibreria_1, obiColora, imageRendObi,giocatori.get(0));					
					giocatori.get(1).aggiornaLibreria(tableLibreria_2, obiColora, imageRendObi,giocatori.get(1));
					if(player>1) {
						giocatori.get(2).aggiornaLibreria(tableLibreria_3, obiColora, imageRendObi,giocatori.get(2));
					}
					if(player>2) {
						giocatori.get(3).aggiornaLibreria(tableLibreria_4, obiColora, imageRendObi,giocatori.get(3));
					}
					countTessera++;
				}

				else {				
					System.out.println("Tessera non raccoglibile o hai finito il nr. di tessere per il turno");
				}
				btnAggTessera.setEnabled(false);
			}
		});

		btnConfermaSetPlayer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConfermaSetPlayer.setBounds(10, 384, 181, 48);
		pnlSetPlayer.add(btnConfermaSetPlayer);

		txtNomeP1 = new JTextField();
		txtNomeP1.setText("P1");
		txtNomeP1.setToolTipText("Giocatore1\n");
		txtNomeP1.setBounds(20, 129, 96, 19);
		pnlSetPlayer.add(txtNomeP1);
		txtNomeP1.setColumns(10);
		txtNomeP1.setOpaque(false);
		txtNomeP1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		txtNomeP2 = new JTextField();
		txtNomeP2.setToolTipText("Giocatore2");
		txtNomeP2.setText("P2");
		txtNomeP2.setColumns(10);
		txtNomeP2.setBounds(20, 157, 96, 19);
		pnlSetPlayer.add(txtNomeP2);
		txtNomeP2.setOpaque(false);
		txtNomeP2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		txtNomeP3 = new JTextField();
		txtNomeP3.setToolTipText("Giocatore3");
		txtNomeP3.setText("P3");
		txtNomeP3.setColumns(10);
		txtNomeP3.setBounds(20, 186, 96, 19);
		pnlSetPlayer.add(txtNomeP3);
		txtNomeP3.setOpaque(false);
		txtNomeP3.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		txtNomeP4 = new JTextField();
		txtNomeP4.setToolTipText("Giocatore4");
		txtNomeP4.setText("P4");
		txtNomeP4.setColumns(10);
		txtNomeP4.setBounds(20, 215, 96, 19);
		pnlSetPlayer.add(txtNomeP4);
		txtNomeP4.setOpaque(false);
		txtNomeP4.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		// Bottone fine partita.
		ImageIcon imageBtnFinePartita = new ImageIcon("./src/pics/btnFinePartita.png");
		JButton btnFinePartita = new JButton("Fine partita");	
		btnFinePartita.setBounds(10, 604, 201, 75);
		pnlSx.add(btnFinePartita);
		btnFinePartita.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFinePartita.setIcon(imageBtnFinePartita);
		btnFinePartita.setVisible(false);

		// Listener bottone fine partita.
		btnFinePartita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Controllo il completamento degli obiettivi comuni.
				for(int i = 0;i<giocatori.size();i++) {
					if(obc1.check(giocatori.get(i).getLibreria())==true) {
						giocatori.get(i).addPunti(10);
						System.out.println("Obiettivo 1 Completato");
					}
					if(obc2.check(giocatori.get(i).getLibreria())==true) {
						giocatori.get(i).addPunti(5);
						System.out.println("Obiettivo 2 completato");
					}											
				}
				
				// Mostro a schermo il punteggio.
				lblPuntiP1.setText(""+(giocatori.get(0).getPunti()+giocatori.get(0).punteggioObiettivoPersonale()));
				lblPuntiP2.setText(""+(giocatori.get(1).getPunti()+giocatori.get(1).punteggioObiettivoPersonale()));
				if(giocatori.size()>2) {
					lblPuntiP3.setText(""+(giocatori.get(2).getPunti()+giocatori.get(2).punteggioObiettivoPersonale()));
				}
				if(giocatori.size()>3) {
					lblPuntiP4.setText(""+(giocatori.get(3).getPunti()+giocatori.get(3).punteggioObiettivoPersonale()));
				}
			}
		});	
		btnProxTurno.setVisible(false);

		// Listener bottone "prossimo turno".
		btnProxTurno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblFineTurno.setText("");

				// Controllo se tutti i giocatori hanno giocato il turno.
				if(player<giocatori.size()-1) {
					// Se non è stato completato il giro, incremento player, così da passare al prossimo giocatore.
					player++;
				}
				// Se tutti i giocatori hanno svolto il loro turno.
				else if(player>=giocatori.size()-1) {
					// Se tutti i player hanno giocato il turno, resetto il counter player e incremento il turno di 1.
					turno++;
					player=0;
				}
				lblTurnoPlayer.setText("Turno nr." + turno + " di: "+giocatori.get(player).getNome());// Label che mostra a chi tocca giocare.

				// Switch per mostrare la tabella dell'obiettivo personale del player corrente.
				switch(player) {
				case 0:
					table.setVisible(true);
					table_1.setVisible(false);
					table_2.setVisible(false);
					table_3.setVisible(false);

					tableLibreria_1.setVisible(true);
					tableLibreria_2.setVisible(false);
					tableLibreria_3.setVisible(false);
					tableLibreria_4.setVisible(false);
					break;
				case 1:
					table.setVisible(false);
					table_1.setVisible(true);
					table_2.setVisible(false);
					table_3.setVisible(false);

					tableLibreria_1.setVisible(false);
					tableLibreria_2.setVisible(true);
					tableLibreria_3.setVisible(false);
					tableLibreria_4.setVisible(false);
					break;
				case 2:
					table.setVisible(false);
					table_1.setVisible(false);
					table_2.setVisible(true);
					table_3.setVisible(false);

					tableLibreria_1.setVisible(false);
					tableLibreria_2.setVisible(false);
					tableLibreria_3.setVisible(true);
					tableLibreria_4.setVisible(false);
					break;
				case 3: 
					table.setVisible(false);
					table_1.setVisible(false);
					table_2.setVisible(false);
					table_3.setVisible(true);

					tableLibreria_1.setVisible(false);
					tableLibreria_2.setVisible(false);
					tableLibreria_3.setVisible(false);
					tableLibreria_4.setVisible(true);
					break;
				}


				for(int i = 0; i<countTessera; i++) {
					row = coppieValori[i][0];
					col = coppieValori[i][1];

					if (row > 0 && Tavola.tavolaDaGioco[row - 1][col].getColor() != Color.BLACK) {
						Tavola.tavolaDaGioco[row - 1][col].setDisponibile(true);
					}
					if (row < Tavola.tavolaDaGioco.length - 1 && Tavola.tavolaDaGioco[row + 1][col].getColor() != Color.BLACK) {
						Tavola.tavolaDaGioco[row + 1][col].setDisponibile(true);
					}
					if (col > 0 && Tavola.tavolaDaGioco[row][col - 1].getColor() != Color.BLACK) {
						Tavola.tavolaDaGioco[row][col - 1].setDisponibile(true);
					}
					if (col < Tavola.tavolaDaGioco[0].length - 1 && Tavola.tavolaDaGioco[row][col + 1].getColor() != Color.BLACK) {
						Tavola.tavolaDaGioco[row][col + 1].setDisponibile(true);
					}
				}
				countTessera = 0;

				giocatori.get(0).aggiornaLibreria(tableLibreria_1, obiColora, imageRendObi,giocatori.get(0));					
				giocatori.get(1).aggiornaLibreria(tableLibreria_2, obiColora, imageRendObi,giocatori.get(1));
				if(player>1) {
					giocatori.get(2).aggiornaLibreria(tableLibreria_3, obiColora, imageRendObi,giocatori.get(2));
				}
				if(player>2) {
					giocatori.get(3).aggiornaLibreria(tableLibreria_4, obiColora, imageRendObi,giocatori.get(3));
				}
			}

		});
		
		btnIniziaPartita.setVisible(true);
		
		// Listener bottone "Inizia partita".
		btnIniziaPartita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlMainSx.setVisible(true);
				cardLayout.show(pnlMainSx, "pnlSetPlayer");

				btnIniziaPartita.setVisible(true);
				btnProxTurno.setVisible(false);
				lblTurnoPlayer.setVisible(false);
				btnFinePartita.setVisible(true);
			}
		});

		txtNomeP1.setVisible(false);
		txtNomeP2.setVisible(false);
		txtNomeP3.setVisible(false);
		txtNomeP4.setVisible(false);
	}


	/**
	 * Genera un obiettivo collettivo randomicamente.
	 */
	private ObiettivoComune generaObiettivoCollettivo() {
		Random rand = new Random();
		int nObiettivo = rand.nextInt(1,13);
		ObiettivoComune obiettivo = null;
		switch(nObiettivo) {
		case 1:
			obiettivo = new Obiettivo1();
			break;
		case 2:
			obiettivo = new Obiettivo2();
			break;
		case 3:
			obiettivo = new Obiettivo3();
			break;
		case 4:
			obiettivo = new Obiettivo4();
			break;
		case 5:			
			obiettivo = new Obiettivo5();
			break;
		case 6:	
			obiettivo = new Obiettivo6();
			break;
		case 7:
			obiettivo = new Obiettivo7();
			break;
		case 8:
			obiettivo = new Obiettivo8();
			break;
		case 9:
			obiettivo = new Obiettivo9();
			break;
		case 10:
			obiettivo = new Obiettivo10();
			break;
		case 11:
			obiettivo = new Obiettivo11();
			break;
		case 12:
			obiettivo = new Obiettivo12();
			break;
		}		
		return obiettivo;
	}
}
