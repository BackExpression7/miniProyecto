/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import vistas.Listados.ListadoInscritos;
import vistas.Listados.ListadoEditar;
import vistas.Listados.ListadoInscripcion;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Jesus
 */
public class MenuPrincipal extends JFrame{
    
    /* acciones */
    private final JButton registrar = new JButton("Registro de conferencias");
    private final JButton inscribirse = new JButton("Inscribirse a conferencia");
    private final JButton lista = new JButton();
    private final JButton editar = new JButton("Editar conferencias");
               
    public MenuPrincipal()
    {
        super();
        configura();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            
        } 
    }
    
    private void configura()
    {
        /* Titulo */
        setSize(520,300);
        setTitle("Conferencias .net");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);        
        
        
        /* Layout */
        setLayout(null);

        
        /* registrar */
        registrar.setBounds(50, 50, 200, 30);
        registrar.addActionListener
        ((ActionEvent e) -> {
            registrar_onClick();
        });
        add(registrar);
        
        /* Inscribirse */
         inscribirse.setBounds(260, 50, 200, 30);
        inscribirse.addActionListener
        ((ActionEvent e) -> {
            inscribirse_onClick();
        });
        add(inscribirse);
        
         /* Lista */
        lista.setBounds(50, 110, 200, 50);
        lista.addActionListener
        ((ActionEvent e) -> {
            listar_onClick();
        });
        lista.setText("<html> Lista de asistencia" +" <br>"+ "de conferencia <html/>");
        add(lista);
        
         /* Editar */
         editar.setBounds(260, 110, 200, 50);
        editar.addActionListener
        ((ActionEvent e) -> {
            editar_onClick();
        });
        add(editar);
        
    }

    private void registrar_onClick() 
    {
        new RegistroUsuario().setVisible(true);
    }

    private void inscribirse_onClick() 
    {
        new ListadoInscripcion().setVisible(true);
    }

    private void listar_onClick() 
    {
        new ListadoInscritos().setVisible(true);
    }

    private void editar_onClick() 
    {
        new ListadoEditar().setVisible(true);
    }
    
    
}
