package com.unrn.double_dispatch.ejercicio5;

import java.time.LocalDate;

public abstract class Articulo {
    protected String nombre;
    protected int dias;
    protected LocalDate fechaPrestacion;
    protected LocalDate fechaDevolucion;
    protected float precio;
    protected Condicion condicion;
    protected boolean disponible;

    public Articulo(Condicion condicion, float precio) {
        this.condicion = condicion;
        this.precio = precio;//precio inicial
    }
    public void PrestarArticulo(String nombre) {
        this.nombre = nombre;
        this.fechaPrestacion = LocalDate.now();
        this.dias = calcularDiasDePrestacion();
        this.fechaDevolucion = this.fechaPrestacion.plusDays(dias);
        // por lo que entendi de la consigna el precio se calcula segun los dias que se va a alquilar el articulo, por lo tanto se llama al metodo precio con los dias calculados
        this.precio= precio(dias);

        this.disponible = false;
    }

    protected abstract int calcularDiasDePrestacion();

    public abstract float precio(int dias);

}
/*Implementar un sistema de biblioteca/multimedia para gestionar préstamos de
artículos. El sistema debe calcular la duración del préstamo según:
a. el tipo de artículo (Libro, Disco, Revista),
b. su condición del artículo (Nuevo, Usado, Deteriorado).
Los artículos se pueden prestar y se debe conocer la persona a la que se presta la
fecha de inicio y la fecha de devolución calculada automáticamente. La cantidad de
días de préstamo varía según el tipo de artículo:
Libro: 1 día cada 100 páginas, redondeando hacia arriba.
Disco: Si su condición es deteriorada y la banda musical es menor a 1980, no
se puede prestar. Si su condición es deteriorada y la banda musical es mayor o igual
a 1980, se le resta 1 día al cálculo de días ( mínimo 1 día). En otra condición 3 días
si el año de creación de la banda musical es menor a 1980, 5 días en otro caso.
Revista: Sí su condición es deteriorada y si la fecha de publicación tiene más
de 10 años reduce 3 días y si no reduce 1 día (mínimo 1 día). En otra condición, 2
días si la cantidad de páginas es menor a 100, 3 días si es mayor a 100 y menor a
2000 y 5 días si páginas es mayor a 2000.*/