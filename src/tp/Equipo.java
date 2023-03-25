package tp;


public class Equipo {
    private String nombre;
    private String descripcion;
    
    // Constructors
    public Equipo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Equipo() {
        this.nombre = "";
        this.descripcion = "";
    }
    
    // Getters and Setters
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
        return "Equipo{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
  
}
