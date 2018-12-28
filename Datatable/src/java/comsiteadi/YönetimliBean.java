/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comsiteadi;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Win7
 */
@ManagedBean(name="yb")
@RequestScoped
public class YönetimliBean implements Serializable {

    
    private static final Personel[] personelListesi = new Personel[]{
      new Personel("571","Amine Yıldız",new BigDecimal("1900.00"), 22),
      new Personel("1299","Mimar Aslan",new BigDecimal("2500.00"), 28),
      new Personel("1350","Özkan Acar",new BigDecimal("3000.00"), 35),
      new Personel("1453","Fatih Sultan Mehmet",new BigDecimal("4000.00"),20),
      new Personel("1680","Mehme Zorlu",new BigDecimal("2000.00"),25),
      new Personel("1753","Amine Gedikli",new BigDecimal("8000.00"),40),
      new Personel("1920","Mimar Hocam",new BigDecimal("10000.00"),25)
  };
    
    public Personel[] getPersonelListesi(){
        return personelListesi;
    }
    
    public YönetimliBean() {
    }
    
}
