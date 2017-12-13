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
public class BankAccount {
    private int accountNumber;
    private static double balance;
    private Client user;
    private Admin a;
    public BankAccount()
    {
        
    }
    public BankAccount(int accountNumber,Client c, double b) {
        this.accountNumber = accountNumber;
        this.user= c;
        this.balance=b;
    }

    BankAccount(BankAccountMapper BAM, int accountNumber, Client user, Admin a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    BankAccount(BankAccountMapper BAM, int accountNumber, Client user, Admin a, double balance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        BankAccount.balance = balance;
    }

    public Client getUser() {
        return user;
    }

    public void setUser(Client user) {
        this.user = user;
    }

    public Admin getA() {
        return a;
    }

    public void setA(Admin a) {
        this.a = a;
    }

    void add(int accountnumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(int accountNumber, double balance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void delete(int accountNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
