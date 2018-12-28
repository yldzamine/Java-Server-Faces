/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comsiteadi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Amine YILDIZ.
 */
@ManagedBean
@RequestScoped
public class YönetimliBean {

   
    public YönetimliBean() {
    }
    String cümle;

    public String getCümle() {
        return cümle;
    }

    public void setCümle(String cümle) {
        this.cümle = cümle;
    }
    
   
}
