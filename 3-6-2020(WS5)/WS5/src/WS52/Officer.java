/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS52;

/**
 *
 * @author User
 */
public class Officer extends Person {
    double bSalary;

    public Officer() {
    }

    public Officer(String name,double bSalary) {
        super(name);
        this.bSalary = bSalary;
    }
    double getSalary(){
        return bSalary;
    }
    public String display(){
        return super.display() + " - " + getSalary();
    }
    
    
}
