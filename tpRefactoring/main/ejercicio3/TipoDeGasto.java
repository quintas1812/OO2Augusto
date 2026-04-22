package main.ejercicio3;

public abstract class TipoDeGasto {
    String tipo;
    public abstract String tipo();
    public abstract boolean esGastoComida();
    public abstract String estaExcedido(int monto);
}
