package com.unrn.observers;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClimaOnline clima = new WeatherChannelService();
        Termometro medidor = new Medidor(clima);
        Termometro decoradorQueNotifica= new MedidorQueNotifica(medidor,List.of(new SaveFile(), new Consola()));
        decoradorQueNotifica.temperatura();
        decoradorQueNotifica.temperatura();
    }
}
