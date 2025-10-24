package com.armandodev.view;

import com.armandodev.cellRenderer.TabelaZebra;
import com.armandodev.filter.ParticipanteFilter;
import com.armandodev.internal.cadastro.CadastroParticipanteInternal;
import com.armandodev.internal.filtro.FiltroParticipanteInternal;
import com.armandodev.internal.messages.LoadingMessageInternal;
import com.armandodev.negocio.ParticipanteBO;
import com.armandodev.tableModel.ConsultaParticipanteTableModel;
import com.armandodev.util.MessagesUtil;
import com.armandodev.util.TableUtil;
import java.util.Arrays;
import javax.swing.ListSelectionModel;
import javax.swing.SwingWorker;

public class ParticipanteView extends javax.swing.JFrame {
    
    //VARIAVEIS
    private ParticipanteFilter filter;
    
    //TABLE MODEL
    private ConsultaParticipanteTableModel tableModelParticipante;
    
    //NEGOCIO
    private ParticipanteBO participanteBO;
    
    public ParticipanteView() {
        initComponents();
        this.init();
    }
    
    private void init() {
        
        participanteBO = new ParticipanteBO();
        this.initTableModel();
        this.rSButtonBuscarActionPerformed(null);
    }
    
    private void initTableModel() {
        
        tableModelParticipante = new ConsultaParticipanteTableModel();
        jTableParticipantes.setModel(tableModelParticipante);        
        TableUtil.configureTable(jTableParticipantes, Arrays.asList(80,500,60));
        
        jTableParticipantes.setDefaultRenderer(String.class,new TabelaZebra());
        jTableParticipantes.setDefaultRenderer(Integer.class,new TabelaZebra());
        
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSButtonNovo = new rojeru_san.rsbutton.RSButtonForma();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableParticipantes = new javax.swing.JTable();
        rSButtonAlterar = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonFiltro = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonBuscar = new rojeru_san.rsbutton.RSButtonForma();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modelo View");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Participantes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        rSButtonNovo.setBackground(new java.awt.Color(0, 168, 84));
        rSButtonNovo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_mais.png"))); // NOI18N
        rSButtonNovo.setText("Novo");
        rSButtonNovo.setColorHover(new java.awt.Color(0, 239, 119));
        rSButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonNovoActionPerformed(evt);
            }
        });

        jTableParticipantes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableParticipantes.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">\n(P) - Pedido de Venda <br/>\n(L)  - Log de Desdobramento <br/>\n(C) - Número de Autorização POS <br/>\n(F) - Menu Canhoto Eletrônico </h4> </body> </html>");
        jTableParticipantes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableParticipantes.setGridColor(new java.awt.Color(204, 204, 204));
        jTableParticipantes.setRowHeight(20);
        jScrollPane1.setViewportView(jTableParticipantes);

        rSButtonAlterar.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonAlterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_alterar.png"))); // NOI18N
        rSButtonAlterar.setText("Alterar");
        rSButtonAlterar.setColorHover(new java.awt.Color(0, 219, 219));
        rSButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonAlterarActionPerformed(evt);
            }
        });

        rSButtonFiltro.setBackground(new java.awt.Color(204, 204, 0));
        rSButtonFiltro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_filtro.png"))); // NOI18N
        rSButtonFiltro.setColorHover(new java.awt.Color(239, 239, 0));
        rSButtonFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonFiltroActionPerformed(evt);
            }
        });

        rSButtonBuscar.setBackground(new java.awt.Color(4, 123, 174));
        rSButtonBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_buscar.png"))); // NOI18N
        rSButtonBuscar.setText("Buscar");
        rSButtonBuscar.setColorHover(new java.awt.Color(45, 188, 250));
        rSButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rSButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rSButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rSButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSButtonFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonNovoActionPerformed
        
        CadastroParticipanteInternal internal = new CadastroParticipanteInternal(this, true);
        internal.setVisible(true);
        
        if (internal.isAtualizarConsulta()) {
            rSButtonBuscarActionPerformed(null);
        }
        
        internal = null;
        
    }//GEN-LAST:event_rSButtonNovoActionPerformed

    private void rSButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonBuscarActionPerformed
        
        LoadingMessageInternal internal = new LoadingMessageInternal(null, true);
        SwingWorker<Void, Void> sw = new SwingWorker<Void, Void>() {

            @Override
            protected Void doInBackground() throws Exception {
                BuscarParticipantes();
                return null;
            }

            @Override
            protected void done() {
                internal.dispose();
            }
        };

        sw.execute();
        internal.setVisible(true);
        
    }//GEN-LAST:event_rSButtonBuscarActionPerformed

    private void rSButtonFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonFiltroActionPerformed
        
        FiltroParticipanteInternal internal = new FiltroParticipanteInternal(this, true);
        internal.setVisible(true);
        filter = internal.getFilter();
        
        internal = null;
        
    }//GEN-LAST:event_rSButtonFiltroActionPerformed

    private void rSButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonAlterarActionPerformed
        
        if (jTableParticipantes.getSelectedRowCount() == 1) {
            
            CadastroParticipanteInternal internal = new CadastroParticipanteInternal(this, true, 
                    tableModelParticipante.getRow(jTableParticipantes.getSelectedRow()));
            internal.setVisible(true);

            if (internal.isAtualizarConsulta()) {
                rSButtonBuscarActionPerformed(null);
            }

            internal = null;
            
        }
        
    }//GEN-LAST:event_rSButtonAlterarActionPerformed
               
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParticipanteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableParticipantes;
    private rojeru_san.rsbutton.RSButtonForma rSButtonAlterar;
    private rojeru_san.rsbutton.RSButtonForma rSButtonBuscar;
    private rojeru_san.rsbutton.RSButtonForma rSButtonFiltro;
    private rojeru_san.rsbutton.RSButtonForma rSButtonNovo;
    // End of variables declaration//GEN-END:variables
    
    private void BuscarParticipantes() {
        
        try {
            
            if (filter == null) filter = new ParticipanteFilter();
            tableModelParticipante.setRows(participanteBO.buscarParticipantes(filter));            
            jTableParticipantes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            
            filter = null;

        } catch (Exception e) {
            e.printStackTrace();
            MessagesUtil.error(null, true, null, null, null);
        }
        
    }
}
