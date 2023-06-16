/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import InterfacesGraficas.JFMensaje;
import InterfacesGraficas.Login.IniciarSesion;
import java.sql.SQLException;

/**
 *
 * @author Hansel Chavez
 */
public class ServicioDeAgua {

    /**     
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static final JFMensaje mensaje= new JFMensaje();
    public static void main(String args[]) throws ClassNotFoundException
       , SQLException {  
       
        mensaje.setVisible(true);
        mensaje.setVisible(false);
        IniciarSesion login = new IniciarSesion();
        login.setVisible(true);
       

    }  
    
}
