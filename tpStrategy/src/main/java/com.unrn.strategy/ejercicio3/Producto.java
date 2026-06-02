package com.unrn.strategy.ejercicio3;

class Producto {
    public CalculadorDePrecios tipo;
    public double precio;
    public Producto(CalculadorDePrecios tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }
    public double precioFinal() {
        return tipo.calcularPrecio(this.precio);
    }
//    public double precioFinal() {
//        double impuestos = 0;
//        double descuentos = 0;
////        boolean envioGratis = false;
////        if (tipo == CalculadorDePrecios.LIBRO) {
////            impuestos = 0.1;
////            descuentos = 0.1;
////            if (precio > 100) {
////                envioGratis = true;
////            }
//        } else if (tipo == CalculadorDePrecios.ALIMENTO) {
//            impuestos = 0.05;
//            if (precio > 100) {
//                descuentos = 0.15;
//            }
//            if (precio > 200) {
//                envioGratis = true;
//            }
//        } else if (tipo == CalculadorDePrecios.MEDICINA) {
//            impuestos = 0.02;
//            if (precio > 50) {
//                descuentos = 0.05;
//            }
//        }
//
////        impuestos = 0;
////        if (precio > 50) {
////            descuentos = 0.1;
////        }
////        if (precio > 100) {
////            envioGratis = true;
////        } else {
////                impuestos = 0.15;
////                if (precio > 50) {
////                   descuentos = 0.05;
////                }
////                if (precio > 200) {
////                    envioGratis = true;
////                }
////        }
//        double total = precio * (1 + impuestos) * (1 - descuentos);
//        if (envioGratis) {
//             total -= 10;
//        }
//        return total;
//    }
}