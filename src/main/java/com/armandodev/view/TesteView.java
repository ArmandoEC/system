package com.armandodev.view;

public class TesteView extends javax.swing.JFrame {
    
   
    public TesteView() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSButtonNovo = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonSalvar = new rojeru_san.rsbutton.RSButtonForma();
        textField1 = new necesario.TextField();
        jTextFieldNumNota = new javax.swing.JTextField();
        rSButtonVoltar = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonConfirmar = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonSim = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonNao = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonAlterar = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonFiltro = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonBuscar = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonFiltrar = new rojeru_san.rsbutton.RSButtonForma();
        rSComboBoxPorta = new rojerusan.RSComboBox();
        jTextFieldNome1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modelo View");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome da Rotina");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
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

        rSButtonSalvar.setBackground(new java.awt.Color(0, 168, 84));
        rSButtonSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_confirmar.png"))); // NOI18N
        rSButtonSalvar.setText("Salvar");
        rSButtonSalvar.setColorHover(new java.awt.Color(0, 239, 119));

        textField1.setForeground(new java.awt.Color(0, 0, 0));
        textField1.setPlaceholder("Nome...");

        jTextFieldNumNota.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldNumNota.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldNumNota.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldNumNota.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jTextFieldNumNota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNumNotaFocusGained(evt);
            }
        });

        rSButtonVoltar.setBackground(new java.awt.Color(255, 153, 0));
        rSButtonVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_voltar.png"))); // NOI18N
        rSButtonVoltar.setText("Voltar");

        rSButtonConfirmar.setBackground(new java.awt.Color(0, 168, 84));
        rSButtonConfirmar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonConfirmar.setText("OK");
        rSButtonConfirmar.setColorHover(new java.awt.Color(0, 239, 119));
        rSButtonConfirmar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N

        rSButtonSim.setBackground(new java.awt.Color(0, 168, 84));
        rSButtonSim.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonSim.setText("SIM");
        rSButtonSim.setColorHover(new java.awt.Color(0, 239, 119));
        rSButtonSim.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N

        rSButtonNao.setBackground(new java.awt.Color(255, 51, 51));
        rSButtonNao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonNao.setText("NÃO");
        rSButtonNao.setColorHover(new java.awt.Color(255, 117, 117));
        rSButtonNao.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N

        rSButtonAlterar.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonAlterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_alterar.png"))); // NOI18N
        rSButtonAlterar.setText("Alterar");
        rSButtonAlterar.setColorHover(new java.awt.Color(0, 219, 219));

        rSButtonFiltro.setBackground(new java.awt.Color(204, 204, 0));
        rSButtonFiltro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_filtro.png"))); // NOI18N
        rSButtonFiltro.setColorHover(new java.awt.Color(239, 239, 0));

        rSButtonBuscar.setBackground(new java.awt.Color(4, 123, 174));
        rSButtonBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_buscar.png"))); // NOI18N
        rSButtonBuscar.setText("Buscar");
        rSButtonBuscar.setColorHover(new java.awt.Color(45, 188, 250));

        rSButtonFiltrar.setBackground(new java.awt.Color(204, 204, 0));
        rSButtonFiltrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_filtro.png"))); // NOI18N
        rSButtonFiltrar.setText("Filtrar");
        rSButtonFiltrar.setColorHover(new java.awt.Color(239, 239, 0));

        rSComboBoxPorta.setForeground(new java.awt.Color(0, 0, 0));
        rSComboBoxPorta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE" }));
        rSComboBoxPorta.setColorArrow(new java.awt.Color(0, 0, 0));
        rSComboBoxPorta.setColorBorde(new java.awt.Color(0, 0, 0));
        rSComboBoxPorta.setColorBoton(new java.awt.Color(255, 255, 255));
        rSComboBoxPorta.setColorFondo(new java.awt.Color(255, 255, 255));
        rSComboBoxPorta.setColorListaItems(new java.awt.Color(242, 242, 242));
        rSComboBoxPorta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextFieldNome1.setEditable(false);
        jTextFieldNome1.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldNome1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldNome1.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldNome1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldNome1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jTextFieldNome1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNome1FocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNumNota, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rSButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rSButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rSButtonFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rSComboBoxPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rSButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(rSButtonSim, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonNao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNumNota, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSComboBoxPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonSim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonNao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 513, Short.MAX_VALUE))
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

    private void jTextFieldNumNotaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNumNotaFocusGained
        jTextFieldNumNota.selectAll();
    }//GEN-LAST:event_jTextFieldNumNotaFocusGained

    private void jTextFieldNome1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNome1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNome1FocusGained
               
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldNome1;
    private javax.swing.JTextField jTextFieldNumNota;
    private rojeru_san.rsbutton.RSButtonForma rSButtonAlterar;
    private rojeru_san.rsbutton.RSButtonForma rSButtonBuscar;
    private rojeru_san.rsbutton.RSButtonForma rSButtonConfirmar;
    private rojeru_san.rsbutton.RSButtonForma rSButtonFiltrar;
    private rojeru_san.rsbutton.RSButtonForma rSButtonFiltro;
    private rojeru_san.rsbutton.RSButtonForma rSButtonNao;
    private rojeru_san.rsbutton.RSButtonForma rSButtonNovo;
    private rojeru_san.rsbutton.RSButtonForma rSButtonSalvar;
    private rojeru_san.rsbutton.RSButtonForma rSButtonSim;
    private rojeru_san.rsbutton.RSButtonForma rSButtonVoltar;
    private rojerusan.RSComboBox rSComboBoxPorta;
    private necesario.TextField textField1;
    // End of variables declaration//GEN-END:variables
    
}
