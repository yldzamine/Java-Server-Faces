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
 * @author Win7
 */
@ManagedBean
@RequestScoped
public class Yönetimlibean {

    /**
     * Creates a new instance of Yönetimlibean
     */
    public Yönetimlibean() {
    }
     int tamsayi;
    double virgullusayi;

    public int getTamsayi() {
        return tamsayi;
    }

    public void setTamsayi(int tamsayi) {
        this.tamsayi = tamsayi;
    }

    public double getVirgullusayi() {
        return virgullusayi;
    }

    public void setVirgullusayi(double virgullusayi) {
        this.virgullusayi = virgullusayi;
    }
}
