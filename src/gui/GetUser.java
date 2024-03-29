/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import dao.UsuarioDao;
import java.awt.Color;
import modelo.Usuarios;

/**
 *
 * @author isaqu
 */
public class GetUser extends javax.swing.JFrame {

    /**
     * Creates new form GetUser
     */
    private UsuarioDao usuarioDao = new UsuarioDao();
    Color panDefault, panEnter, panClick;
    
    public GetUser() {
        initComponents();
        
        panDefault = new Color(220,141,77);
        panClick = new Color(223,171,87);
        panEnter = new Color(234,98,43);
        jPCadastar.setBackground(panDefault);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nomeField = new javax.swing.JTextField();
        scrumMaster = new javax.swing.JRadioButton();
        productOwner = new javax.swing.JRadioButton();
        devTeam = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPCadastar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        senhaField = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLCadastrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(610, 500));

        jPanel1.setBackground(new java.awt.Color(13, 36, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeField.setBackground(new java.awt.Color(13, 36, 70));
        nomeField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomeField.setForeground(new java.awt.Color(255, 255, 255));
        nomeField.setBorder(null);
        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 330, 30));

        buttonGroup1.add(scrumMaster);
        scrumMaster.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        scrumMaster.setForeground(new java.awt.Color(255, 255, 255));
        scrumMaster.setText("Scrum Master");
        scrumMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrumMasterActionPerformed(evt);
            }
        });
        jPanel1.add(scrumMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        buttonGroup1.add(productOwner);
        productOwner.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        productOwner.setForeground(new java.awt.Color(255, 255, 255));
        productOwner.setText("Product Owner");
        productOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productOwnerActionPerformed(evt);
            }
        });
        jPanel1.add(productOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        buttonGroup1.add(devTeam);
        devTeam.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        devTeam.setForeground(new java.awt.Color(255, 255, 255));
        devTeam.setText("Dev Team");
        devTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devTeamActionPerformed(evt);
            }
        });
        jPanel1.add(devTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jPanel2.setBackground(new java.awt.Color(220, 141, 77));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-adicionar-usuário-masculino-100.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cadastro");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 180, 75));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 490));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jPCadastar.setBackground(new java.awt.Color(220, 141, 77));
        jPCadastar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCadastarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCadastarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCadastarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPCadastarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPCadastarMouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cadastrar");

        javax.swing.GroupLayout jPCadastarLayout = new javax.swing.GroupLayout(jPCadastar);
        jPCadastar.setLayout(jPCadastarLayout);
        jPCadastarLayout.setHorizontalGroup(
            jPCadastarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(jPCadastarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPCadastarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPCadastarLayout.setVerticalGroup(
            jPCadastarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPCadastarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPCadastarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPCadastar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 240, 40));

        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 330, -1));

        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 330, -1));

        senhaField.setBackground(new java.awt.Color(13, 36, 70));
        senhaField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        senhaField.setForeground(new java.awt.Color(255, 255, 255));
        senhaField.setBorder(null);
        jPanel1.add(senhaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 330, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Senha");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jLCadastrar.setText("Já cadastrado");
        jLCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCadastrarMouseExited(evt);
            }
        });
        jPanel1.add(jLCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 100, -1));

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

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void scrumMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrumMasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scrumMasterActionPerformed

    private void jPCadastarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadastarMouseClicked
        // TODO add your handling code here:
        Usuarios usuario = new Usuarios();
        usuario.setNome(nomeField.getText());
        usuario.setSenha(senhaField.getPassword(), true);
        if (scrumMaster.isSelected()) {
            usuario.setCargo("Scrum Master");
        } else if (productOwner.isSelected()) {
            usuario.setCargo("Product Owner");
        } else if (devTeam.isSelected()) {
            usuario.setCargo("Dev Team");
        }
        if(usuarioDao.adicionar(usuario)){
            Login l = new Login();
            l.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jPCadastarMouseClicked

    private void jPCadastarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadastarMouseEntered
        // TODO add your handling code here:
        jPCadastar.setBackground(panEnter);

    }//GEN-LAST:event_jPCadastarMouseEntered

    private void jPCadastarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadastarMouseExited
        // TODO add your handling code here:
        jPCadastar.setBackground(panDefault);
    }//GEN-LAST:event_jPCadastarMouseExited

    private void jPCadastarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadastarMousePressed
        // TODO add your handling code here:
        jPCadastar.setBackground(panClick);
    }//GEN-LAST:event_jPCadastarMousePressed

    private void jPCadastarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCadastarMouseReleased
        // TODO add your handling code here:
        jPCadastar.setBackground(panDefault);
    }//GEN-LAST:event_jPCadastarMouseReleased

    private void devTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devTeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_devTeamActionPerformed

    private void productOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productOwnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productOwnerActionPerformed

    private void jLCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCadastrarMouseEntered
        // TODO add your handling code here:
        jLCadastrar.setForeground(new Color(12,72,186));
    }//GEN-LAST:event_jLCadastrarMouseEntered

    private void jLCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCadastrarMouseExited
        // TODO add your handling code here:
        jLCadastrar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jLCadastrarMouseExited

    private void jLCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCadastrarMouseClicked
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLCadastrarMouseClicked

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
            java.util.logging.Logger.getLogger(GetUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton devTeam;
    private javax.swing.JLabel jLCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPCadastar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomeField;
    private javax.swing.JRadioButton productOwner;
    private javax.swing.JRadioButton scrumMaster;
    private javax.swing.JPasswordField senhaField;
    // End of variables declaration//GEN-END:variables
}
