package proyectolabo;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class buscar extends javax.swing.JFrame {

    /**
     * Creates new form dueño
     */
    public buscar() {
        initComponents();
        this.setLocationRelativeTo(null);
        textpane.setText("Nota: Si no ha registrado con anterioridad no deberia\n"
                + "estar en esta pestaña, primero debe registrar\n"
                + " a su mascota,en ser ese el caso, debe presionar \"cancelar\".");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscarrg = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textpane = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdui = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbxsexop = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtmascota = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxanimal = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtraza = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btncacelar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txttamaño = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtpeso = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarrg.setEnabled(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuarionewfondo.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 50, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuariolog.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 60, 50));
        jPanel3.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 160, -1));

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel3.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jButton5.setText("cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, -1));

        jScrollPane2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textpane.setBackground(new java.awt.Color(204, 204, 255));
        textpane.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textpane.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textpane.setEnabled(false);
        jScrollPane2.setViewportView(textpane);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 360, 70));

        buscarrg.addTab("usuario", jPanel3);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 85, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APELLIDO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 85, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DUI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        txtdui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtduiActionPerformed(evt);
            }
        });
        jPanel1.add(txtdui, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 85, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SEXO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Datos del dueño");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avanzar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 60, 60));

        cbxsexop.setBackground(new java.awt.Color(0, 102, 102));
        cbxsexop.setForeground(new java.awt.Color(255, 255, 255));
        cbxsexop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(cbxsexop, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dueñonew.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 450));

        buscarrg.addTab("dueño", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Datos de la mascota");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        jPanel2.add(txtmascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo de animal:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        cbxanimal.setBackground(new java.awt.Color(0, 153, 153));
        cbxanimal.setForeground(new java.awt.Color(255, 255, 255));
        cbxanimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato", "Hamster", "Ave", "Conejo", "Reptil" }));
        cbxanimal.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cbxanimal.setEditor(null);
        cbxanimal.setFocusCycleRoot(true);
        jPanel2.add(cbxanimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 110, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Raza");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        jPanel2.add(txtraza, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 110, -1));

        btnguardar.setText("Guardar cambios");
        jPanel2.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        btncacelar.setText("Cancelar");
        btncacelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncacelarActionPerformed(evt);
            }
        });
        jPanel2.add(btncacelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tamaño:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPanel2.add(txttamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 110, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Edad:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel2.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Peso:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        jPanel2.add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 110, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Sexo");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jComboBox3.setBackground(new java.awt.Color(0, 153, 153));
        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hembra", "varon" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dueñonew.png"))); // NOI18N
        jPanel2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        buscarrg.addTab("mascota", jPanel2);

        getContentPane().add(buscarrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtduiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtduiActionPerformed

    }//GEN-LAST:event_txtduiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscarrg.setSelectedIndex(2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncacelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncacelarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btncacelarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (txtnombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nombre del propietario no hacido ingresado");
            txtnombre.requestFocus();
        } else if (txtapellido.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Apellido del propietario no hacido ingresado");
            txtapellido.requestFocus();
        } else if (txtdui.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Documento de identificacion del propietario no hacido ingresado");
            txtdui.requestFocus();
        } else if (txtmascota.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nombre de la mascota no hacido ingresado");
            txtmascota.requestFocus();
        } else if (txtraza.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Raza de la mascota no hacido ingresado");
            txtraza.requestFocus();
        } else if (txttamaño.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Tamaño de la mascota no hacido ingresado");
            txttamaño.requestFocus();
        } else if (txtpeso.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Peso de la mascota no hacido ingresado");
            txtpeso.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "guardado con exito");
        }
    }

    private void txttamañoKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        char letra = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
        if (evt.getKeyChar() == '.' && txttamaño.getText().contains(".")) {
            evt.consume();
        }
    }

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        char dato = evt.getKeyChar();
        String cadena = "" + dato;
        if (!cadena.matches("[0-9]")) {
            evt.consume();
        }
    }

    private void txtpesoKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        char letra = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
        if (evt.getKeyChar() == '.' && txttamaño.getText().contains(".")) {
            evt.consume();
        }
    }

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        char dato = evt.getKeyChar();
        String cadena = "" + dato;
        if (!Character.isLetter(dato)) {
            evt.consume();
        }
    }

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        char dato = evt.getKeyChar();
        String cadena = "" + dato;
        if (!Character.isLetter(dato)) {
            evt.consume();
        }
    }

    private void txtmascotaKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        char dato = evt.getKeyChar();
        String cadena = "" + dato;
        if (!Character.isLetter(dato)) {
            evt.consume();
        }
    }

    private void txtrazaKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        char dato = evt.getKeyChar();
        String cadena = "" + dato;
        if (!Character.isLetter(dato)) {
            evt.consume();
        }
    }

    private void txtduiKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        int limite = 8;
        if (txtdui.getText().length() > limite) {
            evt.consume();
        }
        char dato = evt.getKeyChar();
        String cadena = "" + dato;
        if (!cadena.matches("[0-9]")) {
            evt.consume();
        }
    }

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtapellido.requestFocus();
        }
    }

    private void txtapellidoKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtdui.requestFocus();
        }
    }

    private void txtduiKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxsexop.requestFocus();
        }
    }

    private void txtmascotaKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxanimal.requestFocus();
        }

    }

    private void txtrazaKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txttamaño.requestFocus();
        }
    }

    private void txttamañoKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtedad.requestFocus();
        }
    }

    private void txtedadKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtpeso.requestFocus();
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        if(txtusuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "usuario no ingresado");
            txtusuario.requestFocus();
        }else{
            this.buscarrg.setEnabled(true);
        this.buscarrg.setSelectedIndex(1);
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
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncacelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTabbedPane buscarrg;
    private javax.swing.JComboBox<String> cbxanimal;
    private javax.swing.JComboBox<String> cbxsexop;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane textpane;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtdui;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtmascota;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txtraza;
    private javax.swing.JTextField txttamaño;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}