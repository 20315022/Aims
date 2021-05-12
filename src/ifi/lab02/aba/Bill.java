package ifi.lab02.aba;

public class Bill extends Order {
    private int idBill;
    String datePayBill;

    public Bill(int idPro, String tit, String cat, float cos,
                int numOrd, int idItem, int idCostumer, String dateOdr,
                float totalCost, int idBill, String datePayBill) {
        super(idPro, tit, cat, cos, numOrd, idItem, idCostumer, dateOdr, totalCost);
        this.idBill = idBill;
        this.datePayBill = datePayBill;
    }

    public int getIdBill() {
        return idBill;
    }

    public String getDatePayBill() {
        return datePayBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public void setDatePayBill(String datePayBill) {
        this.datePayBill = datePayBill;
    }
}
