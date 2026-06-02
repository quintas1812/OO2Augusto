package com.unrn.double_dispatch.ejercicio5;

public class Bueno extends Condicion {
     @Override
    public boolean libroEstaEncondiciones() {
        return true; //la condicion no afecta al libro para ser prestado
    }
}
