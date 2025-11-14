
package BaseDatos;
import java.sql.*;
import javax.swing.JOptionPane;

public class conectar {
   
   
   
   public static Connection getConexion(){
       Connection cn=null;
       try {
           //cargar nuestro driver
           Class.forName("com.mysql.jdbc.Driver");
           cn=DriverManager.getConnection("jdbc:mysql://localhost/dboec?autoReconnect=true&useSSL=false","root","");
           System.out.println("conexion establecida");
           //JOptionPane.showMessageDialog(null, "conexion establecida");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("Error de conexion");
           JOptionPane.showMessageDialog(null, "error de conexion "+e);
       }
       return cn;
   }
}
