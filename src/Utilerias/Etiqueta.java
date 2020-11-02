/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilerias;

import javax.swing.JLabel;

/**
 *
 * @author Jesus
 */
public class Etiqueta extends JLabel
{

    /**
     * Este constructor pone el texto que se le pasa y la fuente como fuente
     * normal
     * @param texto Texto de la Etiqueta
     */
    public Etiqueta(String texto) 
    {
        super(texto);
        setFont(Fuentes.normal);
    }
    
    /**
     * Este constructor pone el texto que se le pasa y a partir del segundo parametro
     * el tipo de fuente, puede ser titulo o normal, por defecto se pone como 
     * fuente normal
     * @param texto Texto de la Etiqueta
     * @param tipo Tipo de fuente de la etiqueta
     */
    public Etiqueta(String texto, String tipo) 
    {
        super(texto);
        
        switch(tipo)
        {
            case "titulo":
                setFont(Fuentes.titulo);
                break;
            case "normal":
                setFont(Fuentes.normal);
                    break;
            default:
                setFont(Fuentes.normal);
                break;
        }
        
    }
    
}
