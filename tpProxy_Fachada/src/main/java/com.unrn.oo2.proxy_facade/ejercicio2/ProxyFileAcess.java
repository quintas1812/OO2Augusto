package com.unrn.oo2.proxy_facade.ejercicio2;

import java.io.IOException;

public class ProxyFileAcess implements AdministrarPermisos {
    private FileAccess fileAccess;
    private Usuario usuario;
    public ProxyFileAcess(FileAccess fileAccess, Usuario usuario) {
        this.fileAccess = fileAccess;
        this.usuario = usuario;
    }
    @Override
    public String readFile() throws IOException {
        if (!usuario.poseePermiso(fileAccess.NombreArchivo())) {
            throw new RuntimeException("Acceso denegado al archivo: " + fileAccess.NombreArchivo());
        }
        return fileAccess.readFile();

    }

}
