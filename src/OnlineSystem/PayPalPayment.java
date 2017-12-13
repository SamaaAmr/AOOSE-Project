/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineSystem;

import se.BankingSystem.BankAccount;

/**
 *
 * @author Samaa
 */
public class PayPalPayment implements PaymentInterface {
    
    BankAccount b;
    @Override
   
    public void pay(double amount) {
        double temp=0.0;
        if (amount<= b.getBalance())
        {
            temp=b.getBalance()-amount;
            b.setBalance(temp);
            System.out.println(" successful Paybal payment");
        }
        else 
        {
            System.out.println("error not enough credit");
        }
    }
    
}
