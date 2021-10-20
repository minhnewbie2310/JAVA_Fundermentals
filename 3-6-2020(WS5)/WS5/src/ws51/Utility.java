/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws51;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Utility {

    public static void getInt(String msg, int min, int max) {
        Scanner sc = new Scanner(System.in);
        msg = "Type of phone number ? (1 - local phone, 2 - Inter phone number, 0 - exit): ";
        int choose;
        boolean check;
        
        do {
            try {
                System.out.println(msg);
                choose = Integer.parseInt(sc.nextLine());
                if(choose >= min && choose <=max){
                    check = false;
                }else{
                    check = true;
                }
            } catch (Exception e) {
                check = true;
            }
        } while (check);
        
    }

    public static String getString(String msg, int min, int max) {
        return msg;
    }
}
