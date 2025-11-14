package modelo;

public class Roles {
// Atributos de clase

    private int idRol;
    private String rolNombre;
    private String rolDescripcion;

// Constructor con todos los atributos
    public Roles(int idRol, String rolNombre, String rolDescripcion) {
        this.idRol = idRol;
        this.rolNombre = rolNombre;
        this.rolDescripcion = rolDescripcion;
    }

// Constructor sin el id (primary key)
    public Roles(String rolNombre, String rolDescripcion) {
        this.rolNombre = rolNombre;
        this.rolDescripcion = rolDescripcion;
    }

// Constructor vacío
    public Roles() {
    }

// Métodos Getter y Setter
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public String getRolDescripcion() {
        return rolDescripcion;
    }

    public void setRolDescripcion(String rolDescripcion) {
        this.rolDescripcion = rolDescripcion;
    }

// Método toString()
    @Override
    public String toString() {
        return "Roles{"
                + "idRol=" + idRol
                + ", rolNombre='" + rolNombre + '\''
                + ", rolDescripcion='" + rolDescripcion + '\''
                + '}';
    }
}
