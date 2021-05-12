package ifi.lab02.aba;

import java.util.ArrayList;

public class CompacDisc extends Products {
    private ArrayList artist =new ArrayList();
    private ArrayList track = new ArrayList();

    public CompacDisc(String tit, final float cos, final int idPro, final String cat) {
        super(idPro, tit, cat, cos);
        this.artist =artist;
        this.track =track;
    }

    public ArrayList getArtist() {
        return artist;
    }

    public ArrayList getTrack() {
        return track;
    }

    @Override
    public String toString() {
        return "CompacDisc{" +
                "artist=" + artist +
                ", track=" + track +
                '}';
    }
}


