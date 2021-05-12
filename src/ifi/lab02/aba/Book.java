package ifi.lab02.aba;

import java.util.ArrayList;

public class Book extends Products {
    private ArrayList authors =new ArrayList();
    private String correspondant;

    public Book(final int idPro, final String tit,final String cat, final float cos,final String coresp, final ArrayList authors ) {
        super(idPro, tit, cat, cos);
        this.authors =authors;
        correspondant = coresp;
    }

    public ArrayList getAuthors() {
        return authors;
    }

    public String getCorrespondant() {
        return correspondant;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + authors +
                ", correspondant='" + correspondant + '\'' +
                '}';
    }
}
