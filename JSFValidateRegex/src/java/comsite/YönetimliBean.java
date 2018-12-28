/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comsite;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Amine Yıldız
 */
@ManagedBean(name="yb")
@RequestScoped
public class YönetimliBean {

    public YönetimliBean() {
    }
    private String eposta;

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
}
