/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author Samaa
 */
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
 
import org.bson.Document;

import se.BankingSystem.*;
public class BankAccountDB {
    public void insertBankAccount(BankAccount ba, int id) {
 
		
                MongoClient BA = new MongoClient("localhost", 27017);
		MongoDatabase database = BA.getDatabase("BankAccounts_db");
                MongoCollection collection = database.getCollection("BankAccounts");
		Document document = new Document();
                document.put("accountNumber",ba.getAccountNumber());
		document.put("ClintID", id);
		document.put("Balane", ba.getBalance());
		collection.insertOne(document);
                BA.close();
                
    }
    public String DeleteBankAccount(int accountnumber)
        {
                 MongoClient BA = new MongoClient("localhost", 27017);
		MongoDatabase database = BA.getDatabase("BankAccounts_db");
                MongoCollection collection = database.getCollection("BankAccounts");
                collection.deleteOne(new Document ("accountNumber",accountnumber));
                BA.close();
                return "Bank with Postcode  " +accountnumber+ " is removed from Data base";
                 
        }
    public BankAccount getBankAccountInfo (int accountnumber)
    {
         MongoClient BA = new MongoClient("localhost", 27017);
		MongoDatabase database = BA.getDatabase("BankAccounts_db");
                MongoCollection collection = database.getCollection("BankAccounts");
                Document doc = (Document) collection.find(Filters.eq("accountNumber",accountnumber)).first();
               BankAccount b= new BankAccount();
              b.setAccountNumber(doc.getInteger("accountNumber"));
              b.setBalance(doc.getDouble("Balane"));
              return b;
    }
    
    
}
