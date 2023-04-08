package tp; 

public class Participante {

    private String nombre;
    private Pronostico[] pronosticos;

    // Constructors
    public Participante(String nombre, Pronostico[] pronostico) {
        this.nombre = nombre;
        this.pronosticos = pronostico;
    }

    public Participante() {
        this.nombre = "";
        this.pronosticos = null;
    }

    // Setters and Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pronostico[] getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(Pronostico[] pronostico) {
        this.pronosticos = pronostico;
    }

    // toString()
    @Override
    public String toString() {
        String aux;
        int cantPronosticos;
        if (pronosticos==null) {
            cantPronosticos = 0;
        } else {
            cantPronosticos = pronosticos.length;
        }
        if (cantPronosticos == 0) {
            aux = "[]";
        } else {
            aux = "[";
            for (int i = 0; i < cantPronosticos; i++) {
                aux = aux + pronosticos[i]; // El .toString() entra solo.
                if (i < (cantPronosticos - 1)) {
                    aux = aux + ", ";
                }
            }
            aux = aux + "]";
        }
        return "Participante{" + "nombre=" + nombre + ", pronosticos=" + aux + "}";
    }

}
