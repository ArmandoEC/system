package com.armandodev.tableModel;

import com.armandodev.entity.ParticipanteEntity;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ConsultaParticipanteTableModel extends AbstractTableModel {
    
    private List<ParticipanteEntity> rows;

    private String[] columns = {
        "Código", "Nome", "Ativo"
    };
    
    public ConsultaParticipanteTableModel() {}
        
    @Override
    public int getRowCount() {
        return this.rows.size();
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
        switch(columnIndex) {

            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;                         
            default:
                throw new ArrayIndexOutOfBoundsException("column index inválid");            
        }
        
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        ParticipanteEntity e = rows.get(rowIndex);
        
        switch(columnIndex) {
            
            case 0:
                return e.getCodigo();
            case 1:
                return e.getNome();
            case 2:
                return e.getAtivo() ? "Sim" : "Não";              
            default:
                throw new ArrayIndexOutOfBoundsException("column index inválid");            
        }
        
    }
    
    public void removeRow(int rowIndex) {
        rows.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    public ParticipanteEntity getRow(int rowIndex) {
        return rows.get(rowIndex);
    }

    public List<ParticipanteEntity> getRows() {
        return rows;
    }

    public void update() {
        fireTableDataChanged();
    }
    
    public void insertRow(ParticipanteEntity row) {
        this.rows.add(this.rows.size(), row);
        fireTableRowsInserted(this.rows.size() - 1, this.rows.size() - 1);
    }
    
    public void setRows(List<ParticipanteEntity> rows) {
        this.rows = rows;
        fireTableDataChanged();
    }
    
    public void removeAll() {
        this.rows.clear();
        fireTableDataChanged();
    }
    
}
