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
@ManagedBean(name="yb")
@RequestScoped
public class NewJSFManagedBean {

    public String yonelinecekSayfaGit(){
        return "sayfa2";
    }
    
}
