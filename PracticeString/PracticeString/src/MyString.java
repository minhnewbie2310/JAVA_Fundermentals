/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trinh
 */
public class MyString {

    //input: abC123Qbc
    //output: C123Q
    public String f1(String txt) {
        String result = "";
        for (int i=0;i<txt.length();i++){
            char c = txt.charAt(i);
            if(Character.isDigit(c) || Character.isUpperCase(c)){
                result = result + c;
            }
        }
        return result;
    }

    //input: abC0123Qbc
    //output: 0123CQ
    public String f2(String txt) {
        String result = "";
        for (int i = 0; i <txt.length(); i++) {
            char c = txt.charAt(i);
            if(Character.isDigit(c)){
                if(c != '0'){
                    c--;
                    //input: abC0123Qbc
                    //output: 0012CQ
                }  
                result = result +c;
            }
        }
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if(Character.isUpperCase(c)){
                result = result +c;
            }
        }
        return result;
    }

    //input: abC123Qbcz
    //output: bcC123Qcdz
    public String f3(String txt) {
        String result = "";
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if(Character.isLetter(c) && Character.isLowerCase(c) && c!='z'){
                c++;
            }
            result = result +c;
        }
        return result;
    }

    //input: abC123Qbc4
    //output: ab2bc4
    public String f4(String txt) {
        String result = "";
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if((Character.isLetter(c) && Character.isLowerCase(c)) || (Character.isDigit(c) && Character.getNumericValue(c)%2==0)){
                result = result +c;
            }
        }
        
        return result;
    }

    //input: abC123Qbc4
    //output: 24  (=1*2*3*4)
    public int f5(String txt) {
        int sum=1;
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if(Character.isDigit(c)){
                sum*=Character.getNumericValue(c);
            }
        }
        return sum;
    }

    //input: abc123cb2
    //output: abc-123-cd2
    public String f6(String txt) {
        String result = "";
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if(i%3==0 && i!=txt.length() && i!=0){
               result+='-';
            } 
            result+=c;
        }
        return result;
    }

    //input: abc-123-cd2
    //output: 123
    public String f7(String txt) {
        String[] result = txt.split("-");
        return result[1];
    }

    //input: abC123Qbc49
    //output: 6  (sum of even number)
    public int f8(String txt) {
        
        int sum=0;
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if(Character.isDigit(c) && Character.getNumericValue(c)%2==0){
                sum+=Character.getNumericValue(c);
            }
        }
        return sum;
        
    }

    //input: abC123Qbc49
    //output: abC032Qbc58 (even = even + 1; odd = odd -1)
    public String f9(String txt) {
        String result = "";
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if(Character.isDigit(c)){
                if(Character.getNumericValue(c)%2==0){
                    c++;
                }
                else{
                    c--;
                }   
            }
            result+=c;
        }
        return result;
    }

    //input: abC123Qbc49
    //output: 234
    public String f10(String txt) {
        String result = "";
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if(Character.isDigit(c) && 1<Character.getNumericValue(c) && Character.getNumericValue(c)<9){
                result+=c;
            }
                    
        }
        return result;
    }
}
