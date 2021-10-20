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
public class AddList {
    
    ArrayList<IntPhoneNumber>  arriP = new ArrayList<>();
    public ArrayList<PhoneNumber> phone(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area code: ");
        int area = Integer.parseInt(sc.nextLine());
        System.out.print("Enter number: ");
        String number = sc.nextLine();
        ArrayList<PhoneNumber>  arrP = new ArrayList<>();
        PhoneNumber p = new PhoneNumber(area, number);
        arrP.add(p);
        return arrP;
    }
    public ArrayList<IntPhoneNumber> intphone(){
        ArrayList<IntPhoneNumber>  arriP = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter country code: ");
        String ccode = sc.nextLine();
        System.out.print("Enter the area code: ");
        int area = Integer.parseInt(sc.nextLine());
        System.out.print("Enter number: ");
        String number = sc.nextLine();
        IntPhoneNumber ip = new IntPhoneNumber(ccode,area,number);
        arriP.add(ip);
        return arriP;
    }
    
}
