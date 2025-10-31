package com.armandodev.view;

import com.armandodev.cellRenderer.MenuPrincipalTreeCellRenderer;
import com.armandodev.negocio.MenuPrincipalBO;
import com.armandodev.tableModel.MenuPrincipalTreeModel;
import com.armandodev.util.MessagesUtil;
import com.armandodev.util.jpa.ConnectionFactory;
import javax.swing.JOptionPane;
import javax.swing.tree.TreeSelectionModel;

public class MenuPrincipalSystem extends javax.swing.JFrame {
    
    private MenuPrincipalBO menuPrincipalBO;
     
    public MenuPrincipalSystem() {
        initComponents();
        this.init();
    }
    
    private void init() {
        ConnectionFactory.getConnection();
        this.initVariaveis();
    }
    
    private void initVariaveis() {
   
        try {
            
            menuPrincipalBO = new MenuPrincipalBO();
            jTreeMenu.setModel(new MenuPrincipalTreeModel(menuPrincipalBO.buscarListMenu()));
            jTreeMenu.setCellRenderer(new MenuPrincipalTreeCellRenderer());
            jTreeMenu.setShowsRootHandles(true);
            jTreeMenu.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
            jTreeMenu.setRootVisible(false);
            
        } catch (Exception e) {
            e.printStackTrace();
            MessagesUtil.error(null, true, null, null, null);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTreeMenu = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modelo View");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        jTreeMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTreeMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTreeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTreeMenu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTreeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeMenuMouseClicked

        if (evt.getClickCount() == 2 && jTreeMenu.getPathForLocation(evt.getX(), evt.getY()) != null) {
            abrirRotina(jTreeMenu.getLastSelectedPathComponent().toString());
        }
        
    }//GEN-LAST:event_jTreeMenuMouseClicked
               
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTreeMenu;
    // End of variables declaration//GEN-END:variables
    
    private void abrirRotina(String node) {
        
        switch(node) {
            case "10 - Participantes":
                ParticipanteView view = new ParticipanteView();
                view.setVisible(true);
            break;
        }
    }
}
