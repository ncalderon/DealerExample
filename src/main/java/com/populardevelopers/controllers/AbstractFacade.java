/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.populardevelopers.controllers;

import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;

/**
 *
 * @author Nathaniel
 */
public abstract class AbstractFacade<T> {
    
    private Class<T> entityClass;
    private Datastore datastore;
    
    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void create(T entity) {
        datastore.save(entity);
    }

    public void edit(T entity) {
        datastore.save(entity);
    }

    public void remove(T entity) {
        datastore.delete(entity);
    }

    public T find(ObjectId id) {
        return (T) datastore.get(entityClass, id);
    }

    public List<T> findAll() {
        return datastore.createQuery(entityClass).asList();
    }

    public List<T> findRange(int[] range) {       
        return datastore.createQuery(entityClass).limit(range[1] - range[0] + 1).asList();
      
    }

    public int count() {
        return datastore.createQuery(entityClass).asList().size();
    }
    
}
