package com.unrn.oo2.tp3.fronted.ejercicio3;

import com.unrn.oo2.tp3.main.ejercicio3.RadioCompetition;import com.unrn.oo2.tp3.persistence.ejercicio3.LectorFile;
import com.unrn.oo2.tp3.modelo.ejercicio3.Save;
import com.unrn.oo2.tp3.persistence.ejercicio3.SaveFile;

import javax.swing.SwingUtilities;

public class Main {

    public static final String PATH_INSCRIPTOS = "C:\\Users\\augus_r4ret8\\IdeaProjects\\OO2Augusto\\tp3Layers\\src\\inscriptos.txt";
    public static final String PATH_CONCURSOS = "C:\\Users\\augus_r4ret8\\IdeaProjects\\OO2Augusto\\tp3Layers\\src\\concursos.txt";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                   new Main().start();
                } catch (Exception e) {
                    System.out.println("Error al iniciar la aplicación: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        });
    }

    private void start() {
        Save save = new SaveFile(PATH_INSCRIPTOS);
        LectorFile lector = new LectorFile(PATH_CONCURSOS);
       //aca yo le pase el path en save file por si quiero cambiar de archivo, pero tambien ya guarda en  mi bd
        new RadioCompetition(save, lector);

    }
}

/*Se requiere:
● Modifique y termine de implementar utilizando diseño en capas (invirtiendo la
dependencias hacia model).
● Implemente los métodos faltantes:
○ todosLosConcursos(): Recupera del archivo concursos.txt los concursos si
su inscripción se encuentra abierta. Y los muestra en el Combo.
○ saveInscription(): Graba las personas que se inscriben en el archivo
inscriptos.txt según el formato definido.

• Implemente los métodos pero ahora leyendo y escribiendo en una base de datos
relacional. Diseñe Usted la/s tabla/s de concursos e inscriptos.
El archivo inscriptos.txt debe quedar así:
apellido, nombre, teléfono, email, idconcurso
Young, Angus, 4444-898789, angus@acdc.com, 1
Johnson, Brian, 7789-658987, brian@acdc.com, 2
.
.
El archivo concursos.txt tiene la siguiente estructura:
idconcurso, nombre, fechaInicioInscripcion, fechaFinInscripcion
1, concurso x, 2020/06/01, 2020/07/01*/
