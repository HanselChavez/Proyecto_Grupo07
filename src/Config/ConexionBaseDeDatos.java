/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hansel Chavez
 */
public class ConexionBaseDeDatos {
    private static Connection conexion ;
    private static String url = 
            "jdbc:sqlserver://localhost:1433;databaseName=WaterService";
    private static String usuario = "sa";
    private static String contraseña = "CARLOS3231234";
    public static Connection getConexion(){
         
        try {
            /*url = "jdbc:sqlserver://grupo07tecpoo.database.windows.net:1433;"
            + "database=WaterService;user=grupo07@grupo07tecpoo;password=Grupo7TecPoo"
            + ";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*"
            + ".database.windows.net;loginTimeout=30;";
            usuario = "grupo07";
            contraseña = "Grupo7TecPoo";*/
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion= DriverManager.getConnection(url,usuario,contraseña);     
            return conexion;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
}
