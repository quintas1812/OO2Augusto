package  com.unrn.oo2.tp4.ejercicioAdicional;

public class Libro extends Producto{
    public static final double IMPUESTOS = 0.1;
    public static final double DESCUENTOS = 0.1;
    public static final double MONTO_DESCUENTO = 0;
    public static final double MONTO_ENVIO_GRATIS = 100;
    public Libro(double precio) {
        super(precio);
    }
    @Override
    public double impuesto() {
        return IMPUESTOS;
    }
    @Override
    public double descuento() {
        return DESCUENTOS;
    }
    @Override
    public double montoDeDescuento() {
        return MONTO_DESCUENTO;
    }
    @Override
    public double montoDeEnvioGratis() {
        return MONTO_ENVIO_GRATIS;
    }
}
