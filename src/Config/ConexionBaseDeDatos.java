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
    private static Connection conexion ;
    private static String url = "jdbc:sqlserver://localhost:1433;"
                                    + "databaseName=WaterService";;
    
    private static String usuario;
    private static String contraseña;
    public static Connection getConexion(){
         
        try {
            
            /*url = "jdbc:sqlserver://grupo07tecpoo.database.windows.net:1433;"
            + "database=WaterService;user=grupo07@grupo07tecpoo;password=Grupo7TecPoo"
            + ";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*"
            + ".database.windows.net;loginTimeout=30;";*/
            usuario = "SAA";
            contraseña = "123456";
            //Solicitando al cargador de clases que busque y cargue  la clase 
            //SQLServerDriver 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Establecer y obtener la conexion
            conexion= DriverManager.getConnection(url,usuario,contraseña);     
            return conexion;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error: "+ ex.getMessage());
        }
        return null;
    }    
}
