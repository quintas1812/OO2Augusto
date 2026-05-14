package com.unrn.oo2.tp5.ejercicio1;

public class AdapterElectrico implements Motor {
    private Electrico electrico;
    public AdapterElectrico(Electrico electrico) {
        this.electrico = electrico;
    }
    @Override
    public void acelerar() {
        electrico.moverMasRapido();
    }

    @Override
    public void arrancar() {
        electrico.activar();
    }

    @Override
    public void apagar() {
        electrico.desactivar();
    }
    @Override
    public String tipoMotor() {
        return "Electrico";
    }
}
// conectar y activar, moverMasRapido, detener y desconectar.