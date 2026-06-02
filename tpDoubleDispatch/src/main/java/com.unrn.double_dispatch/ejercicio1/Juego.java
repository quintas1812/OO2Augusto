package com.unrn.double_dispatch.ejercicio1;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    // Opciones posibles
    private ElementoJuego[] opciones = {new Piedra(), new Papel(), new Tijera()};
    // Crear un objeto Scanner para leer la entrada del usuario
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            ElementoJuego eleccionUsuario = elegirElementoUsuario(scanner);
            ElementoJuego eleccionComputadora = elegirElementoComputadora(opciones);

            // Mostrar las elecciones de ambos jugadores
            System.out.println("Tu elección: " + eleccionUsuario);
            System.out.println("Elección de la computadora: " + eleccionComputadora);

            // Mostrar el resultado
            System.out.println(new Jugada().jugar(eleccionUsuario, eleccionComputadora));

            continuar = preguntarSiQueremosContinuar();
        }// end while

        System.out.println("¡Hasta pronto!");
        scanner.close();
    }

    private ElementoJuego elegirElementoUsuario(Scanner scanner) {
        // Solicitar al usuario que ingrese su elección
        System.out.println("Elige una opción: piedra, papel o tijera");
        String eleccion = scanner.nextLine().toLowerCase();

        return  ElementoJuego.crearElemento(eleccion);
    }

    private ElementoJuego elegirElementoComputadora(ElementoJuego[] opciones) {
        // Crear un objeto Random para generar la elección de la computadora
        Random random = new Random();
        // Generar la elección de la computadora
        int indice = random.nextInt(3);
        return opciones[indice];
    }

    private boolean preguntarSiQueremosContinuar() {
        System.out.println("¿Desea continuar? s/n");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        return respuesta.toLowerCase().charAt(0) == 's';
    }
}
