package Test.inciso1;
import Modelo.inciso1.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalcularSalario {
    @Test
    public void testCalcularSalarioTotal() {
        Director director = new Director("Augusto", 110);
        Gerente gerente1 = new Gerente("Daniel", 100);
        Gerente gerente2 = new Gerente("Juan", 100);
        MandoMedio mandoMedio = new MandoMedio("Carina", 70);
        EmpleadoRegular regular = new EmpleadoRegular("Morena", 50);

        director.asiganarGerente(gerente1);
        director.asiganarGerente(gerente2);
        gerente1.asiganarMandoMedio(mandoMedio);
        mandoMedio.asiganarEmpleadoRegular(regular);
        assertEquals(430, director.calcularSalario());
    }

    @Test
    public void testCalcularSalarioEmpleadoSinSubordinados() {
        EmpleadoRegular regular = new EmpleadoRegular("Morena", 50);
       assertEquals(50, regular.calcularSalario());
    }

}
