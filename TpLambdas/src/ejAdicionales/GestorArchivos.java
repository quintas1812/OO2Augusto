package ejAdicionales;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class GestorArchivos {
    public void escribirLinea(String ruta, String linea) {
        ejecutarConWriter(ruta, "Error al escribir la línea en: " , (bf)-> {if (linea.length() > 100) {
            bf.write("[La línea es muy larga]");
            bf.write(linea);
        }});
    }
    public void escribirEncabezado(String ruta) {
        ejecutarConWriter(ruta, "Error al escribir encabezado en: ", (bf) -> bf.write("=== INICIO ==="));
    }
    public void escribirSeparador(String ruta) {
        ejecutarConWriter(ruta, "Error al escribir separador en: ",
                bw -> bw.write("---"));
    }
    private void ejecutarConWriter(String ruta, String mensajeEror, OperacionEscritura op) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, true))) {
            op.escribir(writer);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(mensajeEror + ruta, e);
        }
    }
}
interface OperacionEscritura {
    void escribir(BufferedWriter bw) throws IOException;
 }

//    public void escribirEncabezado(String ruta) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta,
//                true))) {
//            writer.write("=== INICIO ===");
//            writer.newLine();
//        } catch (IOException e) {
//            throw new RuntimeException("Error al escribir encabezado en: " +
//                    ruta, e);
//        }
//    }
//    public void escribirSeparador(String ruta) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta,
//                true))) {
//            writer.write("---");
//            writer.newLine();
//        } catch (IOException e) {
//            throw new RuntimeException("Error al escribir separador en: " +
//                    ruta, e);
//        }
//    }

 //    public void escribirLinea(String ruta, String linea) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta,
//                true))) {
//            if (linea.length() > 100) {
//                writer.write("[La línea es muy larga]");
//            }
//            writer.write(linea);
//            writer.newLine();
//        } catch (IOException e) {
//            throw new RuntimeException("Error al escribir la línea en: " + ruta,
//                    e);
//        }
//    }
//a. Definir una interfaz funcional OperacionEscritura que reciba un BufferedWriter y lance
//IOException.
//b. Extraiga un método privado ejecutarConWriter(String ruta, String mensaje, OperacionEscritura op)
// que encapsule lógica de apertura/cierre.
//c. Reescriba los tres métodos públicos usando las lambdas.

