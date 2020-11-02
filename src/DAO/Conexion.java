/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jesus
 */
public class Conexion {
    //Conexion de la bd
    protected static Connection con;
    
    public Conexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net:3306/sql3373462","sql3373462","kmFVyX3EAX");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("El driver no se encuentra");
        }  
        catch (SQLException e)
        {
            System.out.println("La conexion ha fracasado: " + e.getMessage());
        }
    }
}
