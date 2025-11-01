package com.backend.newproject;
import jakarta.persistence.Transient;

public class ImageProxy implements Element {
    @Transient
    private String url;

    @Transient
    private Image realImage;

    @Transient
    public Image getRealImage() {
        return realImage;
    }

    @Transient
    public void setRealImage(Image realImage) {
        this.realImage = realImage;
    }

    public ImageProxy(String url) {
        this.url = url;
    }

    @Transient
    private Image loadImage() {
        String imageTitle = "image";
        if (realImage == null) {
            realImage = new Image(url, imageTitle);
        }
        return realImage;
    }
    @Transient
    @Override
    public void print() {
        System.out.println(url);
    }

    @Transient
    @Override
    public void add(Element e) {}
    @Transient
    @Override
    public void remove(Element e) {}
    @Transient
    @Override
    public Element get(int i) { return null; }
}
