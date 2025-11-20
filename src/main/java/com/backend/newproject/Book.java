package com.backend.newproject;

import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Book{

    private String title;
    @ManyToMany
    private List<Author> authors;
    @OneToMany(mappedBy = "book", targetEntity = Author.class, cascade = CascadeType.ALL)
    private List<Element> elements;
    @Id
    private Long id;

    public Book(String t){
        this.title=t;
        this.authors = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public Book() {}

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Object getIsbn() {
        return null;
    }

    public String getAuthor() {
        return null;
    }
}
