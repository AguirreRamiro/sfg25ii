package evaluaciones;

public class dependiente extends generica{
    private String observaciones;
    //Contructores
    public dependiente(String observaciones){
        this.observaciones = observaciones;
    }
    
    
    //Setters Getters

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    //Metodos tipo
    public String toString(){
        return super.toString()+"\nObservaciones: "+observaciones;
    }
    public void ajustes(){
        System.out.println("Ajustes Dependientes");
    }
    
    public String mostrarDatos(){
        return "\nObservaciones: "+observaciones;
    }

    public dependiente(String observaciones, Integer idGenerica, String descripcion) {
        super(idGenerica, descripcion);
        this.observaciones = observaciones;
    }
    
    
}
