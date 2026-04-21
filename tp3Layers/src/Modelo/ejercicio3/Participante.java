package Modelo.ejercicio3;

import java.util.Date;

public class Participante {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    public Participante(String nombre, String apellido, String email, String telefono)throws Exception {
        validarNombreYApellido(nombre, apellido);
        if (!checkEmail(email)){
            new Exception("El email no es valido");
        }
        if(!checkPhone(telefono)){
            new Exception("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN");
        }
        this.email = email;
        this.telefono = telefono;
    }

    private boolean checkPhone(String telefono) {
        String regex = "\\d{4}-\\d{6}";
        return telefono.matches(regex);
    }
        private boolean checkEmail(String email) {
            String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
            return email.matches(regex);
        }

    private void validarNombreYApellido(String nombre, String apellido){
        if (nombre.isEmpty() || apellido.isEmpty()){
            new RuntimeException("El nombre y el apellido no pueden estar vacios");
        }
        this.nombre = nombre;
        this.apellido = apellido;
    }
    protected String Apellido() {
    return this.apellido;
    }
    protected String Nombre(){
        return this.nombre;
    }
    protected String Telefono(){
        return  this.telefono;
    }
    protected String Email(){
        return this.email;
    }


}

