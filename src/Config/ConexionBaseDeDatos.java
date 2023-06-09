<<<<<<< HEAD
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
    private Connection conexion ;
   
    public Connection getConexion() throws ClassNotFoundException,SQLException{
        try{              
            
            String url = "jdbc:sqlserver://localhost:1433;databaseName=WaterService";
            String usuario = "sa";
            String contraseña = "CARLOS3231234";
            /*String url = "jdbc:sqlserver://grupo07tecpoo.database.windows.net:1433;"
            + "database=WaterService;user=grupo07@grupo07tecpoo;password=Grupo7TecPoo"
            + ";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*"
                    + ".database.windows.net;loginTimeout=30;";
            String usuario = "grupo07";
            String contraseña = "Grupo7TecPoo";*/
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion= DriverManager.getConnection(url,usuario,contraseña);
            return conexion;
           
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error Abrir: "+ex.getMessage());
        }
        return null;
    }
   
}
=======
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
    private Connection conexion ;
   
    public Connection getConexion() throws ClassNotFoundException,SQLException{
        try{              

            String url = "jdbc:sqlserver://localhost:1433;databaseName=WaterService";
            String usuario = "sa";
            String contraseña = "CARLOS3231234";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion= DriverManager.getConnection(url, usuario, contraseña);
            return conexion;
           
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error Abrir: "+ex.getMessage());
        }
        return null;
    }
   
}
>>>>>>> 82b1bebf0855fea11d5b75c724e5fe6307bfa7c6
