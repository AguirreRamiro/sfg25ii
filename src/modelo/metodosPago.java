package modelo;

import db.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class metodosPago extends entidadesFuertes{
    //atributos de clase
    private String tipoPago;
    //Constructores
    //Todos los atributos de clase
    public metodosPago(Integer id, String tipoPago) {
        super(id);
        this.tipoPago = tipoPago;
    }

    public metodosPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public metodosPago() {
    }
    
    //Métodos Setters y Getters

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    //Metodos tipo

    @Override
    public String toString() {
        
        return super.toString()+"metodosPago{" + "tipoPago=" + tipoPago + '}';
    }

    @Override
    public void guardar(){
        Connection cnn = conectar.getConexion();
        PreparedStatement ps = null;

        String sql = "INSERT INTO categorias (catNombre,catDescripcion)VALUES (?,?)";
        try {
            ps = cnn.prepareStatement(sql);
//            ps.setString(1, getNombre());
//            ps.setString(2, getDescripción());
            //Control
            int n = ps.executeUpdate();
            if (n > 0) {
                System.out.println("Grabación Exitosa"+ps);
                JOptionPane.showMessageDialog(null, "Registrado con exito\n"+toString(), "Grabar Registro", JOptionPane.INFORMATION_MESSAGE);
            }

            cnn.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se logro grabar el Registro.." + e);
            e.printStackTrace();
        }
    }
    

    @Override
    public void buscar() {
        System.out.println("Método Buscar - metodosPago");
    }

    @Override
    public void actualizar() {
        System.out.println("Método Actualizar - metodosPago");
    }

    @Override
    public void eliminar() {
        System.out.println("Método Eliminar - metodosPago");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(""+super.toString()+"metodosPago{" + "tipoPago=" + tipoPago + '}'); 
    }
}
