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
        ImageIcon image;
        if((Color)value != Color.BLACK) {
         image = Image.sceltaImmagine(cellColor);      
        }
        else {
        	image = new ImageIcon("./src/pics/casellaVuota.png");
        }
        ImageIcon imgRes = null;
        
        if(table.getRowSelectionAllowed()==true ) {//libreria
       	 imgRes = Image.scaleImage(image, (table.getHeight()/table.getColumnCount()),(table.getWidth()/table.getRowCount()+25));
        }
        if (table.getRowSelectionAllowed()==true && cellColor == Color.BLACK && giocatori.getLibreria()[row][column].getDisponibile()==false) {//libreria      
            imgRes = Image.scaleImage(Image.scurisciImage(image), (table.getHeight() / table.getColumnCount()), (table.getWidth() / table.getRowCount()+25));
        }     
        if (table.getRowSelectionAllowed()==false){//obiettivi personali
        	imgRes = Image.scaleImage(image, (table.getHeight()/table.getColumnCount()),(table.getWidth()+10/table.getRowCount()+20));
        }  
        
        setIcon(imgRes);
        setText(null); // Rimuovi il testo per evitare sovrapposizioni
        setHorizontalAlignment(SwingConstants.CENTER); // Centra l'immagine nella cella
        
        return this;
    }
}