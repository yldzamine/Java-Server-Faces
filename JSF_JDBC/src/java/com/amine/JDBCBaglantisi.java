package com.amine;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class JDBCBaglantisi {
    static Connection con = null;
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/firmaveritabani","root","");
            if(!con.isClosed()){
                System.out.println("Veritabanına başarılı olarak bağlandık");
            }else{
                System.out.println("Veritabanına bağlantı kurulamadı.");
            }
            PreparedStatement statement = (PreparedStatement)
                    con.prepareStatement("SELECT * FROM personel");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                System.out.println(
                resultSet.getInt(1) + " " + resultSet.getString(2) + " "
              + resultSet.getString(3) + " " + resultSet.getString(4) + " "
              + resultSet.getString(5) + " " + resultSet.getString(6));
            }
            
        }catch(Exception e){
            System.out.println("Tüm kayıtlar alınamadı hata" + e);
        }finally{
            System.out.println("Teşekkür Ederiz");
        }
    }
}
