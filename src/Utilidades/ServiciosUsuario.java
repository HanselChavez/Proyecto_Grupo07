/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Config.ConexionBaseDeDatos;
import Entidades.EstadoSolicitud;
import Entidades.HistorialSolicitudes;
import Entidades.Solicitud;
import Entidades.Usuario;
import RSMaterialComponent.RSTableMetroCustom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author chave
 */
public class ServiciosUsuario {
    private final Connection conexion;
    private Statement bdSelect;
    private PreparedStatement bdUpdate;
    private String sql;
    
    public ServiciosUsuario() throws ClassNotFoundException, SQLException{
        ConexionBaseDeDatos conection = new ConexionBaseDeDatos();
        this.conexion = conection.getConexion(); 
        this.sql ="";
        bdSelect=conexion.createStatement();
        bdUpdate = conexion.prepareStatement(sql);
    }
    //Obtener datos de Usuario
    public ResultSet getUsuario( String usuario) throws SQLException{        
        this.sql = "select * from Usuario Us where Us.nombreUsuario "
                + "='".concat(usuario)+"'";
        ResultSet rs = bdSelect.executeQuery(sql);      
        return rs;
    }
    //Obtener todas las Solicitudes
    public ResultSet obtenerSolicitudes() throws SQLException{        
        this.sql = "select * from Solicitud";
        ResultSet rs = bdSelect.executeQuery(sql); 
        return rs;    
    }
    //Obtener todas las Solicitudes segun su estado
    public ResultSet obtenerSolicitudes(String valor,String estado
            ,String buscar) throws SQLException{       
        this.sql = "select so.idSolicitud,so.descripcion,so.fecha,"
                + " es.nombre as nombreEstado"
                + " from Solicitud so inner join Estado es on"
                + " ( so.idEstado = es.idEstado) where es.idEstado "
                +valor+"="+estado;
        
        if(!buscar.equals("")){
            this.sql+= " AND (so.idSolicitud  LIKE '"+buscar
                    +"%' OR so.idSolicitud LIKE '%"+buscar+"%')";
        }
        ResultSet rs = bdSelect.executeQuery(this.sql); 
        return rs;    
    }
    //Obtener Usuarios con rol de usuario
    public ResultSet getUsuarios(String rol,String buscar) throws SQLException{        
        this.sql = "select * from Usuario Us where Us.idRol="+rol;
        if(!buscar.equals("")){      
            sql+= " AND (nombres LIKE '"+buscar+"%' OR nombres LIKE '%"
                    +buscar+"%')";
        }
        ResultSet rs = bdSelect.executeQuery(sql);      
        return rs;
    }
    
    //Obtener todas las solicitudes de un Usuario
    public ResultSet getSolicitudesUsuario(String idusuario) throws SQLException{        
        this.sql = "select so.idSolicitud,so.descripcion as descripcionSolicitud"+
        ",so.fecha,es.idEstado,es.nombre ,es.descripcion as descripcionEstado " +
        "from Solicitud so inner join Estado es on " +
        "( so.idEstado = es.idEstado)\n" +
        "where so.idUsuario = '".concat(idusuario)+"'";
        ResultSet rs = bdSelect.executeQuery(sql); 
        return rs;
    }
    //Autenticar contraseña de un usuario
    public boolean validarUsuario(String username, String password) {        
        try {
           ResultSet result =  this.getUsuario(username);
           if(result.next()){
                if(result.getString("contraseña").equals(password)){
                    return true;
                }
            }
        } 
        catch (SQLException e) {
        }
        return false;
    }
    //Cargar datos de una consulta a un Objeto Usuario
    public Usuario cargarDatosSesion( String username, String password)
            throws SQLException {
        ResultSet result =  this.getUsuario(username);
        Usuario user = new Usuario();
        if(result.next()){
            inicializarUsuario(result, user);
        }       
        return user;
    }

   
    
    //Cargar datos de una consulta a un Objeto HistorialSolicitudes
    public HistorialSolicitudes getHSolicitudes(Usuario user) throws SQLException {
        HistorialSolicitudes hsolicitudes= new HistorialSolicitudes(user);
        ResultSet result =  this.getSolicitudesUsuario(user.getDni());
        
        while(result.next()){
            Solicitud solid = new Solicitud();           
            String idSolicitud = result.getString("idSolicitud");
            String descS = result.getString("descripcionSolicitud");
            Date fecha = result.getDate("fecha");        
            int idEstado = result.getInt("idEstado");
            String descE = result.getString("descripcionEstado");
            String nombre = result.getString("nombre");
            EstadoSolicitud estado = new EstadoSolicitud(idEstado,descE,nombre);            
            solid.setCodigo(idSolicitud);
            solid.setFecha(fecha);
            solid.setDescripcion(descS);
            solid.setEstado(estado);
            hsolicitudes.agregarSolicitud(solid);
        }      
        return hsolicitudes;
    }
    public int listarUsuarios(RSTableMetroCustom tabla,String rol
            ,String buscar,List<Usuario> lista) throws SQLException{
        ResultSet rs = this.getUsuarios(rol,buscar);
        String [] columns={"Dni","Nombres","Apellidos","Telefono"};
        TableColumn column = tabla.getColumnModel().getColumn(0);
        
        
        return Tabla.llenarTablaUsuarios(rs, tabla, columns,lista);
    }
    public int listarSolicitudes(RSTableMetroCustom tabla,String estado
            ,String valor,String buscar) throws SQLException{
        ResultSet rs = this.obtenerSolicitudes(valor,estado,buscar);
        String [] columns={"Nro Solicitud","Descripcion","Fecha","Estado"};
        return Tabla.llenarTablaSolicitudes(rs, tabla, columns);
    }
    
    public void guardarFotoEnSQLServer(byte[] fotoBytes) {
        
        this.sql = "INSERT INTO tabla (foto) VALUES (?)";

        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setBytes(1, fotoBytes);
            pstmt.executeUpdate();
            System.out.println("Foto insertada correctamente en SQL Server.");
        } catch (SQLException e) {
            System.out.println("Error al insertar la foto en SQL Server: " + e.getMessage());
        }
    }
    
    public String getSQLInsert(String table,String Columns[],String valores[]){
        this.sql = "INSERT INTO "+table+"(";
        for (int i = 0; i < Columns.length; i++) {
            if(i==(Columns.length-1))
                sql+=Columns[i];
            else
                sql+=Columns[i]+",";
        }
        sql +=")VALUES(";
        for (int i = 0; i < valores.length; i++) {
            if(i==(valores.length-1))
                sql +="'"+valores[i]+"'";
            else
                sql += "'"+valores[i]+"',";
        }
        sql+=")";
        return sql;
    }
    public boolean insertarTabla(String table,String Columnas[]
            ,String []datos) throws SQLException{
        this.sql = getSQLInsert(table, Columnas, datos);
        this.bdUpdate= this.conexion.prepareStatement(this.sql);
        bdUpdate.executeUpdate();
        String id= String.valueOf(bdUpdate.getMaxRows());
        bdUpdate.close();        
        return true;
    }
    public String nuevoUsuario(String [] valores) throws SQLException{
        String [] columns = {"idUsuario","nombres","apellidos","fechaNac"
                ,"nombreUsuario","correo","contraseña","telefono","direccion",
                "idRol","usuCreador","fechaCreador","usuModifica"
                ,"fechaModifica","foto"};
        
        boolean resultado =this.insertarTabla("Usuario", columns, valores);
        return "";
    }
    
    public void verUsuario(Object valor){
        JOptionPane.showMessageDialog(null, "Ver info de "+valor);
    }
    public void editarUsuario(Object valor){
        JOptionPane.showMessageDialog(null, "Editar info de "+valor);
        
    }
   
     public void inicializarUsuario(ResultSet result, Usuario user) throws SQLException {
        String Id = result.getString("idUsuario");
        String nombre1 = result.getString("nombre");
        String nombre2 = result.getString("segundoNombre");
        String apellido1 = result.getString("apellidoPaterno");
        String apellido2 = result.getString("apellidoMaterno");
        Date fechaNac = result.getDate("fechaNac");
        String nombreUsuario =  result.getString("username");
        String correo = result.getString("correo");
        String contraseña =  result.getString("contraseña");
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
      //Cerrar la conexion a la base de Datos
    public void cerrarConexion() throws SQLException{
        this.conexion.close();
    }
}
