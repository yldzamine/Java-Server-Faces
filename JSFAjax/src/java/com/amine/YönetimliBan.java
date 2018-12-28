
package com.amine;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Amine YILDIZ.
 */
@ManagedBean(name="yb")
@RequestScoped
public class YönetimliBan {

    public YönetimliBan() {
    }
    String adi,soyadi;

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
}
