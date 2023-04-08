package tp;


public class Equipo {
    private int idEquipo;
    private String nombre;
    private String descripcion;
    
    // Constructors
    public Equipo(int idEquipo, String nombre, String descripcion) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Equipo() {
        this.idEquipo = 0;
        this.nombre = "";
        this.descripcion = "";
    }
    
    // Getters and Setters
    
    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // ToString()
    @Override
    public String toString() {
        return "Equipo{" + "idEquipo=" + idEquipo + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
  
}
