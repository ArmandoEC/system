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
    
    public static void configureTable(JTable table, TableModel tableModel, Map<Integer, String> mapSorter, List<Integer> sizes, int listSelection) {
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tableModel);         
        if (!Utils.isNullOrEmpty(mapSorter)) {
            for (Map.Entry<Integer, String> entry : mapSorter.entrySet()) {
                sorter.setComparator(entry.getKey(), returnComparator(entry.getValue()));
            }
        }
        table.setRowSorter(sorter);
        
        for (int i = 0; i < sizes.size(); i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(sizes.get(i));
        }
        
        table.setSelectionMode(listSelection);

    }
    
    private static Comparator<?> returnComparator(String comp) {
        
        if (comp.equals("date")) {
            return TableComparatorUtil.returnComparatorDate("dd/MM/yyyy");
        } else if (comp.equals("dateTime")) {
            return TableComparatorUtil.returnComparatorDate("dd/MM/yyyy HH:mm:ss");
        } else if (comp.equals("number")) {
            return TableComparatorUtil.returnComparatorNumber();
        } else if (comp.equals("bigDecimal")) {
            return TableComparatorUtil.returnComparatorBigDecimal();
        }
        
        return null;
        
    }
  
}
