package com.unrn.observers;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Random;
import org.json.JSONObject;
public class WeatherChannelService implements ClimaOnline {
    private final String API_KEY = "9078fe641ed1613a39cd07309143ff38";

    @Override
    public String obtenerTemperaturaActual() {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=Viedma,Argentina&units=metric&APPID=" + API_KEY;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        if (response.statusCode() == 200) {
            JSONObject json = new JSONObject(response.body());
            return  Float.toString(json.getJSONObject("main").getFloat("temp")) ;
        }
        return "";
    }

}

//1. Modifique la clase WheatherChannel para consumir el servicio web de
//https://openweathermap.org/current.
//Obtenga una cuenta gratuita desde: https://home.openweathermap.org/users/sign_up
//(registrándose). Una vez registrado, recibirá un email con una API KEY que necesitan para
//consumir los servicios. La activación de la API KEY demora unos 15 minutos una vez
//creada.
//Ejemplo de consumo del clima en Viedma en celsius:
//https://api.openweathermap.org/data/2.5/weather?q=Viedma,Argentina&units=metric&APPID
//=TU_API_KEY