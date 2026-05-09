package com.unrn.oo2.tp3.modelo.ejercicio2;

import java.time.LocalDate;

public class Empleado {
        private String nombre;
        private String apellido;
        private String email;
        private LocalDate fecha_nac;
        public Empleado(String nombre, String apellido, String email, LocalDate fecha_nac)throws Exception {
            validarNombre(nombre);
            validarApellido(apellido);
            if (!checkEmail(email)){
                throw new Exception("El email no es valido");
            }
            this.email = email;
            this.fecha_nac = fecha_nac;
        }
        private boolean checkEmail(String email) {
            String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
            return email.matches(regex);
        }

        private void validarApellido( String apellido)throws Exception{
            if (apellido.isBlank() || apellido==null){
                throw new Exception("El apellido no es valido");
            }
            this.apellido = apellido;
        }

    private void validarNombre(String nombre)throws Exception {
        if (nombre.isBlank() || nombre==null){
            throw new Exception("El nombre no es valido");
        }
        this.nombre = nombre;
    }
        protected String Apellido() {
            return this.apellido;
        }
        protected String Nombre(){
            return this.nombre;
        }
        protected String Email(){
            return this.email;
        }
    public boolean esCumple() {
        LocalDate hoy = LocalDate.now();
        return(hoy.getMonth() == fecha_nac.getMonth() && hoy.getDayOfMonth() == fecha_nac.getDayOfMonth());
    }
    }
