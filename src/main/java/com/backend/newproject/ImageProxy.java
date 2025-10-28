package com.backend.newproject;

public class ImageProxy implements Element {
    private String url;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    private Image loadImage() {
        String imageTitle = "image";
        if (realImage == null) {
            realImage = new Image(url, imageTitle);
        }
        return realImage;
    }

    @Override
    public void print() {
        System.out.println(url);
    }

    @Override
    public void add(Element e) {}
    @Override
    public void remove(Element e) {}
    @Override
    public Element get(int i) { return null; }
}
