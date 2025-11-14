package evaluaciones;

public abstract class generica implements caleccion{
    //atributos de clase
    private Integer idGenerica;
    private String descripcion;
    //contructores
    public generica(){
        
    }
    public generica(Integer idGenerica, String descripcion){
        this.idGenerica=idGenerica;
        this.descripcion=descripcion;
    }
    public generica(String descripcion){
        this.descripcion=descripcion;
    }
    //Setters
    public void setIdGenerica(Integer idGenerica){
        this.idGenerica = idGenerica;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    //Getters
    public Integer getIdGenerica(){
        return idGenerica;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    //metodo tipo
    
    public String toString(){
        return "\nidGenerica: "+idGenerica+"\nDescripion: "+descripcion;
    }
    
}
