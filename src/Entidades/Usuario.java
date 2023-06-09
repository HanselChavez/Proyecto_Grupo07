<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;
/**
 *
 * @author chave
 */
public class Usuario {
    private String dni ;
    private String nombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNac;
    private String direccion;
    private String correo;
    private String nombreUsuario;
    private String celular;
    private String contraseña;
    private byte[] fotoBytes;
    private int rol;
    public Usuario(){
        fotoBytes = null;
    }
    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public byte[] getFoto() {
        return fotoBytes;
    }

    public void setFoto(byte[] foto) {
        this.fotoBytes = foto;
    }
    
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombre+" "+segundoNombre;
    }

    public void setNombres(String pnombre,String snombre) {
        this.nombre = pnombre;
        this.segundoNombre = snombre;
    }

    public String getApellidos() {
        return apellidoPaterno+" "+apellidoMaterno;
    }

    public void setApellidos(String apellidoP,String apellidoM) {
        this.apellidoPaterno = apellidoP;
        this.apellidoMaterno = apellidoM;
    }

    public Date getFechaNac() {

        
        return this.fechaNac;
    }
    public String getFechaString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = dateFormat.format(this.fechaNac);
        return dateString;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public Object[] toArrayString(){
        Object [] array=new Object[13];
        array[0]=this.dni;
        array[1]=this.nombre;
        array[2]=this.segundoNombre;
        array[3]=this.apellidoPaterno;
        array[4]=this.apellidoMaterno;
        array[5]=this.getFechaString();
        array[6]=this.nombreUsuario;
        array[7]=this.correo;
        array[8]=this.contraseña;
        array[9]=this.celular;
        array[10]=this.direccion;
        array[11]=String.valueOf(this.rol);      
        array[12]=this.fotoBytes;
                
        return array;  
    }
    @Override
    public String toString() {
        return "Usuario{" + "dni=" + dni + ", nombres=" 
                + nombre + ", apellidos=" + apellidoPaterno 
                + ", fechaNac=" + fechaNac + ", direccion="
                + direccion + ", correo=" + correo + ", celular=" 
                + celular + ", contrase\u00f1a=" + contraseña
                + ", rol=" + rol + '}';
    }
    
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.util.Date;
import java.util.Arrays;
/**
 *
 * @author chave
 */
public class Usuario {
    private String dni ;
    private String nombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNac;
    private String direccion;
    private String correo;
    private String nombreUsuario;
    private String celular;
    private String contraseña;
    private byte[] fotoBytes;
    private int rol;
    public Usuario(){
    
    }
    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public byte[] getFoto() {
        return fotoBytes;
    }

    public void setFoto(byte[] foto) {
        this.fotoBytes = foto;
    }
    
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombre+" "+segundoNombre;
    }

    public void setNombres(String pnombre,String snombre) {
        this.nombre = pnombre;
        this.segundoNombre = snombre;
    }

    public String getApellidos() {
        return apellidoPaterno+" "+apellidoMaterno;
    }

    public void setApellidos(String apellidoP,String apellidoM) {
        this.apellidoPaterno = apellidoP;
        this.apellidoMaterno = apellidoM;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public String[] toArrayString(){
        String [] array=new String[13];
        array[0]=this.dni;
        array[1]=this.nombre;
        array[2]=this.segundoNombre;
        array[3]=this.apellidoPaterno;
        array[4]=this.apellidoMaterno;
        array[5]=this.fechaNac.toString();
        array[6]=this.nombreUsuario;
        array[7]=this.correo;
        array[8]=this.contraseña;
        array[9]=this.celular;
        array[10]=this.direccion;
        array[11]=String.valueOf(this.rol);      
        array[12]=Arrays.toString(this.fotoBytes);
                
        return array;  
    }
    @Override
    public String toString() {
        return "Usuario{" + "dni=" + dni + ", nombres=" 
                + nombre + ", apellidos=" + apellidoPaterno 
                + ", fechaNac=" + fechaNac + ", direccion="
                + direccion + ", correo=" + correo + ", celular=" 
                + celular + ", contrase\u00f1a=" + contraseña
                + ", rol=" + rol + '}';
    }
    
    
}
>>>>>>> 82b1bebf0855fea11d5b75c724e5fe6307bfa7c6
