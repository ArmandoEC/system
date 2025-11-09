package com.armandodev.internal.cadastro;

import com.armandodev.entity.GrupoContaEntity;
import com.armandodev.enumerator.RegexDocument;
import com.armandodev.internal.messages.LoadingMessageInternal;
import com.armandodev.negocio.GrupoContaBO;
import com.armandodev.util.MessagesUtil;
import com.armandodev.util.document.GenericRegexTextDocument;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.SwingWorker;
import org.apache.commons.lang.StringUtils;

public class CadastroContaInternal extends javax.swing.JDialog {
    
    //VARIAVEIS
    private boolean atualizarConsulta;
    private boolean isAlterar;
    private GrupoContaEntity conta;
    
    //NEGOCIO
    private GrupoContaBO grupoContaBO;
    
    public CadastroContaInternal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initPadrao();                    
    }
    
    public CadastroContaInternal(java.awt.Frame parent, boolean modal, GrupoContaEntity conta, boolean isAlterar) {
        super(parent, modal);
        initComponents();
        this.conta = conta;
        this.isAlterar = isAlterar;
        this.initPadrao();
        this.initNovoAlterar();
    }
    
    private void initPadrao() {

        jTextFieldNome.setDocument(new GenericRegexTextDocument(60, RegexDocument.LETRAS_NUMEROS_ESPACOS.getPadrao()));
        grupoContaBO = new GrupoContaBO();
        this.defineTeclasAtalho();

    }
    
    private void initNovoAlterar() {
       
        jTextFieldNivel.setText(conta.getNome());
        
        if (isAlterar && conta != null) {           
            jTextFieldCodigo.setText(conta.getId().toString());            
            jTextFieldNome.setText(conta.getNome()); 
            jTextFieldNome.setCaretPosition(0);
        }
        
              
    }
    
    private void defineTeclasAtalho() {

        InputMap iMap = this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "sair"); 
        iMap.put(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0), "sair");
        iMap.put(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0), "salvar");

        ActionMap aMap = this.getRootPane().getActionMap();
        aMap.put("sair", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rSButtonVoltarActionPerformed(e);
            }
        });
            
        aMap.put("salvar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rSButtonSalvarActionPerformed(e);
            }
        });     

    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSButtonSalvar = new rojeru_san.rsbutton.RSButtonForma();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelValorDiferenca1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        rSButtonVoltar = new rojeru_san.rsbutton.RSButtonForma();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNivel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerto de títulos");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rSButtonSalvar.setBackground(new java.awt.Color(0, 168, 84));
        rSButtonSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_confirmar.png"))); // NOI18N
        rSButtonSalvar.setText("Salvar");
        rSButtonSalvar.setColorHover(new java.awt.Color(0, 239, 119));
        rSButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonSalvarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Código:");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldCodigo.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jLabelValorDiferenca1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelValorDiferenca1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabelValorDiferenca1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelValorDiferenca1.setText("Informe os dados da conta:");

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

        rSButtonVoltar.setBackground(new java.awt.Color(255, 153, 0));
        rSButtonVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_voltar.png"))); // NOI18N
        rSButtonVoltar.setText("Voltar");
        rSButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonVoltarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Nível:");

        jTextFieldNivel.setEditable(false);
        jTextFieldNivel.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldNivel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldNivel.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldNivel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldNivel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValorDiferenca1)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rSButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelValorDiferenca1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_rSButtonVoltarActionPerformed

    private void rSButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonSalvarActionPerformed

        LoadingMessageInternal internal = new LoadingMessageInternal(null, true);
        SwingWorker<Void, Void> sw = new SwingWorker<Void, Void>() {

            @Override
            protected Void doInBackground() throws Exception {
                salvarConta();
                return null;
            }

            @Override
            protected void done() {
                internal.dispose();
            }
        };

        sw.execute();
        internal.setVisible(true);
            
    }//GEN-LAST:event_rSButtonSalvarActionPerformed

    private void jTextFieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomeFocusGained
        jTextFieldNome.selectAll();
    }//GEN-LAST:event_jTextFieldNomeFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelValorDiferenca1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNivel;
    private javax.swing.JTextField jTextFieldNome;
    private rojeru_san.rsbutton.RSButtonForma rSButtonSalvar;
    private rojeru_san.rsbutton.RSButtonForma rSButtonVoltar;
    // End of variables declaration//GEN-END:variables
 
    private void salvarConta() {
        
        try {
            
            if (StringUtils.isNotBlank(jTextFieldNome.getText())) {
                
                GrupoContaEntity contaSalvar;
                
                if (isAlterar) {
                    contaSalvar = this.conta;
                    
                } else {
                    
                    contaSalvar = new GrupoContaEntity();                    
                    contaSalvar.setNivel(1);
                    
                    if (conta != null) {
                        contaSalvar.setGrupo(conta);
                        contaSalvar.setNivel(conta.getNivel() + 1);
                    }
                    
                }
    
                contaSalvar.setNome(jTextFieldNome.getText());
                grupoContaBO.salvarConta(contaSalvar);
                atualizarConsulta = true;
                dispose();
                
            } else {
                MessagesUtil.alert(null, true, null, null, "Informe um nome!");
                jTextFieldNome.grabFocus();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            MessagesUtil.error(null, true, null, null, null);           
        }
        
    }

    public boolean isAtualizarConsulta() {
        return atualizarConsulta;
    }
    
}
