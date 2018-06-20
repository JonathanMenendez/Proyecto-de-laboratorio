
package proyectolabo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conectar {
   private static Connection conn;
  private static final String driver ="com.mysql.jdbc.Driver";
          private static final String user= "root";
          private static final String password ="";
          private static final String url = "jdbc:mysql://localhost:3306/mascotas";

    

    public conectar() {
    conn= null;
    try {
      Class.forName(driver);
      conn= DriverManager.getConnection(url,user,password);
      if(conn!= null) {
          System.out.print("conexcion establecida");
          
         
         
      }
    }
    catch(ClassNotFoundException | SQLException e) {
     System.out.println("error"+e);   
    }
    }
      void cargar(){
   
          String sql = "SELECT * FROM datos";
          conectar cc = new conectar();
          Connection cn = cc.getConnection();
          
          
           try { 
               Statement st = cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
          String usuari="";
          String pass="";
          usuari=rs.getString("usuario");
          pass=rs.getString("contraseña");
          JOptionPane.showMessageDialog(null, usuari+pass);
      } catch (SQLException ex) {
          Logger.getLogger(conectar.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "se esta saliendo no muestra datos");
      }
        
        
    }
    public Connection getConnection() {
        
  
    return conn;
          
} 
public void desconectar () {
    conn=null;
    if(conn==null) {
        System.out.println("desconectado bb");
    }
}
}