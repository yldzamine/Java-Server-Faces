/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comsite;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author Amine YILDIZ.
 */
@ManagedBean(name="yb")
@RequestScoped
public class PersonelBean implements Serializable{

    public PersonelBean() {
    }
    private static final long serialVersionUID = 1L;
    private static Map<String, String> kisiler;
    private String hakkinda ="Fırat Üniversitesi" ;

    
    static{
        kisiler = new LinkedHashMap<String, String>();
        
        kisiler.put("Burak Çağatay Akman","Fırat Üniversitesi" );
        kisiler.put("Furkan Uzun","Ondokuz Mayıs Üniversitesi" );
        kisiler.put("Veysel Hyung Ece","Bilgisayar Mühendisi-Oracle-DBA");
        kisiler.put("Metin Dinibütünoğlu","Hyundai Assan Otomotiv'de Stajyer");
        kisiler.put("Tanju Bozok","Azerbeycan Tecnical Universty" );
        kisiler.put("Burakhan Sinal","Gstcranes");
        kisiler.put("Ferid Mosümov","Ankara Üniversitesi" );
        kisiler.put("Fatih Aktürk","Total Var'da Stajyer" );
    } 
    
    public void personelHakkindaChanged(ValueChangeEvent e){
        //persoel bilgisine yeni bir değer atanıyor.
        hakkinda = e.getNewValue().toString();
    }
    
    public Map<String, String> getPersonelInMap() {
        return PersonelBean.kisiler;
    }
    
    
    public String getHakkinda() {
        return hakkinda;
    }

    public void setHakkinda(String hakkinda) {
        this.hakkinda = hakkinda;
    }
    
}
