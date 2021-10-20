
package ws31;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the structure: ");
        String addS = sc.nextLine();
        System.out.print("Enter the name: ");
        String addN = sc.nextLine();
        System.out.print("Enter the weight: ");
        double addW = Double.parseDouble(sc.nextLine());
        Molecule m = new Molecule(addS,addN,addW);
        System.out.println(m);
    }
    
}
