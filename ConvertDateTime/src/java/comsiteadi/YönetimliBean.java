/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comsiteadi;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Amine YILDIZ
 */
@ManagedBean(name="yb")
@RequestScoped
public class YönetimliBean {

    /**
     * Creates a new instance of YönetimliBean
     */
    public YönetimliBean() {
    }
    Date dogumtarihi;

    public Date getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(Date dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }
}
