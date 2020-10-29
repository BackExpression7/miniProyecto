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
public class AsistenteConferencia {
    private int idAsistente;
    private int idConferncia;
    private int idUsuario;

    public AsistenteConferencia() {
    }

    public AsistenteConferencia(int idAsistente, int idConferncia, int idUsuario) {
        this.idAsistente = idAsistente;
        this.idConferncia = idConferncia;
        this.idUsuario = idUsuario;
    }

    public int getIdAsistente() {
        return idAsistente;
    }

    public void setIdAsistente(int idAsistente) {
        this.idAsistente = idAsistente;
    }

    public int getIdConferncia() {
        return idConferncia;
    }

    public void setIdConferncia(int idConferncia) {
        this.idConferncia = idConferncia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
}
