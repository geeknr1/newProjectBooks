package com.backend.newproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Table implements Element{
    @Transient
    private String title;
    @Transient
    @Id
    private Long id;

    public Table(String t){
        this.title = t;
    }

    public Table() {

    }

    @Transient
    public String getTableTitle(){
        return this.title;
    }

    @Transient
    public void setTableTitle(String otherTableTitle){
        this.title = otherTableTitle;
    }

    @Transient
    @Override
    public Element get(int urlNumber) {
        return null;
    }

    @Transient
    @Override
    public void add(Element newURLAdded) {

    }

    @Transient
    @Override
    public void remove(Element newURLRemoved) {

    }

    @Transient
    @Override
    public void print() {
        System.out.println("Table title: " + this.title);
    }

    @Transient
    public void setId(Long id) {
        this.id = id;
    }

    @Transient
    public Long getId() {
        return id;
    }
}
