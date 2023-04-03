/*
Para entrega 2
 */
package tp;


/**
 *
 * @author aguzman
 */
public class PronosticoDeportivo {
    private ListaEquipos equipos;
    private ListaPartidos partidos;

    public PronosticoDeportivo() {
        equipos = new ListaEquipos();
        partidos = new ListaPartidos();
    }

    public void play(){
        // cargar y listar los equipos
        equipos.setNombreArchivo("equipos.csv");
        equipos.cargarDeArchivo();
        System.out.println("Los equipos cargados son:\n" + equipos.listar());
        
        System.out.println ("Buscando el equipo");
        int idEquipo = 17;
        Equipo eq = equipos.getEquipo(idEquipo);
        if (eq != null) {
            System.out.println (eq);
        } else {
            System.out.println ("No se encontró el equipo...");
        }
        partidos.setNombreArchivo("partidos.csv");
        partidos.cargarDeArchivo(equipos);
        System.out.println("Los partidos cargados son: \n" + partidos.listar());
    }    
}
