package db;
import java.sql.*;
import javax.swing.JOptionPane;

public class conectar {  

    public static Connection getConexion(){
       Connection cnn = null;
       try {
           //cargar nuestro driver
           Class.forName("com.mysql.cj.jdbc.Driver");
//           cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsfg25?autoReconnect=true&useSSL=false","root","MySQL2024!!..");
           cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsfg25?autoReconnect=true&useSSL=false&serverTimezone=America/Guayaquil","root","MySQL2024!!..");
           System.out.println("Conexion establecida: "+ cnn);
       }catch (ClassNotFoundException ex) {
           System.out.println("Error de conexion: Agregue la Driver a su proyecto "+ex);
           ex.printStackTrace();
       }catch (SQLException ex) {
           System.out.println("Error de conexion: Revice el URL de conección"+ex);
           ex.printStackTrace();
       }
       return cnn;
   }
   
//   public static Connection getConexionMySQL57(){
//       Connection cn = null;
//       try {
//           //cargar nuestro driver
//           Class.forName("com.mysql.jdbc.Driver");
//           cn = DriverManager.getConnection("jdbc:mysql://localhost/dbsfg21iia?autoReconnect=true&useSSL=false","root","");
//           System.out.println("conexion establecida");
//       } catch (ClassNotFoundException | SQLException e) {
//           System.out.println("Error de conexion "+e);
//           JOptionPane.showMessageDialog(null, "Error de conexion "+e);
//       }
//       return cn;
//   }
}
