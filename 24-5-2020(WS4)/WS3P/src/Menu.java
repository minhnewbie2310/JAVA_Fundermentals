
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Menu {
    String[] hints;
    int n=0;
    //current number of hints
    //create a menu with size elements
    public Menu(int size){
        if(size<1) size=10;
        hints = new String[size];        
    }
    public void add (String aHint){
        if(n<hints.length){
            hints[n++]=aHint;
        }
    }
    //get User choice
    public int getChoice(){
        int result=0;
        if(n>0){
            //print our hints
            for (int i = 0; i < n; i++) {
                System.out.println((i+1)+"-"+hints[i]);
            }
            System.out.println("Please select an operation: ");
            Scanner sc = new Scanner(System.in);
            result=Integer.parseInt(sc.nextLine());
            //get user choice
        }
        return result;
    }
}
