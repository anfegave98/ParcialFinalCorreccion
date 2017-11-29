/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LabingXEON
 */
public class Recoleccion {
    private int idrecoleccion;
    private String fecha;
    private int idtrabajador;
    private int idcolmena;
    private int kilos;

    public Recoleccion(int idrecoleccion, String fecha, int idtrabajador, int idcolmena, int kilos) {
        this.idrecoleccion = idrecoleccion;
        this.fecha = fecha;
        this.idtrabajador = idtrabajador;
        this.idcolmena = idcolmena;
        this.kilos = kilos;
    }

    
    public int getIdrecoleccion() {
        return idrecoleccion;
    }

    public void setIdrecoleccion(int idrecoleccion) {
        this.idrecoleccion = idrecoleccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public int getIdcolmena() {
        return idcolmena;
    }

    public void setIdcolmena(int idcolmena) {
        this.idcolmena = idcolmena;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }
    
}
