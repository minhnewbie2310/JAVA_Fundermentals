/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws51;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddList al = new AddList();
        System.out.println("Enter list of phone numbers");
        System.out.println("-------------------------------------------");
        ArrayList<PhoneNumber>  phone = new ArrayList<>();
        ArrayList<IntPhoneNumber>  iPhone = new ArrayList<>();
        boolean done = true;
     
        int check;
        do{
            System.out.println();
            check = Utility.getInt("Type of phone number ? (1 - local phone, 2 - Inter phone number, 0 - exit): ", 0, 2);
            switch(check){
                case 1: 
                    phone.addAll(al.phone());
                    break;
                case 2:
                    iPhone.addAll(al.intphone());
                    break;
                case 0:
                    System.out.println();
                    System.out.println("List of the phone number");
                    System.out.println("-------------------------------------------");
                    for (int i = 0; i < phone.size()&& i < iPhone.size(); i++) {
                        PhoneNumber p = phone.get(i);
                        p.display();
                        IntPhoneNumber ip = iPhone.get(i);
                        ip.display();
                    }
//                    for (int j = 0; j < iPhone.size(); j++) {
//                        IntPhoneNumber ip = iPhone.get(j);
//                        ip.display();
//                    }
                    done = false;
                    break;
                
                    
            }
        }while(done);
    }
}
