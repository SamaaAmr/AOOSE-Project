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
public class Payment {
 private   BankAccount b;
 private   PaymentInterface p;
    public void setPaymentMethod(PaymentInterface p,double amount)
    {
        p.pay(amount);
    }
}
