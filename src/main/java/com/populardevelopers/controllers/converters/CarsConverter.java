package com.populardevelopers.controllers.converters;

import com.populardevelopers.model.Cars;
import com.populardevelopers.controllers.CarsFacade;
import com.populardevelopers.controllers.beans.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.bson.types.ObjectId;

@FacesConverter(value = "carsConverter")
public class CarsConverter implements Converter {

    @Inject
    private CarsFacade ejbFacade;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    ObjectId getKey(String value) {
        ObjectId key;
        key = new ObjectId(value);
        return key;
    }

    String getStringKey(java.lang.Integer value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value);
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Cars) {
            Cars o = (Cars) object;
            return o.getId().toString();
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Cars.class.getName()});
            return null;
        }
    }

}
