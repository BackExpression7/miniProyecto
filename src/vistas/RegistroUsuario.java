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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Jesus
 */
public class RegistroUsuario extends JFrame implements ActionListener
{
    
    JTextField nombre,numeroTelefono,nombreLogin;

    public RegistroUsuario() 
    {
        super();
        configura();
    }
    
    private void configura()
    {
        setSize(300,300);
        setTitle("Conferencias .net");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false); 
        
        // <editor-fold defaultstate="collapsed" desc="Layout">
        setLayout(new GridLayout(0,1));
         //</editor-fold>
         
        // <editor-fold defaultstate="collapsed" desc="Registro">
        JSeparator separador;
        add(new Etiqueta("Registrarse", "titulo"));
        add(new Etiqueta("Nombre"));
        nombre = new JTextField();
        add(nombre);
        add(new Etiqueta("Numero de telefono"));
        numeroTelefono = new JTextField();
        add(numeroTelefono); 
        separador = new JSeparator();
        add(separador);
        //</editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Iniciar Sesion">
        add(new Etiqueta("Iniciar Sesion", "titulo"));
        add(new Etiqueta("Nombre"));
        nombreLogin = new JTextField();
        add(nombreLogin);
        separador = new JSeparator();
        add(separador);
        //</editor-fold>
        
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
            //crea un usuario
            //idUsuario tiene que ser el id del usuario creado
            registroConferencia(idUsuario);
        }else if(!nombreLogin.getText().equals(""))
        {
            //busca al usuario y saca su id
            //idUsuario tiene que ser el id del usuario encontrado
            registroConferencia(idUsuario);
        }else
        {
            JOptionPane.showMessageDialog(null,"Favor de llenar todos los campos");
        }
    }

    /**
     * este metodo crea una nueva ventana con el formulario para hacer un registro
     * de conferencia, ademas tambien cierra la ventana actual
     * @param idUsuario id del usuario que registra la conferencia
     */
    private void registroConferencia(int idUsuario)
    {
        new RegistroConferencia(idUsuario).setVisible(true);
        dispose();
    }
    
}
