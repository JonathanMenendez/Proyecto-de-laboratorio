/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolabo;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class dueño extends javax.swing.JFrame {

    /**
     * Creates new form dueño
     */
    public dueño() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    //guarda los dato del dueño
    public void datosDueño() {
        conectar cc = new conectar();
        Connection cn = cc.getConnection();
        String nombre, apellido, sexo = "", dui;
        String mysql = "";
        nombre = txtnombre.getText();
        apellido = txtapellido.getText();
        dui = txtdui.getText();
      
        //ver que sexo selecciona  
          sexo=String.valueOf(cbxsexo.getSelectedItem());
        
        mysql = "INSERT INTO dueño (nombre,apellido,dui,sexo) VALUES (?,?,?,?)";

        try {
            PreparedStatement Pst = cn.prepareStatement(mysql);
            Pst.setString(1, nombre);
            Pst.setString(2, apellido);
            Pst.setString(3, dui);
            Pst.setString(4, sexo);

            int n = Pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "DATOS DEL DUEÑO guardado con exito");
            }
        } catch (SQLException ex) {
            Logger.getLogger(dueño.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ay regada no guarda los dato");
        }

        //datos de la masocota
        String nom, tipo = "", sex = "", raza = "";
        String peso = "", tamaño = "", edad = "";
        String sql = "";
        raza = txtraza.getText();
        peso = txtpeso.getText();
        tamaño = txttamaño.getText();
        edad = txtedad.getText();
        nom = txtmascota.getText();
        dui = txtdui.getText();
        tipo=String.valueOf(cbxanimal.getSelectedItem());
        // mira que tipo de animal ha selecciondo
        sex=String.valueOf(cbxexoo.getSelectedItem());
        //apellido=txtapellido.getText();
        sql = "INSERT INTO animal (nomascota,edad,tamaño,peso,sexo,tipoanimal,Dui,raza) VALUES (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement Pst = cn.prepareStatement(sql);
            Pst.setString(1, nom);
            Pst.setString(2, edad);
            Pst.setString(3, tamaño);
            Pst.setString(4, peso);
            Pst.setString(5, sex);
            Pst.setString(6, tipo);
            Pst.setString(7, dui);
            Pst.setString(8, raza);
            int n = Pst.executeUpdate();
            if (n > 0) {
                //JOptionPane.showMessageDialog(null, "guardado con exito los DATOS DEL animal");
                menuopciones men = new menuopciones ();
                men.show();
                this.dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(dueño.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ay regada no guarda los datodel animal");
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

        registro = new javax.swing.JTabbedPane();
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
        cbxsexo = new javax.swing.JComboBox<>();
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
        btncancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txttamaño = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbxexoo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registro.setEnabled(false);

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
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
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
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 85, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DUI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        txtdui.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtdui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtduiActionPerformed(evt);
            }
        });
        txtdui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtduiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtduiKeyTyped(evt);
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

        cbxsexo.setBackground(new java.awt.Color(0, 102, 102));
        cbxsexo.setForeground(new java.awt.Color(255, 255, 255));
        cbxsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione genero", "Masculino", "Femenio" }));
        cbxsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxsexoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dueñonew.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 450));

        registro.addTab("tab1", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Datos de la mascota");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        txtmascota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmascotaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmascotaKeyTyped(evt);
            }
        });
        jPanel2.add(txtmascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo de animal:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        cbxanimal.setBackground(new java.awt.Color(0, 153, 153));
        cbxanimal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxanimal.setForeground(new java.awt.Color(255, 255, 255));
        cbxanimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione animal", "Perro", "Gato", "Hamster", "Ave", "Conejo", "Reptil" }));
        cbxanimal.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cbxanimal.setEditor(null);
        cbxanimal.setFocusCycleRoot(true);
        jPanel2.add(cbxanimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 140, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Raza:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtraza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtraza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrazaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrazaKeyTyped(evt);
            }
        });
        jPanel2.add(txtraza, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, -1));

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("tamaño");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Edad:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Peso:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        txttamaño.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttamaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttamañoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttamañoKeyTyped(evt);
            }
        });
        jPanel2.add(txttamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 140, -1));

        txtedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtedadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });
        jPanel2.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 140, -1));

        txtpeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpesoKeyTyped(evt);
            }
        });
        jPanel2.add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 140, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sexo:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        cbxexoo.setBackground(new java.awt.Color(0, 153, 153));
        cbxexoo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxexoo.setForeground(new java.awt.Color(255, 255, 255));
        cbxexoo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione sexo", "hembra", "varon" }));
        jPanel2.add(cbxexoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dueñonew.png"))); // NOI18N
        jPanel2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        registro.addTab("tab2", jPanel2);

        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

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
        if (txtnombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Nombre del propietario no hacido ingresado");
                txtnombre.requestFocus();
            } else if (txtapellido.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Apellido del propietario no hacido ingresado");
                txtapellido.requestFocus();
            } else if (txtdui.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Documento de identificacion del propietario no hacido ingresado");
                txtdui.requestFocus();
                } else{
                 registro.setSelectedIndex(1);
            }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        // TODO add your handling code here:
        
            if (txtmascota.getText().equals("")) {
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
               // JOptionPane.showMessageDialog(null, );
                
               //ESTE METODO ES EL QUE LLAMA LA CONEXION Y GUARDA LOS DATOS ESTA AL PRICIPIO DE ESTA CLASE
        
                  datosDueño(); 
                
            }  
        


    }//GEN-LAST:event_btnguardarActionPerformed

    private void txttamañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttamañoKeyTyped
        // TODO add your handling code here:
        char letra = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
        if (evt.getKeyChar() == '.' && txttamaño.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txttamañoKeyTyped

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        // TODO add your handling code here:
        char dato = evt.getKeyChar();
        String cadena = "" + dato;
        if (!cadena.matches("[0-9]")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtedadKeyTyped

    private void txtpesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesoKeyTyped
        // TODO add your handling code here:
        char letra = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
        if (evt.getKeyChar() == '.' && txttamaño.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtpesoKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
        char dato = evt.getKeyChar();
        String cadena = "" + dato;
        if (!Character.isLetter(dato)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        // TODO add your handling code here:
        char dato = evt.getKeyChar();
        String cadena = "" + dato;
        if (!Character.isLetter(dato)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtmascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmascotaKeyTyped
        // TODO add your handling code here:
        char dato = evt.getKeyChar();
        String cadena = "" + dato;
        if (!Character.isLetter(dato)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmascotaKeyTyped

    private void txtrazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrazaKeyTyped
        // TODO add your handling code here:
        char dato = evt.getKeyChar();
        String cadena = "" + dato;
        if (!Character.isLetter(dato)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtrazaKeyTyped

    private void txtduiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtduiKeyTyped
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
    }//GEN-LAST:event_txtduiKeyTyped

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtapellido.requestFocus();
        }
    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtapellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtdui.requestFocus();
        }
    }//GEN-LAST:event_txtapellidoKeyPressed

    private void txtduiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtduiKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxsexo.requestFocus();
        }
    }//GEN-LAST:event_txtduiKeyPressed

    private void txtmascotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmascotaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxanimal.requestFocus();
        }

    }//GEN-LAST:event_txtmascotaKeyPressed

    private void txtrazaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrazaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txttamaño.requestFocus();
        }
    }//GEN-LAST:event_txtrazaKeyPressed

    private void txttamañoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttamañoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtedad.requestFocus();
        }
    }//GEN-LAST:event_txttamañoKeyPressed

    private void txtedadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtpeso.requestFocus();
        }
    }//GEN-LAST:event_txtedadKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        registro.setSelectedIndex(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbxsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxsexoActionPerformed

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
            java.util.logging.Logger.getLogger(dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dueño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cbxanimal;
    private javax.swing.JComboBox<String> cbxexoo;
    private javax.swing.JComboBox<String> cbxsexo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTabbedPane registro;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtdui;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtmascota;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txtraza;
    private javax.swing.JTextField txttamaño;
    // End of variables declaration//GEN-END:variables
}
