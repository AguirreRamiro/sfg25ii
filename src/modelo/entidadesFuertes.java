package modelo;

public abstract class entidadesFuertes implements crud{
    //Atributos de Clase
    private Integer id;
    //Metodos Contructores
    //Contruactor con todos los atributos de clase

    public entidadesFuertes(Integer id) {
        this.id = id;
    }
    //Contructor vacio
    public entidadesFuertes() {
        this.id = 0;  
    }
    
    //Metodos Setters y Getters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //Metodos Tipo

    @Override
    public String toString() {
        return "entidadesFuertes{" + "id=" + id + '}';
    }
    
    public abstract void mostrarDatos();
    
    public void holaMundo(){
        System.out.println("Hola Mundo - Entidades Fuertes");
    }
    
}
