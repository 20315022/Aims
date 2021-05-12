package ifi.lab02.aba;

public class Order extends Products {
    private int numOrd, idItem, idCostumer;
    private String dateOdr ;
    private float totalCost;

    public Order(int idPro, String tit, String cat, float cos, int numOrd, int idItem, int idCostumer, String dateOdr, float totalCost) {
        super(idPro, tit, cat, cos);
        this.numOrd = numOrd;
        this.idItem = idItem;
        this.idCostumer = idCostumer;
        this.dateOdr = dateOdr;
        this.totalCost = totalCost;
    }


}
