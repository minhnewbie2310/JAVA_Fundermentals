
import java.util.Scanner;



/*
 *  This code is written by Nguyen Hoang Minh
 * 
 */

/**
 *
 * @author luugia
 */
public class Utinity {
    public int getInt(String msg) {
        boolean check;
        int choose = 0 ;
        Scanner sc = new Scanner(System.in);
        
        do {
            try {
                System.out.print(msg);
//                System.out.println();
                choose = Integer.parseInt(sc.nextLine()); 
                break;

            } catch (NumberFormatException e) {
                System.out.println("Nhập sai rồi bạn ơi!!! Mời bạn nhập lại");
                check = true;
                
            }
        } while (check);

        return choose;
    }
}

