package com.populardevelopers.controllers.beans;

import com.populardevelopers.model.Cars;
import com.populardevelopers.controllers.CarsFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Named(value = "carsController")
@ViewScoped
public class CarsController extends AbstractController<Cars> {

    @Inject
    private CarsFacade ejbFacade;

    /**
     * Initialize the concrete Cars controller bean. The AbstractController
     * requires the EJB Facade object for most operations.
     */
    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public CarsController() {
        // Inform the Abstract parent controller of the concrete Cars Entity
        super(Cars.class);
    }

}
