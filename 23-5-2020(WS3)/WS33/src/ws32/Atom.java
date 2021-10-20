/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws32;

import java.util.Locale;

/**
 *
 * @author User
 */
public class Atom {
    private int number;
    private String symbol;
    private String fullname;
    private double weight;

    public Atom() {
    }

    public Atom(int number, String symbol, String fullname, double weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullname = fullname;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%2d%10s%20s%15f", number, symbol, fullname, weight); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
