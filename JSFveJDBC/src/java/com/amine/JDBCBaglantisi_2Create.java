
package com.amine;

import static com.amine.JDBCBaglantisi_1.con;
import static com.amine.JDBCBaglantisi_1.veritabaninaBaglantiKur;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class JDBCBaglantisi_2Create {
    
      public void veriEkle(String personeladi, String personelsoyadi, 
              String personeleposta, String personelgorevi, String personelmaasi){
          veritabaninaBaglantiKur();
          String durumbilgisi="";
          try{
              String eklemeSorgusu = ("INSERT INTO personel "
                      + "(personeladi, personelsoyadi, "
                      + "personeleposta, personelgorevi, personelmaasi) "
                      + "VALUES (?,?,?,?,?)");
              
              PreparedStatement preparedStatement = con.prepareStatement(eklemeSorgusu);
                        preparedStatement.setString(1, personeladi);
                        preparedStatement.setString(2, personelsoyadi);
                        preparedStatement.setString(3,personeleposta);
                        preparedStatement.setString(4, personelgorevi);
                        preparedStatement.setString(5, personelmaasi);
                        boolean resultSet = preparedStatement.execute();
                        if(resultSet){
                            durumbilgisi = "Ekleme işlemi başarısız!";
                        }else{
                            durumbilgisi = "Tebrikler Ekleme işlemi başarılı bir şekilde tamamlandı.";
                        }
          }
          catch(SQLException e){
              System.out.println("hata :" + e);
          }
          System.out.println(durumbilgisi);
      }
      public static void main(String args[]){
          JDBCBaglantisi_2Create nesne = new JDBCBaglantisi_2Create();
          JDBCBaglantisi_1 nesne1=new JDBCBaglantisi_1();
       nesne1.veriOku();
      
          nesne.veriEkle("muhammed","gedikli", "mg@gmail.com","inşaat mühendisi","3000");
          nesne1.veriOku();
      }
           
}
