package com.armandodev.internal.filtro;

import com.armandodev.enumerator.RegexDocument;
import com.armandodev.filter.ParticipanteFilter;
import com.armandodev.util.document.GenericRegexTextDocument;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import org.apache.commons.lang.StringUtils;

public class FiltroParticipanteInternal extends javax.swing.JDialog {
    
    //VARIAVEIS
    private ParticipanteFilter filter;
    
    public FiltroParticipanteInternal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initPadrao();                    
    }
    
    private void initPadrao() {
        
        try {
            
            jTextFieldNome.setDocument(new GenericRegexTextDocument(60, RegexDocument.LETRAS_NUMEROS_ESPACOS.getPadrao()));
            jTextFieldCodigo.setDocument(new GenericRegexTextDocument(10, RegexDocument.NUMEROS.getPadrao()));                  
            defineTeclasAtalho();

        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    private void defineTeclasAtalho() {

        InputMap iMap = this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "sair"); 
        iMap.put(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0), "sair");
        iMap.put(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0), "filtrar");

        ActionMap aMap = this.getRootPane().getActionMap();
        aMap.put("sair", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rSButtonForma3ActionPerformed(e);
            }
        });
            
        aMap.put("filtrar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rSButtonFiltrarActionPerformed(e);
            }
        });     

    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelValorDiferenca1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        rSButtonForma3 = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonFiltrar = new rojeru_san.rsbutton.RSButtonForma();
        rSComboBoxAtivo = new rojerusan.RSComboBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerto de títulos");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Código:");

        jTextFieldCodigo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldCodigo.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jLabelValorDiferenca1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelValorDiferenca1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabelValorDiferenca1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelValorDiferenca1.setText("Filtrar Participantes:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jTextFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNomeFocusGained(evt);
            }
        });

        rSButtonForma3.setBackground(new java.awt.Color(255, 153, 0));
        rSButtonForma3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonForma3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_voltar.png"))); // NOI18N
        rSButtonForma3.setText("Voltar");
        rSButtonForma3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonForma3ActionPerformed(evt);
            }
        });

        rSButtonFiltrar.setBackground(new java.awt.Color(204, 204, 0));
        rSButtonFiltrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_filtro.png"))); // NOI18N
        rSButtonFiltrar.setText("Filtrar");
        rSButtonFiltrar.setColorHover(new java.awt.Color(239, 239, 0));
        rSButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonFiltrarActionPerformed(evt);
            }
        });

        rSComboBoxAtivo.setForeground(new java.awt.Color(0, 0, 0));
        rSComboBoxAtivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Todos", "Ativos", "Inativos" }));
        rSComboBoxAtivo.setSelectedIndex(1);
        rSComboBoxAtivo.setColorArrow(new java.awt.Color(0, 0, 0));
        rSComboBoxAtivo.setColorBorde(new java.awt.Color(0, 0, 0));
        rSComboBoxAtivo.setColorBoton(new java.awt.Color(255, 255, 255));
        rSComboBoxAtivo.setColorFondo(new java.awt.Color(255, 255, 255));
        rSComboBoxAtivo.setColorListaItems(new java.awt.Color(242, 242, 242));
        rSComboBoxAtivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Status Ativo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelValorDiferenca1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rSButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rSButtonForma3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 269, Short.MAX_VALUE))
                                    .addComponent(jTextFieldNome))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(rSComboBoxAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelValorDiferenca1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSComboBoxAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonForma3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomeFocusGained
        jTextFieldNome.selectAll();
    }//GEN-LAST:event_jTextFieldNomeFocusGained

    private void rSButtonForma3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonForma3ActionPerformed
        dispose();
    }//GEN-LAST:event_rSButtonForma3ActionPerformed

    private void rSButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonFiltrarActionPerformed
        
        filter = new ParticipanteFilter();
        filter.setCodigo(StringUtils.isNotBlank(jTextFieldCodigo.getText()) ? Long.valueOf(jTextFieldCodigo.getText()) : null);
        filter.setNome(jTextFieldNome.getText());
        filter.setAtivo(rSComboBoxAtivo.getSelectedItem().toString());
        
        dispose();
        
    }//GEN-LAST:event_rSButtonFiltrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelValorDiferenca1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private rojeru_san.rsbutton.RSButtonForma rSButtonFiltrar;
    private rojeru_san.rsbutton.RSButtonForma rSButtonForma3;
    private rojerusan.RSComboBox rSComboBoxAtivo;
    // End of variables declaration//GEN-END:variables

    public ParticipanteFilter getFilter() {
        return filter;
    }

}
