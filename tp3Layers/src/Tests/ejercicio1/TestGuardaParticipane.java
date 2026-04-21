package Tests.ejercicio1;

import Modelo.ejercicio1.GuardaParticipante;
import Modelo.ejercicio1.Participante;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestGuardaParticipane {

    @Test
    public void testGuardarParticipante() throws Exception {
        // Instanciamos el Fake del mismo paquete
        FakeGuardar fakeGuardar = new FakeGuardar();
        
        // Datos de prueba
        Participante participante = new Participante("Juan Perez", "1234-567890", "China");
        
        // Inyección de dependencia
        GuardaParticipante guardaParticipante = new GuardaParticipante(fakeGuardar);
        guardaParticipante.guardar(participante);
        
        // Verificación
        assertEquals(participante.Nombre(), fakeGuardar.nombre(), "El nombre guardado debe coincidir");
    }

    @Test
    public void testTelefonoInvalidoLanzaExcepcion() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Participante("Juan", "123-456", "China");
        });
        
        assertEquals("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN", exception.getMessage());
    }

    @Test
    public void testNombreVacioLanzaExcepcion() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Participante("", "1234-567890", "China");
        });

        assertEquals("El nombre no puede estar vacío", exception.getMessage());
    }

    @Test
    public void testRegionInvalidaLanzaExcepcion() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Participante("Juan", "1234-567890", "Argentina");
        });

        assertEquals("La región debe ser China, US o Europa", exception.getMessage());
    }
}
