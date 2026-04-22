package main.ejercicio1;

public class LibroRegular extends Libro {
    private final double PRECIOSINDECUENTO=2;
    private final double PRECIOCONDESCUENTO=1.5;
    private final double DIAQUEAPLICAELDESCUENTO =2;
    public LibroRegular(String nombre) {
        super(nombre);
    }

    @Override
    public double Precio(int diasAlquilado) {
        double precio = PRECIOSINDECUENTO;
        if (diasAlquilado > DIAQUEAPLICAELDESCUENTO){
            precio += (diasAlquilado - DIAQUEAPLICAELDESCUENTO) * PRECIOCONDESCUENTO;
        }
        return precio;
    }

    @Override
    public int sumaPuntos(int diasAlquilado) {
        return 1;
    }
}