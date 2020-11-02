/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Listados;

import javax.swing.JFrame;

/**
 *
 * @author Jesus
 */
public class ListadoUsuarios extends JFrame
{
    private final int idConferencia;

    public ListadoUsuarios(int idConferencia) 
    {
        super();
        this.idConferencia = idConferencia;
        configura();
    }
    
    private void configura()
    {
        Listado.configurar(this, "Usuarios");
        poblar();
    }
    
    private void poblar()
    {
        
    }
    
}
