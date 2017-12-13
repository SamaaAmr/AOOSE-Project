/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.BankingSystem;

import DB.*;
import OnlineSystem.*;
/**
 *
 * @author Samaa
 */
public class SE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClientDB db =  new ClientDB();
        Authenticate auth = new Authenticate("samaa","samaa");
        Authenticate auth1 = new Authenticate("samaa1","samaa1");
        AddressFacade af= new AddressFacade("bue","bue",1);
        Client c = new Client("samaa",1234,21,af,auth);
        db.insertClient(c);
        Client c2 = new Client("samaa amr",1235,22,af,auth1);
         db.insertClient(c2);
       System.out.println(c2.getId());
       db.DeleteCustomer(c2.getId());
        System.out.println(db.getUserName(1));
        Address a = new Address ("bue","bue",1);
        BankAccount ba = new BankAccount(1,c,2000);
        Bank b = new Bank(a,af,ba,"CIB");
        BankAccountDB bdb = new BankAccountDB();
        bdb.insertBankAccount(ba, 1);
        BankDB bankdb = new BankDB();
        bankdb.insertBank(b);
    }
    
}
