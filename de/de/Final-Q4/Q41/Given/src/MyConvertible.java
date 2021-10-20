/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alias
 */
public class MyConvertible implements Convertible{

    @Override
    public double toMile(double x) {
        return x*0.621371 ;
    }

    @Override
    public String getCode(String rc) {
        String result = "";
        for (int i = 0; i < rc.length() ; i++) {
            result =  result + rc.charAt(i);
            if((i+1)%3==0&&(i+1)!=rc.length()){
                result = result + "-";
            }
        }
        return result;
    }

   
    
}
