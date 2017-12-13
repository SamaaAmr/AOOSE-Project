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
public class Transaction {
    BankAccount b;
    Client c;

    public Transaction(BankAccount b, Client c) {
        this.b = b;
        this.c = c;
    }
   public double withdraw( double amount )
    {
        double temp = 0.0;
        if (amount <= b.getBalance())
        {
          temp = b.getBalance() - amount;
          b.setBalance(temp);
        }
        return  b.getBalance();
    }
    
    public double Deposite ( double amount )
    {
        
         double temp = 0.0;
         
             temp=b.getBalance()+amount;
             b.setBalance(temp);
             System.out.println("Amount  is sucessfully added ");
         
        
         return b.getBalance();
}
    
   
}
