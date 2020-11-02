package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class AsistenteConferenciaDAO extends Conexion 
{

    public AsistenteConferenciaDAO()
    {
        super();
    }
    
    /**
     * Este metodo hace una consulta a la base de datos para saber cuantas
     * personas asistirán a la conferenica
     * @param id_conferencia id de la conferencia
     * @return numero de asistentes a la conferencia
     */
    public int cuentaDeAsistentes(int id_conferencia)
    {
        PreparedStatement statement;
        ResultSet resultSet;
        int cuenta = 0;
        String query = "SELECT COUNT(id_usuario) AS cuenta FROM asistente_a_conferencia"
                + " WHERE id_conferencia = ?";
        
        try 
        {
            statement = con.prepareStatement(query);
            statement.setInt(1, id_conferencia);
            resultSet = statement.executeQuery();
            while(resultSet.next())
                cuenta = resultSet.getInt("cuenta");
        } catch (Exception e) 
        {
            
        }
        return cuenta;
    }
    
    
}
