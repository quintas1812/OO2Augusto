package com.unrn.oo2.proxy_facade.ejercicio2;

import java.util.List;

public class Usuario  {
    private String name;
    private List<StrategyPermisos> permisos;
    public Usuario(String name, List<StrategyPermisos> permisos) {
        this.name = name;
        this.permisos = permisos;
    }
    public boolean  poseePermiso(String nombreArchivo) {
        return permisos.stream().anyMatch(p -> p.puedeAcederA(nombreArchivo));
    }

}
//Utilizando el patrón Proxy implemente el control de acceso a la lectura de los archivos. Aquellos
//archivos cuyo nombre comienza con la letra “i” (de importante), solo los usuario con permiso
//ADMIN pueden accederlos. Los archivos que comienzan con la letra “m”, lo pueden ver los
//usuarios con permiso ADMIN e INTERMEDIO. Cualquier otro archivo, lo ven todos los usuarios
//sin importar qué permiso tengan. Utilice Usuarios#possePermiso para verificar permisos. En caso
//de intento de lectura sin permiso lance una excepción indicando el error.