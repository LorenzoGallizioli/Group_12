package Images;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Classe che permette di modificare il colore di ogni cella.
 * 
 * @author davidedellanno
 */
public class CustomCellColore extends DefaultTableCellRenderer {
   
	/**
	 * @inheritdoc
	 */
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    	
		value = null; // Impostando il valore a Color.BLACK si impedisce di mostrare nelle celle delle stringhe.
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Color cellColor = (Color) table.getModel().getValueAt(row, column);
        
        if (cellColor != Color.WHITE) {
            c.setBackground(cellColor);
        } else {
            c.setBackground(table.getBackground());
        }

        return c;
    }
}