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
@ManagedBean(name="yb")
@RequestScoped
public class YönetimliBean3  implements Serializable{

    /**
     * Creates a new instance of YönetimliBean3
     */
    String verilecekMesaj="Güzel gören güzel düşünen. \n"
            + "Güzel düşünen hayatından lezzet alır.\n";

    public String getVerilecekMesaj() {
        return verilecekMesaj;
    }

    public void setVerilecekMesaj(String verilecekMesaj) {
        this.verilecekMesaj = verilecekMesaj;
    }
    
    public YönetimliBean3() {
    }
    
}
