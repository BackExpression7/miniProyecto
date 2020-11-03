/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.Conexion.con;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Conferencia;
import modelos.Presentador;

/**
 *
 * @author CARLOS
 */
public class presentador {
    public void insert(Presentador presentador) throws SQLException
    {
        PreparedStatement statement;
        String query = "INSERT INTO presentador(nombre_presentador) VALUES (?)";
        
        statement = con.prepareStatement(query);
        statement.setString(1, presentador.getNombrePresentador());
        statement.execute();
    }
 
}
