/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author chave
 */
public class HistorialSolicitudes {
    
    private Usuario user;
    private List<Solicitud> listaDeSolicitudes;
   
    public HistorialSolicitudes(Usuario user) {
        this.user = user;
        listaDeSolicitudes = new ArrayList<>();
    }   

    public Usuario getUser() {
        return user;
    }
    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public List<Solicitud> getListaDeSolicitudes() {
        return listaDeSolicitudes;
    }
    public void setListaDeSolicitudes(List<Solicitud> listaDeSolicitudes) {
        this.listaDeSolicitudes = listaDeSolicitudes;
    }
    public void agregarSolicitud(Solicitud solicitud){
        this.listaDeSolicitudes.add(solicitud);
    }     
}