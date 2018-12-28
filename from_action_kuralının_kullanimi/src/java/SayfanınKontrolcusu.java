/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Win7
 */
@ManagedBean
@RequestScoped
public class SayfanınKontrolcusu implements Serializable{

    private static final long serialVersionUID = 1L;
    
    public String gitSayfa1(){
        return "basarili";
    }
    
    public String gitSayfa2(){
        return "iyimser";
    }
    
    public String gitSayfa3(){
        return "olumlu";
    }
    
    public SayfanınKontrolcusu() {
    }
    
}
