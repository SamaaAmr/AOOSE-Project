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
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface BankingSysInterface extends Remote {
    public double deposite(double x) throws RemoteException;
    
    public double withdraw(double x) throws RemoteException;
   public Result WD(double x) throws RemoteException;
    
    
}
