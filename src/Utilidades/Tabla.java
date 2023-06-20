/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.*;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import RSMaterialComponent.RSTableMetroCustom;

/**
 *
 * @author Kelvin Vasquez
 */
public class Tabla {
    public static int llenarTablaUsuarios(ResultSet rs,RSTableMetroCustom tabla
        , List<Usuario> lista,int modo)  throws SQLException {
        int contador = 0;        
        Usuario user ;
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }        
        String datos []= new String[4];
        
        while(rs.next()){
            user = new Usuario();
            ServiciosUsuario.inicializarUsuario(rs,user);
            datos[0] = rs.getString("idUsuario");
            datos[1] = rs.getString("nombre");
            datos[2] = rs.getString("apellidoPaterno");
                datos[2] = datos[2]+" "+rs.getString("apellidoMaterno");
            if(modo==1)
                datos[3]  = rs.getString("nombreRol");
            else 
                datos[3]  = rs.getString("telefono");
            contador++;
            modeloTabla.addRow(datos);
            lista.add(user);
        }       
        return contador;
        
    }
    /*public static void llenarDatos(Usuario user,ResultSet result) 
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
            
    }*/
    public static int llenarTablaSolicitudes(ResultSet rs,RSTableMetroCustom tabla
        ,List<Solicitud> listaSolicitudes,String codigo) throws SQLException {
         int contador = 0;        
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }     
        if(codigo.equals(""))
        {
            String datos []= new String[5];            
            while(rs.next()){

                datos[0] = rs.getString("idSolicitud");
                datos[1] = rs.getString("idUsuario");
                datos[2] = rs.getString("contenidoSolicitud");
                datos[3] = rs.getDate("fechaSolicitud").toString();
                datos[4]  = rs.getString("nombreEstado");
                Solicitud solicitud = new Solicitud(); 
                EstadoSolicitud estado = new EstadoSolicitud(
                        rs.getInt("idEstado"),datos[4]
                        ,rs.getString("descripcionEstado") );
                solicitud.setCodigo(datos[0]);
                solicitud.setDescripcion(datos[2]);
                solicitud.setFecha(rs.getDate("fechaSolicitud"));                    
                solicitud.setEstado(estado);    
                solicitud.setIdUsuario(datos[1]);
                solicitud.setNombreUser(rs.getString("nombreCompleto"));
                listaSolicitudes.add(solicitud);
                contador++;
                modeloTabla.addRow(datos);
            }
        }else{
            String datos []= new String[4];            
            while(rs.next()){
                Solicitud solicitud = new Solicitud();                    
                datos[0] = rs.getString("idSolicitud");
                datos[1] = rs.getString("contenidoSolicitud");
                datos[2] = rs.getDate("fechaSolicitud").toString();
                datos[3] = rs.getString("nombreEstado");   
                EstadoSolicitud estado = new EstadoSolicitud(
                        rs.getInt("idEstado"),datos[3]
                        ,rs.getString("descripcionEstado") );
                solicitud.setCodigo(datos[0]);
                solicitud.setDescripcion(datos[1]);
                solicitud.setFecha(rs.getDate("fechaSolicitud"));                    
                solicitud.setEstado(estado);              
                listaSolicitudes.add(solicitud);
                modeloTabla.addRow(datos);
            }
        }
       
        return contador;
    }

    static void llenarTablaEstados(ResultSet rs, RSTableMetroCustom tabla
            ,List<EstadoSolicitud> lista)  throws SQLException {      
        EstadoSolicitud estado ;
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }
       
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
            
    }
    static void llenarTablaAvisos(ResultSet rs, RSTableMetroCustom tabla
            , String buscar,List<Mensaje>lista)
            throws SQLException {
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }       
        String datos []= new String[4];
        while(rs.next()){              
            datos[0] = rs.getString("idAviso");
            datos[1] = rs.getString("nombreCompleto");
            datos[2] = rs.getString("contenidoAviso");
            datos[3] = rs.getDate("fechaAviso").toString(); 
            Mensaje aviso = new Mensaje(datos[0],"Aviso"
                    ,datos[2], rs.getDate("fechaAviso"));
            aviso.setNombreUsuario(datos[1]);
            lista.add(aviso);
            modeloTabla.addRow(datos);        
        }          
    }
    static void llenarTablaRetroAlimentacion(ResultSet rs, RSTableMetroCustom tabla
            , String buscar, List<Mensaje> lista,String tipo,int modo) throws SQLException {
         DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }       
        String [] datos= new String[3]; 
        if(modo == 1){
            while(rs.next()){              
                datos[0] = rs.getString("id"+tipo);
                datos[1] = rs.getString("contenido"+tipo);
                datos[2] = rs.getDate("fecha"+tipo).toString();       
                Mensaje comentario = new Mensaje(datos[0],tipo
                        ,datos[1], rs.getDate("fecha"+tipo));            
                lista.add(comentario);
                modeloTabla.addRow(datos);        
            }   
        }else {
            datos = new String[4]; 
            while(rs.next()){              
                datos[0] = rs.getString("id"+tipo);
                datos[1] = rs.getString("idUsuario");
                datos[2] = rs.getString("contenido"+tipo);  
                datos[3] = rs.getDate("fecha"+tipo).toString();
                Mensaje comentario = new Mensaje(datos[0],tipo
                        ,datos[2], rs.getDate("fecha"+tipo));  
                comentario.setNombreUsuario(datos[1]);
                lista.add(comentario);
                modeloTabla.addRow(datos);        
            }  
        }
    }
}
