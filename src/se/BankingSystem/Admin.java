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
import OnlineSystem.LogInReadOnlyInterface;
public class Admin extends Person {
    
    public static  Admin  a ;
    private LogInReadOnlyInterface l;
    private Admin(String name, int SSn, int age, AddressFacade a) {
        super(name, SSn,  age, a);
    }
     
    
    public static Admin getInstance()
   {
       AddressFacade b = new AddressFacade("BUE","RGB14",1);
      
       if (a==null)
       {
           a = new Admin("admin",1,22,b);
       }
       return a;
   }
    public boolean AdminLoginAuthentication(String un,String pass)
    {
        if (un=="admin"&& pass=="admin" )
        {
            l.Login(un, pass);
            return true;
        }
        else 
            return false;
    }
    
    
}
