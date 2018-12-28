/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comsite;

import java.io.Serializable;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Win7
 */
@ManagedBean(name="yb")
@RequestScoped
public class YönetimliBean implements Serializable {

     public String adi,soyadi,bolumu;
    public int numarasi;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(int numarasi) {
        this.numarasi = numarasi;
    }
   
    public String yonelinecekSayfaGit(){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        this.bolumu = getBolumuParametresiniAl(facesContext);
        return "sayfa2";
    }
    
    public String getBolumuParametresiAl(FacesContext facesContext){
        Map<String, String> params = facesContext.getExternalContext().getRequestParameterMap();
        
        return params.get("bolumu");
    }
    public YönetimliBean() {
    }

    private String getBolumuParametresiniAl(FacesContext facesContext) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
