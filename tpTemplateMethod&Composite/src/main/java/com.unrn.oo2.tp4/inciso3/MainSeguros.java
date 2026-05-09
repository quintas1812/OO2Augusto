package com.unrn.oo2.tp4.inciso3;


public class MainSeguros {
    public static void main(String[] args){
        Seguro hogar = new SeguroHogar("S.alicia", 1);
        Seguro auto = new SeguroAuto("S.alicia",5000);
        Seguro vida = new SeguroVida("S.alicia", 8800);
        Seguro medico = new SeguroMedico("S.alicia",6000);

        PaqueteSeguros paquete = new PaqueteSeguros("Paquete1");

        paquete.agregarSeguro(hogar);
        paquete.agregarSeguro(auto);
        paquete.agregarSeguro(vida);
        PaqueteSeguros sub = new PaqueteSeguros("subPaquete");



        System.out.println(paquete.calcularCostoTotal());
    }
}
