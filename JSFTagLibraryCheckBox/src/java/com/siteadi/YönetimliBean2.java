/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Win7
 */
@ManagedBean(name="yb2")
@RequestScoped
public class YönetimliBean2 {

    /**
     * Creates a new instance of YönetimliBean2
     */
    
    public String[] androidSeverler;

    public String[] getAndroidSeverler() {
        return androidSeverler;
    }

    public void setAndroidSeverler(String[] androidSeverler) {
        this.androidSeverler = androidSeverler;
    }
    
    public String getAndroidSeverlerSonucu(){
       return Arrays.toString(androidSeverler);
    }
    public YönetimliBean2() {
    }
    
}
