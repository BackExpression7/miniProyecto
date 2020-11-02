/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Utilerias.Etiqueta;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Jesus
 */
public class Inscripcion extends  JFrame implements ActionListener
{
    public int idConfe;
    JTextField nombre,numeroTelefono,nombreLogin;

    /**
     * Este constructor recibe el id de la conferencia que se clickeo
     * @param idConfe id de la conferncia a la que se inscribirá
     */
    public Inscripcion(int idConfe) 
    {
        super();
        this.idConfe = idConfe;
        configura();
    }

    private void configura()
    {
        setSize(300,300);
        setTitle("Conferencias.net");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);      
        
        /*registro*/
        setLayout(new GridLayout(0,1));
        add(new Etiqueta("Inscribirse a conferencia", "titulo"));
        add(new Etiqueta("Registrarse"));
        add(new Etiqueta("Nombre"));
        nombre = new JTextField();
        add(nombre);
        add(new Etiqueta("Numero de telefono"));
        numeroTelefono = new JTextField();
        add(numeroTelefono);
        JSeparator separador = new JSeparator();
        add(separador);
        
        /*iniciar Sesion*/
        add(new Etiqueta("Iniciar Sesion","titulo"));
        add(new Etiqueta("Nombre"));
        nombreLogin = new JTextField();
        add(nombreLogin);
        separador = new JSeparator();
        add(separador);
        
        /*inscribirse*/
        JButton inscribirse = new JButton("Inscribirse");
        inscribirse.addActionListener(this);
        add(inscribirse);
        
    }

    /**
     * este metodo se dispara cuando se clickea el boton de inscribirse y 
     * verifica si se quiere crear un usuario o iniciar sesion.
     * despues manda a llamar checarCosto para hacer la operacion correspondiente
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int idUsuario = 0;
        
        if(!nombre.getText().equals("") && !numeroTelefono.getText().equals(""))
        {
            //TODO: crea un usuario
            // idUsuario será igual al id del usuario que acaba de crear
            checarCosto(idUsuario);
        }else if(!nombreLogin.getText().equals(""))
        {
            //TODO: idUsuario será igual a el id del nombre de usuario que se escribio
            //en el textField, se tiene que hacer una consulta
            checarCosto(idUsuario);
        }else
        {
            JOptionPane.showMessageDialog(null,"Favor de llenar todos los campos");
        }
    }
    
    
    /**
     * Este metodo verifica si la inscripcion clickeada anteriormente tiene costo
     * o no, si tiene costo se muestra una nueva ventana para proceder al pago,
     * de lo contrario, se debe inscribir al usuario
     * @param idUsuario id del usuario que se quiere incribir a la conferencia
     */
    public void checarCosto(int idUsuario)
    {
        //TODO: se tiene que hacer una consulta para saber si la conferencia que 
        //TODO: clickeo tiene costo o no.
        boolean tieneCosto = true;
        //TODO: con la misma consulta se tiene que poner el costo de la conferencia
        double costo = 0.0;
        
        if(tieneCosto)
        {
            new HacerPago(idConfe,idUsuario,costo).setVisible(true);
            dispose();
        }else
        {
            //TODO: inscribir al usuario
            JOptionPane.showMessageDialog(null,"Inscrito");
            dispose();
        }
    }
}
