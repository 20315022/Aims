package ifi.lab02.aba;

public class DigitalVideoDisc extends Products {
    private String director;
    private int length;
    public DigitalVideoDisc (final String tit, final String cat,
                                     final int idPro, final float cos,
                                     final String dir, final int length){
        super(idPro, tit, cat, cos);
        director = dir;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "DigitalVideoDisc{" +
                "director='" + director + '\'' +
                ", length=" + length +
                '}';
    }
}
