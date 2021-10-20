/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws31;

/**
 *
 * @author User
 */
public class Molecule {
    private String structure;
    private String name;
    private double weight;

    public Molecule() {
    }

    public Molecule(String structure, String name, double weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }

    

    @Override
    public String toString() {
        return String.format("%10s%20s%15f",structure,name,weight); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
