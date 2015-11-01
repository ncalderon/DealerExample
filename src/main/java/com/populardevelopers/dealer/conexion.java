/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.populardevelopers.dealer;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;
import org.jongo.*;




/**
 *
 * @author itla
 */
public class conexion {
    
    public static void main(String[] args) {
        String textUri = "mongodb://admin:oracle@ds045614.mongolab.com:45614/popular";
        
        MongoClientURI uri = new MongoClientURI(textUri);
        MongoClient mongoClient = new MongoClient(uri);
        DB db = mongoClient.getDB("popular");
        Jongo jongo = new Jongo(db);
        org.jongo.MongoCollection users = jongo.getCollection("users");
        users.insert("{name: 'javier', password: 'oracle'}");
        
        mongoClient.close();
         
    }
}

   
    
    
   
    
  