/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop10;

import java.util.Comparator;

/**
 *
 * @author 
 */
public class Car implements Comparable {
    String name;
    float price;
    String production;

    public Car(String name, float price, String production) {
        this.name = name;
        this.price = price;
        this.production = production;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car)o;
        return name.compareTo(car.name);
    }
    @Override
    public String toString(){
        return name+"\t"+price+"\t"+production;
    }
//    public static Comparator compareObj = new Comparator(){
//        @Override
//        public int compare(Object o1, Object o2) {
//            Car car1 = (Car) o1;
//            Car car2 = (Car) o2;
//            float d = car1.price - car2.price;
//            if (d>0) return -1;
//            if (d==0) return car1.production.compareTo(car2.production);
//            return 1;
//
//        }
//    };
    public static Comparator compareObj = new Comparator(){
        @Override
        public int compare(Object o1, Object o2) {
            Car car1 = (Car) o1;
            Car car2 = (Car) o2;
            int d = car1.production.compareToIgnoreCase(car2.production);
            float f = car1.price - car2.price;
            if (d>0){
                return 1;
            }
            else if (d==0){
                return (int)f;
            }
            else {
                return -1;
            }

        }
    };
    
}
