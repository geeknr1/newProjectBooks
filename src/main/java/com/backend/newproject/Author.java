package com.backend.newproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {

    private String name;
    private String surname;
    @Id
    private Long id;

    public Author(String n, String s){
        this.name = n;
        this.surname = s;
    }

    public Author(){}

    public String getAuthorName(){
        return this.name;
    }

    public void setAuthorName(String newAuthorName){
        this.name = newAuthorName;
    }

    public String getAuthorSurname(){
        return this.surname;
    }

    public void setAuthorSurname(String newAuthorSurname){
        this.surname = newAuthorSurname;
    }

    public void print(){
        System.out.println("Author's name: " + this.name + "\nAuthor's surname: " + this.surname);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
