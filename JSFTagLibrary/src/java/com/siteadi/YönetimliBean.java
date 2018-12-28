/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Win7
 */
@ManagedBean
@RequestScoped
public class YönetimliBean implements Serializable {

    /**
     * Creates a new instance of YönetimliBean
     */
    private String kullanıcıadi;
    private String parola;

    public String getKullanıcıadi() {
        return kullanıcıadi;
    }

    public void setKullanıcıadi(String kullanıcıadi) {
        this.kullanıcıadi = kullanıcıadi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    
    public YönetimliBean() {
    }
    
}
