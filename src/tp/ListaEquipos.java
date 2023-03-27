/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaEquipos extends ArrayList {
    private ArrayList<Equipo> equipos;
    private String nombreArchivo;
    
    // CONSTRUCTORES

    public ListaEquipos(ArrayList<Equipo> equipos, String nombreArchivo) {
        super();
        this.equipos = equipos;
        this.nombreArchivo = nombreArchivo;
    }

    public ListaEquipos() {
        super();
        this.equipos = null;
        this.nombreArchivo = "";
    }
    
    // GETTERS AND SETTERS

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    // MÉTODOS
    
    void listarEquipos() {
        Iterator<Equipo> it;
        it = this.equipos.iterator();
        while (it.hasNext()){
            Equipo equipo = it.next();
            System.out.println(equipo);
        }
    }
    
    void cargarDeArchivo(){
        String infoDelEquipo = "";
        String vectorEquipo[];
        Scanner sc = null;
        Equipo auxEquipo = null;
        if (this.equipos == null) {
            equipos = new ArrayList<Equipo>();
        } else {
            // La lista de equipos no está vacía, es decir que estoy llamando
            // al metodo cargarDeArchivo() por segunda vez. Lo que hago en 
            // este caso es destruir la lista y crear una nueva. De este
            // modo, evito tener el atributo idEquipo duplicado, lo cual 
            // sería un problema en el futuro.
            while (!equipos.isEmpty()) {
                equipos.remove(0);
            }
        }
        
        try {
            sc = new Scanner(new File(this.nombreArchivo));
            sc.useDelimiter("\n"); // Leerá por renglones.
            while (sc.hasNext()){
                infoDelEquipo = sc.next();
                System.out.println("Línea leída del archivo: " + infoDelEquipo);
                vectorEquipo = infoDelEquipo.split(",");
                System.out.println("Equipo: " + vectorEquipo[0] + ", Descripcion: " + vectorEquipo[1] + ".");
                // Creo un nuevo objeto Equipo a partir del dato reción leído.
                auxEquipo = new Equipo(equipos.size(),vectorEquipo[0],vectorEquipo[1]);
                // Agrego el objeto recién creado a al atributo que contiene el ArrayList de Equipos.
                equipos.add(auxEquipo);
            }
        } catch (IOException e){
            System.out.println("Mensaje: " + e.getMessage());
        } finally {
            try {
                // Si no se cargó ningún equipo en la lista, entonces la pongo en null.
                if (equipos.isEmpty()) {
                    equipos = null;
                }
                if (sc != null){
                    sc.close();
                }
            } catch  (Exception e2) {
                System.out.println("Mensaje: " + e2.getMessage());
            }
        }
        System.out.println("Fin de archivo.");
    }
    
}
