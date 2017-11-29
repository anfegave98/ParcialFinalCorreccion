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
public class Tecnica {
    private String poblacionCantidad;
    private String poblacionCalidad;
    private String reina;
    private String miel;
    private int cera;
    private int alimento;
    private int cria;
    private int vacios;
    private int idcolmena;

    public Tecnica(String poblacionCantidad, String poblacionCalidad, String reina, String miel, int cera, int alimento, int cria, int vacios, int idcolmena) {
        this.poblacionCantidad = poblacionCantidad;
        this.poblacionCalidad = poblacionCalidad;
        this.reina = reina;
        this.miel = miel;
        this.cera = cera;
        this.alimento = alimento;
        this.cria = cria;
        this.vacios = vacios;
        this.idcolmena = idcolmena;
    }

    public String getPoblacionCantidad() {
        return poblacionCantidad;
    }

    public void setPoblacionCantidad(String poblacionCantidad) {
        this.poblacionCantidad = poblacionCantidad;
    }

    public String getPoblacionCalidad() {
        return poblacionCalidad;
    }

    public void setPoblacionCalidad(String poblacionCalidad) {
        this.poblacionCalidad = poblacionCalidad;
    }

    public String getReina() {
        return reina;
    }

    public void setReina(String reina) {
        this.reina = reina;
    }

    public String getMiel() {
        return miel;
    }

    public void setMiel(String miel) {
        this.miel = miel;
    }

    public int getCera() {
        return cera;
    }

    public void setCera(int cera) {
        this.cera = cera;
    }

    public int getAlimento() {
        return alimento;
    }

    public void setAlimento(int alimento) {
        this.alimento = alimento;
    }

    public int getCria() {
        return cria;
    }

    public void setCria(int cria) {
        this.cria = cria;
    }

    public int getVacios() {
        return vacios;
    }

    public void setVacios(int vacios) {
        this.vacios = vacios;
    }

    public int getIdcolmena() {
        return idcolmena;
    }

    public void setIdcolmena(int idcolmena) {
        this.idcolmena = idcolmena;
    }
    
}
