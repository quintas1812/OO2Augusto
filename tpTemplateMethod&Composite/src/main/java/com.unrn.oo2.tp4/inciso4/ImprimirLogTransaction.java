package com.unrn.oo2.tp4.inciso4;


public class ImprimirLogTransaction implements LogTransaction {
    @Override
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
