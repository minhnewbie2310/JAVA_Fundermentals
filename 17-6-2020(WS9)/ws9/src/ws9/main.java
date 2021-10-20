/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author User
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ultility u = new Ultility();
        boolean check = true;
        System.out.println("1-Original ");
        System.out.println("2-HashSet");
        System.out.println("3-TreeSet");
        System.out.println("4-HashMap");
        System.out.println("5-Quit");
        do {
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sach ban dau: ");
                    u.bandau();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Sau khi HashSet: ");
                    u.hashset();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Sau khi TreeSet: ");
                    u.treeset();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Sau khi HashMap: ");
                    u.hashmap();
                    System.out.println();
                    break;
                case 5:
                    boolean kt = false;
                    System.out.println("Do you want to countinue ? (Y/N)");
                    do {
                        try {
                            String cek = sc.nextLine();
                            if (cek.equals("Y") || cek.equals("y")) {
                                check = true;
                            } else if (cek.equals("N") || cek.equals("n")) {
                                check = false;
                            }
                        } catch (Exception e) {
                            kt = true;
                        }
                    } while (kt);
                    System.out.println();
                    break;
            }

        } while (check);
    }

}
