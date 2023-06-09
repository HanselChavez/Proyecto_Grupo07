<<<<<<< HEAD
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Date;
import java.util.List;



/**
 *
 * @author chave
 */
public class ServiciosUsuario {
 

    private final Connection conexion;
    private final Statement bdSelect;
    private PreparedStatement bdUpdate;
    private String sqlQuery;
    public ServiciosUsuario() throws ClassNotFoundException, SQLException{
        ConexionBaseDeDatos conection = new ConexionBaseDeDatos();
        this.conexion = conection.getConexion(); 
        this.sqlQuery ="";
        bdSelect=conexion.createStatement();
        bdUpdate = conexion.prepareStatement(sqlQuery);
    }
    //Obtener datos de Usuario
    public ResultSet getUsuario( String username) throws SQLException{        
        this.sqlQuery = "select * from Usuario Us where Us.username "
                + "='".concat(username)+"'";
        ResultSet rs = bdSelect.executeQuery(sqlQuery);      
        return rs;
    }
    //Obtener todas las Solicitudes
    public ResultSet getSolicitudes() throws SQLException{        
        this.sqlQuery = "select * from Solicitud";
        ResultSet rs = bdSelect.executeQuery(sqlQuery); 
        return rs;    
    }
    //Obtener todas las Solicitudes segun su estado
    public ResultSet getSolicitudes(String negacion,String estado
            ,String buscar,String codigo) throws SQLException{       
        this.sqlQuery = "select so.idSolicitud,so.contenidoSolicitud,so.fechaSolicitud,"
                + " es.nombreEstado,es.descripcionEstado,es.idEstado"
                + " from Solicitud so inner join Estado es on"
                + " ( so.idEstado = es.idEstado)";
        if(!estado.equals("")){
            this.sqlQuery += " WHERE es.idEstado "+negacion+"="+estado;
        }
        if(!codigo.equals(""))
        {
            if(estado.equals(""))
                this.sqlQuery +=" WHERE ";
            else
                this.sqlQuery += " AND ";
                    
            this.sqlQuery +="so.idUsuario = "+codigo;
        }
        
        if(!buscar.equals("")){
            this.sqlQuery+= " AND (so.idSolicitud  LIKE '"+buscar
                    +"%' OR so.idSolicitud LIKE '%"+buscar+"%')";
        }
        ResultSet rs = bdSelect.executeQuery(this.sqlQuery); 
        return rs;    
    }
    public ResultSet getEstados(String buscar)throws SQLException{            
        this.sqlQuery = "select * from Estado es where idEstado is not null ";        
        if(!buscar.equals("")){
            this.sqlQuery+= " AND (es.nombreEstado  LIKE '"+buscar
                    +"%' OR es.nombreEstado LIKE '%"+buscar+"%')";
        }
        ResultSet rs = bdSelect.executeQuery(this.sqlQuery); 
        return rs;    
    }
    //Obtener Usuarios con rol de usuario
    public ResultSet getUsuarios(String rol,String buscar) throws SQLException{        
        this.sqlQuery = "select * from Usuario us inner join Rol rl on"
                + "( us.idRol = rl.idRol ) where Us.idRol="+rol;
        if(!buscar.equals("")){      
            sqlQuery+= " AND (nombre LIKE '"+buscar+"%' OR nombre LIKE '%"
                    +buscar+"%')";
        }
        ResultSet rs = bdSelect.executeQuery(sqlQuery);      
        return rs;
    }
    
    //Obtener todas las solicitudes de un Usuario
    public ResultSet getSolicitudesDeUsuario(String idusuario) throws SQLException{        
        this.sqlQuery = "select so.idSolicitud,so.contenidoSolicitud"+
        ",so.fechaSolicitud,es.idEstado,es.nombreEstado ,es.descripcionEstado " +
        "from Solicitud so inner join Estado es on " +
        "( so.idEstado = es.idEstado)\n" +
        "where so.idUsuario = '".concat(idusuario)+"'";
        ResultSet rs = bdSelect.executeQuery(sqlQuery); 
        return rs;
    }
    
    public void insertarSolicitud(String contenido, String idUsuario) 
            throws SQLException {
        this.sqlQuery = "insert into Solicitud(contenidoSolicitud"
                + ",fechaSolicitud,idUsuario,idEstado)" +
            "values ('"+contenido+"',GETDATE(),'"+idUsuario+"',1)";
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    }

    public  void cancelarSolicitud( String codigoSolicitud) 
            throws SQLException {
        this.sqlQuery = "update Solicitud set idEstado = 5"
                +" where idSolicitud = "+codigoSolicitud;
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    }
    public void editarSolicitud(String codigoSolicitud, String motivoEdit) 
            throws SQLException{
        this.sqlQuery = "update Solicitud set contenidoSolicitud = '"+motivoEdit
                +"' where idSolicitud = "+codigoSolicitud;
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
        ResultSet result =  this.getSolicitudesDeUsuario(user.getDni());
        
        while(result.next()){
            Solicitud solid = new Solicitud();           
            String idSolicitud = result.getString("idSolicitud");
            String descS = result.getString("contenidoSolicitud");
            Date fecha = result.getDate("fechaSolicitud");        
            int idEstado = result.getInt("idEstado");
            String descE = result.getString("descripcionEstado");
            String nombre = result.getString("nombreEstado");
            EstadoSolicitud estado = new EstadoSolicitud(idEstado,descE,nombre);            
            solid.setCodigo(idSolicitud);
            solid.setFecha(fecha);
            solid.setDescripcion(descS);
            solid.setEstado(estado);
            hsolicitudes.agregarSolicitud(solid);
        }      
        return hsolicitudes;
    }
    
   
    
    public void actualizarFotoUsuario(byte[] fotoBytes,String idUsuario) {
        
        this.sqlQuery = "Update Usuario set foto ="+Arrays.toString(fotoBytes)
                + " where idUsuario = '"+idUsuario+"'" ;

        try (PreparedStatement pstmt = conexion.prepareStatement(sqlQuery)) {
            pstmt.setBytes(1, fotoBytes);
            pstmt.executeUpdate();
            System.out.println("Foto insertada correctamente en SQL Server.");
        } catch (SQLException e) {
            System.out.println("Error al insertar la foto en SQL Server: " + e.getMessage());
        }
    }
    /*
    public String getSQLInsert(String table,String Columns[],String valores[]){
        this.sqlQuery = "INSERT INTO "+table+"(";
        for (int i = 0; i < Columns.length; i++) {
            if(i==(Columns.length-1))
                sqlQuery+=Columns[i];
            else
                sqlQuery+=Columns[i]+",";
        }
        sqlQuery +=")VALUES(";
        for (int i = 0; i < valores.length; i++) {
            if(i==(valores.length-1))
                sqlQuery +="'"+valores[i]+"'";
            else
                sqlQuery += "'"+valores[i]+"',";
        }
        sqlQuery+=")";
        return sqlQuery;
    }/*
    public boolean insertarTabla(String table,String Columnas[]
            ,String []datos) throws SQLException{
        this.sqlQuery = getSQLInsert(table, Columnas, datos);
        this.bdUpdate= this.conexion.prepareStatement(this.sqlQuery);
        bdUpdate.executeUpdate();
        String id= String.valueOf(bdUpdate.getMaxRows());
        bdUpdate.close();        
        return true;
    }
    public String nuevoUsuario(String [] valores) throws SQLException{
        String [] columns = {"idUsuario","nombre","segundoNombre"
                ,"apellidoPaterno","apellidoMaterno","fechaNac"
                ,"username","correo","contraseña","telefono","direccion",
                "idRol","foto"};
        
        boolean resultado =this.insertarTabla("Usuario", columns, valores);
        return "";
    }*/
    
      
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
     
   
    public int listarUsuarios(RSTableMetroCustom tabla,String rol
                ,String buscar,List<Usuario> lista) throws SQLException{
        ResultSet rs = this.getUsuarios(rol,buscar);
        //String [] columns={"Dni","Nombre","Apellidos","Rol"};
        //TableColumn column = tabla.getColumnModel().getColumn(0);   

        return Tabla.llenarTablaUsuarios(rs, tabla,lista);
    }
    public void listarEstados(RSTableMetroCustom tabla, String buscar
            ,List<EstadoSolicitud> lista) throws SQLException {
        ResultSet rs = this.getEstados(buscar);             
        Tabla.llenarTablaEstados(rs,tabla,lista);
    }
     public int listarSolicitudes(RSTableMetroCustom tabla,String estado
            ,String negacion,String buscar,String codigo,HistorialSolicitudes
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
     public void actualizarUsuario(Usuario user,String idUsuario) throws SQLException {
        Object [] datos = user.toArrayString();
        byte [] foto = (byte[]) datos[12];
        this.sqlQuery = "update Usuario set idUsuario='"+datos[0]+"', "
                + "nombre='"+datos[1]+"', segundoNombre='"+datos[2]
                + "', apellidoPaterno='"+datos[3]+"', apellidoMaterno='"
                +datos[4]+"',fechaNac='"+datos[5]+"',correo='"
                +datos[7]+"',telefono='"+datos[9]+"',direccion='"
                +datos[10]+"',foto = ? Where idUsuario='".concat(idUsuario)+"'";        
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.setBytes(1, foto);
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
    //Cerrar la conexion a la base de Datos

    public void actualizarContraseña(String contraseñaNueva, String dni) 
            throws SQLException {
        this.sqlQuery = "update Usuario set contraseña = '"+contraseñaNueva+"'"
                + " where idUsuario = '".concat(dni)+"'";
             
        bdUpdate = conexion.prepareStatement(sqlQuery);
        bdUpdate.execute();
    }
    public void cerrarConexion() throws SQLException{
        this.conexion.close();
        
    }

   
}
=======
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author chave
 */
public class ServiciosUsuario {
    private final Connection conexion;
    private final Statement bdSelect;
    private PreparedStatement bdUpdate;
    private String sqlQuery;
    public ServiciosUsuario() throws ClassNotFoundException, SQLException{
        ConexionBaseDeDatos conection = new ConexionBaseDeDatos();
        this.conexion = conection.getConexion(); 
        this.sqlQuery ="";
        bdSelect=conexion.createStatement();
        bdUpdate = conexion.prepareStatement(sqlQuery);
    }
    //Obtener datos de Usuario
    public ResultSet getUsuario( String username) throws SQLException{        
        this.sqlQuery = "select * from Usuario Us where Us.username "
                + "='".concat(username)+"'";
        ResultSet rs = bdSelect.executeQuery(sqlQuery);      
        return rs;
    }
    //Obtener todas las Solicitudes
    public ResultSet getSolicitudes() throws SQLException{        
        this.sqlQuery = "select * from Solicitud";
        ResultSet rs = bdSelect.executeQuery(sqlQuery); 
        return rs;    
    }
    //Obtener todas las Solicitudes segun su estado
    public ResultSet getSolicitudes(String negacion,String estado
            ,String buscar) throws SQLException{       
        this.sqlQuery = "select so.idSolicitud,so.contenidoSolicitud,so.fechaSolicitud,"
                + " es.nombreEstado"
                + " from Solicitud so inner join Estado es on"
                + " ( so.idEstado = es.idEstado) where es.idEstado "
                +negacion+"="+estado;
        
        if(!buscar.equals("")){
            this.sqlQuery+= " AND (so.idSolicitud  LIKE '"+buscar
                    +"%' OR so.idSolicitud LIKE '%"+buscar+"%')";
        }
        ResultSet rs = bdSelect.executeQuery(this.sqlQuery); 
        return rs;    
    }
    public ResultSet getEstados(String buscar)throws SQLException{            
        this.sqlQuery = "select * from Estado es where idEstado is not null ";        
        if(!buscar.equals("")){
            this.sqlQuery+= " AND (es.nombreEstado  LIKE '"+buscar
                    +"%' OR es.nombreEstado LIKE '%"+buscar+"%')";
        }
        ResultSet rs = bdSelect.executeQuery(this.sqlQuery); 
        return rs;    
    }
    //Obtener Usuarios con rol de usuario
    public ResultSet getUsuarios(String rol,String buscar) throws SQLException{        
        this.sqlQuery = "select * from Usuario us inner join Rol rl on"
                + "( us.idRol = rl.idRol ) where Us.idRol="+rol;
        if(!buscar.equals("")){      
            sqlQuery+= " AND (nombre LIKE '"+buscar+"%' OR nombre LIKE '%"
                    +buscar+"%')";
        }
        ResultSet rs = bdSelect.executeQuery(sqlQuery);      
        return rs;
    }
    
    //Obtener todas las solicitudes de un Usuario
    public ResultSet getSolicitudesDeUsuario(String idusuario) throws SQLException{        
        this.sqlQuery = "select so.idSolicitud,so.contenidoSolicitud"+
        ",so.fechaSolicitud,es.idEstado,es.nombreEstado ,es.descripcionEstado " +
        "from Solicitud so inner join Estado es on " +
        "( so.idEstado = es.idEstado)\n" +
        "where so.idUsuario = '".concat(idusuario)+"'";
        ResultSet rs = bdSelect.executeQuery(sqlQuery); 
        return rs;
    }
    //Autenticar contraseña de un usuario
    public boolean validarUsuario(String username, String password) 
            throws SQLException {        
       
        ResultSet result =  this.getUsuario(username);
        if(result.next()){
             if(result.getString("contraseña").equals(password)){
                 return true;
             }
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
        ResultSet result =  this.getSolicitudesDeUsuario(user.getDni());
        
        while(result.next()){
            Solicitud solid = new Solicitud();           
            String idSolicitud = result.getString("idSolicitud");
            String descS = result.getString("contenidoSolicitud");
            Date fecha = result.getDate("fechaSolicitud");        
            int idEstado = result.getInt("idEstado");
            String descE = result.getString("descripcionEstado");
            String nombre = result.getString("nombreEstado");
            EstadoSolicitud estado = new EstadoSolicitud(idEstado,descE,nombre);            
            solid.setCodigo(idSolicitud);
            solid.setFecha(fecha);
            solid.setDescripcion(descS);
            solid.setEstado(estado);
            hsolicitudes.agregarSolicitud(solid);
        }      
        return hsolicitudes;
    }
    
   
    
    public void actualizarFotoUsuario(byte[] fotoBytes,String idUsuario) {
        
        this.sqlQuery = "Update Usuario set foto ="+Arrays.toString(fotoBytes)
                + " where idUsuario = '"+idUsuario+"'" ;

        try (PreparedStatement pstmt = conexion.prepareStatement(sqlQuery)) {
            pstmt.setBytes(1, fotoBytes);
            pstmt.executeUpdate();
            System.out.println("Foto insertada correctamente en SQL Server.");
        } catch (SQLException e) {
            System.out.println("Error al insertar la foto en SQL Server: " + e.getMessage());
        }
    }
    /*
    public String getSQLInsert(String table,String Columns[],String valores[]){
        this.sqlQuery = "INSERT INTO "+table+"(";
        for (int i = 0; i < Columns.length; i++) {
            if(i==(Columns.length-1))
                sqlQuery+=Columns[i];
            else
                sqlQuery+=Columns[i]+",";
        }
        sqlQuery +=")VALUES(";
        for (int i = 0; i < valores.length; i++) {
            if(i==(valores.length-1))
                sqlQuery +="'"+valores[i]+"'";
            else
                sqlQuery += "'"+valores[i]+"',";
        }
        sqlQuery+=")";
        return sqlQuery;
    }/*
    public boolean insertarTabla(String table,String Columnas[]
            ,String []datos) throws SQLException{
        this.sqlQuery = getSQLInsert(table, Columnas, datos);
        this.bdUpdate= this.conexion.prepareStatement(this.sqlQuery);
        bdUpdate.executeUpdate();
        String id= String.valueOf(bdUpdate.getMaxRows());
        bdUpdate.close();        
        return true;
    }
    public String nuevoUsuario(String [] valores) throws SQLException{
        String [] columns = {"idUsuario","nombre","segundoNombre"
                ,"apellidoPaterno","apellidoMaterno","fechaNac"
                ,"username","correo","contraseña","telefono","direccion",
                "idRol","foto"};
        
        boolean resultado =this.insertarTabla("Usuario", columns, valores);
        return "";
    }*/
    
      
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
     
   
    public int listarUsuarios(RSTableMetroCustom tabla,String rol
                ,String buscar,List<Usuario> lista) throws SQLException{
        ResultSet rs = this.getUsuarios(rol,buscar);
        //String [] columns={"Dni","Nombre","Apellidos","Rol"};
        //TableColumn column = tabla.getColumnModel().getColumn(0);   

        return Tabla.llenarTablaUsuarios(rs, tabla,lista);
    }
    public void listarEstados(RSTableMetroCustom tabla, String buscar
            ,List<EstadoSolicitud> lista) throws SQLException {
        ResultSet rs = this.getEstados(buscar);
        //String [] columns={"Id Estado","Nombre","Descripcion"};        
        Tabla.llenarTablaEstados(rs,tabla,lista);
    }
     public int listarSolicitudes(RSTableMetroCustom tabla,String estado
            ,String negacion,String buscar) throws SQLException{
        ResultSet rs = this.getSolicitudes(negacion,estado,buscar);
        String [] columns={"Nro Solicitud","Descripcion","Fecha","Estado"};
        return Tabla.llenarTablaSolicitudes(rs, tabla, columns);
    }

    public void actualizarRol(String idUsuario, int rolNuevo)
            throws SQLException {
        this.sqlQuery = "update Usuario set idRol = "+rolNuevo
                +" where idUsuario = '"+idUsuario+"'";
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
    //Cerrar la conexion a la base de Datos
    public void cerrarConexion() throws SQLException{
        this.conexion.close();
    }
}
>>>>>>> 82b1bebf0855fea11d5b75c724e5fe6307bfa7c6
