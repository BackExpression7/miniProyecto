/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Listados;

import Utilerias.Etiqueta;
import java.awt.GridLayout;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Jesus
 */
public class Listado
{ 
    /**
     * Este metodo configura un frame con lo que tienen todos los listados, osea
     * un grid layout y un titulo
     * @param coso frame que tendrá el listado
     * @param titulo titulo del listado
     */
    public static void configurar(JFrame coso, String titulo)
    {
        coso.setSize(500,500);
        coso.setTitle("Conferencias.net");
        coso.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        coso.setResizable(false);      
        
        /* layout */
        coso.setLayout(new GridLayout(0,1));
        
        coso.add(new Etiqueta(titulo, "titulo"));
    }
    
    
}
