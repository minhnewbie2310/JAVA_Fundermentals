/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws32;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Atom> arr =  new ArrayList<>();
        System.out.print("Enter the number of the atoms: ");
        int na = Integer.parseInt(sc.nextLine());
        System.out.println("Atomic Information");
        System.out.println("==================");
        for (int i = 0; i < na; i++) {
            System.out.print("Enter atomic number: ");
            int addn = Integer.parseInt(sc.nextLine());
            System.out.print("Enter symbol: ");
            String adds = sc.nextLine();
            System.out.print("Enter full name: ");
            String addf = sc.nextLine();
            System.out.println("Enter atomic weight: ");
            double addw = Double.parseDouble(sc.nextLine());
            Atom a = new Atom(addn, adds, addf, addw);
            arr.add(a);
        }
        
        for (Atom o : arr) {
            System.out.println(o);
        }
    }
    
            
}
