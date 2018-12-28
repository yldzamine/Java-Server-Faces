/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comsiteadi;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import static org.apache.coyote.http11.Constants.a;

/**
 *
 * @author Amine YILDIZ
 */
@ManagedBean(name="yb")
@RequestScoped
public class YönetimliBean implements Serializable{

    String numarasi;
    String adiSoyadi;
    BigDecimal maasi;
    int yasi;

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
    
    
    private static final ArrayList<Personel> personelListesi = new ArrayList<Personel>(Arrays.asList(
            new Personel("571","Amine Yıldız",22,new BigDecimal("1900.00")),
            new Personel("1299","Mimar Aslan",28,new BigDecimal("2500.00")),
            new Personel("1350","Özkan Acar",35,new BigDecimal("3000.00")),
            new Personel("1453","Fatih Sultan Mehmet",20,new BigDecimal("4000.00"))
            )
            );
//-------------------------------         

    public static ArrayList<Personel> getPersonelListesi() {
        return personelListesi;
    }

    public String kayitEkle(){
        Personel personel=new Personel(this.numarasi, this.adiSoyadi, this.yasi, this.maasi);
        
        personelListesi.add(personel);
        return null;
    }
    
    public String kayitSil(Personel personel){
        personelListesi.remove(personel);
        return null;        
    }
    public YönetimliBean() {
    }
    
}
