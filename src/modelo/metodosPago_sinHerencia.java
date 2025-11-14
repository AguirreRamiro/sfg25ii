package modelo;
//Definición de un modelo de clase
public class metodosPago_sinHerencia {
    //Atributos de clase
    private Integer idMetodoPago;
    private String tipoPago;
    //Métodos Contructores
    
    //Todos los atributos de clase
    public metodosPago_sinHerencia(Integer idMetodoPago,String tipoPago){
        this.idMetodoPago = idMetodoPago;
        this.tipoPago = tipoPago;
    }
    //Todos los atributos de clase excepto el ID
    public metodosPago_sinHerencia(String tipoPago){
        this.tipoPago = tipoPago;
    }
    //Vacio
    public metodosPago_sinHerencia(){
    
    }
    //Metodos Setters y Getters
    //Setters
    public void setIdMetodoPago(Integer idMetodoPago){
        this.idMetodoPago = idMetodoPago;
    }
    public void setTipoPago(String tipoPago){
        this.tipoPago = tipoPago;
    }
    //Getters
    public Integer getIdMetodoPago(){
        return idMetodoPago;
    }
    
    public String getTipoPago(){
        return tipoPago;
    }
    //Métodos tipo
    
    @Override
    public String toString() {
        return "metodosPago{" + "idMetodoPago=" + idMetodoPago + ", tipoPago=" + tipoPago + '}';
    }
}
