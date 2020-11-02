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
import vistas.EditarConferencia;

/**
 *
 * @author Jesus
 */
public class ListadoEditar extends JFrame implements ActionListener
{

    public ListadoEditar() 
    {
        super();
        configura();
    }
    
    private void configura() 
    {
        //configura este frame como listado con el titulo de conferencia
        Listado.configurar(this,"Conferencia");
        poblar();
    }
    
    /**
     * Este metodo llena el frame con un listado de todas las conferencias
     * y les pone un boton para editar
     */
    private void poblar()
    {
        JLabel nombreConfe;
        JButton inscritos;
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
            inscritos = new JButton("Editar");
            inscritos.setActionCommand(confe.getId()+"");
            inscritos.addActionListener(this);
            add(inscritos);
                
            i++;
        }
    }
    
    /**
     * Este metodo se dispara cuando cualquier boton sea clickeado, se obtiene
     * el id de la conferencia correspondiente al boton clickeado y se crea una
     * nueva ventana para editar la informacion de esa conferencia
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        int idConfe = Integer.parseInt( e.getActionCommand() );
        new EditarConferencia(idConfe).setVisible(true);
        dispose();
    }
    
    
}
