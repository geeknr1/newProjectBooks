package com.backend.newproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Image{
    private String imageURL;
    private String imageTitle;
    @Id
    private Long id;

    public Image(String url, String title){
        this.imageURL = url;
        this.imageTitle = title;
    }

    public Image() {

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
