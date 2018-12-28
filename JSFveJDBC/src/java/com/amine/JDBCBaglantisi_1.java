
package com.amine;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class JDBCBaglantisi_1 {

    static Connection con = null;
   
     public static void main(String args[]){
       JDBCBaglantisi_1 nesne =new JDBCBaglantisi_1();
       nesne.veriOku();
   }
   public static Connection veritabaninaBaglantiKur(){
       
       try{
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firmaveritabani","aminiko","123bilgisayar");
           
           if(!con.isClosed()){
                System.out.println("veritabanına başarılı olarak bağlandık");
           }
           else{
               System.err.println("Veritabanına bağlantı kurulamadı.");
           }
           return con;
       }
        catch(Exception e){
             System.out.println("Bağlantı kurulma hatası :" + e.getMessage());
             return null;
  }
       finally{
           System.out.println("Teşekkür ederiz");
       }
}
   public String veriOku(){
       veritabaninaBaglantiKur();
       String personelBilgisi = "";
       try{
           PreparedStatement statement = (PreparedStatement)
                   con.prepareStatement("SELECT * FROM personel");
           ResultSet resultSet = statement.executeQuery();
           
           while(resultSet.next()){
               System.out.println(
               resultSet.getInt(1)  + "" + resultSet.getString(2) + ""
             + resultSet.getString(3) + "" + resultSet.getString(4)+ ""
             + resultSet.getString(5) + "" + resultSet.getString(6));
               
               personelBilgisi = personelBilgisi + "&"
                       + resultSet.getInt(1)  + "&" + resultSet.getString(2) + " "
                       + resultSet.getString(3) + "&" + resultSet.getString(4) + "&"
                       + resultSet.getString(5) + " " + resultSet.getString(6);
           }
       }
       catch(SQLException e){
           System.out.println("tüm kayıtlar alınamadı. Hata: " + e);
       }
       return personelBilgisi;
   }
   
  
}