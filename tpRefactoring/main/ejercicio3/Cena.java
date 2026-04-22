package main.ejercicio3;

public class Cena extends TipoDeGasto{
    public static final String CENA = "Cena";
    @Override
    public String tipo() {
        return CENA;
    }
    @Override
    public boolean esGastoComida() {
        return true;
    }

    @Override
    public String estaExcedido(int monto) {
        return monto > 5000 ? "X" : " ";
    }
}
