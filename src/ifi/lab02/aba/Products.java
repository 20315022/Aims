package ifi.lab02.aba;

import java.util.ArrayList;

/* Projet AIMS IFI P25 SIM
auteur: ABA MEKONGO Pascal Joseph
id :20315022
date mai 2021
 */
public class Products {
    private String title, category;
    private float cost;
    private int idProduct;
    String [] type ={"DigitalVideoDisc","CompacDisc","Book","Ebook"};

    public Products(String title, String category, float cost, int idProduct, String[] type) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.idProduct = idProduct;
        this.type = type;
    }
             public Products(int idPro, String tit, String cat, float cos) {
        }
    public void displayInfoProduct(){
    };
    @Override
    public String toString() {
        return "ifi.lab02.aba.Products{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                ", idProduct=" + idProduct +
                '}';
    }
}
