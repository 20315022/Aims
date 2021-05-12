package ifi.lab02.aba;

import java.util.ArrayList;
public class TalkingChapter extends Ebook {
    String titleTalkingChap;
    int lengthTalkingChap, idAuthor, idBook;

    public TalkingChapter(int idPro, String cat, int cos, String tit, ArrayList authors, ArrayList talkingChapter, String titleTalkingChap, int lengthTalkingChap, int idAuthor, int idBook) {
        super(idPro, cat, cos, tit, authors, talkingChapter);
        this.titleTalkingChap = titleTalkingChap;
        this.lengthTalkingChap = lengthTalkingChap;
        this.idAuthor = idAuthor;
        this.idBook = idBook;
    }

    @Override
    public String toString() {
        return "TalkingChapter{" +
                "titleTalkingChap='" + titleTalkingChap + '\'' +
                ", lengthTalkingChap=" + lengthTalkingChap +
                ", idAuthor=" + idAuthor +
                ", idBook=" + idBook +
                '}';
    }
}
