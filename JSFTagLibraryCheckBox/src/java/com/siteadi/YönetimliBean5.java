/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.apache.catalina.tribes.util.Arrays;

/**
 *
 * @author Win7
 */
@ManagedBean(name="yb5")
@RequestScoped
public class YönetimliBean5 {

    /**
     * Creates a new instance of YönetimliBean5
     */
    public String[] jsfSeverler;

    public String[] getJsfSeverler() {
        return jsfSeverler;
    }

    public void setJsfSeverler(String[] jsfSeverler) {
        this.jsfSeverler = jsfSeverler;
    }

   public static class Sayi{
       public String sayiEtiketi;
       public String sayiDegeri;
       
        public Sayi(String sayiEtiketi, String sayiDegeri){
           this.sayiEtiketi = sayiEtiketi;
           this.sayiDegeri = sayiDegeri;
       }

        public String getSayiEtiketi() {
            return sayiEtiketi;
        }

        public String getSayiDegeri() {
            return sayiDegeri;
        }
       
      
   } 
   
    
    public Sayi[] jsfServerlerAdiSoyadi;
    public Sayi[] jsfServerlerAdiSoyadi(){
        jsfServerlerAdiSoyadi =new Sayi[6];
        jsfServerlerAdiSoyadi[0]= new Sayi("Faruk K.", "1");
        jsfServerlerAdiSoyadi[1]= new Sayi("Faru G.","2");
        jsfServerlerAdiSoyadi[2]= new Sayi("Faruk J.","3");
        jsfServerlerAdiSoyadi[3]= new Sayi("Faruk H.","4");
        jsfServerlerAdiSoyadi[4]= new Sayi("Faruk M.","5");
        jsfServerlerAdiSoyadi[5]= new Sayi("Faruk N.","6");
        return jsfServerlerAdiSoyadi;
    }
    
    
    public String getJsfSeverlerSonucu(){
        return Arrays.toString(jsfSeverler);
    }
    public YönetimliBean5() {
    }

    
   
    }
    
