package com.backend.newproject;

public class Table implements Element{
    private String title;

    public Table(String t){
        this.title = t;
    }

    public String getTableTitle(){
        return this.title;
    }

    public void setTableTitle(String otherTableTitle){
        this.title = otherTableTitle;
    }

    // public void print(){
    //     System.out.println("Table title: " + this.title);
    // }

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
    public void print() {
        System.out.println("Table title: " + this.title);
    }
}
