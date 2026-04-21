package ejercicio1;

public class LibroNuevoLanzamiento  extends Libro {
    private final double PRECIOSINDECUENTO=3 ;
    private final double PRECIOCONDESCUENTO=1;//no tiene descuentos
    private final double DIASQUEAPLICAPUNTOS = 1;

    public LibroNuevoLanzamiento(String nombre) {
        super(nombre);
    }

    @Override
    public double Precio(int diasAlquilado) {
        return  diasAlquilado  * PRECIOSINDECUENTO;
    }

    @Override
    public int sumaPuntos(int diasAlquilado) {
        if (diasAlquilado >DIASQUEAPLICAPUNTOS ) {
            return 2;
        }
        return 1;
    }
}