/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class GestionProductos extends javax.swing.JFrame {
        private static final String DRIVER= "com.mysql.jdbc.Driver";
        private static final String URL= "jdbc:mysql://localhost:3306/bd-conn";
	private static final String USER= "root";
	private static final String PASSWRD= "root";    
        DefaultTableModel mod;
        
    /**
     * Creates new form GestionProductos
     */
    public GestionProductos() throws ClassNotFoundException {
        initComponents();
        
        String[] titles= {"Nombre Prod.", "Marca Prod.", "Categoria", "Precio", "Cantidad Disponible"};
        mod= new DefaultTableModel(null, titles);
        tableGesProd.setModel(mod);
        
        this.showTab();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGesProd = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableGesProd.setBorder(new javax.swing.border.MatteBorder(null));
        tableGesProd.setModel(new javax.swing.table.DefaultTableModel(
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
        tableGesProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGesProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGesProd);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 527, 110));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 147, 41));

        btnNuevo.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 151, 41));

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Pasar a Formulario MenuPrincipal
        MenuPrincipal mnPr= new MenuPrincipal();
        mnPr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // Pasar a Formulario NuevosProductos
        NuevosProductos nvPr= new NuevosProductos();
        nvPr.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tableGesProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGesProdMouseClicked
        // TODO add your handling code here:
        ActualizarProductos actPr= new ActualizarProductos();
       try {
             if(evt.getClickCount()==1){
            JTable cap= (JTable)evt.getSource();

            //JTextField txtNombre= (JTextField)actPr.txtNombre;
            actPr.txtNombre.setText(cap.getModel().getValueAt(cap.getSelectedRow(),0).toString());
            actPr.txtMarca.setText(cap.getModel().getValueAt(cap.getSelectedRow(),1).toString());
            actPr.txtCategoria.setText(cap.getModel().getValueAt(cap.getSelectedRow(),2).toString());
            actPr.txtPrecio.setText(cap.getModel().getValueAt(cap.getSelectedRow(),3).toString());
            actPr.txtCantidad.setText(cap.getModel().getValueAt(cap.getSelectedRow(),4).toString());
            
            actPr.setVisible(true);
            }} catch (Exception ex) {
                Logger.getLogger(GestionProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableGesProdMouseClicked

    //Codigo Manual
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
            String sqlQuery= "Select * From products";
            ResultSet result= stat.executeQuery(sqlQuery);
                
            while(result.next()){
                String nombre= result.getString("nombre");
                String marca= result.getString("marca");
                String categoria= result.getString("categoria");
                String precio= result.getString("precio");
                String cant= result.getString("cantidadDisponible");
                
                    
            //Objeto para presentar la informacion en la JTable mod
                Object[] tab= {nombre, marca, categoria, precio, cant};
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
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GestionProductos().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GestionProductos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable tableGesProd;
    // End of variables declaration//GEN-END:variables
}
