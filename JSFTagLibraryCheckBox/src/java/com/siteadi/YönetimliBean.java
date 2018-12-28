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
@ManagedBean(name="yb1")
@RequestScoped
public class YönetimliBean {

    /**
     * Creates a new instance of YönetimliBean
     */
    public boolean YazılımıSeviyormu;

    public boolean isYazılımıSeviyormu() {
        return YazılımıSeviyormu;
    }

    public void setYazılımıSeviyormu(boolean YazılımıSeviyormu) {
        this.YazılımıSeviyormu = YazılımıSeviyormu;
    }
    
    
    public YönetimliBean() {
    }
    
}
