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
import OnlineSystem.*;
public class Client extends Person implements LogInReadOnlyInterface {
    OnlineAccount online;
    Authenticate a2;
    Address a1;
    public Client( )
    {
         super();
    }
      
    public Client( String name, int SSn,  int age, AddressFacade a,Authenticate a2) {
        super(name, SSn, age, a);
        this.a2=a2;
    }
     
     public String GetCustomerPostcode(   )
     
    {
      
      return a1.getPostcode();
       
        
    }
    
    public void editusername( String username)
    {
        a2.setUserName(username);
       
        
    }
    public void editpassword(String pass)
    {
         a2.setPassword(pass);
    }
    public OnlineAccount getOnline() {
        return online;
    }

    public void setOnline(OnlineAccount online) {
        this.online = online;
    }

    public String getusername()
    {
        return a2.getUserName();
    }
    public String getpassword()
    {
        return a2.getPassword();
    }

   public boolean CustomerRegistration (String UserName,String password)
   {
       if (!a2.AuthenticateLogin(UserName, password))
       {
           a2.Register(UserName, password);
           return true;
       }
       return false;
   }
    public boolean Login(String un, String pass) {
        if (a2.AuthenticateLogin(un, pass))
          return  a2.Login(un, pass);
        else 
            return false;
    }
   
    
}
