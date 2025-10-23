package com.armandodev.view;

import com.armandodev.entity.ParticipanteEntity;
import com.armandodev.negocio.ParticipanteBO;
import com.armandodev.tableModel.ConsultaParticipanteTableModel;
import java.util.List;

public class ParticipanteView extends javax.swing.JFrame {
    
    //VARIAVEIS
    private List<ParticipanteEntity> listParticipante;
    
    //TABLE MODEL
    private ConsultaParticipanteTableModel tableModelParticipante;
    
    //NEGOCIO
    private ParticipanteBO participanteBO;
    
    public ParticipanteView() {
        initComponents();
        this.init();
    }
    
    private void init() {
         this.initTableModel();
    }
    
    private void initTableModel() {
        
        tableModelParticipante = new ConsultaParticipanteTableModel();
        jTableParticipantes.setModel(tableModelParticipante);
        
        
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSButtonForma1 = new rojeru_san.rsbutton.RSButtonForma();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableParticipantes = new javax.swing.JTable();
        rSButtonForma7 = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonForma8 = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonForma9 = new rojeru_san.rsbutton.RSButtonForma();

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

        rSButtonForma1.setBackground(new java.awt.Color(0, 168, 84));
        rSButtonForma1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonForma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_mais.png"))); // NOI18N
        rSButtonForma1.setText("Novo");
        rSButtonForma1.setColorHover(new java.awt.Color(0, 239, 119));
        rSButtonForma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonForma1ActionPerformed(evt);
            }
        });

        jTableParticipantes.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
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
        jTableParticipantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableParticipantesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableParticipantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTableParticipantesMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableParticipantesMouseReleased(evt);
            }
        });
        jTableParticipantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableParticipantesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableParticipantes);

        rSButtonForma7.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonForma7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonForma7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_alterar.png"))); // NOI18N
        rSButtonForma7.setText("Alterar");
        rSButtonForma7.setColorHover(new java.awt.Color(0, 219, 219));

        rSButtonForma8.setBackground(new java.awt.Color(204, 204, 0));
        rSButtonForma8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonForma8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_filtro.png"))); // NOI18N
        rSButtonForma8.setColorHover(new java.awt.Color(239, 239, 0));

        rSButtonForma9.setBackground(new java.awt.Color(4, 123, 174));
        rSButtonForma9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonForma9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_buscar.png"))); // NOI18N
        rSButtonForma9.setText("Buscar");
        rSButtonForma9.setColorHover(new java.awt.Color(45, 188, 250));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rSButtonForma1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rSButtonForma7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonForma8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rSButtonForma9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonForma1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonForma7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSButtonForma8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonForma9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void rSButtonForma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonForma1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonForma1ActionPerformed

    private void jTableParticipantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableParticipantesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableParticipantesMouseClicked

    private void jTableParticipantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableParticipantesMouseEntered

        ToolTipManager ttm = ToolTipManager.sharedInstance();
        ttm.setDismissDelay(2000);
        ttm.setInitialDelay(180000);

    }//GEN-LAST:event_jTableParticipantesMouseEntered

    private void jTableParticipantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableParticipantesMouseExited
        ToolTipManager ttm = ToolTipManager.sharedInstance();
        ttm.setInitialDelay(0);
        ttm.setDismissDelay(4000);
    }//GEN-LAST:event_jTableParticipantesMouseExited

    private void jTableParticipantesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableParticipantesMouseReleased

        int qtLinhaSelecionada = jTableParticipantes.getSelectedRows().length;
        jTextFieldQtTituloSelecionadoBaixa.setText(String.valueOf(qtLinhaSelecionada));

        BigDecimal vlTitulosSelecionados = BigDecimal.ZERO;
        BigDecimal vlTotalJuro = BigDecimal.ZERO;
        BigDecimal vlTotalOrig = BigDecimal.ZERO;
        BigDecimal vlTotalDesc = BigDecimal.ZERO;

        for (int i = 0; i < jTableParticipantes.getSelectedRows().length; i++) {

            ConsultaContasAReceberModel model = new ConsultaContasAReceberModel();
            model = tableModelBaixa.getRow(jTableParticipantes.convertRowIndexToModel(jTableParticipantes.getSelectedRows()[i]));

            vlTitulosSelecionados = vlTitulosSelecionados.add(model.getValor());
            vlTotalOrig = vlTotalOrig.add(model.getVlOriginal());
            vlTotalDesc = vlTotalDesc.add(model.getVlDesconto());

            //CALCULO DO VALOR DO JURO
            if (model.getVlJuro().doubleValue() == 0 && model.getPerJuroEmpresa() != null && model.getPerJuroEmpresa().doubleValue() != 0) {
                vlTotalJuro = vlTotalJuro.add(calcularVlJuro(model, model.getPerJuroEmpresa()));
            } else {
                vlTotalJuro = vlTotalJuro.add(model.getVlJuro());
            }

            model = null;

        }

        //TAREFA #G4747:
        jTextFieldQtTituloSelecionadoBaixa.setText(String.valueOf(jTableParticipantes.getSelectedRows().length));
        //jTextFieldVlTituloSelecionadoBaixa.setText(MaskUtil.getMaskMoney(vlTitulosSelecionados));
        jTextFieldVlTituloSelecionadoBaixa.setText(MaskUtil.getMaskMoney(vlTotalOrig));
        jTextFieldVlJuroSelecionadoBaixa.setText(MaskUtil.getMaskMoney(vlTotalJuro));
        //jTextFieldVlTotReceberSelecionadoBaixa.setText(MaskUtil.getMaskMoney(vlTitulosSelecionados.add(vlTotalJuro).subtract(vlTotalDesc)));
        jTextFieldVlTotReceberSelecionadoBaixa.setText(MaskUtil.getMaskMoney(vlTotalOrig.add(vlTotalJuro).subtract(vlTotalDesc)));

    }//GEN-LAST:event_jTableParticipantesMouseReleased

    private void jTableParticipantesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableParticipantesKeyPressed

        try {

            if (evt.getKeyCode() == com.sun.glass.events.KeyEvent.VK_L) {

                int linhaSelecionada = jTableParticipantes.getSelectedRow();
                if (linhaSelecionada != -1) {

                    boolean isRotina = false;
                    for (RotinaEntity r : session.getPessoa().getNivelAcesso().getRotinas()) {
                        if (r != null) {
                            if (r.getCodRotina().equals("0609")) {
                                isRotina = true;
                            }
                        }
                    }

                    if(!isRotina) {
                        MessagesUtil.addMensagemDialogWarningD1(null, true, null, null, "Rotina 609 não permitida para este usuário!");
                        return;
                    }

                    ConsultaContasAReceberModel model
                    = tableModelBaixa.getRow(jTableParticipantes.convertRowIndexToModel(jTableParticipantes.getSelectedRow()));

                    if(model.getDtDesdobramento() == null) {
                        MessagesUtil.addMensagemDialogWarningD1(this, true, null, null, "Título selecionado não é derivado de um desdobramento!");
                        return;
                    }

                    LogDesdCReceberView view = new LogDesdCReceberView(model);
                    view.setVisible(true);

                }

            } else if (evt.getKeyCode() == com.sun.glass.events.KeyEvent.VK_P) {

                int linhaSelecionada = jTableParticipantes.getSelectedRow();
                if (linhaSelecionada != -1) {

                    ConsultaContasAReceberModel model
                    = tableModelBaixa.getRow(jTableParticipantes.convertRowIndexToModel(jTableParticipantes.getSelectedRow()));

                    if(model.getDtDesdobramento() != null) {
                        MessagesUtil.addMensagemDialogWarningD1(this, true, null, null, "Título selecionado é derivado de um desdobramento, "
                            + "assim não podendo visualizar seus pedidos!");
                        return;
                    }

                    PedidoVendaPorContasAReceberInternal internalPedido = new PedidoVendaPorContasAReceberInternal(this, true, model);
                    internalPedido.setVisible(true);

                }

            } else if (evt.getKeyCode() == com.sun.glass.events.KeyEvent.VK_C) {

                int linhaSelecionada = jTableParticipantes.getSelectedRow();
                if (linhaSelecionada != -1) {

                    ConsultaContasAReceberModel model
                    = tableModelBaixa.getRow(jTableParticipantes.convertRowIndexToModel(jTableParticipantes.getSelectedRow()));

                    if(model.getDtDesdobramento() != null) {
                        MessagesUtil.addMensagemDialogWarningD1(this, true, null, null, "Título selecionado é derivado de um desdobramento, "
                            + "assim não podendo visualizar seus pedidos!");
                        return;
                    }

                    POSCReceberInternal internalPedido = new POSCReceberInternal(this, true, model);
                    internalPedido.setVisible(true);

                }

            } else if (evt.getKeyCode() == com.sun.glass.events.KeyEvent.VK_F) {
                menuCanhotoEletronico();
            }

        } catch (Exception e) {
            MessagesUtil.addMensagemDialogErroD2(this, true, e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_jTableParticipantesKeyPressed
               
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
    private rojeru_san.rsbutton.RSButtonForma rSButtonForma1;
    private rojeru_san.rsbutton.RSButtonForma rSButtonForma7;
    private rojeru_san.rsbutton.RSButtonForma rSButtonForma8;
    private rojeru_san.rsbutton.RSButtonForma rSButtonForma9;
    // End of variables declaration//GEN-END:variables
    
}
