/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.populardevelopers.dealer;

import com.populardevelopers.dao.BasicDaoImpl;
import com.populardevelopers.model.Cars;
import com.populardevelopers.model.CollectionsEnum;
import java.util.List;



/**
 *
 * @author itla
 */
public class conexion {
    
    public static void main(String[] args) {
        System.out.println("prueba");
        BasicDaoImpl<Cars> basic = new BasicDaoImpl<Cars>(CollectionsEnum.CARS);
        List<Cars> cars = basic.findAll();
        System.out.println(cars.size());
        for(Cars car: cars){
            System.out.println(car.getBrand());
        }
        
        
//      String textUri = "mongodb://admin:oracle@ds045614.mongolab.com:45614/popular";
//        
//        MongoClientURI uri = new MongoClientURI(textUri);
//        MongoClient mongoClient = new MongoClient(uri);
//        DB db = mongoClient.getDB("popular");
//        Jongo jongo = new Jongo(db);
//        org.jongo.MongoCollection users = jongo.getCollection("users");
//        users.insert("{name: 'javier', password: 'oracle'}");
//        
//        mongoClient.close();
         
    }
}

   
    
    
   
    
  