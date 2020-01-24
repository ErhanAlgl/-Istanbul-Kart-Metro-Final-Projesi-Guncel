package com.DTOgüncelveritabaninaerisme;

import java.sql.*;

public class eklenenyolcular {
    // JDBC driver ve Veritabanı URL
    static final String DB_URL = "jdbc:mysql://localhost:3306/istanbulkart";
    // Veritabanı kullanıcı adı ve şifresi
    static final String USER = "root";
    static final String PASS = "a7121523S";
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
// Baglantı acılır.
            System.out.println("Veritabanina baglaniliyor...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Baglanti basarili...");
// Sorgular calıstırlır.
            System.out.println("Deyim oluşturuluyor...");
            stmt = conn.createStatement();
            String sql = "SELECT yolcu_id, yolcu_adi, yolcu_soyadi, yolcu_tipi, cinsiyet, dogum" + " FROM yolcu";
            ResultSet rs = stmt.executeQuery(sql);
            // Veriler ayıklanır.
            while(rs.next()){
                // Sutunlara göre degerlerı alıyoruz
                int id  = rs.getInt("yolcu_id");
                String tipi = rs.getString("yolcu_tipi");
                String adi = rs.getString("yolcu_adi");
                String soyadi = rs.getString("yolcu_soyadi");
                String cinsiyet = rs.getString("cinsiyet");
                String dogum = rs.getString("dogum");
// Verileri görüntüle - yaz
                System.out.print("ID: " + id);
                System.out.print(", Yolcu_tipi: " + tipi);
                System.out.print(", Adı: " + adi);
                System.out.println(", Soyadı: " + soyadi);
                System.out.println(", Cinsiyet: " + cinsiyet);
                System.out.println(", Dogum: " + dogum);
            }
            rs.close();
        }catch(SQLException se){
            se.printStackTrace();

        }catch(Exception e){
            e.printStackTrace();

        }finally{
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Gule gule!");
    }
}
