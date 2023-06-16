/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author chave
 */
public class Dni {
    public void getdni(){
        String token = "cGVydWRldnMucHJvZHVjdGlvbi5maXRjb2RlcnMuNjQ2Njg2Zjk1MzAyNzA0ZDZmMmE1Njk2";
        System.out.println("Ingrese DNI: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String dni = reader.readLine();
            String url = "https://api.perudevs.com/api/v1/dni/complete?document=" + dni + "&key=" + token;

            URL apiUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader responseReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = responseReader.readLine()) != null) {
                    response.append(line);
                }
                responseReader.close();

                // Manipular la respuesta JSON
                // (Puedes usar una biblioteca como Jackson o Gson para facilitar esto)

                System.out.println("Respuesta JSON: " + response.toString());
            } else {
                System.out.println("La solicitud no fue exitosa. Código de estado: " + responseCode);
            }
        } catch (IOException e) {
            System.out.println("Error al realizar la solicitud: " + e.getMessage());
        }
    }
}
