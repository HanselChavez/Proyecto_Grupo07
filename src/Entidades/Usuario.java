/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
/**
 *
 * @author Hansel Chavez
 */
public class Usuario extends Persona{
   
    private String correo;
    private String nombreUsuario;
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

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
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
}
