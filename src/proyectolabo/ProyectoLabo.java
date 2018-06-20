
package proyectolabo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProyectoLabo {
  void cargar( String usuario1, String passwor1){
   String passwor=passwor1;
   String usuario=usuario1;
          String sql = "SELECT * FROM datos";
          conectar cc = new conectar();
          Connection cn = cc.getConnection();
          
          
         
              
      try {
           Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String usuari;
          String pass;
          while(rs.next()){
          usuari=rs.getString("usuario");
          pass=rs.getString("contraseña");
       
          logearse lo = new logearse();
          lo.login(usuari, pass,usuario, passwor);
             }  
      } catch (SQLException ex) {
          Logger.getLogger(ProyectoLabo.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "igual sigue sin entrar");
      }
         
          
      
         
      
        
        
    }
    public static void main(String[] args) {
  //  logearse nuevo=new logearse();
   // nuevo.show();
    conectar con = new conectar();
    con.getConnection();
   logearse du = new logearse();
   
    du.show();
    
   }
    
}
