/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class WS22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        
        int[] arr = new int[20];
        int k=1;
        for (int i = 0; i < arr.length; i++) {
            
                System.out.println("Elements number " + (i + 1) + ": ");
                arr[i] = Integer.parseInt(sc.nextLine());
                if(arr[i]==0){
                    System.err.println("Program ended!!");
                    break;
                }else{
                    k++;
                }
                
        }
        
        System.out.println("------------------");
        for (int j = 0; j < arr.length-(arr.length-k); j++) {
            System.out.println(arr[j]);
        }
        System.out.println("------------------");
        Arrays.sort(arr);
        for (int j = 20-k; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("------------------");
        int max = arr[0];
        for (int j = 19; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println("The maximum element is: " + max);
    }

}
