package ifi.lab02.aba;

import java.util.ArrayList;

public class Track extends CompacDisc{
    private String title;
    private int lengthTrack,idTrack, idArtist;

    public Track(String tit, float cos, int idPro, String cat, String title, int lengthTrack, int idTrack, int idArtist) {
        super(tit, cos, idPro, cat);
        this.title = title;
        this.lengthTrack = lengthTrack;
        this.idTrack = idTrack;
        this.idArtist = idArtist;
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                ", lengthTrack=" + lengthTrack +
                ", idTrack=" + idTrack +
                ", idArtist=" + idArtist +
                '}';
    }
}

