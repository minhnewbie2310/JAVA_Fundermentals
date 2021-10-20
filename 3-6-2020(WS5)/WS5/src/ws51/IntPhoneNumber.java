/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws51;

/**
 *
 * @author User
 */
public class IntPhoneNumber extends PhoneNumber{
    String countryCode;

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(String countryCode, int are, String number) {
        super(are, number);
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void display(){
        System.out.println(countryCode+" - "+getAre()+" - "+getNumber());
    }
}
