/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import BD.DataAccess;
import Connect.BD_Con;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felix Andres Almonte P (2021-2030)
 */
public class GestionUsuarios extends javax.swing.JFrame {
        private static final String DRIVER= "com.mysql.jdbc.Driver";
        private static final String URL= "jdbc:mysql://localhost:3306/bd-conn";
	private static final String USER= "root";
	private static final String PASSWRD= "root";
    DefaultTableModel mod;
    
    public GestionUsuarios() throws ClassNotFoundException {
        initComponents();
        
        
        String[] titles= {"Usuario", "Contraseña", "Nombre", "Apellido", "Numero Tel.", "Correo Elect."};
        mod= new DefaultTableModel(null, titles);
        tableGesUser.setModel(mod);
        this.showTab();
        //Para controlar JButton desde Constructor
        this.btnsEnd();
    

    //Parte del Constructor encargada de la JTable
        
            //this.showTab();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGesUser = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setBackground(new java.awt.Color(255, 153, 0));

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 105, 34));

        btnGoBack.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btnGoBack.setText("Regresar");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, 34));

        btnInsert.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btnInsert.setText("Ingresar");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 99, 34));

        tableGesUser.setBorder(new javax.swing.border.MatteBorder(null));
        tableGesUser.setForeground(new java.awt.Color(204, 204, 0));
        tableGesUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tableGesUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGesUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGesUser);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 515, 109));

        btnUpdate.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 115, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Inicia Codigo Generado por Controles
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        //Pasar al Formulario Insertar
        BD_Con con = new BD_Con();
        con.conectar();
        Insertar ins= new Insertar();
        ins.setVisible(true);
        dispose();
        //this.showTab();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        //Pasar al Formulario MenuPrincipal
        MenuPrincipal mnPrn= new MenuPrincipal();
        mnPrn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DataAccess dtAc= new DataAccess();
        try {
                //Eliminar registro de la JTable y BD
                Class.forName(DRIVER);
                Connection con= DriverManager.getConnection(URL, USER, PASSWRD);
                Statement stat= con.createStatement();   
                
                String sqlSelect= "Select * From users";
                ResultSet result= stat.executeQuery(sqlSelect);
                while(result.next()){
                    String nomUsuario= result.getString("nombreUsuario");
                    dtAc.setNombreUsuario(nomUsuario);
                }
                    String nomUs= dtAc.getNombreUsuario();
                    String sqlQuery= "Delete from users where nombreUsuario= '"+nomUs+"'";
                    stat.executeUpdate(sqlQuery);
                this.showTab();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(GestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }        
        
            try {
                this.showTab();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        this.btnsEnd();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // Actualizar registro de la JTable y BD
        Actualizar act= new Actualizar();
        act.setVisible(true);
        this.btnsEnd();
        //this.showTab();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tableGesUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGesUserMouseClicked
        // TODO add your handling code here:
        Actualizar act= new Actualizar();
        if(evt.getClickCount()==1){
            JTable cap= (JTable)evt.getSource();

            act.txtNomUsuario.setText(cap.getModel().getValueAt(cap.getSelectedRow(), 0).toString());
            act.txtContrsnaUsuario.setText(cap.getModel().getValueAt(cap.getSelectedRow(), 1).toString());
            act.txtNombrePersona.setText(cap.getModel().getValueAt(cap.getSelectedRow(), 2).toString());
            act.txtApellidoPersona.setText(cap.getModel().getValueAt(cap.getSelectedRow(), 3).toString());
            act.txtCorreo.setText(cap.getModel().getValueAt(cap.getSelectedRow(), 4).toString());
            act.txtNumTel.setText(cap.getModel().getValueAt(cap.getSelectedRow(), 5).toString());
        }
        
        //Control sobre los JButtons al ser seleccionados
        btnInsert.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tableGesUserMouseClicked
    //Cierra Codigo Generado por Controles
    
    //Codigo Manual
    public DataAccess registrar(){
        RegistrarUsuario regUser= new RegistrarUsuario();
        DataAccess dtAc= new DataAccess();
            dtAc.setNombreUsuario(regUser.getTxtNomUser());
            dtAc.setContrsnaUsuario(regUser.getTxtContsnaUsuario());
            dtAc.setConfirmarContrsna(regUser.getTxtConfirmarContrsna());
            dtAc.setNombrePersona(regUser.getTxtNombrePersona());
            dtAc.setApellidoPersona(regUser.getTxtApellidoPersona());
            dtAc.setNumeroTelefono(regUser.getTxtNumeroTelefono());
            dtAc.setCorreo(regUser.getTxtCorreo());
        return dtAc;
    }
    
    public void btnsEnd(){
        //Para bloquear los botones
        btnInsert.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    
    public void showTab() throws ClassNotFoundException{
        //Adaptacion para la Tabla mod
        while(mod.getRowCount()>0){
            mod.removeRow(0);
        }
        
        //Conexion BD y obtencion de los datos del JFrame
        
        try{
            Class.forName(DRIVER);
            Connection con= DriverManager.getConnection(URL, USER, PASSWRD);
            Statement stat= con.createStatement();
            String sqlQuery= "Select * From users";
            ResultSet result= stat.executeQuery(sqlQuery);
                
            while(result.next()){
                String nomUsuario= result.getString("nombreUsuario");
                String contUsuario= result.getString("contrsnaUsuario");
                String nomPer= result.getString("nombrePersona");
                String apPer= result.getString("apellidoPersona");
                String numTel= result.getString("numeroTelefono");
                String email= result.getString("correo");
                    
            //Objeto para presentar la informacion en la JTable mod
                Object[] tab= {nomUsuario, contUsuario, nomPer, apPer, numTel, email};
                mod.addRow(tab);
            }
                con.close();
                  
                } catch(Exception e){
                        System.out.println(e);
                        }
    }
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
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GestionUsuarios().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable tableGesUser;
    // End of variables declaration//GEN-END:variables
}

