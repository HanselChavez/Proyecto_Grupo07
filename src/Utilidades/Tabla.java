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
        String[] fila= new String[4];        
        while(rs.next()){
            user = new Usuario();
            ServiciosUsuario.inicializarUsuario(rs,user);
            fila[0] = rs.getString("idUsuario");
            fila[1] = rs.getString("nombre");
            fila[2] = rs.getString("apellidoPaterno")+" "
                    +rs.getString("apellidoMaterno");    
            if(modo==1) 
                fila[3]  = rs.getString("nombreRol");
            else 
                fila[3]  = rs.getString("telefono");
            contador++;
            modeloTabla.addRow(fila);
            lista.add(user);
        }       
        return contador;
        
    }   
    public static int llenarTablaSolicitudes(ResultSet rs,RSTableMetroCustom tabla
        ,List<Solicitud> listaSolicitudes,String codigo) throws SQLException {
         int contador = 0;    
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }     
        if(codigo.equals(""))
        {
            String[] fila= new String[5];            
            while(rs.next()){

                fila[0] = rs.getString("idSolicitud");
                fila[1] = rs.getString("idUsuario");
                fila[2] = rs.getString("contenidoSolicitud");
                fila[3] = rs.getDate("fechaSolicitud").toString();
                fila[4]  = rs.getString("nombreEstado");
                
                Solicitud solicitud = new Solicitud(); 
                EstadoSolicitud estado = new EstadoSolicitud(
                        rs.getInt("idEstado"),fila[4]
                        ,rs.getString("descripcionEstado") );
                solicitud.setCodigo(fila[0]);
                solicitud.setDescripcion(fila[2]);
                solicitud.setFecha(rs.getDate("fechaSolicitud"));                    
                solicitud.setEstado(estado);    
                solicitud.setIdUsuario(fila[1]);
                solicitud.setNombreUser(rs.getString("nombreCompleto"));
                listaSolicitudes.add(solicitud);
                contador++;
                modeloTabla.addRow(fila);
            }
        }else{
            String datos []= new String[4];            
            while(rs.next()){
                //Llenar los fila obtenidos de la consulta al array y crear 
                //un objeto solicitud 
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
                //agregar el objeto solicitud a la lista
                listaSolicitudes.add(solicitud);
                //agregar el array a la fila de la tabla
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
              //Llenar los fila obtenidos de la consulta al array
            datos[0] = rs.getString("idEstado");
            datos[1] = rs.getString("nombreEstado");
            datos[2] = rs.getString("descripcionEstado");            
            estado = new EstadoSolicitud(Integer.parseInt(datos[0])
                    , datos[1], datos[2]);       
            //agregar el array a la fila de la tabla
            modeloTabla.addRow(datos);
            //agregar el Estado Solicitud a la lista
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
            //Llenar los fila obtenidos de la consulta al array
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
        //obtener el model de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        //limpiar la tabla
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);        
        }       
        //array de string
        String [] datos= new String[3]; 
        if(modo == 1){
            while(rs.next()){     
                //Llenar los fila obtenidos de la consulta
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
