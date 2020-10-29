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
public class Usuario {
    private int id;
    private String nombreUsuario;
    private String numeroTel; 

    public Usuario() {
        this.id = 0;
        this.nombreUsuario = "";
        this.numeroTel = "";
    }

    public Usuario(String nombre_usuario, String numero_tel) {
        this.nombreUsuario = nombre_usuario;
        this.numeroTel = numero_tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }
    
}
