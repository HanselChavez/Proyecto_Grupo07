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
     
     */
    public static final JFMensaje mensaje = new JFMensaje();
    public static void main(String args[]) {  
       
        try {
            mensaje.setVisible(true);
            mensaje.setVisible(false);
            IniciarSesion login = new IniciarSesion();
            login.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            mensaje.cargarDatos("Error","No se puede abrir el programa",1);
        }
       

    }  
    
}
