package com.armandodev.internal.messages;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class QuestionMessageInternal extends javax.swing.JDialog {
    
    private boolean confirma;
    
    public QuestionMessageInternal(java.awt.Frame parent, boolean modal, String titulo, String Mensagem) {
        super(parent, modal);
        initComponents();
        jLabelTitulo.setText(titulo);
        JTextAreaMensagem.setText(Mensagem);
        this.defineTeclasAtalho();
    }
    
    private void defineTeclasAtalho() {

        InputMap iMap = this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "confirmar"); 
        iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "declinar"); 

        ActionMap aMap = this.getRootPane().getActionMap();
        aMap.put("confirmar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rSButtonFormaConfirmarActionPerformed(e);
            }
        });
        
        aMap.put("declinar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rSButtonFormaDeclinarActionPerformed(e);
            }
        }); 

    } 
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuestionMessageInternal dialog = new QuestionMessageInternal(new javax.swing.JFrame(), true, null, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSLabelImage1 = new rojeru_san.rslabel.RSLabelImage();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextAreaMensagem = new javax.swing.JTextArea();
        rSButtonFormaConfirmar = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonFormaDeclinar = new rojeru_san.rsbutton.RSButtonForma();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerto de títulos");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/messages/Icone_pergunta.png"))); // NOI18N

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Título");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JTextAreaMensagem.setEditable(false);
        JTextAreaMensagem.setColumns(20);
        JTextAreaMensagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTextAreaMensagem.setForeground(new java.awt.Color(102, 102, 102));
        JTextAreaMensagem.setLineWrap(true);
        JTextAreaMensagem.setRows(1);
        JTextAreaMensagem.setText("Mensagem");
        JTextAreaMensagem.setToolTipText("");
        JTextAreaMensagem.setBorder(null);
        jScrollPane1.setViewportView(JTextAreaMensagem);

        rSButtonFormaConfirmar.setBackground(new java.awt.Color(0, 168, 84));
        rSButtonFormaConfirmar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonFormaConfirmar.setText("SIM");
        rSButtonFormaConfirmar.setColorHover(new java.awt.Color(0, 168, 84));
        rSButtonFormaConfirmar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonFormaConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonFormaConfirmarActionPerformed(evt);
            }
        });

        rSButtonFormaDeclinar.setBackground(new java.awt.Color(255, 51, 51));
        rSButtonFormaDeclinar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonFormaDeclinar.setText("NÃO");
        rSButtonFormaDeclinar.setColorHover(new java.awt.Color(255, 117, 117));
        rSButtonFormaDeclinar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonFormaDeclinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonFormaDeclinarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rSButtonFormaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(rSButtonFormaDeclinar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonFormaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonFormaDeclinar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void rSButtonFormaConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonFormaConfirmarActionPerformed
        confirma = true;
        dispose();
    }//GEN-LAST:event_rSButtonFormaConfirmarActionPerformed

    private void rSButtonFormaDeclinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonFormaDeclinarActionPerformed
        dispose();
    }//GEN-LAST:event_rSButtonFormaDeclinarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea JTextAreaMensagem;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.rsbutton.RSButtonForma rSButtonFormaConfirmar;
    private rojeru_san.rsbutton.RSButtonForma rSButtonFormaDeclinar;
    private rojeru_san.rslabel.RSLabelImage rSLabelImage1;
    // End of variables declaration//GEN-END:variables

    public boolean isConfirma() {
        return confirma;
    }
 
}
