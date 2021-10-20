/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS41;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        System.out.print("Enter the author: ");
        b.setAuthor(sc.nextLine());
        System.out.print("Enter the title: ");
        b.setTitle(sc.nextLine());
        System.out.print("Enter the number of pages: ");
        b.setNoOfPages(Integer.parseInt(sc.nextLine()));
        System.out.print("Is this book a fiction ? (1-TRUE , 2-FALSE): ");
        int temp = Integer.parseInt(sc.nextLine());
        if(temp==1){
            b.setFiction(true);
        }
        if(temp==2){
            b.setFiction(false);
        }
        System.err.println("------------------");
        System.out.println("Author : "+b.getAuthor());
        System.out.println("Title : "+b.getTitle());
        System.out.println("Numeber of pages: "+b.getNoOfPages());
        System.out.println("Fiction?: "+b.isFiction());
   }
}
