package com.backend.newproject;

public interface Element{

    void print();
    default void add(Element element){};
    default void remove(Element element){};
    default Element get(int elementNumber){return null;};
}
