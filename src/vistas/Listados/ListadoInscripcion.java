/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Listados;

import DAO.AsistenteConferenciaDAO;
import DAO.ConferenciaDAO;
import Utilerias.Fuentes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import modelos.Conferencia;
import vistas.Inscripcion;

/**
 *
 * @author Jesus
 */
public class ListadoInscripcion extends JFrame implements ActionListener
{
    
    
    public ListadoInscripcion()
    {
        super();
        configura();  
    }

    private void configura() 
    {
        Listado.configurar(this,"Conferencia");
        poblar();
    }
    
    /**
     * Este metodo llena el frame con un listado de todas las conferencias
     * y les pone un boton para inscribirse en caso de que aun haya cupo
     * en la conferencia
     */
    private void poblar()
    {
        JLabel nombreConfe;
        JButton inscribirse;
        ArrayList<Conferencia> conferencias = new ArrayList<>();
        ConferenciaDAO confeDAO = new ConferenciaDAO();
        AsistenteConferenciaDAO acDAO = new AsistenteConferenciaDAO();
        int i = 0;
        
        try 
        {
            conferencias = confeDAO.selectAll();
        } catch (SQLException ex)
        {
            
        }
        
        for(Conferencia confe : conferencias)
        {
            int numeroAsitentes = acDAO.cuentaDeAsistentes(confe.getId());
            String titulo = i+1 + ".- " + confe.getNombreConferencia();
            String cupo = numeroAsitentes + "/" + confe.getCapacidad();
            
            nombreConfe = new JLabel(titulo + "  " + cupo);
            nombreConfe.setFont(Fuentes.normal);
            add(nombreConfe);
            if(numeroAsitentes < confe.getCapacidad())
            {
                inscribirse = new JButton("Inscribirse");
                inscribirse.setActionCommand(confe.getId()+"");
                inscribirse.addActionListener(this);
                add(inscribirse);
            }
                
            i++;
        }

    }

    /**
     * Este metodo se dispara cuando cualquier boton sea clickeado, se obtiene
     * el id de la conferencia correspondiente al boton clickeado y se crea una
     * nueva ventana para elegir el usuario que se va a inscribir
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int idConfe = Integer.parseInt( e.getActionCommand() );
        new Inscripcion(idConfe).setVisible(true);
        dispose();
    }

}
