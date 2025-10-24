/*
 * TabelaZebra.java
 * Copyright (c) SN SISTEMAS.
 *
 * Este software é confidencial e propriedade da SN SISTEMAS.
 * Não é permitida sua distribuição ou divulgação do seu conteúdo sem expressa autorização da SN SISTEMAS.
 * Este arquivo contém informações proprietárias.
 */
package com.armandodev.cellRenderer;

import java.awt.Color;
import java.awt.Component;
import java.math.BigDecimal;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.LEFT;
import static javax.swing.SwingConstants.RIGHT;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class TabelaZebra implements TableCellRenderer {

    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);
        ((JLabel) renderer).setOpaque(true);

        //CORES:
        Color foreground, background;

        if (isSelected && !table.getModel().isCellEditable(row, 0)) {
            background = new Color(0, 90, 31);
            foreground = Color.white;
        } else {
            if (row % 2 == 0) {
                foreground = Color.black;
                background = Color.white;
            } else {
                foreground = Color.black;
                background = new Color(240, 255, 240);
            }
        }

        if (table.getModel().getColumnClass(column) == BigDecimal.class
                || table.getModel().getColumnClass(column) == Long.class
                || table.getModel().getColumnClass(column) == Integer.class) {
            DEFAULT_RENDERER.setHorizontalAlignment(RIGHT);
        } else if (table.getModel().getColumnClass(column) == Date.class) {
            DEFAULT_RENDERER.setHorizontalAlignment(SwingConstants.CENTER);
        } else {
            DEFAULT_RENDERER.setHorizontalAlignment(LEFT);
        }

        renderer.setForeground(foreground);
        renderer.setBackground(background);

        return renderer;

    }

}
