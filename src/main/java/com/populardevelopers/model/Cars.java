/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.populardevelopers.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 *
 * @author Nathaniel
 */

@Entity("Cars")
public class Cars {
    @Id
    private ObjectId id;
    private String model;
    private String brand;
    private Double price;
    private int year;
}
