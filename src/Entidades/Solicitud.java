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
public class Solicitud {
    private String codigo;
    private String descripcion;
    private Date fecha;
    private EstadoSolicitud estado;
    private String idUsuario;
    private String nombre;
   
    public String getNombreUser() {
        return nombre;
    }
    public void setNombreUser(String nombre) {
        this.nombre = nombre;
    }    
    public String getCodigo() {
        return codigo;
    }    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setIdUsuario(String id){
        this.idUsuario = id;
    }
    public String getIdUsuario(){
        return idUsuario;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public EstadoSolicitud getEstado() {
        return estado;
    }
    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }    
}
