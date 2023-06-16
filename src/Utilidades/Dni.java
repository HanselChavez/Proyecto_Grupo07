/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Usuario;
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
    private static JsonObject jsonObject; 
    private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static Usuario getDatos(String dni) {
        Usuario user = new Usuario();
        try {
            String token = "cGVydWRldnMucHJvZHVjdGlvbi5maXRjb2RlcnMuNjQ2Njg2Zjk1MzAyNzA0ZDZmMmE1Njk2";
            String url = "https://api.perudevs.com/api/v1/dni/complete?document=" + dni + "&key=" + token;
            URL apiUrl = new URL(url);
            HttpURLConnection conexion = (HttpURLConnection) apiUrl.openConnection();
            conexion.setRequestMethod("GET");
            int responseCode = conexion.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                StringBuilder response;
                try (BufferedReader responseReader = new BufferedReader
                    (new InputStreamReader(conexion.getInputStream()))) {
                    response = new StringBuilder();
                    String line;
                    while ((line = responseReader.readLine()) != null) {
                        response.append(line);
                    }
                }
                String jsonString = response.toString();

                // Convertir la cadena JSON en un objeto deseado (por ejemplo, utilizando la biblioteca Gson)
                Gson gson = new Gson();
                jsonObject = gson.fromJson(jsonString, JsonObject.class);            
                // En este caso, solo imprimiremos los valores directamente
                if(verificarEdad(obtenerDato("fecha_nacimiento"))){                    
                    String pnombre = obtenerDato("nombres").split(" ")[0];
                    String snombre ="";
                    if(obtenerDato("nombres").split(" ").length>1)
                        snombre =obtenerDato("nombres").split(" ")[1];
                    String apellidop = obtenerDato("apellido_paterno");
                    String apellidom = obtenerDato("apellido_materno");                  
                    String fechaNac = (obtenerDato("fecha_nacimiento"));                      
                    user.setNombres(pnombre, snombre);
                    user.setApellidos(apellidop, apellidom);
                    user.setFechaNacString(fechaNac);
                    user.setDni(dni);
                    conexion.disconnect();
                    return user;
                }
                  
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
            int edadMinima = 18;
            return calcularEdad(fechaNacimiento, fechaActual) >= edadMinima;
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
    
}
