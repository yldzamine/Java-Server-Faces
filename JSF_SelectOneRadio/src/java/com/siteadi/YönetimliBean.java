/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import java.util.Map;
import java.util.LinkedHashMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Win7
 */
@ManagedBean(name="yb")
@RequestScoped
public class YönetimliBean {

    /**
     * Creates a new instance of YönetimliBean
     */
    public String ProgramlamaDili;

    public String getProgramlamaDili() {
        return ProgramlamaDili;
    }

    public void setProgramlamaDili(String ProgramlamaDili) {
        this.ProgramlamaDili = ProgramlamaDili;
    }
    
    public String ders;
    public String egitmen;

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }

    public String getEgitmen() {
        return egitmen;
    }

    public void setEgitmen(String egitmen) {
        this.egitmen = egitmen;
    }
  
    
    public static class Egitmen{
        public String egitmenAdi;

        public String getEgitmenAdi() {
            return egitmenAdi;
        }

        public String getEgitmenNo() {
            return egitmenNo;
        }
        public String egitmenNo;
        
        
        public Egitmen(String egitmenAdi, String egitmenNo){
            this.egitmenAdi = egitmenAdi;
            this.egitmenNo = egitmenNo;
        }
        
    }
     
    public Egitmen[] egitimBilgisi;
    public Egitmen[] getEgitmenBilgileriniAl(){
        egitimBilgisi = new Egitmen[4];
        egitimBilgisi[0]= new Egitmen("Mimar Aslan","1453");
        egitimBilgisi[1]=new Egitmen("Orhan ERİPEK","1299");
        egitimBilgisi[2]=new Egitmen("Serdar Çetinkaya","1547");
        egitimBilgisi[3]=new Egitmen("Amine YILDIZ","2017");
        
        return egitimBilgisi;
        
    }
    
    
    
    
    public YönetimliBean() {
    }
    
}
