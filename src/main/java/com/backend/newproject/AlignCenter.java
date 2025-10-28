package com.backend.newproject;

public class AlignCenter implements AlignStrategy {
        public void render(Paragraph paragraph, Context context) {
            String t = paragraph.getTextParagraph();
            int width = context.getPageWidth();
            int pad = (width - t.length()) / 4;
            System.out.println(" ".repeat(pad) + t + " ".repeat(pad));
        }
    }

