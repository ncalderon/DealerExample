/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.populardevelopers.utils;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.jongo.Jongo;

/**
 *
 * @author itla
 */
public final class JongoUtils {
    
    public static final String connStringUri ="mongodb://admin:oracle@ds045614.mongolab.com:45614/popular";
    public static final String dbName = "popular";
    public static MongoClientURI uri;
    public static  MongoClient mongoClient;   
  
    
    static {
        
        uri= new MongoClientURI(connStringUri);
        mongoClient= new MongoClient(uri);
        //DB db = mongoClient.getDB(database);
       
        //Jongo jongo = new Jongo(db);
        
        
        //return jongo;
    }
    
    public static MongoClient getMongoClient () {
        return mongoClient;
    }    
    
}
