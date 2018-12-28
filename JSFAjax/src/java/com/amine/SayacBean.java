/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amine;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Win7
 */
@ManagedBean(name="sy")
@RequestScoped
public class SayacBean {

    public SayacBean() {
    }
  public int sayi; 

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }
    public void arttir(){
        sayi++;
    }
    public void azalt(){
        sayi--;
    }
}
