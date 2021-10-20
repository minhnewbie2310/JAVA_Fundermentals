/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws7;

import java.util.Scanner;
import ws7.RightTriangle.IllegalRightTriangleException;
import ws7.RightTriangle.IllegalTriangleException;

/**
 *
 * @author User
 */
public class main {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Scanner nhap = new Scanner(System.in);
        utility u = new utility();

        while (true) {

            try {
                System.out.print("Enter a: ");
                a = u.getcm(a);
                System.out.print("Enter b: ");
                b = u.getcm(b);
                System.out.print("Enter c: ");
                c = u.getcm(c);
                //call constructor of RightTriangle class
                RightTriangle rt = new RightTriangle(a, b, c);
                System.out.println("This is a right triangle!");
            } catch (IllegalTriangleException e1) {
                System.out.println("This is not a triangle !");
            } catch (IllegalRightTriangleException e2) {
                System.out.println("This is not a right triangle !");
            }
            //continue?
            System.out.print("Continue?(Y/N):");
            //Enter a character
            char chon = nhap.next().charAt(0);
            if (chon != 'Y' && chon != 'y') {
                break;
            }
        }
    }

}
