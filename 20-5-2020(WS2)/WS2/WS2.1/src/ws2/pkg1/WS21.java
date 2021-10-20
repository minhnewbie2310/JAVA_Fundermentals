/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws2.pkg1;

/**
 *
 * @author User
 */
public class WS21 {

    
    public static void main(String[] args) {
        boolean flag = true;
        int i=0;
        while(flag){
            if(i%2==0){
                flag = true; 
                System.out.println("i="+i);
            }
            i++;
            if(i>10){
                flag = false; 
            }
        }
    }
    
}
