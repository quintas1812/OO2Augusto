package com.unrn.oo2.state.ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    static final double VALOR_INICIAL = 0.0;
    static final String MSG_ESTADO_ERROR = "La calculadora está en estado de error";
    private double valorAcumulado;
    private EstadoCalculadora estado;
    Operacion operacion ;

    public Calculadora() {
        this.estado = new Inicial(this);
        this.valorAcumulado = VALOR_INICIAL;
    }
    String estado() {
        return this.estado.toString();
    }

    public void mas() {
        operacion = new Sumar();
        this.estado.mas();

//        if (estado == EstadoCalculadora.INICIAL) {
//            this.estado = EstadoCalculadora.ESPERANDO_OPERANDO;
//        } else if (estado == EstadoCalculadora.ESPERANDO_OPERANDO) {
//            this.estado = EstadoCalculadora.ERROR;
//        } else if (estado == EstadoCalculadora.ERROR) {
//            System.out.println(MSG_ESTADO_ERROR);
//        }
    }
    public void menos() {
        operacion = new Restar();
        this.estado.menos();
    }
    public void por() {
        operacion = new Multiplicar();
        this.estado.por();
    }
    public void dividido(){
        operacion = new Dividir();
        this.estado.dividir();
    }
    public Operacion ultimaOperacion() {
        return operacion;
    }
    public void borrar() { // el borrar no lo puse en la interface porque realiza el mismo comportamiento sin importar el estado en el que se encuentre
        this.estado = new Inicial(this);
        this.valorAcumulado = VALOR_INICIAL;
    }

    public void valor(double valor) {
        this.estado.valor(valor);
//        if (estado == EstadoCalculadora.INICIAL) {
//            this.valorAcumulado = valor;
//        } else if (estado == EstadoCalculadora.ESPERANDO_OPERANDO) {
//            this.valorAcumulado += valor;
//            this.estado = EstadoCalculadora.INICIAL;
//        } else if (estado == EstadoCalculadora.ERROR) {
//            System.out.println(MSG_ESTADO_ERROR);
//        }
    }

    public void mostrar() {
        this.estado.mostrar();
//        if (estado == EstadoCalculadora.INICIAL) {
//            System.out.println(this.valorAcumulado);
//        } else if (estado == EstadoCalculadora.ESPERANDO_OPERANDO) {
//            this.estado = EstadoCalculadora.ERROR;
//        } else {
//            System.out.println(MSG_ESTADO_ERROR);
//        }
    }
    public void dividir() {
        this.estado.dividir();
    }


    public double valorAcumulado() {
        return valorAcumulado;
    }

    public void cambiarValor(double valor) {
        this.valorAcumulado = valor;
    }

    public void cambiarEstado(EstadoCalculadora nuevoestado) {
        this.estado = nuevoestado;
    }
}
/*mas provoca que la calculadora espere un nuevo valor. Si a continuación se le envía el
mensaje valor(unValor) la calculadora sumará el valor recibido como parámetro al valor
actual acumulado y guardará el resultado en esta última.
Si la calculadora está esperando un valor (luego de una operación aritmética) y se le envía
cualquier otro mensaje, entonces pasará a un estado de error. Sólo saldrá de ahí si se le envía el
mensaje borrar.
Cuando la calculadora está en estado de error, el mensaje mostrar retorna el String “La
calculadora está en estado de error”.
Implemente las demás operaciones aritméticas: menos, dividido y por: que actúan de manera
similar al mensaje mas. Ahora, la calculadora también entra en estado de error si se intenta
dividir por cero.
a) Refactorice aplicando el patrón State.
*/