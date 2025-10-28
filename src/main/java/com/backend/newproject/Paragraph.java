package com.backend.newproject;

public class Paragraph implements Element{
    private String textParagraph;
    private AlignStrategy align;
    private Context context;
    private static Logger log = Logger.getInstance();

    public Paragraph(String par, AlignStrategy align, Context context){
        this.textParagraph=par;
        this.align = align;
        this.context = context;
        log.info("Paragraph: " + par);
    }

    public String getTextParagraph(){
        return this.textParagraph;
    }

    public AlignStrategy getAlign(){
        return this.align;
    }

    public Context getContext(){
        return this.context;
    }

    public void settextParagraph(String newtextParagraph){
        this.textParagraph = newtextParagraph;
    }

    public void setAlignStrategy(AlignStrategy newAlign){
        this.align = newAlign;
    }

    @Override
    public void print(){
        align.render(this, context);
    }
}
