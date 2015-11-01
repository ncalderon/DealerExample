/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.populardevelopers.dao;

import com.populardevelopers.model.CollectionsEnum;
import com.populardevelopers.utils.JongoUtils;
import java.util.List;
import org.bson.types.ObjectId;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

/**
 *
 * @author itla
 */
public class BasicDaoImpl <E> implements BasicDao<E> {
    
    private MongoCollection collection;
    private Collection type;
    
    public BasicDaoImpl(CollectionsEnum collection){
        Jongo jongo = new Jongo(JongoUtils.getMongoClient().getDB(JongoUtils.dbName));
        this.collection = jongo.getCollection(collection.getCollectionName());
    }
    @Override
    public void insert(E entity) {
        collection.save(entity);
    }

    @Override
    public void update(E entity) {
        collection.save(entity);
    }

    @Override
    public List<E> findAll() {
        return (List)collection.find().as(null)
    }

    
    @Override
    public E findById(String id) {
        return (E)collection.findOne(new ObjectId(id)).as();
    }

    @Override
    public void delete(String id) {
        collection.remove(id);
    }

    
    
}
