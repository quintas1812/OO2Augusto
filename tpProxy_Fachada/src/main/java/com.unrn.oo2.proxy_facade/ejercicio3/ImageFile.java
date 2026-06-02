package com.unrn.oo2.proxy_facade.ejercicio3;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ImageFile implements LoadImage {
    private String path;
    private BufferedImage image;

    public ImageFile(String path) {
        this.path = path;
    }

    public void display() {
        ImageIcon icon = new ImageIcon(this.image);
        JLabel label = new JLabel(icon);
        JOptionPane.showMessageDialog(null, label);
    }

    @Override
    public BufferedImage load() {
        try {
            this.image = ImageIO.read(new File(this.path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }


}