package proyectolabo;

import javax.swing.JOptionPane;

public class logearse extends javax.swing.JFrame {

    /**
     * Creates new form logearse
     */
   public logearse() {
        initComponents();
        this.setLocationRelativeTo(null);
      
    }
 
    public void login (String user, String pass, String usuario, String passwor){
      
     String use=user;
     String paa=pass;
    if( usuario == null ? use == null : usuario.equals(use) && passwor == null ? paa == null : passwor.equals(paa) ){
        menuopciones nuevomenu=new menuopciones();
         this.dispose();
         this.dispose();
        nuevomenu.setVisible(true);
       
        
    }
      else{
        JOptionPane.showMessageDialog(null,"usuario o contraseña incorrecta");
        this.show();
    }
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrupo = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtusuar = new javax.swing.JTextField();
        txtpassw = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuarionewfondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuariolog.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 60, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("INICIAR SESION ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        btnregistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnregistrar.setText("Ingresar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 100, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 90, 30));

        txtusuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 90, -1));

        txtpassw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassw, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mascotasfondo.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 255)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
      if (txtusuar.getText().equals("")||txtpassw.getText().equals("")) {
          JOptionPane.showMessageDialog(null, "usuario o contraseña no ingresado");
            txtusuar.requestFocus();
        }else{
           String use=txtusuar.getText();
        String pa=txtpassw.getText();
        ProyectoLabo la = new ProyectoLabo();
        la.cargar(use,pa);
        this.dispose();
        
        
          
      }
        
        
       // po.cargar();
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtusuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarActionPerformed

    private void txtpasswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswActionPerformed

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
            java.util.logging.Logger.getLogger(logearse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logearse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logearse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logearse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logearse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngrupo;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtpassw;
    private javax.swing.JTextField txtusuar;
    // End of variables declaration//GEN-END:variables
}
