/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Conferencia;

/**
 *
 * @author Jesus
 */
public class ConferenciaDAO extends Conexion{

    public ConferenciaDAO() 
    {
        super();
    }
    
    public void insert(Conferencia confe) throws SQLException
    {
        double costo = 0.0;
        PreparedStatement statement;
        String query = "INSERT INTO conferencia(nombre_conferencia"
                + ",tiene_costo,costo,capaciadad) VALUES (?,?,?,?)";
        
        if(confe.TieneCosto())
            costo = confe.getCosto();
            
        statement = con.prepareStatement(query);
        statement.setString(1, confe.getNombreConferencia());
        statement.setBoolean(2, confe.TieneCosto());
        statement.setDouble(3, costo);
        statement.setInt(4, confe.getCapacidad());
        statement.execute();
    }
    
    
}
