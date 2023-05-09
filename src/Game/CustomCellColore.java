package Game;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomCellColore extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    	value = null;
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        Color cellColor = (Color) table.getModel().getValueAt(row, column);
        if (cellColor != null) {
            c.setBackground(cellColor);
        } else {
            c.setBackground(table.getBackground());
        }

        return c;
    }
}