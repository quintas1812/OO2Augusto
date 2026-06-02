package com.unrn.oo2.proxy_facade.ejercicio3;
public class ImageGalery {

    public static void main(String[] args) {
        LoadImage image1 = new ProxyImageFile(new ImageFile("C:\\Users\\augus_r4ret8\\OneDrive\\Imágenes\\Screenshots\\Screenshot 2026-05-29 181125.png"));
        image1.display();
        image1.display();
    }

}
