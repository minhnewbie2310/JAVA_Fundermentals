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
public class Worker extends Person {
    double hrs;
    final double RATE = 5.5;

    public Worker() {
    }

    public Worker(String name, double hrs) {
        super(name);
        this.hrs = hrs;
    }
    double getSalary(){
        return hrs * RATE;
    }
    public String display(){
        return super.display() + " - " + getSalary();
    }
    
}
