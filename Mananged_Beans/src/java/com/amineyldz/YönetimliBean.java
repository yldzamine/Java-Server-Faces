/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amineyldz;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Win7
 */
@Named(value = "yönetimliBean")
@RequestScoped
public class YönetimliBean {

    /**
     * Creates a new instance of YönetimliBean
     */
    private String adi;
    private String soyadi;        

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
    
    public void yazdirMetodu(){
        System.out.println("Adı Soyadı: " + adi + "" +soyadi);
    }
    public YönetimliBean() {
    }
    
}
