/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.BankingSystem;

/**
 *
 * @author Samaa
 */
public class Address {
    public String StreetName;
    public String Postcode;
    public int Streetnumber;

    public Address(String StreetName, String Postcode, int Streetnumber) {
        this.StreetName = StreetName;
        this.Postcode = Postcode;
        this.Streetnumber = Streetnumber;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String StreetName) {
        this.StreetName = StreetName;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public int getStreetnumber() {
        return Streetnumber;
    }

    public void setStreetnumber(int Streetnumber) {
        this.Streetnumber = Streetnumber;
    }
    
}
