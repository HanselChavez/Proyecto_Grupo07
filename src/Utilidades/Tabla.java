<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.*;

import RSMaterialComponent.RSTableMetroCustom;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chave
 */
public class Tabla {
    public static int llenarTablaUsuarios(ResultSet rs,RSTableMetroCustom tabla
        , List<Usuario> lista){
        int contador = 0;        
        Usuario user ;
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }
        try {
            String datos []= new String[4];
            while(rs.next()){
                user = new Usuario();
                llenarDatos(user,rs);
                datos[0] = rs.getString("idUsuario");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellidoPaterno");
                datos[2] = datos[2]+" "+rs.getString("apellidoMaterno");
                datos[3]  = rs.getString("nombreRol");
                contador++;
                modeloTabla.addRow(datos);
                lista.add(user);
            }
            
        } catch (SQLException e) {
            
        }
        
        return contador;
        
    }
    public static void llenarDatos(Usuario user,ResultSet result) 
            throws SQLException{
            String Id = result.getString("idUsuario");
            String nombre1 = result.getString("nombre");
            String nombre2 = result.getString("segundoNombre");
            String apellido1 = result.getString("apellidoPaterno");
            String apellido2 = result.getString("apellidoMaterno");
            Date fechaNac = result.getDate("fechaNac");
            String nombreUsuario =  result.getString("username");
            String correo = result.getString("correo");
            String contraseña = result.getString("contraseña");
            String telefono = result.getString("telefono");
            String direccion = result.getString("direccion");
            int idRol = result.getInt("idRol");
            byte[]foto = result.getBytes("foto");
            
            user.setDni(Id);
            user.setNombres(nombre1,nombre2);
            user.setApellidos(apellido1,apellido2);
            user.setCelular(telefono);
            user.setContraseña(contraseña);
            user.setCorreo(correo);
            user.setFechaNac(fechaNac);
            user.setNombreUsuario(nombreUsuario);
            user.setRol(idRol);
            user.setDireccion(direccion);
            user.setFoto(foto);
            
    }
    public static int llenarTablaSolicitudes(ResultSet rs,RSTableMetroCustom tabla
        ,HistorialSolicitudes historial,String codigo){
          int contador = 0;
      
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }
        try {
            
            if(codigo.equals(""))
            {
                String datos []= new String[5];            
                while(rs.next()){

                    datos[0] = rs.getString("idSolicitud");
                    datos[1] = rs.getString("idCliente");
                    datos[2] = rs.getString("contenidoSolicitud");
                    datos[3] = rs.getDate("fechaSolicitud").toString();
                    datos[4]  = rs.getString("nombreEstado");
                    contador++;
                    modeloTabla.addRow(datos);
                }
            }else{
               
                String datos []= new String[4];            
                while(rs.next()){
                    Solicitud solicitud = new Solicitud(); 
                    EstadoSolicitud estado = new EstadoSolicitud(
                            rs.getInt("idEstado"),datos[3]
                            ,rs.getString("descripcionEstado") );
                    datos[0] = rs.getString("idSolicitud");
                    datos[1] = rs.getString("contenidoSolicitud");
                    datos[2] = rs.getDate("fechaSolicitud").toString();
                    datos[3] = rs.getString("nombreEstado");                 
                    solicitud.setCodigo(datos[0]);
                    solicitud.setDescripcion(datos[1]);
                    solicitud.setFecha(rs.getDate("fechaSolicitud"));                    
                    solicitud.setEstado(estado);
                    contador++;
                    historial.agregarSolicitud(solicitud);
                    modeloTabla.addRow(datos);
                }
            }
        } catch (SQLException e) {
            
        }
        return contador;
    }

    static void llenarTablaEstados(ResultSet rs, RSTableMetroCustom tabla
            ,List<EstadoSolicitud> lista) {       
        EstadoSolicitud estado ;
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }
        try {
            String datos []= new String[3];           
            while(rs.next()){
                datos[0] = rs.getString("idEstado");
                datos[1] = rs.getString("nombreEstado");
                datos[2] = rs.getString("descripcionEstado");            
                estado = new EstadoSolicitud(Integer.parseInt(datos[0])
                        , datos[1], datos[2]);          
                modeloTabla.addRow(datos);
                lista.add(estado);
            }
            
        } catch (SQLException e) {
            
        }        
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.EstadoSolicitud;
import Entidades.Usuario;
import RSMaterialComponent.RSTableMetroCustom;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chave
 */
public class Tabla {
    public static int llenarTablaUsuarios(ResultSet rs,RSTableMetroCustom tabla
        , List<Usuario> lista){
        int contador = 0;        
        Usuario user ;
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }
        try {
            String datos []= new String[4];
            while(rs.next()){
                user = new Usuario();
                llenarDatos(user,rs);
                datos[0] = rs.getString("idUsuario");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellidoPaterno");
                datos[2] = datos[2]+" "+rs.getString("apellidoMaterno");
                datos[3]  = rs.getString("nombreRol");
                contador++;
                modeloTabla.addRow(datos);
                lista.add(user);
            }
            
        } catch (SQLException e) {
            
        }
        
        return contador;
        
    }
    public static void llenarDatos(Usuario user,ResultSet result) 
            throws SQLException{
            String Id = result.getString("idUsuario");
            String nombre1 = result.getString("nombre");
            String nombre2 = result.getString("segundoNombre");
            String apellido1 = result.getString("apellidoPaterno");
            String apellido2 = result.getString("apellidoMaterno");
            Date fechaNac = result.getDate("fechaNac");
            String nombreUsuario =  result.getString("username");
            String correo = result.getString("correo");
            String contraseña = result.getString("contraseña");
            String telefono = result.getString("telefono");
            String direccion = result.getString("direccion");
            int idRol = result.getInt("idRol");
            byte[]foto = result.getBytes("foto");
            
            user.setDni(Id);
            user.setNombres(nombre1,nombre2);
            user.setApellidos(apellido1,apellido2);
            user.setCelular(telefono);
            user.setContraseña(contraseña);
            user.setCorreo(correo);
            user.setFechaNac(fechaNac);
            user.setNombreUsuario(nombreUsuario);
            user.setRol(idRol);
            user.setDireccion(direccion);
            user.setFoto(foto);
            
    }
    public static int llenarTablaSolicitudes(ResultSet rs,RSTableMetroCustom tabla
        , String columns []){
          int contador = 0;
      
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }
        try {
            String datos []= new String[5];
            while(rs.next()){
              
                datos[0] = rs.getString("idSolicitud");
                datos[1] = rs.getString("idCliente");
                datos[2] = rs.getString("contenidoSolicitud");
                datos[3] = rs.getDate("fechaSolicitud").toString();
                datos[4]  = rs.getString("nombreEstado");
                contador++;
                modeloTabla.addRow(datos);
            }
            
        } catch (SQLException e) {
            
        }
        return contador;
    }

    static void llenarTablaEstados(ResultSet rs, RSTableMetroCustom tabla
            ,List<EstadoSolicitud> lista) {       
        EstadoSolicitud estado ;
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }
        try {
            String datos []= new String[3];           
            while(rs.next()){
                datos[0] = rs.getString("idEstado");
                datos[1] = rs.getString("nombreEstado");
                datos[2] = rs.getString("descripcionEstado");            
                estado = new EstadoSolicitud(Integer.parseInt(datos[0])
                        , datos[1], datos[2]);          
                modeloTabla.addRow(datos);
                lista.add(estado);
            }
            
        } catch (SQLException e) {
            
        }        
    }
}
>>>>>>> 82b1bebf0855fea11d5b75c724e5fe6307bfa7c6
