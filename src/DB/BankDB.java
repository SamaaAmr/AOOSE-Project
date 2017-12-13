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
public class BankDB {
    public void insertBank(Bank b) throws NullPointerException{
 
		
                MongoClient banks = new MongoClient("localhost", 27017);
		MongoDatabase database = banks.getDatabase("banks_db");
                MongoCollection collection = database.getCollection("Banks");
		Document document = new Document();
                document.put("name",b.getName());
		document.put("Postcode", b.getBankPostcode());
		document.put("Address", b.getAddress());
		
 
		collection.insertOne(document);
                banks.close();
                
        }
    public void DeleteBank(String Postcode)
        {
                 MongoClient banks = new MongoClient("localhost", 27017);
		MongoDatabase database = banks.getDatabase("banks_db");
                MongoCollection collection = database.getCollection("Banks");
                collection.deleteOne(new Document ("Postcode",Postcode));
                System.out.println("Bank with Postcode  " +Postcode+ " is removed from Data base");
                 banks.close();
        }
     public Bank getBankbyPost(String Postcode) 
        {
              MongoClient banks = new MongoClient("localhost", 27017);
		MongoDatabase database = banks.getDatabase("banks_db");
                MongoCollection collection = database.getCollection("Banks");
               Document doc = (Document) collection.find(Filters.eq("Postcode",Postcode)).first();
               Bank b= new Bank();
              b.setName(doc.getString("name"));
              b.SetBankInfo(doc.getString("name"), doc.getString("Address"),  doc.getString("Postcode"));
                banks.close();
               return b;
              
        }
}
