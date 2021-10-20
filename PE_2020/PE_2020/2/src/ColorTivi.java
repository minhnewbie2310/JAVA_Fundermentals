/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class ColorTivi extends Tivi{
    private String type;
    private int serie;
    private double price;

    public ColorTivi() {
    }

    public ColorTivi(String type, int serie, double price) {
        super(type,price);
        this.serie = serie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public double getPrice() {
        double newprice=0;
        if(serie>3000){
            newprice = super.getPrice()-super.getPrice()*0.1;
        }else{
            newprice = super.getPrice();
        }
                
        return newprice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.getType()+"\t"+serie+"\t"+super.getPrice();
    }

    
}
