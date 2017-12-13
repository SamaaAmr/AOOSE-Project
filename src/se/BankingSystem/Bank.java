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
public class Bank {
    private AddressFacade a;
    private BankAccount b;
    private String name;
    Address a1;
    public Bank()
    {
        
    }
    public Bank(Address a, AddressFacade af,BankAccount b, String name) {
        this.a1 = a;
         this.a = af;
        this.b = b;
        this.name = name;
    }
    
    public String getAddress()
    {
        return a.getData();
    }
    public String getBankPostcode()
    {
        return a1.getPostcode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressFacade getA() {
        return a;
    }

    public void setA(AddressFacade a) {
        this.a = a;
    }

    public BankAccount getB() {
        return b;
    }

    public void setB(BankAccount b) {
        this.b = b;
    }

    public Address getA1() {
        return a1;
    }

    public void setA1(Address a1) {
        this.a1 = a1;
    }
            
    public void SetBankInfo(String name,String Address,String Postcode)
    {
        this.name= name;
        a1.setPostcode(Postcode);
        a1.setStreetName(Address);
        
    }
}
