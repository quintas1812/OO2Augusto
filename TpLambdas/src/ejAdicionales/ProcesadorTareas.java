package ejAdicionales;

import java.util.logging.Logger;

public class ProcesadorTareas {
    private final Logger log;
    public ProcesadorTareas(Logger logger) {
        this.log = logger;
    }
    public void ejecutarContador() {
        Thread hilo = new Thread(
                ()->{
                for (int i = 5; i > 0; i--) {
                    log.info("Cuenta regresiva: {}" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                log.info("¡Tarea finalizada!");
            }
        );
        hilo.start();
    }
}
