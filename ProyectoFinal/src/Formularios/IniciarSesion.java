/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author LENOVO
 */
public class IniciarSesion extends javax.swing.JFrame {
        private static final String DRIVER= "com.mysql.jdbc.Driver";
        private static final String URL= "jdbc:mysql://localhost:3306/bd-conn";
	private static final String USER= "root";
	private static final String PASSWRD= "root";

    /**
     * Creates new form IniciarSesion
     */
    public IniciarSesion() {
        initComponents();
        lbMess1.setVisible(false);
        lbMess2.setVisible(false);
        lbMess3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMessage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbNomUs = new javax.swing.JLabel();
        lbPsUs = new javax.swing.JLabel();
        txtNomUs = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbMess1 = new javax.swing.JLabel();
        lbMess2 = new javax.swing.JLabel();
        lbMess3 = new javax.swing.JLabel();
        txtPswdUs = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        lbMessage.setText("Debe ingresar su Usuario y Contrase??a.  Adem??s, si no esta registrado debe registrarse");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lbNomUs.setText("Nombre Usuario");

        lbPsUs.setText("Contrase??a Usuario");

        txtNomUs.setForeground(new java.awt.Color(204, 204, 204));
        txtNomUs.setText("Ingresar Usuario");
        txtNomUs.setBorder(null);

        btnIniciar.setText("Iniciar Sesion");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrarse");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMess1.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        lbMess1.setText("Debe ingresar su Usuario ");
        jPanel1.add(lbMess1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 60));

        lbMess2.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        lbMess2.setText("y Contrase??a; si no esta ");
        jPanel1.add(lbMess2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 51));

        lbMess3.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        lbMess3.setText("registrado debe registrarse");
        jPanel1.add(lbMess3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, 50));

        txtPswdUs.setText("Ingresar Contrase??a");
        txtPswdUs.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNomUs)
                            .addComponent(txtNomUs)
                            .addComponent(lbPsUs)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIniciar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addComponent(txtPswdUs)
                            .addComponent(jSeparator1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lbNomUs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomUs, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbPsUs)
                .addGap(18, 18, 18)
                .addComponent(txtPswdUs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // Pasar a Formulario RegistrarUsuario
        RegistrarUsuario regUs= new RegistrarUsuario();
        regUs.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        
        
        String user, ps;
        user= txtNomUs.getText();
        ps= txtPswdUs.getText();
        
            try {
                Class.forName(DRIVER);
            
                Connection con= DriverManager.getConnection(URL, USER, PASSWRD);
                Statement stat= con.createStatement();   
                
                String sqlSelect= "Select nombreUsuario, contrsnaUsuario From users"
                        + "Where nombreUsuario='"+user+"' And contrsnaUsuario='"+ps+"'";
                ResultSet result= stat.executeQuery(sqlSelect);
                if(result.next()){
                    //String nomUs= result.getString("nombreUsuario");
                    //String psUs= result.getString("contrsnaUsuario");
                    MenuPrincipal mnPr= new MenuPrincipal();
                        mnPr.setVisible(true);
                        dispose();
                
                    if(user.isEmpty() || ps.isEmpty()){
                        lbMess1.setVisible(true);
                        lbMess2.setVisible(true);
                        lbMess3.setVisible(true);
                    }else{
                        lbMess1.setText("Usuario o Contrase??a");
                        //lbMess2.
                        lbMess2.setText("incorrectos");
                        /*IniciarSesion inic= new IniciarSesion();
                        inic.setVisible(true);
                        dispose();*/
                    }
                    
                    //dtAc.setNombreUsuario(nombre);
                }   
                    
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(IniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(IniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbMess1;
    private javax.swing.JLabel lbMess2;
    private javax.swing.JLabel lbMess3;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JLabel lbNomUs;
    private javax.swing.JLabel lbPsUs;
    private javax.swing.JTextField txtNomUs;
    private javax.swing.JPasswordField txtPswdUs;
    // End of variables declaration//GEN-END:variables
}
