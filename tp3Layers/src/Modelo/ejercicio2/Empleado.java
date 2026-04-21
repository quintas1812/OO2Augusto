package Modelo.ejercicio2;

import java.util.Date;
import java.util.SplittableRandom;

public class Empleado {
    private String nombre;
    private String apellido;
    private Date fecha_Nac;
    private String email;
    public Empleado(String nombre, String apellido, Date fecha_Nac, String email) {
        validarNombreYApellido(nombre, apellido);
        validarEmail(email);
        this.fecha_Nac = fecha_Nac;
    }

    private void validarEmail(String email) {
        if(email.contains("@") == false){
            new RuntimeException("El email no es valido");
        }
        if (email.isEmpty()){
            new RuntimeException("El email no puede estar vacio");
        }
        this.email = email;
    }
    private void validarNombreYApellido(String nombre, String apellido){
        if (nombre.isEmpty() || apellido.isEmpty()){
            new RuntimeException("El nombre y el apellido no pueden estar vacios");
        }
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public boolean esCumple(){
        Date hoy = new Date();
        if(hoy.getMonth() == this.fecha_Nac.getMonth() && hoy.getDay() == this.fecha_Nac.getDay()){
            return true;
        }
        return false;
    }
}
