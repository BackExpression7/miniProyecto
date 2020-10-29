/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Jesus
 */
public class Presentador {
    private int id;
    private String nombrePresentador;

    public Presentador() {
    }

    public Presentador(int id, String nombrePresentador) {
        this.id = id;
        this.nombrePresentador = nombrePresentador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePresentador() {
        return nombrePresentador;
    }

    public void setNombrePresentador(String nombrePresentador) {
        this.nombrePresentador = nombrePresentador;
    }
    
}
