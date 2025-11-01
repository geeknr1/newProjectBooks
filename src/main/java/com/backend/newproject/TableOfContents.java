package com.backend.newproject;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;

@Entity
public class TableOfContents implements Element{

    @OneToMany(mappedBy = "book", targetEntity = Book.class, cascade = CascadeType.ALL)
    private ArrayList<Section> sections;
    @Id
    private Long id;

    public TableOfContents(){}

    @Override
    public Element get(int urlNumber) {
        return null;
    }

    @Override
    public void add(Element newURLAdded) {

    }

    @Override
    public void remove(Element newURLRemoved) {

    }

    @Override
    public void print(){
        for(Section s: sections)
            s.print();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
