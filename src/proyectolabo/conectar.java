
package proyectolabo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {
   private static Connection conn;
  private static final String driver ="com.mysql.jdbc.Driver";
          private static final String user= "root";
          private static final String password ="";
          private static final String url = "jdbc:mysql://localhost:3306/mascotas";

    public conectar() {
    
    }
    public Connection getConnection() {
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
  
    return conn;
         
}
    public void animal(int n){
        if (n>0){
           
        }
    }
public void desconectar () {
    conn=null;
    if(conn==null) {
        System.out.println("desconectado bb");
    }  
}
}