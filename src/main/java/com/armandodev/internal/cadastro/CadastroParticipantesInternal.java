package com.armandodev.internal.cadastro;

import com.armandodev.entity.ParticipanteEntity;
import com.armandodev.enumerator.RegexDocument;
import com.armandodev.internal.messages.LoadingMessageInternal;
import com.armandodev.negocio.ParticipantesBO;
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

public class CadastroParticipantesInternal extends javax.swing.JDialog {
    
    //VARIAVEIS
    private ParticipanteEntity participante;
    
    //NEGOCIO
    private ParticipantesBO participantesBO;
    
    public CadastroParticipantesInternal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initPadrao();                    
    }
    
    public CadastroParticipantesInternal(java.awt.Frame parent, boolean modal, ParticipanteEntity participante) {
        super(parent, modal);
        initComponents();
        this.participante = participante;
        this.initPadrao();
        this.initAlterar();
    }
    
    private void initPadrao() {
        
        try {
            
            jTextFieldNome.setDocument(new GenericRegexTextDocument(60, RegexDocument.LETRAS_NUMEROS_ESPACOS.getPadrao()));            
            defineTeclasAtalho();

        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    private void initAlterar() {
       
        if (participante != null) {
            jTextFieldCodigo.setText(String.valueOf(participante.getCodigo()));
            jTextFieldNome.setText(participante.getNome());            
            jTextFieldCodigo.setCaretPosition(0);
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
                rSButtonForma3ActionPerformed(e);
            }
        });
            
        aMap.put("salvar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rSButtonForma2ActionPerformed(e);
            }
        });     

    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSButtonForma2 = new rojeru_san.rsbutton.RSButtonForma();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelValorDiferenca1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        rSSwitchAtivo = new rojerusan.RSSwitch();
        jLabel3 = new javax.swing.JLabel();
        rSButtonForma3 = new rojeru_san.rsbutton.RSButtonForma();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerto de títulos");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rSButtonForma2.setBackground(new java.awt.Color(0, 168, 84));
        rSButtonForma2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonForma2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_confirmar.png"))); // NOI18N
        rSButtonForma2.setText("Salvar");
        rSButtonForma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonForma2ActionPerformed(evt);
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
        jLabelValorDiferenca1.setText("Informe os dados do Participante:");

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

        rSSwitchAtivo.setToolTipText("");
        rSSwitchAtivo.setColorFondoActivado(new java.awt.Color(5, 147, 207));
        rSSwitchAtivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rSSwitchAtivoMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Ativo");

        rSButtonForma3.setBackground(new java.awt.Color(255, 153, 0));
        rSButtonForma3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonForma3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_voltar.png"))); // NOI18N
        rSButtonForma3.setText("Voltar");
        rSButtonForma3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonForma3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(rSSwitchAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel3))))
                            .addComponent(jLabelValorDiferenca1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rSButtonForma2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonForma3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSSwitchAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonForma2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonForma3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jTextFieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomeFocusGained
        jTextFieldNome.selectAll();
    }//GEN-LAST:event_jTextFieldNomeFocusGained

    private void rSSwitchAtivoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSSwitchAtivoMousePressed
        if (rSSwitchAtivo.isEnabled()) {
            //switchAlternarParcelamento();
        }
    }//GEN-LAST:event_rSSwitchAtivoMousePressed

    private void rSButtonForma3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonForma3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonForma3ActionPerformed

    private void rSButtonForma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonForma2ActionPerformed

        LoadingMessageInternal internal = new LoadingMessageInternal(null, true);
        SwingWorker<Void, Void> sw = new SwingWorker<Void, Void>() {

            @Override
            protected Void doInBackground() throws Exception {
                salvarParticipante();
                return null;
            }

            @Override
            protected void done() {
                internal.dispose();
            }
        };

        sw.execute();
        internal.setVisible(true);
            
    }//GEN-LAST:event_rSButtonForma2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelValorDiferenca1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private rojeru_san.rsbutton.RSButtonForma rSButtonForma2;
    private rojeru_san.rsbutton.RSButtonForma rSButtonForma3;
    private rojerusan.RSSwitch rSSwitchAtivo;
    // End of variables declaration//GEN-END:variables
 
    private void salvarParticipante() {
        
        try {
            
            if (StringUtils.isNotBlank(jTextFieldNome.getText())) {
                
                participante = participante != null ? participante : new ParticipanteEntity();
                participante.setNome(jTextFieldNome.getText().trim());
                participante.setAtivo(rSSwitchAtivo.isActivado());
                
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            MessagesUtil.error(null, true, null, null, null);           
        }
    }
    
}
