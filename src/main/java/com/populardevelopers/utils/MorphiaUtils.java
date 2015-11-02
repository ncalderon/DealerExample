/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.populardevelopers.utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;


/**
 *
 * @author itla
 */
public final class MorphiaUtils {
    
    private static final String connectionString ="mongodb://admin:oracle@ds045614.mongolab.com:45614/popular";
    private static final String dbName = "popular";
    private static final String packageModel = "com.populardevelopers.model";
    
    
    private static final MongoClientURI uri;
    private static final MongoClient mongoClient; 
    private static final Morphia morphia;
    private static final Datastore datastore;
  
    
    static {
        
        uri= new MongoClientURI(connectionString);
        mongoClient= new MongoClient(uri);
        morphia = new Morphia();
        morphia.mapPackage(packageModel);
        datastore = morphia.createDatastore(mongoClient, dbName);
        datastore.ensureIndexes();
        //DB db = mongoClient.getDB(database);
       
        //Jongo jongo = new Jongo(db);
        
        
        //return jongo;
    }
    
    public static Datastore getDatastore () {
        return datastore;
    }    
    
}
