package comsite;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

/**
 * win Amine YILDIZ.
 */
public class PersonelValueListener implements ValueChangeListener{


    @Override
    public void processValueChange(ValueChangeEvent vce) throws AbortProcessingException {
       
        PersonelBean personel = (PersonelBean) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("personel");
        
        personel.setHakkinda(event.getNewValue().toString());
    }
    
}
