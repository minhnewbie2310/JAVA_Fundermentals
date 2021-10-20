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

    
    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        Utility ct = new Utility();
        System.out.print("Enter the @str: ");
        String enter = sc.nextLine();
        System.out.println("1 - Search within @str string to conclude whether it contains the following words or NOT? ('me','why','well')");
        System.out.println("2 - 'you' word appear in @str how many times? ");
        System.out.println("3 - Replace the first character of each word by its UPPER CASE");
        System.out.println("4 - Replace the first character of each word by its LOWER CASE, and the last character of each word by its UPPER CASE ");
        System.out.println("5 - Extract @str string to an array of words, then display those words by increasing order.");
        System.out.println("6 - Give a character named c, remove from @str the first character which is equals to c. ");
        System.out.println("7 - Count how many words in @str, display “empty string” if @str is an empty string.");
        System.out.println("8 - Print all letters of @str only.");
        System.out.println("9 - Reserve @str.");
        System.out.println("10 - Replace all letter ‘a’ by ‘A’ and ‘b’ by ‘B’");
        System.out.println("11 - How many upper letters in @str?");
        System.out.println("12 - Exit");
        do {
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    //co chua "me","why","well"
                    ct.contain("me", enter);
                    ct.contain("why", enter);
                    ct.contain("well", enter);
                    break;
                case 2:
                    //chu 'you' xuat hien bao nhieu lan
                    ct.you("you", enter);
                    break;
                case 3:
                    //viet hoa chu dau
                    ct.firstUP(enter);
                    break;
                case 4:
                    //viet thuong chu dau, viet hao chu cuoi
                    ct.firstLOWlastUP(enter);
                    break;
                case 5:
                    //sap xep tang dan
                    String ex = ct.sort(enter);
                    System.out.println(ex);
                    break;
                case 6:
                    //xoa ky tu c dau tien
                    char c=0;
                    ct.removeFirst(c, enter);
                    break;
                case 7:
                    //co bao nhieu tu
                    ct.countWords(enter);
                    break;
                case 8:
                    //in cac chu cai
                    for (int i = 0; i < enter.length(); i++) {
                        System.out.print(" " + enter.charAt(i));
                    }
                    break;
                case 9:
                    //dao nguoc
                    StringBuilder strb = new StringBuilder(enter);
                    System.out.println(strb.reverse());
                    break;
                case 10:
                    //thay the a, b 
                    ct.replaceCaps(enter);
                    break;
                case 11:
                    //bao nhieu chu in hoa
                    ct.manyUp(enter);
                    break;
                case 12:
                    //thoat
                    check = false;
                    break;
            }
        } while (check);
    }

}
