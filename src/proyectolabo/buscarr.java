/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolabo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class buscarr extends javax.swing.JFrame {

    /**
     * Creates new form buscarr
     */
    public buscarr() {
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

        txtbusca = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnbuscar.setText("buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("ingrese el numero de dui para poder buscar su mascota");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnbuscar)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
 
    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
       String busca ="";
       busca =txtbusca.getText();
        buscar bus = new buscar();
        
        String sql = "SELECT * FROM dueño where dui="+busca;
          conectar cc = new conectar();
          Connection cn = cc.getConnection();
          String nombre, apellido,dui,sexo;
        
          
         
              
      try {
           Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
          while(rs.next()){
        nombre=rs.getString("nombre");
       apellido=rs.getString("apellido");
       dui=rs.getString("dui");
       sexo=rs.getString("sexo");
       //JOptionPane.showMessageDialog(null,nombre+apellido+dui+sexo);
       bus.show();
        bus.mostrar(nombre,apellido,dui,sexo);
       this.dispose();
          
             }  
      } catch (SQLException ex) {
          Logger.getLogger(ProyectoLabo.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "ierror al ingresar los datos de la persona");
      }
      
      String nom,tipo,edad,tamaño,peso,sexoo,Dui,raza,id;
     String mysql = "SELECT * FROM animal where dui="+busca;
         // conectar cc = new conectar();
         // Connection cn = cc.getConnection();
          //String nombre, apellido,dui,sexo;
        
          
         
              
      try {
           Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(mysql);
            
          while(rs.next()){
        nom=rs.getString("nomascota");
       tipo=rs.getString("tipoanimal");
       edad=rs.getString("edad");
       tamaño=rs.getString("tamaño");
       peso=rs.getString("peso");
       sexo=rs.getString("sexo");
       Dui=rs.getString("Dui");
       raza=rs.getString("raza");
       id=rs.getString("idmascota");
       //JOptionPane.showMessageDialog(null,"");
       bus.show();
        bus.mostraranimal(nom, edad, tamaño, peso, sexo, tipo, Dui, raza, id);
       this.dispose();
          
             }  
      } catch (SQLException ex) {
          Logger.getLogger(ProyectoLabo.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "error al ingresar los datos del animal");
      }
         
          
      
         
              
    }//GEN-LAST:event_btnbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(buscarr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscarr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscarr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscarr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscarr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtbusca;
    // End of variables declaration//GEN-END:variables
}