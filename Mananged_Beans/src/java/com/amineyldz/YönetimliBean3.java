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
@Named(value = "yönetimliBean3")
@RequestScoped
public class YönetimliBean3 {

    /**
     * Creates a new instance of YönetimliBean3
     */
    public YönetimliBean3() {
    }
    private String adi;
     private String soyadi;
    private String deneyim;

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

    public String getDeneyim() {
        return deneyim;
    }

    public void setDeneyim(String deneyim) {
        this.deneyim = deneyim;
    }
   
    public void yazdirMetodu(){
        String mesaj="Adı Soyadı:" +this.adi+"" +this.soyadi+"Deneyim:"+this.deneyim;
        System.out.println(mesaj);
    }
}
