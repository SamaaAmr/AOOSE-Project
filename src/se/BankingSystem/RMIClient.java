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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
public class RMIClient {
    private static BankingSysInterface c;
      private static BankingSysGUI gui;
    public static void main(String[] args) {
        try {
            // Connecting to the RMI Registry created on the server
            Registry registry = LocateRegistry.getRegistry(1099);

            // Search for the stub "calc"
            c = (BankingSysInterface) registry.lookup("transaction");

            

            gui.getWithDrawButton().addActionListener(new WithDrawButtonListener());
            gui.getDepositeButton().addActionListener(new DepositeButtonListener());

            gui.setLocationRelativeTo(null);
            gui.setVisible(true);

        } catch (Exception ex) {
            System.out.println("Exception occured");
        }
    }
    static class WithDrawButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber = Double.parseDouble(gui.getNumber());
                double result = c.withdraw(firstNumber);
                gui.setResultTxt(Double.toString(result));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Wrong Input");
            }
        }
    }

    static class DepositeButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber = Double.parseDouble(gui.getNumber());
                double result = c.deposite(firstNumber);
                gui.setResultTxt(Double.toString(result));
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Wrong Input");
            }
        }

    }
}
