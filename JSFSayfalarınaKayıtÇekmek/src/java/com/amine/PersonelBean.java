
package com.amine;

import com.mysql.jdbc.Connection;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="yb")
@RequestScoped
public class PersonelBean implements Serializable{

    public PersonelBean() {
    }
    static Connection con = null;
    
    public static Connection veritabaninaBaglantiKur(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/firmaveritabani","root","");
            
            if(!con.isClosed()){
                System.out.println("Veritabanına başarılı olarak bağlandık.");
            }
            else{
                System.out.println("Veritabanına bağlantı kurulamadı.");
            }
            return con;
        }
        catch(Exception e){
            System.out.println("bağlantı kurulma hatası : " + e.getMessage());
            return null;
        }finally{
            System.out.println("Teşekkür ederiz.");
        }
    }
    
    public List<Personel> getPersonelList() throws SQLException{
 
        con= veritabaninaBaglantiKur();
        
        PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM personel");
        
        ResultSet resultSet = preparedStatement.executeQuery();
        
        List<Personel> list = new ArrayList<Personel>();
        
        while(resultSet.next()){
            Personel personel = new Personel();
         personel.setPersonelid(resultSet.getInt("personelid"));
         personel.setPersoneladi(resultSet.getString("personeladi"));
         personel.setPersonelsoyadi(resultSet.getString("personelsoyadi"));
         personel.setPersoneleposta(resultSet.getString("personeleposta"));
         personel.setPersonelgorevi(resultSet.getString("personelgorevi"));
         personel.setPersonelmaasi(resultSet.getString("personelmaasi"));
         
         list.add(personel);
        }
        return list;
    }
}
