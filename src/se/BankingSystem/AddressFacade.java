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
public  class AddressFacade {
    Address a;
    String add;
    public AddressFacade()
    {
        
    }
    public AddressFacade(String StreetName, String Postcode, int Streetnumber) {
        a = new Address(StreetName,Postcode,Streetnumber);
        
    }
    
    public AddressFacade (String add)
    {
        this.add= add;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
    
   public  String getData()
   {
       return a.getStreetName()+a.getPostcode()+ a.getStreetnumber();
   }
    public  void setAddress(String SN, int StN,String PC)
    {
        a.setPostcode(PC);
        a.setStreetName(SN);
        a.setStreetnumber(StN);
    }
    
}
