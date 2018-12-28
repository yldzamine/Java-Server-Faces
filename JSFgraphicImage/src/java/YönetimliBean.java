/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    public YönetimliBean() {
    }
    public String yonetilecekSayfaGit(){
        return "sayfa2.xhtml";
    }
    
}
