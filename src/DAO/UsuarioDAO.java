/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Usuario;

/**
 *
 * @author Jesus
 */
public class UsuarioDAO extends Conexion{

    public UsuarioDAO() {
        super();
    }
    
    /**
     * Este metodo hace insert en la tabla de usuario con el usuario recibido
     * @param usuario Usuario que se quiere insertar en la tabla
     * @throws SQLException 
     */
    public void insert(Usuario usuario) throws SQLException
    {
        PreparedStatement statement;
        String query = "INSERT INTO usuario(nombre_usuario,numero_tel) VALUES (?,?)";
        
        statement = con.prepareStatement(query);
        statement.setString(1, usuario.getNombreUsuario());
        statement.setString(2, usuario.getNumeroTel());
        statement.execute();
    }
    
    
}
