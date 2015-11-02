/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.populardevelopers.dao;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author itla
 */
public interface BasicDao<E> {
    
    public void insert(E entity);
    public void update(E entity);
    public List<E> findAll ();
    public E findById(ObjectId id);
    public void delete(ObjectId id);

}
