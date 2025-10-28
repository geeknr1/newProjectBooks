package com.backend.newproject;

public class Author {

    private String name;
    private String surname;

    public Author(String n, String s){
        this.name = n;
        this.surname = s;
    }

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
}
