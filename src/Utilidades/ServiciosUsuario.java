/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;
import Entidades.*;
import java.util.*;
import Config.ConexionBaseDeDatos;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import RSMaterialComponent.RSTableMetroCustom;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Hansel Chavez
 */
public class ServiciosUsuario {
    private final Connection conexion;
    private final Statement bdSelect;
    private PreparedStatement bdUpdate;
    private String sqlQuery;
    
    public ServiciosUsuario() throws ClassNotFoundException, SQLException{         
        this.conexion = ConexionBaseDeDatos.getConexion(); 
        this.sqlQuery ="";
        bdSelect = conexion.createStatement();
        bdUpdate = conexion.prepareStatement(sqlQuery);    
    }
    
    public  boolean verificarCampo(String campo,String valor) {
        try {
            this.sqlQuery = "select count("+campo+") cantidad"
                    + " from Usuario where "+campo+"='"+valor+"'";
            ResultSet rs = bdSelect.executeQuery(sqlQuery);
            rs.next();
            return rs.getInt("cantidad")==1;
                
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        return false;
    }
    //Obtener datos de Usuario por su username
    private ResultSet getUsuario(String username) throws SQLException{   
        this.sqlQuery = "select * from Usuario Us where Us.username "
                + "='".concat(username)+"'";
        ResultSet rs = bdSelect.executeQuery(sqlQuery);    
        return rs;
    }
    //Generar Codigo segun la cantidad de registros de sugerencia o reclamos
    public int getCodigo(String tipo,String idUsuario) throws SQLException{
        this.sqlQuery = "select count(id"+tipo+")+1 codigo "
                + "from "+tipo+" where idUsuario  = '"+idUsuario+"'";
        ResultSet rs = bdSelect.executeQuery(sqlQuery);
        rs.next();
        return rs.getInt("codigo");
    }    
    //Obtener Solicitudes según su estado
    private ResultSet getSolicitudes(String negacion,String estado
            ,String buscar,String usuario) throws SQLException{       
        this.sqlQuery = "select u.idUsuario, u.nombre+' '+u.apellidoPaterno+"
                + "' '+u.apellidoPaterno nombreCompleto,so.idSolicitud"
                + ",so.contenidoSolicitud,so.fechaSolicitud, es.nombreEstado,"
                + "es.descripcionEstado,es.idEstado from Solicitud so inner "
                + "join Usuario u on(so.idUsuario = u.idUsuario)inner join "
                + "Estado es on(so.idEstado = es.idEstado)";
        if(!estado.equals("")){
            this.sqlQuery += " WHERE es.idEstado "+negacion+"="+estado;
        }
        if(!usuario.equals(""))
        {
            if(estado.equals(""))
                this.sqlQuery +=" WHERE ";
            else
                this.sqlQuery += " AND ";                    
            this.sqlQuery +="so.idUsuario = '"+usuario+"'";
        }        
        if(!buscar.equals("")){
            this.sqlQuery+= " AND (so.idSolicitud  LIKE '"+buscar
                    +"%' OR so.idSolicitud LIKE '%"+buscar+"%')";
        }
        ResultSet rs = bdSelect.executeQuery(this.sqlQuery); 
        return rs;    
    }
    private ResultSet getEstados(String buscar)throws SQLException{            
        this.sqlQuery = "select * from Estado es where idEstado is not null ";        
        if(!buscar.equals("")){
            this.sqlQuery+= " AND (es.nombreEstado  LIKE '"+buscar
                    +"%' OR es.nombreEstado LIKE '%"+buscar+"%')";
        }
        ResultSet rs = bdSelect.executeQuery(this.sqlQuery); 
        return rs;    
    }
    //Obtener Usuarios con rol de usuario
    private ResultSet getUsuarios(String rol,String buscar) throws SQLException{        
        this.sqlQuery = "select * from Usuario us inner join Rol rl on"
                + "( us.idRol = rl.idRol ) where Us.idRol="+rol;
        if(!buscar.equals("")){      
            sqlQuery+= " AND (nombre LIKE '"+buscar+"%' OR nombre LIKE '%"
                    +buscar+"%')";
        }
        ResultSet rs = bdSelect.executeQuery(sqlQuery);     
        return rs;
    }
    private ResultSet getAvisos(String buscar) throws SQLException {
        this.sqlQuery = "select a.idAviso,a.contenidoAviso,a.fechaAviso,"
                + "u.nombre+' '+u.apellidoPaterno+' '+u.apellidoPaterno "
                + "nombreCompleto from Aviso a inner join Usuario u "
                + "on(a.idUsuario = u.idUsuario)";    
        if(!"".equals(buscar))
            this.sqlQuery +="where idAviso LIKE '"+buscar
                    +"%' OR idAviso LIKE '%"+buscar+"%'";        
        ResultSet rs = bdSelect.executeQuery(sqlQuery);  
        return rs;
    }
    
    private ResultSet getRetroalimentacion(String idUsuario,String tipo
            ,String buscar) throws SQLException{
        this.sqlQuery = "select * from "+tipo; 
        if(!idUsuario.equals(""))
            this.sqlQuery +=" where idUsuario ='"+idUsuario+"'";
        if(!idUsuario.equals("")&&!"".equals(buscar))
            this.sqlQuery +=" AND";
        else if(idUsuario.equals("")&&!"".equals(buscar))
            this.sqlQuery +=" where ";        
        if(!"".equals(buscar)){
            if("Sugerencia".equals(tipo))
                this.sqlQuery+= "(idSugerencia LIKE '"+buscar+"%'"
                        + " OR idSugerencia LIKE '%"+buscar+"%')";
            else 
                this.sqlQuery+= "(idReclamo LIKE '"+buscar+"%'"
                        + " OR idReclamo LIKE '%"+buscar+"%')";                
        }
        ResultSet rs = bdSelect.executeQuery(sqlQuery); 
        return rs;
    }
    //Eliminar Historia Solicitudes de un usuario
    public void eliminarSolicitudesUsuario(String dni) throws SQLException{     
        this.sqlQuery = "delete from Solicitud where idUsuario ='"+dni+"'";
        bdUpdate= conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    }
    //Eliminar Aviso segun su codigo
    public void eliminarAviso(String cod) throws SQLException {
        this.sqlQuery = "delete from Aviso where idAviso ="+cod;
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    }
    public void insertarCuenta(Usuario user) throws SQLException {
        Object [] datos = user.toArrayString();
        byte [] foto = (byte[]) datos[12];
        this.sqlQuery = "insert into Usuario(idUsuario,nombre,segundoNombre"
                + ",apellidoPaterno,apellidoMaterno,fechaNac,username,correo,"
                + "contraseña,telefono,direccion,idRol,foto) values('"+datos[0]
                +"','"+datos[1]+"','"+datos[2]+"','"+datos[3]+"','"+datos[4]
                +"','"+datos[5]+"','"+datos[6]+"','"+datos[7]+"','"+datos[8]
                +"','"+datos[9]+"','"+datos[10]+"',"+datos[11]+",?)";                     
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.setBytes(1, foto);
        bdUpdate.execute();    
    }
    public void insertarRetroalimentacion(int cod,String tipo
            ,String contenido,String dni) 
            throws SQLException {
        this.sqlQuery = "insert into "+tipo+"(id"+tipo+",idUsuario,contenido"
                +tipo+",fecha"+tipo+") values("+cod+",'"+dni+"'"
                + ",'"+contenido+"',GETDATE())";
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    }
    public void insertarAviso(String dni, String contenido) throws SQLException {
        this.sqlQuery = "insert into Aviso(idUsuario,contenidoAviso,fechaAviso)"
                + "values('"+dni+"','"+contenido+"',GETDATE())";
        bdUpdate = conexion.prepareCall(sqlQuery);
        bdUpdate.execute();
    }
    public void insertarSolicitud(String contenido, String idUsuario
            ,int idSolicitud) throws SQLException {
        this.sqlQuery = "insert into Solicitud(idUsuario,idSolicitud"
                + ",contenidoSolicitud,fechaSolicitud,idEstado)"
                + " values('"+idUsuario +"',"+idSolicitud+",'"
                +contenido+"',GETDATE(),1)";
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    }
    public  void cancelarSolicitud( String codigoSolicitud, String idUsuario) 
            throws SQLException {
        this.sqlQuery = "update Solicitud set idEstado = 5"
                +" where idSolicitud = "+codigoSolicitud+" AND idUsuario='"
                +idUsuario+"'";
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    }    
    //Autenticar contraseña de un usuario
    public boolean validarUsuario(String username, String password) 
            throws SQLException { 
        ResultSet result =  this.getUsuario(username);    
        if(result.next()){
            boolean resultado = result.getString("contraseña").equals(password);
            return resultado;
        }   
        return false;
    }
    //Cargar datos de una consulta a un Objeto Usuario
    public Usuario cargarDatosSesion(String username)
            throws SQLException {
        ResultSet result =  this.getUsuario(username);
        Usuario user = new Usuario();
        if(result.next()){
            inicializarUsuario(result, user);
        }       
        return user;
    }
    public void actualizarSolicitud(String codigoSolicitud, String motivoEdit,
            String idUsuario)throws SQLException{
        this.sqlQuery = "update Solicitud set contenidoSolicitud = '"+motivoEdit
                +"' where idSolicitud = "+codigoSolicitud + "AND idUsuario='"+
                idUsuario+"'";
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();    
    }
    
    public void actualizarAviso(String codigo,String contenido) 
            throws SQLException {
        this.sqlQuery = "update Aviso set contenidoAviso = '"+contenido+"' "
                + "where idAviso="+codigo;
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    }        
    public int listarUsuarios(RSTableMetroCustom tabla,String rol
                ,String buscar,List<Usuario> lista,int modo) throws SQLException{
        ResultSet rs = this.getUsuarios(rol,buscar);        
        return Tabla.llenarTablaUsuarios(rs, tabla,lista,modo);
    }
    public void listarEstados(RSTableMetroCustom tabla, String buscar
            ,List<EstadoSolicitud> lista) throws SQLException {
        ResultSet rs = this.getEstados(buscar);             
        Tabla.llenarTablaEstados(rs,tabla,lista);
    }    
    public void listarAvisos(RSTableMetroCustom tabla, String buscar,List<Mensaje>
            lista)
            throws SQLException {
        ResultSet rs = this.getAvisos(buscar);
        Tabla.llenarTablaAvisos(rs,tabla,buscar,lista);        
    }    
    public void listarRetroAlimentacion(RSTableMetroCustom tabla,String idUsuario
            , String buscar, String tipo,List<Mensaje> lista,int modo) 
            throws SQLException {
        ResultSet rs = this.getRetroalimentacion(idUsuario, tipo, buscar);
        Tabla.llenarTablaRetroAlimentacion(rs,tabla,buscar,lista,tipo,modo);
        
    }
    public int listarSolicitudes(RSTableMetroCustom tabla,String estado
            ,String negacion,String buscar,String codigo,List<Solicitud>
                    historial) throws SQLException{
        ResultSet rs = this.getSolicitudes(negacion,estado,buscar,codigo);          
        return Tabla.llenarTablaSolicitudes(rs, tabla,historial,codigo);
    }      
    public void actualizarRol(String idUsuario, int rolNuevo)
            throws SQLException {
        this.sqlQuery = "update Usuario set idRol = "+rolNuevo
                +" where idUsuario = '"+idUsuario+"'";
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    }
    public void actualizarUsuario(Usuario user) throws SQLException {
        Object [] datos = user.toArrayString();
        byte [] foto = (byte[]) datos[12];
        this.sqlQuery = "update Usuario set idUsuario='"+datos[0]+"', "
                + "nombre='"+datos[1]+"', segundoNombre='"+datos[2]
                + "', apellidoPaterno='"+datos[3]+"',apellidoMaterno='"
                +datos[4]+"',fechaNac='"+datos[5]+"',correo='"
                +datos[7]+"',telefono='"+datos[9]+"',direccion='"
                +datos[10]+"',foto = ? Where idUsuario='".concat(user.getDni())
                +"'";        
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.setBytes(1, foto);
        bdUpdate.execute();       
     }
     
    public void actualizarEstadoSolicitud(String idSoli, String idUser, int estado) 
            throws SQLException {
        this.sqlQuery = "update Solicitud set idEstado = "+estado+" where "
                + "idSolicitud = "+idSoli+" AND idUsuario ='"+idUser+"'";                 
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    }
     public void actualizarEstados(String idEstado, String nuevoNombre,
             String nuevaDescrip) throws SQLException {         
        this.sqlQuery = "update Estado set nombreEstado = '"+nuevoNombre+"'"
                + ", descripcionEstado = '"+nuevaDescrip+"' where idEstado = "+
                idEstado; 
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    }
    public void actualizarContraseña(String contraseñaNueva, String dni
            ,String correo) 
            throws SQLException {
        this.sqlQuery = "update Usuario set contraseña = '"+contraseñaNueva+"'"
            + " where" ;
            if(!dni.isEmpty())
                sqlQuery+=" idUsuario ='".concat(dni)+"'";
            else
                sqlQuery+=" correo ='"+correo+"'";
             
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    } 
    public static void inicializarUsuario(ResultSet result, Usuario user)   {
        try {
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
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosUsuario.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }   

   

   
   
}
