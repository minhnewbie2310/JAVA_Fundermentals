
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trinh
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input string: ");
        String txt = sc.nextLine();
        System.out.print("input choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        MyString m = new MyString();
        switch(choice){
            case 1:
                System.out.println(m.f1(txt));
                break;
            case 2:
                System.out.println(m.f2(txt));
                break;
            case 3:
                System.out.println(m.f3(txt));
                break;
            case 4:
                System.out.println(m.f4(txt));
                break;
            case 5:
                System.out.println(m.f5(txt));
                break;
            case 6:
                System.out.println(m.f6(txt));
                break;
            case 7:
                System.out.println(m.f7(txt));
                break;
            case 8:
                System.out.println(m.f8(txt));
                break;
            case 9:
                System.out.println(m.f9(txt));
                break;
            case 10:
                System.out.println(m.f10(txt));
                break;
        }
    }
}
