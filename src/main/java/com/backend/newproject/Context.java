package com.backend.newproject;

public class Context{
    private int pageWidth;

    public Context(int width){
        this.pageWidth = width;
    }

    public int getPageWidth(){
        return this.pageWidth;
    }

    public void setPageWidth(int otherPageWidth){
        this.pageWidth = otherPageWidth;
    }
}
