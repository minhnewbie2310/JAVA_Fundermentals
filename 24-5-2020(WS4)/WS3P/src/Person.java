
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
public class Person {
    private String code=" ", name=" ";
    private int age=0;
    //Constructors

    public Person() {
    }
    public Person(String c, String n, int a) {
        code=c; name=n; age=a>0? a: 0;
    }
    //Get & set

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Input
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person's code: ");
        code = sc.nextLine();
        System.out.println("Enter the person's name: ");
        name = sc.nextLine();
        System.out.println("Enter the person's age: ");
        age = Integer.parseInt(sc.nextLine());
    }
    //Method for output
    @Override
    public String toString() {
        return code +","+ name + ","+age;
    }

}
