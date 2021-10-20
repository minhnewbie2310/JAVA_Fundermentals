/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS52;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Person [] e = new Person[10];
        int n = 0, c = 0;
        do{
            System.out.println("Worker (1); Officer(2): ");
            Scanner in = new Scanner(System.in);
            c = Integer.parseInt(in.nextLine());
            if(c == 1){
                //accept information of worker
                System.out.println("Enter worker name: ");
                String name = in.nextLine();
                System.out.println("Enter worker working hours: ");
                double hrs = Double.parseDouble(in.nextLine());
                e[n] = new Worker(name, hrs);
                n++;
            }else if(c == 2){
                //accept information of Officer
                System.out.print("Enter Officer name: ");
                String name = in.nextLine();
                System.out.print("Enter officer salary: ");
                double salary = Double.parseDouble(in.nextLine());
                e[n] = new Officer(name, salary);
                n++;
            }
        }while(c != 0);
        //print all objects of e
        for(int i = 0; i < n; i++){
            //print the instance of Worker only
            if(e[i] instanceof Worker)
                e[i].display();
        }

    }
}
