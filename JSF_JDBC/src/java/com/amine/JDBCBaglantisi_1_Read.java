
package com.amine;

import static com.amine.JDBCBaglantisi.con;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCBaglantisi_1_Read {
    static Connection con = null;
    
    public static Connection veritabaniBaglantiKur(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firmaveritabani","root","");
            if(!con.isClosed()){
                System.out.println("Veritabanina başarılı olarak bağlandık.");
            }else{
                System.err.println("Veritabanına bağlantı kurulamadı");
            }
       return con;   
    } 
        
        catch(Exception e){
            System.out.println("Bağlantı kurulma hatası" + e);
            return null;
        }finally{
            System.out.println("Yine Bekleriz");
        }
    }       
    
    public String veriOku(){
        veritabaniBaglantiKur();
        String personelbilgisi = "";
        try{
            PreparedStatement statement = (PreparedStatement)
                    con.prepareStatement("SELECT * FROM personel");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                System.out.println(
                resultSet.getInt(1) + " " + resultSet.getString(2) + " "
              + resultSet.getString(3) + " " + resultSet.getString(4) + " "
              + resultSet.getString(5) + " " + resultSet.getString(6));
            
            personelbilgisi = personelbilgisi + "&"
              + resultSet.getInt(1) + "&" + resultSet.getString(2) + " "
              + resultSet.getString(3) + "&" + resultSet.getString(4) + "&"
              + resultSet.getString(5) + " " + resultSet.getString(6);
            }
        }catch (SQLException e){
            System.out.println("tüm kayıtlar alınamadı " + e);
        }
        return personelbilgisi;
    }
    public static void main(String args[]){
        JDBCBaglantisi_1_Read nesne = new JDBCBaglantisi_1_Read();
        nesne.veriOku();
    }
}
