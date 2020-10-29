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
public class PresentadorConferencia {
    private int idConferencia;
    private int idPresentador;

    public PresentadorConferencia() {
    }

    public PresentadorConferencia(int idConferencia, int idPresentador) {
        this.idConferencia = idConferencia;
        this.idPresentador = idPresentador;
    }

    public int getIdConferencia() {
        return idConferencia;
    }

    public void setIdConferencia(int idConferencia) {
        this.idConferencia = idConferencia;
    }

    public int getIdPresentador() {
        return idPresentador;
    }

    public void setIdPresentador(int idPresentador) {
        this.idPresentador = idPresentador;
    }
    
}
