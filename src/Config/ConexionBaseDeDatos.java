/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hansel Chavez
 */
public class ConexionBaseDeDatos {
    public Connection getConexion() throws ClassNotFoundException,SQLException{
        try{              

            String url = "jdbc:sqlserver://localhost:1433;databaseName=WaterService";
            String usuario = "sa";
            String contraseña = "CARLOS3231234";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            return conexion;
           
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error Abrir: "+ex.getMessage());
        }
        return null;
    }
   
}
