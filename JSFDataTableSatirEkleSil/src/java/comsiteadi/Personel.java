/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comsiteadi;

import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Win7
 */
@ManagedBean
@RequestScoped
public class Personel {

     
    String numarasi;
    String adiSoyadi;

    public String getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(String numarasi) {
        this.numarasi = numarasi;
    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public BigDecimal getMaasi() {
        return maasi;
    }

    public void setMaasi(BigDecimal maasi) {
        this.maasi = maasi;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }
    BigDecimal maasi;
    int yasi;
    
    //----------------------------
    public Personel(String numarasi, String adiSoyadi, int yasi, BigDecimal maasi){
        this.numarasi = numarasi;
        this.adiSoyadi = adiSoyadi;
        this.yasi = yasi;
        this.maasi = maasi;
    }
}

    

