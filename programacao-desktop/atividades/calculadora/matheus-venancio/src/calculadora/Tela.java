/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Usuario
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Visor = new javax.swing.JTextField();
        BotaoZERO = new javax.swing.JButton();
        BotaoPonto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Botao1 = new javax.swing.JButton();
        Botao2 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        Botao4 = new javax.swing.JButton();
        Botao5 = new javax.swing.JButton();
        Botao6 = new javax.swing.JButton();
        Botao7 = new javax.swing.JButton();
        Botao8 = new javax.swing.JButton();
        Botao9 = new javax.swing.JButton();
        BotaoMENOS = new javax.swing.JButton();
        BotaoMAIS = new javax.swing.JButton();
        BotaoMULTIPLICAR = new javax.swing.JButton();
        BotaoDIVISAO = new javax.swing.JButton();
        BotaoAPAGAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        BotaoZERO.setText("0");
        BotaoZERO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoZEROMouseClicked(evt);
            }
        });

        BotaoPonto.setText(".");
        BotaoPonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoPontoMouseClicked(evt);
            }
        });
        BotaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPontoActionPerformed(evt);
            }
        });

        jButton1.setText("=");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        Botao1.setText("1");
        Botao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao1MouseClicked(evt);
            }
        });
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        Botao2.setText("2");
        Botao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao2MouseClicked(evt);
            }
        });
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });

        Botao3.setText("3");
        Botao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao3MouseClicked(evt);
            }
        });
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3ActionPerformed(evt);
            }
        });

        Botao4.setText("4");
        Botao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao4MouseClicked(evt);
            }
        });
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4ActionPerformed(evt);
            }
        });

        Botao5.setText("5");
        Botao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao5MouseClicked(evt);
            }
        });
        Botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao5ActionPerformed(evt);
            }
        });

        Botao6.setText("6");
        Botao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao6MouseClicked(evt);
            }
        });
        Botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao6ActionPerformed(evt);
            }
        });

        Botao7.setText("7");
        Botao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao7MouseClicked(evt);
            }
        });
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7ActionPerformed(evt);
            }
        });

        Botao8.setText("8");
        Botao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao8MouseClicked(evt);
            }
        });
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8ActionPerformed(evt);
            }
        });

        Botao9.setText("9");
        Botao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao9MouseClicked(evt);
            }
        });
        Botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao9ActionPerformed(evt);
            }
        });

        BotaoMENOS.setText("-");
        BotaoMENOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoMENOSMouseClicked(evt);
            }
        });
        BotaoMENOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMENOSActionPerformed(evt);
            }
        });

        BotaoMAIS.setText("+");
        BotaoMAIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoMAISMouseClicked(evt);
            }
        });
        BotaoMAIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMAISActionPerformed(evt);
            }
        });

        BotaoMULTIPLICAR.setText("X");
        BotaoMULTIPLICAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoMULTIPLICARMouseClicked(evt);
            }
        });
        BotaoMULTIPLICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMULTIPLICARActionPerformed(evt);
            }
        });

        BotaoDIVISAO.setText("/");
        BotaoDIVISAO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoDIVISAOMouseClicked(evt);
            }
        });
        BotaoDIVISAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDIVISAOActionPerformed(evt);
            }
        });

        BotaoAPAGAR.setText("CE");
        BotaoAPAGAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoAPAGARMouseClicked(evt);
            }
        });
        BotaoAPAGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAPAGARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotaoZERO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Visor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoAPAGAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoDIVISAO, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoMULTIPLICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotaoMAIS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotaoMENOS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Visor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoMULTIPLICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoDIVISAO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoAPAGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMENOS, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMAIS, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotaoPonto, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(BotaoZERO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Calculadora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoPontoActionPerformed

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao1ActionPerformed

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao2ActionPerformed

    private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao3ActionPerformed

    private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao4ActionPerformed

    private void Botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao5ActionPerformed

    private void Botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao6ActionPerformed

    private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao7ActionPerformed

    private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao8ActionPerformed

    private void Botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao9ActionPerformed

    private void BotaoMENOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMENOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoMENOSActionPerformed

    private void BotaoMAISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMAISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoMAISActionPerformed

    private void BotaoMULTIPLICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMULTIPLICARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoMULTIPLICARActionPerformed

    private void BotaoDIVISAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDIVISAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoDIVISAOActionPerformed

    private void BotaoAPAGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAPAGARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoAPAGARActionPerformed

    private void BotaoZEROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoZEROMouseClicked
        String valor = Visor.getText();
        Visor.setText(valor + "0");
    }//GEN-LAST:event_BotaoZEROMouseClicked

    private void Botao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao1MouseClicked
        String valor = Visor.getText();
        Visor.setText(valor + "1");
    }//GEN-LAST:event_Botao1MouseClicked

    private void Botao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao2MouseClicked
        String valor = Visor.getText();
        Visor.setText(valor + "2");
    }//GEN-LAST:event_Botao2MouseClicked

    private void Botao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao3MouseClicked
        String valor = Visor.getText();
        Visor.setText(valor + "3");
    }//GEN-LAST:event_Botao3MouseClicked

    private void Botao4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao4MouseClicked
        String valor = Visor.getText();
        Visor.setText(valor + "4");
    }//GEN-LAST:event_Botao4MouseClicked

    private void Botao5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao5MouseClicked
        String valor = Visor.getText();
        Visor.setText(valor + "5");
    }//GEN-LAST:event_Botao5MouseClicked

    private void Botao6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao6MouseClicked
        String valor = Visor.getText();
        Visor.setText(valor + "6");
    }//GEN-LAST:event_Botao6MouseClicked

    private void Botao7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao7MouseClicked
        String valor = Visor.getText();
        Visor.setText(valor + "7");
    }//GEN-LAST:event_Botao7MouseClicked

    private void Botao8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao8MouseClicked
        String valor = Visor.getText();
        Visor.setText(valor + "8");
    }//GEN-LAST:event_Botao8MouseClicked

    private void Botao9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao9MouseClicked
        String valor = Visor.getText();
        Visor.setText(valor + "9");
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao9MouseClicked

    private void BotaoAPAGARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAPAGARMouseClicked
        Visor.setText("");
    }//GEN-LAST:event_BotaoAPAGARMouseClicked

    private void BotaoMULTIPLICARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMULTIPLICARMouseClicked
            String numero = Visor.getText();
        Visor.setText(numero + "*");
    }//GEN-LAST:event_BotaoMULTIPLICARMouseClicked

    private void BotaoDIVISAOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoDIVISAOMouseClicked
       String numero = Visor.getText();
        Visor.setText(numero + "/");
    }//GEN-LAST:event_BotaoDIVISAOMouseClicked

    private void BotaoMENOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMENOSMouseClicked
         String numero = Visor.getText();
        Visor.setText(numero + "-");
    }//GEN-LAST:event_BotaoMENOSMouseClicked

    private void BotaoMAISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMAISMouseClicked
             String numero = Visor.getText();
        Visor.setText(numero + "+");
    }//GEN-LAST:event_BotaoMAISMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         String numero= Visor.getText();
        System.out.println(">>>"+numero);
        Calculadora calcular = new Calculadora();
        String resultado = calcular.calculadora(numero);
        
        Visor.setText(resultado);
    }//GEN-LAST:event_jButton1MouseClicked

    private void BotaoPontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoPontoMouseClicked
      String valor = Visor.getText();
        Visor.setText(valor + ".");
    }//GEN-LAST:event_BotaoPontoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JButton Botao5;
    private javax.swing.JButton Botao6;
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Botao8;
    private javax.swing.JButton Botao9;
    private javax.swing.JButton BotaoAPAGAR;
    private javax.swing.JButton BotaoDIVISAO;
    private javax.swing.JButton BotaoMAIS;
    private javax.swing.JButton BotaoMENOS;
    private javax.swing.JButton BotaoMULTIPLICAR;
    private javax.swing.JButton BotaoPonto;
    private javax.swing.JButton BotaoZERO;
    private javax.swing.JTextField Visor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}