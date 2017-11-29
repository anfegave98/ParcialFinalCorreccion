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
public class Reporte {
    private int idcolmena;
    private String ubicacion;
    private String fabrica;
    private int idcolmenamadre;
    private int kilostotales;

    public Reporte(int idcolmena, String ubicacion, String fabrica, int idcolmenamadre, int kilostotales) {
        this.idcolmena = idcolmena;
        this.ubicacion = ubicacion;
        this.fabrica = fabrica;
        this.idcolmenamadre = idcolmenamadre;
        this.kilostotales = kilostotales;
    }

    public int getIdcolmena() {
        return idcolmena;
    }

    public void setIdcolmena(int idcolmena) {
        this.idcolmena = idcolmena;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFabrica() {
        return fabrica;
    }

    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }

    public int getIdcolmenamadre() {
        return idcolmenamadre;
    }

    public void setIdcolmenamadre(int idcolmenamadre) {
        this.idcolmenamadre = idcolmenamadre;
    }

    public int getKilostotales() {
        return kilostotales;
    }

    public void setKilostotales(int kilostotales) {
        this.kilostotales = kilostotales;
    }
    
}
