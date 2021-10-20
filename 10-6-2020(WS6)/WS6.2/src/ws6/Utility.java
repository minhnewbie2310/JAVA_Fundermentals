/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Utility {
    private static String[] StringArray(String enter){
        String[] words = enter.split("\\s");
        return words;
    }
    public String sort(String string){
        char[] charArray = string.toCharArray();

        java.util.Arrays.sort(charArray);

        return new String(charArray);
    }

    public void contain(String find, String enter) {
        String ee = enter.replaceAll("\\p{Punct}", " ");
        String[] words = StringArray(ee);
        List<String> list = Arrays.asList(words);
        int kt = Collections.frequency(list, find);
        if(kt==0){
                System.out.println("That string does not contain " + find + " !");
            }else{
                System.out.println("That string contains " + find + " !");
            }
    }

    public void you(String fid, String enter) {
        String[] words = StringArray(enter);
        System.out.println("Enter the word to count: ");
        List<String> list = Arrays.asList(words);
        int no = Collections.frequency(list, fid);
        System.out.println("Tu '" + fid + "' xuat hien " + no + " lan");

    }

    public void firstUP(String enter) {
        String[] words = StringArray(enter);
        String c1, c2;
        for (String word : words) {
            c1 = word.substring(0, 1).toUpperCase();
            c2 = c1 + word.substring(1);
            System.out.print(c2 + " ");

        }
        System.out.println();
    }

    public void firstLOWlastUP(String enter) {
        String[] words = StringArray(enter);
        String c10, c20, c5;
        for (String word : words) {
            c5 = word.substring(0, 1).toLowerCase();
            c10 = word.substring(word.length() - 1).toUpperCase();
            c20 = c5 + word.substring(1, word.length() - 1) + c10;
            System.out.print(c20 + " ");
        }
        System.out.println();
    }

    public void removeFirst(char c, String enter) {
        Scanner sc = new Scanner(System.in);
        int chek = 0;
        System.out.print("Enter the char to delete: ");
        c = sc.nextLine().charAt(0);
        StringBuffer strf = new StringBuffer(enter);
        for (int i = 0; i < strf.length(); i++) {
            if (Character.compare(strf.charAt(i), c) == 0) {
                strf.deleteCharAt(i);
                chek++;
                if (chek == 1) {
                    break;
                }
            }
        }
        System.out.println(strf);
    }

    public void countWords(String enter) {
        String[] words = StringArray(enter);
        int chk = 0;
        if (enter.equals(" ")) {
            System.out.println("Empty list !");
        }
        for (String string : words) {
            System.out.println(string);
            chk++;
        }
        System.out.println("@str has " + chk + " words");
    }

    public void replaceCaps(String enter) {
        StringBuffer strf = new StringBuffer(enter);
        char a = 'a';
        char b = 'b';
        char A = 'A';
        char B = 'B';
        for (int i = 0; i < strf.length(); i++) {
            if (Character.compare(strf.charAt(i), a) == 0) {
                strf.deleteCharAt(i);
                strf.insert(i, A);
            }
            if (Character.compare(strf.charAt(i), b) == 0) {
                strf.deleteCharAt(i);
                strf.insert(i, B);
            }

        }
        System.out.println(strf);
    }

    public void manyUp(String enter) {
        StringBuilder strb = new StringBuilder(enter);
        int ceck = 0;
        System.out.println("How many upper letters in @str?: ");

        for (int i = 0; i < strb.length(); i++) {
            if (Character.isUpperCase(strb.charAt(i)) == true) {
                ceck++;
            }
        }
        System.out.println("@str have " + ceck + " upper letters");
    }
}
