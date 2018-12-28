/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comsite;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Amine YILDIZ.
 */
@ManagedBean(name="yb")
@RequestScoped
public class yönetimliBean {

    /**
     * Creates a new instance of yönetimliBean
     */
    public yönetimliBean() {
    }
    
    float urunfiyatı;

    public float getUrunfiyatı() {
        return urunfiyatı;
    }

    public void setUrunfiyatı(float urunfiyatı) {
        this.urunfiyatı = urunfiyatı;
    }
}
