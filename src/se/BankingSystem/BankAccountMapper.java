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
public class BankAccountMapper {
    BankAccountMapper BAM;
    BankAccount b;

    
 

    public BankAccountMapper(BankAccountMapper BAM, int accountNumber, Client user, Admin a,double balance) {
        b=new  BankAccount (BAM,accountNumber,user,a,balance);
    }

    public void setB(BankAccount b) {
        this.b = b;
    }

    public BankAccount getB() {
        return b;
    }

    
    public void addaccount(int accountnumber,double balance ){
        int temp=0;
        
            b.add(b.getAccountNumber(),b.getBalance());
       temp++;
       System.out.println("updated number of accounts is "+temp);
        
    }
    
    
    
 
public void deleteaccount(int accountnumber){
  b.delete(b.getAccountNumber()); 
    
}    
public void UpdateAll(int accountnum,double balance ){
     BAM.UpdateAll(accountnum, balance);
     
}
}
