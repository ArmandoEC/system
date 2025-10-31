package com.armandodev.cellRenderer;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

public class GrupoContaTreeCellRenderer extends DefaultTreeCellRenderer {

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded,
            boolean leaf, int row, boolean hasFocus) {

        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);

        tree.setRowHeight(23);//AUMENTA TAMANHO DA LINHA
        setOpaque(true);
        setBackground(Color.WHITE); //BACKGROUND DA LINHA
        setForeground(new Color(102,102,102));// COR DO TEXTO
        
        //SE A LINHA ESTIVER SELECIONADA
        if (selected) {
            setBackground(Color.WHITE);
            setForeground(new Color(102,102,102));
            setIcon(new ImageIcon(GrupoContaTreeCellRenderer.class.getResource("/images/menuPrincipal/icone_pastaSelecionada.png")));
        } else {
            setIcon(new ImageIcon(GrupoContaTreeCellRenderer.class.getResource("/images/menuPrincipal/icone_pasta.png"))); 
        }
        
        return this;
        
    }
}
