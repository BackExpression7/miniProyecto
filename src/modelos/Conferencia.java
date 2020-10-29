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
public class Conferencia {
    private int id;
    private String nombreConferencia;
    private boolean tieneCosto;
    private double costo;
    private int capacidad;

    public Conferencia() {
    }

    public Conferencia(String nombreConferencia, boolean tieneCosto, double costo, int capacidad) {
        this.nombreConferencia = nombreConferencia;
        this.tieneCosto = tieneCosto;
        if(!tieneCosto)
            this.costo = 0.0;
        else
            this.costo = costo;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreConferencia() {
        return nombreConferencia;
    }

    public void setNombreConferencia(String nombreConferencia) {
        this.nombreConferencia = nombreConferencia;
    }

    public boolean TieneCosto() {
        return tieneCosto;
    }

    public void setTieneCosto(boolean tieneCosto) {
        this.tieneCosto = tieneCosto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
