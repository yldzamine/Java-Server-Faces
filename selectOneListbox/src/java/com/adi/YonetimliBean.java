/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adi;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Win7
 */
@ManagedBean(name="yb")
@RequestScoped
public class YonetimliBean implements Serializable{

    /**
     * Creates a new instance of YonetimliBean
     */
    public String tarih1,tarih2,tarih3;

    public String getTarih1() {
        return tarih1;
    }

    public void setTarih1(String tarih1) {
        this.tarih1 = tarih1;
    }

    public String getTarih2() {
        return tarih2;
    }

    public void setTarih2(String tarih2) {
        this.tarih2 = tarih2;
    }

    public String getTarih3() {
        return tarih3;
    }

    public void setTarih3(String tarih3) {
        this.tarih3 = tarih3;
    }
    
    public static class Yil{
        public String yilEtiketi;
         public String yilDegeri;

        public String getYilEtiketi() {
            return yilEtiketi;
        }

        public String getYilDegeri() {
            return yilDegeri;
        }
       
    public Yil(String yilEtiketi, String yilDegeri){
        this.yilEtiketi = yilEtiketi;
        this.yilDegeri = yilDegeri;
    }
    
    }
    public Yil[] tarih3Listesi;
    public Yil[] getTarih3DegerleriniAl(){
        tarih3Listesi = new Yil[3];
        tarih3Listesi[0] = new Yil("Osmanlı İmparatorluluğunun "+"Kuruluş Tarihi - 1299","1299");
        tarih3Listesi[1] = new Yil("İstanbu'un Fetih Tarihi-1453 ","1453");
        tarih3Listesi[2] = new Yil("Mısır'ın Fetih Tarihi - 1517","1517");
        return tarih3Listesi;
    }
    
    public YonetimliBean() {
    }
    
}
