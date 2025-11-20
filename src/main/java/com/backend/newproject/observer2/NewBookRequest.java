package com.backend.newproject.observer2;

public class NewBookRequest{

    private String title;
    private String author;

    public NewBookRequest() {}

    public NewBookRequest(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

}
