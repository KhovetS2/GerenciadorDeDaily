/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import javax.swing.JOptionPane;

import modelo.Usuarios;

/**
 *
 * @author isaqu
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    private Usuarios usuario;
    Color DefaultColor, ClickColor;
    
    public Dashboard() {
        initComponents();
        DefaultColor= new Color(13,36,70);
        ClickColor = new Color(220,141,77);
    }
    
    public Dashboard(Usuarios usuario) {
        initComponents();
        this.usuario=usuario;
        DefaultColor= new Color(13,36,70);
        ClickColor = new Color(220,141,77);
        
        bemVindoText.setText(bemVindoText.getText()+" "+this.usuario.getNome());
        seuIdText.setText(seuIdText.getText()+" "+this.usuario.getId());
        
        FazerDailyButton.setBackground(DefaultColor);
        VerDailyButton.setBackground(DefaultColor);
        Menu3.setBackground(DefaultColor);
        Menu4.setBackground(DefaultColor);
        Menu5.setBackground(DefaultColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(DefaultColor);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MenuName = new javax.swing.JLabel();
        seuIdText = new javax.swing.JLabel();
        bemVindoText = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        FazerDailyButton = new javax.swing.JButton();
        VerDailyButton = new javax.swing.JButton();
        Menu3 = new javax.swing.JButton();
        Menu4 = new javax.swing.JButton();
        Menu5 = new javax.swing.JButton();
        Menu6 = new javax.swing.JButton();
        Menu7 = new javax.swing.JButton();
        jDesktopPanel = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(220, 141, 77));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-menu-do-xbox-40.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 60));

        MenuName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MenuName.setForeground(new java.awt.Color(255, 255, 255));
        MenuName.setText("Menu");
        jPanel4.add(MenuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 40));

        seuIdText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        seuIdText.setForeground(new java.awt.Color(255, 255, 255));
        seuIdText.setText("Seu Id: ");
        jPanel4.add(seuIdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 80, 20));

        bemVindoText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bemVindoText.setForeground(new java.awt.Color(255, 255, 255));
        bemVindoText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-welcome-64.png"))); // NOI18N
        bemVindoText.setText("Bem-Vindo");
        jPanel4.add(bemVindoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 710, 80));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 100));

        jPanel5.setBackground(new java.awt.Color(13, 36, 70));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FazerDailyButton.setBackground(new java.awt.Color(13, 36, 70));
        FazerDailyButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FazerDailyButton.setForeground(new java.awt.Color(255, 255, 255));
        FazerDailyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-daily-40.png"))); // NOI18N
        FazerDailyButton.setText("Fazer Daily");
        FazerDailyButton.setBorder(null);
        FazerDailyButton.setBorderPainted(false);
        FazerDailyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FazerDailyButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FazerDailyButtonMousePressed(evt);
            }
        });
        FazerDailyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FazerDailyButtonActionPerformed(evt);
            }
        });
        jPanel5.add(FazerDailyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 179, 57));

        VerDailyButton.setBackground(new java.awt.Color(13, 36, 70));
        VerDailyButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VerDailyButton.setForeground(new java.awt.Color(255, 255, 255));
        VerDailyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-daily-40.png"))); // NOI18N
        VerDailyButton.setText("Ver Daily");
        VerDailyButton.setBorder(null);
        VerDailyButton.setBorderPainted(false);
        VerDailyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VerDailyButtonMousePressed(evt);
            }
        });
        VerDailyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerDailyButtonActionPerformed(evt);
            }
        });
        jPanel5.add(VerDailyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, 57));

        Menu3.setBackground(new java.awt.Color(13, 36, 70));
        Menu3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Menu3.setForeground(new java.awt.Color(255, 255, 255));
        Menu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-calendário-de-folgas-40.png"))); // NOI18N
        Menu3.setText("Cadastrar Dias");
        Menu3.setBorder(null);
        Menu3.setBorderPainted(false);
        Menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu3MousePressed(evt);
            }
        });
        Menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu3ActionPerformed(evt);
            }
        });
        jPanel5.add(Menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 180, 57));

        Menu4.setBackground(new java.awt.Color(13, 36, 70));
        Menu4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Menu4.setForeground(new java.awt.Color(255, 255, 255));
        Menu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-daily-40.png"))); // NOI18N
        Menu4.setText("Mostrar Daily");
        Menu4.setBorder(null);
        Menu4.setBorderPainted(false);
        Menu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu4MousePressed(evt);
            }
        });
        Menu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu4ActionPerformed(evt);
            }
        });
        jPanel5.add(Menu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 180, 57));

        Menu5.setBackground(new java.awt.Color(13, 36, 70));
        Menu5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Menu5.setForeground(new java.awt.Color(255, 255, 255));
        Menu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-daily-40.png"))); // NOI18N
        Menu5.setText("Mostrar Daily");
        Menu5.setBorder(null);
        Menu5.setBorderPainted(false);
        Menu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu5MousePressed(evt);
            }
        });
        Menu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu5ActionPerformed(evt);
            }
        });
        jPanel5.add(Menu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 180, 57));

        Menu6.setBackground(new java.awt.Color(13, 36, 70));
        Menu6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Menu6.setForeground(new java.awt.Color(255, 255, 255));
        Menu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-daily-40.png"))); // NOI18N
        Menu6.setText("Mostrar Daily");
        Menu6.setBorder(null);
        Menu6.setBorderPainted(false);
        Menu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu6MousePressed(evt);
            }
        });
        Menu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu6ActionPerformed(evt);
            }
        });
        jPanel5.add(Menu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 180, 57));

        Menu7.setBackground(new java.awt.Color(13, 36, 70));
        Menu7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Menu7.setForeground(new java.awt.Color(255, 255, 255));
        Menu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-daily-40.png"))); // NOI18N
        Menu7.setText("Mostrar Daily");
        Menu7.setBorder(null);
        Menu7.setBorderPainted(false);
        Menu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu7MousePressed(evt);
            }
        });
        Menu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu7ActionPerformed(evt);
            }
        });
        jPanel5.add(Menu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 180, 57));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 600));

        jDesktopPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel3.add(jDesktopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 920, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FazerDailyButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FazerDailyButtonMousePressed
        // TODO add your handling code here:
        FazerDailyButton.setBackground(ClickColor);
        VerDailyButton.setBackground(DefaultColor);
        Menu3.setBackground(DefaultColor);
        Menu4.setBackground(DefaultColor);
        Menu5.setBackground(DefaultColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(DefaultColor);
    }//GEN-LAST:event_FazerDailyButtonMousePressed

    private void FazerDailyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FazerDailyButtonMouseClicked
        // TODO add your handling code here:
        FazerDailyButton.setBackground(ClickColor);
        VerDailyButton.setBackground(DefaultColor);
        Menu3.setBackground(DefaultColor);
        Menu4.setBackground(DefaultColor);
        Menu5.setBackground(DefaultColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(DefaultColor);
    }//GEN-LAST:event_FazerDailyButtonMouseClicked

    private void FazerDailyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FazerDailyButtonActionPerformed
        // TODO add your handling code here:
        FazerDaily fazerDaily;
        if (this.usuario==null){
            fazerDaily = new FazerDaily();
        }
        else{
            fazerDaily = new FazerDaily(usuario.getId());
        }
        
        jDesktopPanel.removeAll();
        jDesktopPanel.add(fazerDaily).setVisible(true);
    }//GEN-LAST:event_FazerDailyButtonActionPerformed

    private void VerDailyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerDailyButtonActionPerformed
        // TODO add your handling code here:
         MostrarDailys mostrarDaily;
        if (this.usuario==null){
            mostrarDaily = new MostrarDailys();
        }
        else{
            mostrarDaily = new MostrarDailys(usuario.getId());
        }
        
        jDesktopPanel.removeAll();
        jDesktopPanel.add(mostrarDaily).setVisible(true);
        
    }//GEN-LAST:event_VerDailyButtonActionPerformed

    private void VerDailyButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerDailyButtonMousePressed
        // TODO add your handling code here:
        FazerDailyButton.setBackground(DefaultColor);
        VerDailyButton.setBackground(ClickColor);
        Menu3.setBackground(DefaultColor);
        Menu4.setBackground(DefaultColor);
        Menu5.setBackground(DefaultColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(DefaultColor);
    }//GEN-LAST:event_VerDailyButtonMousePressed

    private void Menu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu3MousePressed
        // TODO add your handling code here:
        FazerDailyButton.setBackground(DefaultColor);
        VerDailyButton.setBackground(DefaultColor);
        Menu3.setBackground(ClickColor);
        Menu4.setBackground(DefaultColor);
        Menu5.setBackground(DefaultColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(DefaultColor);
    }//GEN-LAST:event_Menu3MousePressed

    private void Menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu3ActionPerformed

    private void Menu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu4MousePressed
        // TODO add your handling code here:
        FazerDailyButton.setBackground(DefaultColor);
        VerDailyButton.setBackground(DefaultColor);
        Menu3.setBackground(DefaultColor);
        Menu4.setBackground(ClickColor);
        Menu5.setBackground(DefaultColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(DefaultColor);
    }//GEN-LAST:event_Menu4MousePressed

    private void Menu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu4ActionPerformed

    private void Menu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu5MousePressed
        // TODO add your handling code here:
        FazerDailyButton.setBackground(DefaultColor);
        VerDailyButton.setBackground(DefaultColor);
        Menu3.setBackground(DefaultColor);
        Menu4.setBackground(DefaultColor);
        Menu5.setBackground(ClickColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(DefaultColor);
    }//GEN-LAST:event_Menu5MousePressed

    private void Menu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu5ActionPerformed

    private void Menu6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu6MousePressed
        // TODO add your handling code here:
        FazerDailyButton.setBackground(DefaultColor);
        VerDailyButton.setBackground(DefaultColor);
        Menu3.setBackground(DefaultColor);
        Menu4.setBackground(DefaultColor);
        Menu5.setBackground(DefaultColor);
        Menu6.setBackground(ClickColor);
        Menu7.setBackground(DefaultColor);
    }//GEN-LAST:event_Menu6MousePressed

    private void Menu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu6ActionPerformed

    private void Menu7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu7MousePressed
        // TODO add your handling code here:
        FazerDailyButton.setBackground(DefaultColor);
        VerDailyButton.setBackground(DefaultColor);
        Menu3.setBackground(DefaultColor);
        Menu4.setBackground(DefaultColor);
        Menu5.setBackground(DefaultColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(ClickColor);
    }//GEN-LAST:event_Menu7MousePressed

    private void Menu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FazerDailyButton;
    private javax.swing.JButton Menu3;
    private javax.swing.JButton Menu4;
    private javax.swing.JButton Menu5;
    private javax.swing.JButton Menu6;
    private javax.swing.JButton Menu7;
    private javax.swing.JLabel MenuName;
    private javax.swing.JButton VerDailyButton;
    private javax.swing.JLabel bemVindoText;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel seuIdText;
    // End of variables declaration//GEN-END:variables
}
