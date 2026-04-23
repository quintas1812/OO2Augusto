package ejercicio1;

public abstract class Libro {
  //  public static final int INFANTILES = 2;
//public static final int REGULARES = 0;
  //  public static final int NUEVO_LANZAMIENTO = 1;
    private String nombre;
  //  private int codigoPrecio;

    public Libro(String nombre) {
        this.nombre = nombre;
    }

// los precios son por la cantidad de dias, descuento a partir de ciertos dias
    public abstract double Precio(int diasAlquilado);
    public abstract int sumaPuntos(int diasAlquilado);


//        this.nombre = nombre;
//        this.codigoPrecio = priceCode;

//    public int codigoPrecio() {
//        return codigoPrecio;
//    }


//    public String nombre() {
//        return nombre;
//    }
}