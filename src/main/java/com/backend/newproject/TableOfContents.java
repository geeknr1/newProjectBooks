package com.backend.newproject;

import java.util.ArrayList;

public class TableOfContents implements Element{

    private ArrayList<Section> sections;

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

}
