package com.backend.newproject;

public class Image{
    private String imageURL;
    private String imageTitle;

    public Image(String url, String title){
        this.imageURL = url;
        this.imageTitle = title;
    }

    public String getImageURL(){
        return this.imageURL;
    }

    public String getImageTitle(){
        return this.imageTitle;
    }

    public void setImageURL(String newImageURL){
        this.imageURL = newImageURL;
    }

    public void setImageTitle(String newImageTitle){
        this.imageTitle = newImageTitle;
    }

}
