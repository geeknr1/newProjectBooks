package com.backend.newproject;

public class AlignRight implements AlignStrategy{
    public void render(Paragraph paragraph, Context context){
        String t = paragraph.getTextParagraph();
        int width = context.getPageWidth();
        int pad = (width - t.length())/2;
        System.out.println(" ".repeat(pad) + t);

    }
}