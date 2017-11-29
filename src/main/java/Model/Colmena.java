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
public class Colmena {
    private int idcolmena;
    private String ubicacion;
    private String fabrica;
    private int idcolmenamadre;

    public Colmena(int idcolmena, String ubicacion, String fabrica, int idcolmenamadre) {
        this.idcolmena = idcolmena;
        this.ubicacion = ubicacion;
        this.fabrica = fabrica;
        this.idcolmenamadre = idcolmenamadre;
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
            
}
