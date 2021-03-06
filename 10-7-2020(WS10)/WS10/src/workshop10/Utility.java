/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Utility {

    public static int GetInt(String msg, int min, int max)
    {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do
        {
            System.out.print(msg);
            try
            {
                i = sc.nextInt();
                if(i >= min && i <= max)
                    loop = false;
            }
            catch(Exception e)
            {
                System.out.println(e);
                sc.nextLine();
            }
        }while(loop);
        
        return i;
                
    }
    
    public static float GetFloat(String msg, float min, float max)
    {
        float i = 0;
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do
        {
            System.out.print(msg);
            try
            {
                i = sc.nextFloat();
                if(i >= min && i <= max)
                    loop = false;
            }
            catch(Exception e)
            {
                System.out.println(e);
                sc.nextLine();
            }
        }while(loop);
        
        return i;
                
    }
    
    public static String GetString(String msg, boolean isEmpty)
    {
        String s = "";
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do
        {
            System.out.print(msg);
            try
            {
                s = sc.nextLine();
                if(isEmpty)
                    loop = false;
                else if(!s.isEmpty())
                    loop = false;
            }
            catch(Exception e)
            {
                System.out.println(e);
                sc.nextLine();
            }
        }while(loop);
        return s;
    }
    
    public static boolean GetYesNo(String msg)
    {
        String s = "";
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do
        {
            System.out.print(msg);
            try
            {
                s = sc.next("[yn]");
                loop = false;
            }
            catch(Exception e)
            {
                System.out.println(e);
                sc.nextLine();
            }
        }while(loop);
        if(s.charAt(0) == 'y') return true;
        else return false;
    }
    
    public static Date GetDate(String msg)
    {
        Date date = new Date();
        
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do
        {
            System.out.print(msg);
            try
            {
                String sDate = sc.next();
                date=new SimpleDateFormat("dd/mm/yyyy").parse(sDate);  
                check = false;
            }
            catch (Exception e) {
                
                System.out.println(e);
           }
        }while(check);
        return date;
        
    }
    
    
    
}
