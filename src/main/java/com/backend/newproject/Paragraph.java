package com.backend.newproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Paragraph implements Element{
    private String textParagraph;
    @Transient
    private AlignStrategy align;
    @Transient
    private Context context;
    private static Logger log = Logger.getInstance();
    @Id
    private Long id;

    public Paragraph(String par, AlignStrategy align, Context context){
        this.textParagraph=par;
        this.align = align;
        this.context = context;
        log.info("Paragraph: " + par);
    }

    public Paragraph() {

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

    @Transient
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

    @Transient
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
