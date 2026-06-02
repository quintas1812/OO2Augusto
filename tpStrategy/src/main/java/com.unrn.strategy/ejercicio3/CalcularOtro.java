package com.unrn.strategy.ejercicio3;

public class CalcularOtro extends CalculadorDePrecios{

    @Override
    public void calcular(double precio) {
        if (precio > 50) {
            super.descuentos = 0.1;
        }
        if (precio > 100) {
            super.envioGratis = true;
        } else {
                super.impuestos = 0.15;
                if (precio > 50) {
                   super.descuentos = 0.05;
                }
                if (precio > 200) {
                    super.envioGratis = true;
                }
        }
    }
}
//         impuestos = 0;
//        if (precio > 50) {
//            descuentos = 0.1;
//        }
//        if (precio > 100) {
//            envioGratis = true;
//        } else {
//                impuestos = 0.15;
//                if (precio > 50) {
//                   descuentos = 0.05;
//                }
//                if (precio > 200) {
//                    envioGratis = true;
//                }
//        }