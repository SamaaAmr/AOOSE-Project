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
public class Authenticate implements LogInReadOnlyInterface {
  private String  UserName;
  private String  password;

    public Authenticate ()
    {
        
    }
    public Authenticate(String UserName, String password) {
        this.UserName = UserName;
        this.password = password;
       
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean AuthenticateLogin(String username,String pass)
    {
        if (this.UserName == username && this.password==pass)
            return true;
        else 
            return false;
        
    }
    
    
   public void Register(String UserName,String password)
   {
       this.UserName=UserName;
       this.password=password;
       
   }
    
    public boolean Login(String un, String pass) {
        if (AuthenticateLogin(un,pass))
        return true;
        else 
            return false;
    }
}
