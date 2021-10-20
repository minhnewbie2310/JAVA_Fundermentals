
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
public class ManagingProgram1 {
    public static void main(String[] args) {
        Menu menu = new Menu(5);
        menu.add("Add new person");
        menu.add("Remove a person");
        menu.add("Update a person");
        menu.add("List");
        menu.add("Quit");
        int choice;
        int fl = 0;
        PersonList list = new PersonList(50);
        do{
            System.out.println("Class : IA1501");
            System.out.println("Group : 2");
            System.out.println("PERSON MANAGER");
            choice=menu.getChoice();
            if(choice==5){
                break;
            }
            switch(choice){
                case 1: list.add(); break;
                case 2: list.remove(); break;
                case 3: list.update(); break;
                case 4: list.sort(); list.print(); break;
                
            }
            System.out.println("Press any key to continue !");
            Scanner sc = new Scanner(System.in);
            
            String key = sc.nextLine();
            if(key!=null){
                fl = 1;
            }
        }
        while(choice>=1&&choice<5&&fl==1);
    }
}
