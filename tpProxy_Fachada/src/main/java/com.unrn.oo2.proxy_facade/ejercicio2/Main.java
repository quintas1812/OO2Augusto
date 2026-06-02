package com.unrn.oo2.proxy_facade.ejercicio2;

import java.util.List;

public class Main {
    static void main() {
        Usuario usuario1 = new Usuario("Juan", List.of(new Admin(), new Intermedio()));
        FileAccess fileAccess1 = new FileAccess("C:\\Users\\augus_r4ret8\\IdeaProjects\\OO2Augusto", "archivo.txt");
        AdministrarPermisos proxy1 = new ProxyFileAcess(fileAccess1, usuario1);
        try {
            System.out.println(proxy1.readFile());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
