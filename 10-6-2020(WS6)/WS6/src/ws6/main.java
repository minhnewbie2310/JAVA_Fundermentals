/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ctr c = new ctr();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String char1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String char2 = sc.nextLine();
        char1.replaceAll(".", " ");
        char2.replaceAll(".", " ");
        
        if (ctr.areAnagrams(char1, char2)) {
            System.out.println("This is anagram!");
        }else{
            System.out.println("This is not anagram!");
        }
    }

}
