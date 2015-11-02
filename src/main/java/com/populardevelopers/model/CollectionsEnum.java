/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.populardevelopers.model;

/**
 *
 * @author itla
 */
public enum CollectionsEnum {
    CARS(Cars.class, "Cars");
    
    ;

    private String collectionName;
    private Class type;
    private CollectionsEnum (Class type, String collectionName){
        this.type = type;
        this.collectionName = collectionName;
    }
    
    public Class getType () {
        return type;
    }
    
    public String getCollectionName () {
        return collectionName;
    }
}
