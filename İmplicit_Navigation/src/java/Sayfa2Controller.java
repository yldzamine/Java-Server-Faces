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
public class Sayfa2Controller  implements Serializable{

    /**
     * Creates a new instance of Sayfa2Controller
     */
    public String sayfa2yiAc(){
        return "sayfa2";
    }
    
    public Sayfa2Controller() {
    }
    
}
