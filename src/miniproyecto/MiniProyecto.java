/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto;

import DAO.ConferenciaDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Conferencia;

/**
 *
 * @author Jesus
 */
public class MiniProyecto {

    public static void main(String[] args) 
    {
        Conferencia confe = new Conferencia("TED TALK", false, 0, 10);
        ConferenciaDAO confeDAO = new ConferenciaDAO();
        try {
            confeDAO.insert(confe);
        } catch (SQLException ex) {
            Logger.getLogger(MiniProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
