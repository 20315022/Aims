package ifi.lab02.aba;

import java.util.ArrayList;

public class Ebook extends Products {
    private ArrayList authors;
    private ArrayList talkingChapter;

    public Ebook(final int idPro, final String cat,
                 final int cos, String tit,
                 final ArrayList authors,
                 final ArrayList talkingChapter) {
        super(idPro, tit, cat, cos);
        this.authors = authors;
        this.talkingChapter = talkingChapter;
    }

    public ArrayList getAuthors() {
        return authors;
    }

    public ArrayList getTalkingChapter() {
        return talkingChapter;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "authors=" + authors +
                ", talkingChapter=" + talkingChapter +
                '}';
    }
}

