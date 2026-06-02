package com.unrn.observers;

//esta es la clase base
public class Medidor  implements Termometro {
    private ClimaOnline clima;

    public Medidor(ClimaOnline clima) {
        this.clima = clima;
    }

    @Override
    public String temperatura() {
        return this.clima.obtenerTemperaturaActual();
    }
}
//2. Utilizando el patrón Observer, escriba dos observadores:
//a. Uno que guarde en un archivo de texto una entrada por cada lectura que se realiza
//de la temperatura y la fecha en la que se realiza.
//b. Otro que imprima en consola cada vez que se lea la temperatura. Si la temperatura
//es menor a 12 grados, debe imprimir: “Hace frio, se encenderá la caldera”. Si la temperatura
//es mayor a 17 grados, debe imprimir: “Hace calor, se encenderá el aire acondicionado”.

//3. (OPCIONAL) Mejore la implementación anterior utilizando un Decorador. El resultado
//final es que el ejercicio se resuelve utilizando ambos patrones: Observer y Decorador.