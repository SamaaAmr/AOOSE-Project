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
public class OnlineAccount {
    private Authenticate a;
    private Bank b;
    private Payment p;
    private Client c;
    private BankAccount b1;
    public OnlineAccount(Authenticate a, Bank b, Payment p, Client c,BankAccount b1) {
        this.a = a;
        this.b = b;
        this.p = p;
        this.c = c;
        this.b1=b1;
    }
    
    public void EditAccountInfo( int id,  AddressFacade a, String UserName, String password)
    {
        if (c.getId()==id)
        {
           c.editpassword(UserName);
           c.editusername(UserName);
           c.setA(a);
        }
    }
    public String getNearestBank() 
    {
        String caddress= c.GetCustomerPostcode();
        String baddress=b.getBankPostcode();
         if (caddress.substring(0, 3) == baddress.substring(0, 3))
         {
             return "Nearest Branch is "+ b.getAddress();
         }
         else 
             return "no bank near by";
                   
    }
    
    public void payBill(double amount)
    {
         double temp=0.0;
        if ( b1.getBalance()>=amount )
        {
            temp=b1.getBalance()-amount;
            b1.setBalance(temp);
            System.out.println(" Bill paied successfuly  ");
        }
        else 
        {
            System.out.println("error not enough credit");
        }
    }
    public String  viewBankInformation()
    {
        if (c.Login(a.getUserName(),a.getUserName()))
        {
            return "Name:  "+c.getName()+"User Name:  "+a.getUserName()+"    "+ "Password:  "+ a.getPassword()+"     "+"Address:  "+ c.getAddress()+"     "+"Account Number:  "+b1.getAccountNumber()+"     "+"Balance:  "+b1.getBalance();
        }
        else 
            return "error";
    }
    
    
}
