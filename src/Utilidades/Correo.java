/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;


import javax.mail.Authenticator;

import java.util.Properties;
import java.util.Random;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Kelvin Vasquez
 */
public class Correo {
    private static String generarCodigoAleatorio() {
        // Generar un código aleatorio de 6 dígitos
        Random random = new Random();
        int codigo = 100000 + random.nextInt(900000);
        return String.valueOf(codigo);
    }
    public static String enviarCorreoElectronico(String destinatario ) 
            throws MessagingException  {
        String codigo = generarCodigoAleatorio();
     
        // Configurar las propiedades del servidor de correo
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.port", "587");
        properties.setProperty("mail.smtp.user","chavezhansel2901@gmail.com");
        properties.setProperty("mail.smtp.auth", "true");

        // Configurar las credenciales del remitente
        final String remitente = "chavezhansel2901@gmail.com";
        final String password = "xrduhdsfnnbkblex";

        // Obtener la sesión de correo
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(remitente, password);
            }
        });

        // Crear el mensaje de correo
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(remitente));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
        message.setSubject("Verificación de código");
        message.setText("Tu código de verificación es: " + codigo);
        // Enviar el mensaje de correo
        Transport.send(message);
        System.out.println("Correo electrónico enviado correctamente.");           
       
        return codigo;
    }  

}
