package com.unrn.observers;

import java.time.LocalDateTime;

public class ProxyClimaOnline implements  ClimaOnline {
    private ClimaOnline clima;
    private String temperatura;
    private LocalDateTime ultimaConsulta;

    public ProxyClimaOnline(ClimaOnline clima) {
        this.clima = clima;
    }

    @Override
    public String obtenerTemperaturaActual() {
// proxy de cache si queres obtener la temperatura actual, si la ultima consulta fue hace menos de una hora, devuelve la temperatura guardada, sino consulta al clima online y guarda el resultado
        if (this.temperatura != null && (LocalDateTime.now().isBefore(this.ultimaConsulta))) {
            return this.temperatura;
        }
        this.temperatura = clima.obtenerTemperaturaActual();
        this.ultimaConsulta = LocalDateTime.now().plusHours(1);
        return this.temperatura;
    }
}