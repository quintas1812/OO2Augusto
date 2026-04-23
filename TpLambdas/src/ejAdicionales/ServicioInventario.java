package ejAdicionales;

import org.slf4j.Logger;

import java.util.function.Supplier;

public class ServicioInventario {
    private final Logger log;
    public ServicioInventario(Logger log) {
        this.log = log;
    }
    public void agregarStock(String producto, int cantidad) {
       ejecutarConLog("agregarStock", ()-> log.info("Stock agregado: +" + cantidad + " de " + producto));
    }
    public void retirarStock(String producto, int cantidad) {
        ejecutarConLog("retirarStock", () -> log.info("Stock reducido: -" + cantidad + " de " + producto));
    }
    public String consultarStock(String producto) {
        return  ejecutarConLog("consultarStock",()-> "100 unidades de " + producto);
    }
    private void ejecutarConLog(String nombreOperacion, Runnable operacion){
        log.info("[LOG] Inicio: "+ nombreOperacion);
        long inicio = System.currentTimeMillis();
        try {
            operacion.run();
        } finally {
            long fin = System.currentTimeMillis();
            log.info("[LOG] Fin: "+nombreOperacion+" ({}ms)", (fin - inicio));
        }
    }
    private <T> T ejecutarConLog(String nombreOperacion, Supplier<T> operacion) {
        log.info("[LOG] Inicio: " + nombreOperacion);
        long inicio = System.currentTimeMillis();
        try {
            return operacion.get();
        } finally {
            long fin = System.currentTimeMillis();
            log.info("[LOG] Fin: " + nombreOperacion + " ({}ms)", (fin - inicio));
        }
    }

//    public void retirarStock(String producto, int cantidad) {
//        log.info("[LOG] Inicio: retirarStock");
//        long inicio = System.currentTimeMillis();
//        try {
//            log.info("Stock reducido: -" + cantidad + " de " + producto);
//        } finally {
//            long fin = System.currentTimeMillis();
//            log.info("[LOG] Fin: retirarStock (" + (fin - inicio) + "ms)");
//        }
//    }

//    public String consultarStock(String producto) {
//        log.info("[LOG] Inicio: consultarStock");
//        long inicio = System.currentTimeMillis();
//        try {
//            return "100 unidades de " + producto;
//        } finally {
//            long fin = System.currentTimeMillis();
//            log.info("[LOG] Fin: consultarStock ({}ms)", (fin - inicio));
//        }
//    }

}

//a. Identificar el código duplicado. ¿Qué cambia entre un método y otro, y qué permanece
//igual?
//b. Extraer un método privado:
//private void ejecutarConLog(String nombreOperacion, Runnable operacion)
//que encapsule el log de inicio, la medición de tiempo y el log de fin.
//c. Para el caso de consultarStock() que retorna un valor, defina un segundo método:
//private <T> T ejecutarConLog(String nombreOperacion, Supplier<T> operacion)
//d. Reescriba los tres métodos de ServicioInventario usando estos métodos con lambdas