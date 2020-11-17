package services;

import models.*;

public class BookStatistics implements Visitor {

    int paragraphs = 0;
    int sections = 0;
    int imageproxy = 0;
    int images = 0;
    int tables = 0;
    int book = 0;

    @Override
    public void visit(Book b) { book++; }

    @Override
    public void visit(Section s) { sections++; }

    @Override
    public void visit(Paragraph p) { paragraphs++; }

    @Override
    public void visit(ImageProxy ip) { imageproxy++; }

    @Override
    public void visit(Image i) { images++; }

    @Override
    public void visit(Table t) { tables++; }

    public void printStatistics(){
        System.out.println("Books: "+book+"\nSections: "+sections+"\nparagraphs: "+paragraphs+"\nimages: "+images+"\nimageproxy: "+imageproxy+"\ntables: "+tables);
    }
}