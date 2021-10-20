/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws7;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class utility {
    public int getcm(int a){
        
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        do {            
            try {
                a = Integer.parseInt(sc.nextLine());
                
            } catch (Exception e) {
                check = true;
                System.out.println("re-enter plz!!!");
            }
        } while (check);
        return a;
    }
}
