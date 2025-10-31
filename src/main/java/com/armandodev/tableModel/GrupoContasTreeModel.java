package com.armandodev.tableModel;

import com.armandodev.entity.GrupoContaEntity;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class GrupoContasTreeModel implements TreeModel {
      
    private List<TreeModelListener> listeners = new ArrayList<>();    
    private List<GrupoContaEntity> listContas;
    
    public GrupoContasTreeModel(List<GrupoContaEntity> listContas) {
        this.listContas = listContas;
    }

    @Override
    public Object getRoot() {
        return null;
    }

    @Override
    public Object getChild(Object parent, int index) {
        
        if(((GrupoContaEntity) parent).getNivel() == 1) {
            return listContas.get(index);
        } else {
            return ((GrupoContaEntity) parent).getSubGrupos().get(index);
        }
        
    }

    @Override
    public int getChildCount(Object parent) {
        
        if(((GrupoContaEntity) parent).getNivel() == 1) {
            return listContas.size();
        } else {
            return ((GrupoContaEntity) parent).getSubGrupos().size();
        }
        
    }

    @Override
    public boolean isLeaf(Object node) {
        return ((GrupoContaEntity) node).isUltimoNivel();
    }
    
    @Override
    public int getIndexOfChild(Object parent, Object child) {
        
        if(((GrupoContaEntity) parent).getNivel() == 1) {
            return listContas.indexOf(child);
        } else {
            return ((GrupoContaEntity) parent).getSubGrupos().indexOf(child);
        }
        
    }
    
    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {        
    }
    
    @Override
    public void addTreeModelListener(TreeModelListener l) {
        listeners.add(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        listeners.remove(l);
    }
    
    public void setContas (List<GrupoContaEntity> listContas) {
        this.listContas = listContas;
    }
    
}
