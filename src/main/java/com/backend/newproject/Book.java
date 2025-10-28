package com.backend.newproject;

import java.util.ArrayList;

public class Book{

    private String title;
    private ArrayList<Author> authors;
    private ArrayList<Element> elements;

    public Book(String t){
        this.title=t;
        this.authors = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void addAuthor(Author newAUthor){
        authors.add(newAUthor);
    }

    public void addContent(Element newElementAdded){
        elements.add(newElementAdded);
    }

    public void removeContent(Element newElementRemoved){
        elements.remove(newElementRemoved);
    }

    public void print(){
        System.out.println("Book title: " + this.title);
        for(Author a: authors){
            a.print();
        }
        for(Element newElement: elements){
            newElement.print();
        }
    }
}
