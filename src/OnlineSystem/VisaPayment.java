/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineSystem;

/**
 *
 * @author Samaa
 */
import se.BankingSystem.*;
public class VisaPayment implements PaymentInterface {
 BankAccount b;
    @Override
   
    public void pay(double p) {
        double temp=0.0;
        if (p<= b.getBalance())
        {
            temp=b.getBalance()-p;
            b.setBalance(temp);
            System.out.println(" successful Visa payment");
        }
        else 
        {
            System.out.println("error not enough credit");
        }
    }
    
}
