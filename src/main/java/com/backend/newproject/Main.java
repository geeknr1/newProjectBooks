package com.backend.newproject;

public class Main{

    public static void main(String[] args) {
        Section cap1 = new Section("Capitolul 1");
        AlignCenter center = new AlignCenter();
        AlignLeft left = new AlignLeft();
        AlignRight right = new AlignRight();
        Context context = new Context(30);

        Paragraph p1 = new Paragraph("Paragraph 1", left, context);
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2", center, context);
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3", right, context);
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4", center, context);
        cap1.add(p4);

        p1.setAlignStrategy(new AlignRight());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());
        p4.setAlignStrategy(new AlignLeft());

        System.out.println();
        System.out.println("\nPrinting with Alignment\n");
        System.out.println();
        cap1.print();
    }
}
