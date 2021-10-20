/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alias
 */
public class VNMotor extends Motor {

    String series;

    public VNMotor() {
    }

    public VNMotor(String brandName, String series, double price) {
        super(brandName, price);
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public double getSalePrice() {
        double np=0;
        if(super.getPrice()<3000){
            np=super.getPrice()-super.getPrice()*0.05;
        }else{
            np=super.getPrice()-super.getPrice()*0.1;
        }
        return np;
    }

    @Override
    public String toString() {
        return super.getBrandName() +"\t"+ series +"\t"+ super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }

}
