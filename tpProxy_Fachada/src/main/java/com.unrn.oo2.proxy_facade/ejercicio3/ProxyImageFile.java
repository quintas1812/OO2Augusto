package com.unrn.oo2.proxy_facade.ejercicio3;

import java.awt.image.BufferedImage;

public class ProxyImageFile implements LoadImage {

    private ImageFile imageFile;
    BufferedImage cacheImage;

    public ProxyImageFile(ImageFile imageFile) {
        this.imageFile = imageFile;
    }
    @Override
    public BufferedImage load() {
        if (this.cacheImage != null) {
            return this.cacheImage;
        }
        this.cacheImage = this.imageFile.load();
        return this.cacheImage;
    }
    @Override
    public void display() {
        this.load();
        this.imageFile.display();
    }
}
