package Modelo.ejercicioAdicional;

 public abstract class Producto {
     public static final int DESCUENTO_ENVIO_GRATIS = 10;
     public double precio;

    public Producto(double precio) {
        this.precio = precio;
    }
     //pornerle final permite al compilador detectar si algun producto intenta sobrescribir este metodo, es por seguridad
    public final double precioFinal() {
        double impuestos = impuesto();
        double descuentos = 0;
        boolean envioGratis = false;
         if (this.precio > montoDeDescuento()) {
             descuentos = descuento();
         }
         if (this.precio > montoDeEnvioGratis()) {
             envioGratis = true;
         }
         double total = precio * (1 + impuestos) * (1 - descuentos);
         if (envioGratis) {
             total -= DESCUENTO_ENVIO_GRATIS;
         }
         return total;
     }
     public  abstract double impuesto();
     public  abstract double descuento();
     public  abstract double montoDeDescuento();
     public abstract double montoDeEnvioGratis();
 }
