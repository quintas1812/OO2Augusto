package Modelo.inciso3;

public class MainSeguros {
    public static void main(String[] args){
        Seguro Paquete1 = new SeguroHogar("S.alicia", 1);
        Seguro auto = new SeguroAuto("S.alicia",5000);
        Paquete1.agregarSeguro(auto);
        Seguro vida = new SeguroVida("S.alicia", 8800);
        Seguro Paquetemedico = new SeguroMedico("S.alicia",6000);
        Paquetemedico.agregarSeguro(vida);
        Paquete1.agregarSeguro(Paquetemedico);

        System.out.println(Paquete1.calcularCostoTotal());
    }
}
