package com.armandodev.util;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class TableUtil {

    public static void configureTable(JTable table, List<Integer> sizes) {

        table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        for (int i = 0; i < sizes.size(); i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(sizes.get(i));
        }

    }
    
    public static void configureTableParticipantes(JTable table, TableModel tableModel, Map<Integer, String> mapSorter, List<Integer> sizes, int listSelection) {
        
        TableRowSorter<?> sorter = new TableRowSorter<>(tableModel); 
        table.setSelectionMode(listSelection);

        for (int i = 0; i < sizes.size(); i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(sizes.get(i));
        }

    }
  
}
