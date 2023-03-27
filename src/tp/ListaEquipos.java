/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

    void cargarDeArchivo(){
        String infoDelEquipo = "";
        String vectorEquipo[];
        Scanner sc = null;
        try {
            sc = new Scanner(new File(this.nombreArchivo));
            sc.useDelimiter("\n"); // Leerá por renglones.
            while (sc.hasNext()){
                infoDelEquipo = sc.next();
                System.out.println("Equipo: " + infoDelEquipo);
                vectorEquipo = infoDelEquipo.split(",");
                System.out.println("Equipo: " + vectorEquipo[0] + ", Descripcion: " + vectorEquipo[1] + ".");
            }
        } catch (IOException e){
            System.out.println("Mensaje: " + e.getMessage());
        } finally {
            try {
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
