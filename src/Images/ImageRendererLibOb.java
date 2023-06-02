package Images;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

import Game.Giocatore;
import Game.Tavola;

import java.awt.*;
/**
 * Applica l'immagine alla cella di una determinata tabella JTable
 * @author Davide
 *
 */
public class ImageRendererLibOb extends DefaultTableCellRenderer {
	
	private Giocatore giocatori;
	
	public void setGiocatori(Giocatore giocatori) {
		this.giocatori = giocatori;
		
	}

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        Color cellColor = (Color) value; // Recupera il colore dalla cella direttamente dal valore

        ImageIcon image = Image.sceltaImmagine(cellColor);      
        
        ImageIcon imgRes = Image.scaleImage(image, (table.getHeight()/table.getColumnCount()+16),(table.getWidth()/table.getRowCount()+5));//scala l'immagine con una proporzione calcolata
        if(table.getRowSelectionAllowed()==true && cellColor == Color.BLACK && giocatori.getLibreria()[row][column].getDisponibile() == false) {
        	imgRes = Image.scurisciImage(imgRes);
        }
        setIcon(imgRes);
        setText(null); // Rimuovi il testo per evitare sovrapposizioni
        setHorizontalAlignment(SwingConstants.CENTER); // Centra l'immagine nella cella
        
        return this;
    }
}