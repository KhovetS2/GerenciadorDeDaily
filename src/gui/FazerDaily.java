/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import dao.DailyDao;
import dao.UsuarioDao;

import java.util.Calendar;

import javax.swing.plaf.basic.BasicInternalFrameUI;

import modelo.Daily;
import modelo.Usuarios;

/**
 *
 * @author isaqu
 */
public class FazerDaily extends javax.swing.JInternalFrame {

    /**
     * Creates new form FazerDaily
     */
    
    private Usuarios usuario = new Usuarios();
    private UsuarioDao usuarioDao = new UsuarioDao();
    private DailyDao dailyDao = new DailyDao();
    
    public FazerDaily() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }
    
    public FazerDaily(int id) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        this.usuario.setId(id);
        this.usuario = this.usuarioDao.getUsuarioById(usuario.getId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        conteudoField1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        enviarDaily = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        conteudoField1.setColumns(20);
        conteudoField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        conteudoField1.setLineWrap(true);
        conteudoField1.setRows(5);
        conteudoField1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(conteudoField1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-daily-32.png"))); // NOI18N
        jLabel1.setText("Escreva sua daily");

        enviarDaily.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enviarDaily.setText("Enviar daily");
        enviarDaily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarDailyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(enviarDaily)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(enviarDaily, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarDailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarDailyActionPerformed
        // TODO add your handling code here:
        if(this.usuario!=null){
            Daily daily = new Daily();
            daily.setConteudo(conteudoField1.getText());
            daily.setUsuarios_id(usuario.getId());
            Calendar cal = Calendar.getInstance();


            cal.set(Calendar.YEAR, cal.get(Calendar.YEAR));
            cal.set(Calendar.MONTH, cal.get(Calendar.MONTH));
            cal.set(Calendar.DATE, cal.get(Calendar.DAY_OF_MONTH));

            java.sql.Date sqlDate = new java.sql.Date(cal.getTimeInMillis());
            daily.setData(sqlDate);
            dailyDao.adicionar(daily);
            conteudoField1.setText("");


        }else{

        }
        
    }//GEN-LAST:event_enviarDailyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea conteudoField1;
    private javax.swing.JButton enviarDaily;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
