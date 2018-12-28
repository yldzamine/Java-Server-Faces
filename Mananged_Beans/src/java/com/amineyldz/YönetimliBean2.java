/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amineyldz;

import java.awt.event.ActionEvent;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Win7
 */
@Named(value = "yönetimliBean2")
@Dependent
public class YönetimliBean2 {

    /**
     * Creates a new instance of YönetimliBean2
     */
    public String onayverAction(){
        String sonuc="Action metodu çalıştırıldı.";
        System.out.println(sonuc);
        return sonuc;
    }
    
    public void onayverActionListener(ActionEvent olay){
       System.out.println("Action Listener Metodu Çalıştırıldı.");
     /*  String gelenParametreAdi=(String)olay.getComponent().getAttiibutes().get("p_adi");
       String gelenParametreSoyadi=(String) olay.get("p_soyadi");
       
       String sonuc=
         "parametreler:" +gelenParametreAdi+ "" +gelenParametreSoyadi;
       System.out.println(sonuc);*/
    }
    public YönetimliBean2() {
    }
    
}
