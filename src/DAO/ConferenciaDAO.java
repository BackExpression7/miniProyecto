/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Conferencia;

/**
 *
 * @author Jesus
 */
public class ConferenciaDAO extends Conexion
{

    public ConferenciaDAO() 
    {
        super();
    }
    
    /**
     * Este metodo hace insert a la tabla de conferencia
     * @param confe conferencia que se va a insertar
     * @throws SQLException cuando falla la query, o algo asi
     */
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
    
    /**
     * TODO:
     * este metodo hará select de todos los datos de una conferencia en especifico
     * @param idConferencia id de la conferencia que se busca
     * @return Objeto conferencia con toda la informacion de la consulta
     * @throws SQLException 
     */
    public Conferencia select(int idConferencia) throws SQLException
    {
        Conferencia confe = new Conferencia();
        
        return confe;
    }
    
    /**
     * Este metodo hace una consulta a la base de datos que busca todas las 
     * conferencias en la tabla conferencia,
     * @return ArrayList de todas las conferencias en la tabla
     * @throws SQLException 
     */
    public ArrayList selectAll() throws SQLException
    {
        ArrayList<Conferencia> conferencias = new ArrayList<>();
        PreparedStatement statement;
        ResultSet resultSet;
        String query = "SELECT id_conferencia,nombre_conferencia,capacidad FROM conferencia";
        
        statement = con.prepareCall(query);
        resultSet = statement.executeQuery();
        
        while(resultSet.next())
        {
            Conferencia x = new Conferencia();
            x.setId(resultSet.getInt("id_conferencia"));
            x.setNombreConferencia(resultSet.getString("nombre_conferencia"));
            x.setCapacidad(resultSet.getInt("capacidad"));
            conferencias.add(x);
        }
        
        return conferencias;
    }
    
}
