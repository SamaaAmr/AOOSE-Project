/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
 
import org.bson.Document;

import se.BankingSystem.*;
import OnlineSystem.*;
/**
 *
 * @author Samaa
 */


public class ClientDB {

/**
 *
 * @author Samaa
 */
   
	public void insertClient(Client c) {
 
		
                MongoClient clients = new MongoClient("localhost", 27017);
		MongoDatabase database = clients.getDatabase("Clients_db");
                MongoCollection collection = database.getCollection("Clients");
		Document document = new Document();
                document.put("id",c.getId());
		document.put("name", c.getName());
		document.put("Address", c.getAddress());
		document.put("Age", c.getAge());
                document.put("UserName", c.getusername());
		document.put("Password", c.getpassword());
                
		collection.insertOne(document);
                clients.close();
                
}
        
        public String DeleteCustomer(int id)
        {
            MongoClient clients = new MongoClient("localhost", 27017);
		MongoDatabase database = clients.getDatabase("Clients_db");
		MongoCollection collection = database.getCollection("Clients");
                collection.deleteOne(new Document ("id",id));
                
                 clients.close();
                 return "Customer with ID  " +id+ " is removed from Data base";
        }
        
        public void updateCustomer  ( int id,String username,String password, AddressFacade Address)
        {
            
            MongoClient clients = new MongoClient("localhost", 27017);
		MongoDatabase database = clients.getDatabase("Clients_db");
		MongoCollection collection = database.getCollection("Clients");
               Document doc1 = new Document("UserName", username).append("Password", password) .append("Address", Address);
              
                collection.updateOne(eq("id",id), doc1); 
                 clients.close();
                
        }
        public String getClientById( int id )
        {
             MongoClient clients = new MongoClient("localhost", 27017);
		MongoDatabase database = clients.getDatabase("Clients_db");
		MongoCollection collection = database.getCollection("Clients");
               Document doc = (Document) collection.find(Filters.eq("id",id)).first();
               Client c = new Client();
               c.setAge(doc.getInteger("Age"));
               c.setName(doc.getString("name"));
               
                clients.close();
               return c.toString();
              
        }
        public String getUserName(int id)
        {
            MongoClient clients = new MongoClient("localhost", 27017);
		MongoDatabase database = clients.getDatabase("Clients_db");
		MongoCollection collection = database.getCollection("Clients");
               Document doc = (Document) collection.find(Filters.eq("id",id)).first();
               Client c = new Client();
               Authenticate a = new Authenticate();
               a.setUserName(doc.getString("User Name"));
                clients.close();
               return a.getUserName();
               
        }
        public String getPassword(int id)
        {
            MongoClient clients = new MongoClient("localhost", 27017);
		MongoDatabase database = clients.getDatabase("Clients_db");
		MongoCollection collection = database.getCollection("Clients");
               Document doc = (Document) collection.find(Filters.eq("id",id)).first();
               Client c = new Client();
               Authenticate a = new Authenticate();
               a.setPassword(doc.getString("Password"));
               clients.close();
               return a.getPassword();
        }
        
}