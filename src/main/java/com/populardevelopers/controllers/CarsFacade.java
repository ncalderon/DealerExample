/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.populardevelopers.controllers;

import com.populardevelopers.model.Cars;
import javax.ejb.Stateless;


/**
 *
 * @author Nathaniel
 */
@Stateless
public class CarsFacade extends AbstractFacade<Cars> {

    public CarsFacade() {
        super(Cars.class);
    }
    
}
