/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.apache.catalina.tribes.util.Arrays;

/**
 *
 * @author Win7
 */
@ManagedBean(name="yb4")
@RequestScoped
public class YönetimliBean4 {

    /**
     * Creates a new instance of YönetimliBean4
     */
    public String[] javaGuiSeverler;

    public String[] getJavaGuiSeverler() {
        return javaGuiSeverler;
    }

    public void setJavaGuiSeverler(String[] javaGuiSeverler) {
        this.javaGuiSeverler = javaGuiSeverler;
    }
    
    //Map-Haritalama ile oluşturuldu.
    private static Map<String, Object> javaGuiSeverlerAdiSoyadi;

     static{
        javaGuiSeverlerAdiSoyadi = new LinkedHashMap<String, Object>();
        javaGuiSeverlerAdiSoyadi.put("1", "Emre Kaçan");
        javaGuiSeverlerAdiSoyadi.put("2", "Memduh Şener");
        javaGuiSeverlerAdiSoyadi.put("3", "Adnan Şenses");
        javaGuiSeverlerAdiSoyadi.put("4", "Maher Zain");
        javaGuiSeverlerAdiSoyadi.put("5", "Kübra Yıldız");
        javaGuiSeverlerAdiSoyadi.put("6", "Dostoyeviski Al");
    }
     
     public Map<String, Object> getJavaGuiSeverlerAdiSoyadi() {
        return javaGuiSeverlerAdiSoyadi;
    }
    
     public String getJavaGuiSeverlerSonucu(){
         return Arrays.toString(javaGuiSeverler);
     }
    public YönetimliBean4() {
    }
    
}
