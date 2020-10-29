/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jesus
 */
public class FechaPresentacion {
    private int id;
    private Date fecha;
    private SimpleDateFormat formato;

    public FechaPresentacion(int id, Date fecha, SimpleDateFormat formato) {
        this.id = id;
        this.fecha = fecha;
        this.formato = formato;
    }

    public FechaPresentacion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
