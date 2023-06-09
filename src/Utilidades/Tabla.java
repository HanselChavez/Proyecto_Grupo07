/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Usuario;
import RSMaterialComponent.RSTableMetroCustom;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author chave
 */
public class Tabla {
    public static int llenarTablaUsuarios(ResultSet rs,RSTableMetroCustom tabla
        , String columns [],List<Usuario> lista){
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
                datos[1] = rs.getString("nombres");
                datos[2] = rs.getString("apellidos");
                datos[3]  = rs.getString("telefono");
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
}
