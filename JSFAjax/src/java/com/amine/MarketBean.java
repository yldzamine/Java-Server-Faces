/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amine;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.model.SelectItem;

/**
 *
 * @author Win7
 */
@ManagedBean
@RequestScoped
public class MarketBean {

   private SelectItem[] firma=new SelectItem[]{
       new SelectItem("firma1","Firma Adı 1"),
       new SelectItem("firma2","Firma Adı 2"),
       new SelectItem("firma3","Firma Adı 3"),
       new SelectItem("firma4","Firma Adı 4")
   };
   
   private SelectItem[] firma1=new SelectItem[]{
      new SelectItem("urun1","Ürün Adı 001"),
      new SelectItem("urun2","Ürün Adı 002")
   };
   
   private SelectItem[] firma2= new SelectItem[]{
      new SelectItem("urun3","Ürün Adı 003"), 
      new SelectItem("urun4","Ürün Adı 004"), 
      new SelectItem("urun5","Ürün Adı 005"), 
      new SelectItem("urun6","Ürün Adı 006"), 
   };
 
   private SelectItem[]firma3 = new SelectItem[]{
       new SelectItem("urun7","Ürün Adı 007"),
       new SelectItem("urun8","Ürün Adı 008"),
       new SelectItem("urun9","Ürün Adı 009"),
       new SelectItem("urun10","Ürün Adı 010"),
       new SelectItem("urun11","Ürün Adı 011"),
       new SelectItem("urun12","Ürün Adı 012"),
       new SelectItem("urun13","Ürün Adı 013")
   };
   
  private SelectItem[] firma4=new SelectItem[]{
      new SelectItem("urun14","Ürün Adı 014"),
      new SelectItem("urun15","Ürün Adı 015"),
      new SelectItem("urun16","Ürün Adı 016"),
  };
  
private SelectItem urun[]=firma1;
private String firma_adi="firma_adi";
private String urun_no;

    public SelectItem[] getFirma() {
        return firma;
    }

    public void setFirma(SelectItem[] firma) {
        this.firma = firma;
    }

    public SelectItem[] getFirma1() {
        return firma1;
    }

    public void setFirma1(SelectItem[] firma1) {
        this.firma1 = firma1;
    }

    public SelectItem[] getFirma2() {
        return firma2;
    }

    public void setFirma2(SelectItem[] firma2) {
        this.firma2 = firma2;
    }

    public SelectItem[] getFirma3() {
        return firma3;
    }

    public void setFirma3(SelectItem[] firma3) {
        this.firma3 = firma3;
    }

    public SelectItem[] getFirma4() {
        return firma4;
    }

    public void setFirma4(SelectItem[] firma4) {
        this.firma4 = firma4;
    }

    public SelectItem[] getUrun() {
        return urun;
    }

    public void setUrun(AjaxBehaviorEvent event) {
        if(this.firma_adi.equalsIgnoreCase("firma1")){
            this.urun =firma1;
        }
        else if(this.firma_adi.equalsIgnoreCase("firma2")){
            this.urun =firma2;
    }
        else if(this.firma_adi.equalsIgnoreCase("firma3")){
        this.urun =firma3;
    }
        else if(this.firma_adi.equalsIgnoreCase("firma4")){
        this.urun=firma4;
    }
    }

    public String getFirma_adi() {
        return firma_adi;
    }

    public void setFirma_adi(String firma_adi) {
        this.firma_adi = firma_adi;
    }

    public String getUrun_no() {
        return urun_no;
    }

    public void setUrun_no(String urun_no) {
        this.urun_no = urun_no;
    }



}