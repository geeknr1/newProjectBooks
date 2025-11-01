package com.backend.newproject;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Section implements Element{
    private String sectionName;
    @OneToMany(mappedBy = "book", targetEntity = Book.class, cascade = CascadeType.ALL)
    private List<Element> elements;
    @Id
    private Long id;

    public Section(String section){
        this.sectionName=section;
        elements=new ArrayList<>();
    }

    public Section() {

    }

    public String getSectionName(){
        return this.sectionName;
    }

    public void setSectionName(String newSectionName){
        this.sectionName=newSectionName;
    }

    @Override
    public Element get(int sectionNumber){
        return elements.get(sectionNumber);
    }

    @Override
    public void add(Element newSectionAdded){
        elements.add(newSectionAdded);
    }

    @Override
    public void remove(Element newSectionsRemoved){
        elements.remove(newSectionsRemoved);
    }

    @Override
    public void print(){
        System.out.println(sectionName);
        for(Element e: elements){
            e.print();
        }
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
