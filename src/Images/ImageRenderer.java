package Images;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.*;

public class ImageRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        Color cellColor = (Color) value; // Recupera il colore dalla cella direttamente dal valore

        ImageIcon image = null;
        
        if(cellColor == Color.white) {
            image = new ImageIcon("./src/pics/Libri.png");
        } else if(cellColor == Color.green) {
            image = new ImageIcon("./src/pics/Gatti.png");
        } else if(cellColor == Color.yellow) {
            image = new ImageIcon("./src/pics/Giochi.png");
        } else if(cellColor == Color.blue) {
            image = new ImageIcon("./src/pics/Cornici.png");
        } else if(cellColor == Color.cyan) {
            image = new ImageIcon("./src/pics/Trofei.png");
        } else if(cellColor == Color.pink) {
            image = new ImageIcon("./src/pics/Piante.png");
        } else if(cellColor == Color.black) {
            image = new ImageIcon("./src/pics/nero.jpg");
        }
        
        
        ImageIcon imgRes = Image.scaleImage(image, (table.getHeight()/table.getColumnCount()+16),(table.getWidth()/table.getRowCount()+5));  
        
        setIcon(imgRes);
        setText(null); // Rimuovi il testo per evitare sovrapposizioni
        setHorizontalAlignment(SwingConstants.CENTER); // Centra l'immagine nella cella

        return this;
    }
}