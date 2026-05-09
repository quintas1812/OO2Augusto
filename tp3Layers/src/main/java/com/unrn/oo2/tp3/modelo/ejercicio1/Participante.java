package com.unrn.oo2.tp3.modelo.ejercicio1;

public class Participante {
    private String nombre;
    private String telefono;
    private String region;
    public Participante(String nombre, String telefono, String region) throws Exception {
       validarNombre(nombre);
       if (!validarTelefono(telefono)) {
           throw new Exception("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN");
       }
       this.telefono = telefono;
       validarRegion(region);
    }
    private boolean validarTelefono(String telefono) {
        String regex = "\\d{4}-\\d{6}";
        return telefono.matches(regex);
    }
    private void validarRegion(String region) throws Exception{
        if (!region.equals("China") && !region.equals("US") && !region.equals("Europa")) {
            throw new Exception("La región debe ser China, US o Europa");
        }
        this.region = region;
    }
    private void validarNombre(String nombre)throws Exception {
        if (nombre.equals("")){
            throw new Exception("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }
    public String Nombre() { return nombre; }
    public String Telefono() { return telefono; }
    public String Region() { return region; }
}
