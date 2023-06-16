/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;


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
    public void eliminarHistorial(){
        this.listaDeSolicitudes.clear();    
    }
    public int buscarIndice(Solicitud solicitud){
        int x =-1;
        for (Solicitud solicitud2 : listaDeSolicitudes) {
            if(solicitud2 == solicitud);
            {                
                x = listaDeSolicitudes.indexOf(solicitud2);
                break;
            }
        }  
        return x;
    }
    public void cancelarSolicitud(Solicitud solicitud){
        int x = buscarIndice(solicitud);
        if(!"Pendiente".equals(listaDeSolicitudes.get(x)
            .getEstado().getNombre())){
            listaDeSolicitudes.remove(x);            
        } 
        else{
            System.out.println("La solicitud ya ha sido procesada,"
                    + " no es posible cancelarla.");
        }
        
    }
   
    public Solicitud buscarSolicitudporFecha(Date fecha){
        Solicitud encontrado = null;
        for (Solicitud solicitud : listaDeSolicitudes) {
            if(solicitud.getFecha()==fecha){
                encontrado =solicitud;
                break;
            }
        }        
        return encontrado;
    }
}
