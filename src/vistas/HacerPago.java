/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Utilerias.Etiqueta;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Jesus
 */
public class HacerPago extends JFrame
{
    private final int idConfe;
    private final int idUsuario;
    private final double costo;
    
    /**
     * Este constructor recibe los datos necesarios para hacer insert en la tabla
     * asistentes_a_conferencia
     * @param idConfe id de la conferencia
     * @param idUsuario id del usuario que se esta inscribiendo
     * @param costo costo de la conferencia para mostrarla, no se insertará
     */
    public HacerPago(int idConfe, int idUsuario, double costo) 
    {
        super();
        this.idConfe = idConfe;
        this.idUsuario = idUsuario;
        this.costo = costo;
        configura();
    }
    
    private void configura()
    {
        setSize(300,300);
        setTitle("Conferencias.net");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        
        /* */
        setLayout(new GridLayout(0,1));
        
        add(new Etiqueta("Hacer pago","titulo"));
        add(new Etiqueta("Costo: " + costo));
        add(new Etiqueta("Numero de tarjeta"));
        JTextField numeroTarjeta = new JTextField();
        add(numeroTarjeta);
        
        JSeparator separador = new JSeparator();
        add(separador);
        JButton pagar = new JButton("Pagar");
        pagar.addActionListener((ActionEvent e) -> 
        {
            //TODO: insertar en la tabla de asistentes a conferencia, no importa lo
            //que ponga en el numero de tarjeta
            JOptionPane.showMessageDialog(null,"Inscrito");
            //TODO: este dialog deberá mostrar el id de asistente
            dispose();
        });

        add(pagar);
    }
    
}
