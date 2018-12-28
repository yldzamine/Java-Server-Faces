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
@ManagedBean(name="yb3")
@RequestScoped
public class YönetimliBean3 {

    /**
     * Creates a new instance of YönetimliBean3
     */
    public String[] iphoneSeverler;

    public String[] getIphoneSeverler() {
        return iphoneSeverler;
    }

    public void setIphoneSeverler(String[] iphoneSeverler) {
        this.iphoneSeverler = iphoneSeverler;
    }
    
    //Array-Dizi Tarafından OLuşturuldu.
    public String[] getIphoneSeverlerAdiSoyadi(){
        iphoneSeverler = new String[6];
        iphoneSeverler[0]="Birdal Özcan";
        iphoneSeverler[1]="Amine Yıldız";
        iphoneSeverler[2]="Mimar Aslan";
        iphoneSeverler[3]="Özkan Acar";
        iphoneSeverler[4]="Haluk Tatar";
        iphoneSeverler[5]="Memduha Yıldızz";
        return iphoneSeverler;
    }
    
    public String getIphoneSeverlerSonucu(){
        return Arrays.toString(iphoneSeverler);
    }
    public YönetimliBean3() {
    }
    
}
