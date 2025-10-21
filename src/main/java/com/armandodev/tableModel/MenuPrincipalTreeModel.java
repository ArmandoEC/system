package com.armandodev.tableModel;

import com.armandodev.entity.MenuEntity;
import com.armandodev.entity.RotinaEntity;
import com.armandodev.entity.SubMenuEntity;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class MenuPrincipalTreeModel implements TreeModel {
    
    private String root = "Modulos";    
    private List<TreeModelListener> listeners = new ArrayList<>();    
    private List<MenuEntity> listMenu;
    private List<SubMenuEntity> listSubMenu;
    private List<RotinaEntity> listRotina;
    
    public MenuPrincipalTreeModel(List<MenuEntity> listMenu) {
        this.listMenu = listMenu;
        this.preencherListaRotinas();
    }
    
    private void preencherListaRotinas() {
        
        listSubMenu = new ArrayList<>();
        listRotina = new ArrayList<>();        
        for (MenuEntity e: listMenu) {
            listSubMenu.addAll(e.getSubmenus());            
            for (SubMenuEntity x: e.getSubmenus()) {
                listRotina.addAll(x.getRotinas());
            }
        }
        
    }

    @Override
    public Object getRoot() {
        return root;
    }

    @Override
    public Object getChild(Object parent, int index) {
        
        if(parent == root) {
            return listMenu.get(index);
        }
        
        if(parent instanceof MenuEntity) {
            return ((MenuEntity) parent).getSubmenus().get(index);
        } else if(parent instanceof SubMenuEntity) {
            return ((SubMenuEntity) parent).getRotinas().get(index);
        }
        
        throw new IllegalArgumentException("Invalid parent class: " + parent.getClass().getSimpleName());
    }

    @Override
    public int getChildCount(Object parent) {
        
        if(parent == root) {
            return listMenu.size();
        }
        
       if(parent instanceof MenuEntity) {
            return ((MenuEntity) parent).getSubmenus().size();
        } else if(parent instanceof SubMenuEntity) {
            return ((SubMenuEntity) parent).getRotinas().size();
        }
        
        return 0;
    }

    @Override
    public boolean isLeaf(Object node) {
        return node instanceof RotinaEntity;
    }
    
    @Override
    public int getIndexOfChild(Object parent, Object child) {
        if(parent == root) {
            return listMenu.indexOf(child);
        }
        
        if(parent instanceof MenuEntity) {
            return ((MenuEntity) parent).getSubmenus().indexOf(child);
        } else if(parent instanceof SubMenuEntity) {
            return ((SubMenuEntity) parent).getRotinas().indexOf(child);
        }
        
        return 0;
    }
    
    public List<MenuEntity> getModulos(){
        return listMenu;
    }
    
    public List<SubMenuEntity> getSubModulos(){
        return listSubMenu;
    }
    
    public List<RotinaEntity> getRotinas(){
        return listRotina;
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
    
}
