/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author chave
 */
public class Mensaje {
    private final String cod;
    private final String tipo;
    private final String contenido;
    private final Date fecha;
    private String nombreUsuario;
    public Mensaje(String cod, String tipo,String contenido, Date fecha) {
        this.cod = cod;
        this.tipo= tipo;
        this.contenido = contenido;
        this.fecha = fecha;
    }
    public String getCod() {
        return cod;
    }
    public String getTipo(){
        return tipo;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombre) {
        this.nombreUsuario = nombre;
    }
    public String getContenido() {
        return contenido;
    }

    public Date getFecha() {
        return fecha;
    }    
}
