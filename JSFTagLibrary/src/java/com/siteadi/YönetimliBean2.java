/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Win7
 */
@ManagedBean
@RequestScoped
public class YönetimliBean2 {

    /**
     * Creates a new instance of YönetimliBean2
     */
    
    private String adisoyadi;

    public String getAdisoyadi() {
        return adisoyadi;
    }

    public void setAdisoyadi(String adisoyadi) {
        this.adisoyadi = adisoyadi;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    private String mesaj;
    private String adres;
    
    public YönetimliBean2() {
    }
    
}
