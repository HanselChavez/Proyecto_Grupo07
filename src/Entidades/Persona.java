/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author chave
 */
public class Persona {
    protected String dni ;
    protected String nombre;
    protected String segundoNombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected String direccion;
    protected String celular;
    protected Date fechaNac;
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
    
    public String getFechaString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = dateFormat.format(this.fechaNac);
        return dateString;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public void setFechaNacString(String fecha){
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");   
            this.fechaNac = dateFormat.parse(fecha);
        } catch (ParseException ex) {
            System.out.println("No se pudo convertir el string en date");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
