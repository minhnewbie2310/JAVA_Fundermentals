/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GenericCar<Car> list = new GenericCar<Car>(new ArrayList<>());

        int choice;
        do {

            System.out.println("1. Add a new car: ");
            System.out.println("2. Dislay list of car: ");
            System.out.println("3. The number of car: ");
            System.out.println("4. Is list of car empty? ");
            System.out.println("5. Delete a car ");           
            System.out.println("6. Sort by production");
            System.out.println("7. Exit");
            choice = Utility.GetInt("Enter your choice (1-7): ", 1, 7);
            switch (choice) {
                case 1:
                    String name = Utility.GetString("Enter the name of car: ", true);
                    float price = Utility.GetFloat("Enter the price of car: ", 0, 999999);
                    String production = Utility.GetString("Enter the production of car: ", true);
                    Car car = new Car(name, price, production);
                    list.Add(car);
                    break;
                case 2:
                    list.sort();
                    System.out.println("Name\tPrice\tProduction");
                    list.Display();
                    break;
                case 3:
                    int size = list.getSize();
                    System.out.println("Number of cars: " + size);
                    break;
                case 4:
                    System.out.println("Is list of car empty?: ");
                    boolean check = list.isEmpty();
                    if (check = true) {
                        System.out.println("Not empty");
                    } else {
                        System.out.println("Empty");
                    }
                    break;
                case 5:
                    int pos = Utility.GetInt("Enter number of car to delete: ", 1, list.getSize());
                    list.delete(pos - 1);
                    break;
                case 6:
                    list.sort2();
                    System.out.println("Sorted list:");
                    System.out.println("Name\tPrice\tProduction");
                    list.Display();
                    break;
                
                case 7:
                    choice++;
                    break;
            }
        } while (choice >= 1 && choice <= 7);
        
    }

}
