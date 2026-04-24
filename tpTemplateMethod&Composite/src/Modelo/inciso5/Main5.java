package Modelo.inciso5;

public class Main5 {
    static void main (String[] args){
        Remera mangalarga= new RemeraImportada(100);
        System.out.println(mangalarga.calcularPrecio());
        Remera mangacorta= new RemeraNacional(100);
        System.out.println(mangacorta.calcularPrecio());
    }
}
