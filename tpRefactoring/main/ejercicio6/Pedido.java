package ejercicio6;

public class Pedido {

    public static final double DESCUENTO_CLIENTEVIP = 0.15;
    public static final double DESCUENTO_PROPIETARIO = 0.05;
    private double subtotal;
    private boolean clienteVip;
    private boolean envioPrioritario;

    public Pedido(double subtotal, boolean clienteVip, boolean envioPrioritario) {
        this.subtotal = subtotal;
        this.clienteVip = clienteVip;
        this.envioPrioritario = envioPrioritario;
    }

    public double calcularTotalConDescuentoVip() {
        double descuento = 0;
        if (this.clienteVip) {
            descuento = this.subtotal * DESCUENTO_CLIENTEVIP;
        }
        return this.subtotal - descuento;
    }

    public double calcularTotalConDescuentoPrioritario() {
        double descuento = 0;
        if (this.envioPrioritario) {
            descuento = this.subtotal * DESCUENTO_PROPIETARIO;
        }
        return this.subtotal - descuento;
    }

}

