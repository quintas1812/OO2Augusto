package com.unrn.strategy.ejercicio3;



import com.unrn.strategy.ejercicio3.CalculadorDePrecios;

public class CalcularLibro extends CalculadorDePrecios{


    @Override
    public void calcular(double precio) {
        super.impuestos = 0.1;
        super.descuentos = 0.1;
        if (precio > 100) {
            super.envioGratis = true;
        }

    }
}
//            impuestos = 0.1;
//            descuentos = 0.1;
//            if (precio > 100) {
//                envioGratis = true;
//            }
