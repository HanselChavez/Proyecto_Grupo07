/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Usuario;
import Main.ServicioDeAgua;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author chave
 */
public class Dni {
    private static DateFormat dateFormat;
    private static JsonObject jsonObject; 
    public static Usuario getDatos(String dni) {
        dateFormat= new SimpleDateFormat("dd/MM/yyyy");
        Usuario user = null;
        try {
            String token = "cGVydWRldnMucHJvZHVjdGlvbi5maXRjb2RlcnMuNjQ"
                    + "4Zjk0NTM1MzAyNzA0ZDZmMmE1NmI5";
            String url = "https://api.perudevs.com/api/v1/dni/complete?document=" 
                    + dni + "&key=" + token;
            URL apiUrl = new URL(url);
            
            /*
            * HttpURLConnection es una clase que proporciona una forma de
            * establecer conexion y manejar conexiones a recursos a travez
            * del protocolo HTTP
            */
            HttpURLConnection conexion = (HttpURLConnection) apiUrl.openConnection();
            //metodo que envia la solicitud 'GET'
            conexion.setRequestMethod("GET");
            //Obtener codigo de respuesta
            int responseCode = conexion.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                StringBuilder response;
                //Leer el flujo de entrada
                try (BufferedReader responseReader = new BufferedReader
                    (new InputStreamReader(conexion.getInputStream()))) {
                    response = new StringBuilder();
                    String line;
                    while ((line = responseReader.readLine()) != null) {
                        response.append(line);
                    }
                }                
                String jsonString = response.toString();
                if(jsonString.contains("Error de validación")||jsonString
                        .contains("\"nombre_completo\":\"  \"")){
                        ServicioDeAgua.mensaje.cargarDatos("Verificar Dni",
                               "El dni ingresado es invalido",1 );
                    return user;  
                }
                // Convertir la cadena a JSON              
                Gson gson = new Gson();
                jsonObject = gson.fromJson(jsonString, JsonObject.class);            
                // En este caso, solo imprimiremos los valores directamente
                if(verificarEdad(obtenerDato("fecha_nacimiento"))){                    
                    String pnombre = obtenerDato("nombres").split(" ")[0];
                    String snombre ="";
                    if(obtenerDato("nombres").split(" ").length>1)
                        snombre = obtenerDato("nombres").split(" ")[1];
                    String apellidoP = obtenerDato("apellido_paterno");
                    String apellidoM = obtenerDato("apellido_materno");                  
                    String fechaNac = obtenerDato("fecha_nacimiento");                      
                    user = new Usuario();
                    user.setNombres(capitalizar(pnombre), capitalizar(snombre));
                    user.setApellidos(capitalizar(apellidoP)
                            ,capitalizar(apellidoM));
                    user.setFechaNacString(fechaNac);
                    user.setDni(dni);
                    conexion.disconnect();
                }               
                else{
                    ServicioDeAgua.mensaje.cargarDatos("Verificar Dni",
                        "El dni ingresado pertenece a un menor de edad",1 );
                }
                return user;
            }             
        } catch (IOException ex) {
            System.out.println("Error al realizar la solicitud: " + ex.getMessage());
        } 
        return null;
    }
    private static String obtenerDato(String dato){
        String rpta = jsonObject.get("resultado").getAsJsonObject()
                .get(dato).toString().replace("\"","");
        return rpta;
    }  
    private static boolean verificarEdad(String fecha) {          
        Date fechaNacimiento;
        try {
            fechaNacimiento = dateFormat.parse(fecha);            
            // Verificar si es mayor de edad
            Date fechaActual = new Date();            
            return calcularEdad(fechaNacimiento, fechaActual) >= 18;
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
        return false;
    }
   
    private static int calcularEdad(Date fechaNacimiento, Date fechaActual) {
        int edad;        
        // Calcular la diferencia en milisegundos entre las fechas
        long diferencia = fechaActual.getTime() - fechaNacimiento.getTime();
        
        // Convertir la diferencia a años       
        edad = (int) (diferencia / 1000 / 60 / 60 / 24 / 365.25);        
        return edad;
    }
    public static String capitalizar(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto; // Devuelve la cadena original si es nula o vacía
        } else {
            String primeraLetra = texto.substring(0,1);
            String resto = texto.substring(1).toLowerCase();
            return primeraLetra + resto;
        }
    }
    
}
