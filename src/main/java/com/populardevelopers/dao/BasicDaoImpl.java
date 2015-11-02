/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.populardevelopers.dao;

import com.populardevelopers.model.CollectionsEnum;
import com.populardevelopers.utils.MorphiaUtils;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;


/**
 *
 * @author itla
 */
public class BasicDaoImpl <E> implements BasicDao<E> {
    
    private CollectionsEnum type;
    private Datastore datastore;
    
    public BasicDaoImpl(CollectionsEnum type){
        this.type = type;
    }
    
    @Override
    public void insert(E entity) {
        datastore.save(entity);
    }

    @Override
    public void update(E entity) {
        datastore.save(entity);
    }

    @Override
    public List<E> findAll() {
        return (List<E>)datastore.createQuery(type.getType()).asList();
    }

    @Override
    public E findById(ObjectId id) {
        return (E) datastore.get(type.getType(), id);
    }

    @Override
    public void delete(ObjectId id) {
        datastore.delete(type.getType(), id);
    }

    
    
}
