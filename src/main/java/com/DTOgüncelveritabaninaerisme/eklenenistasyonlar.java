package com.DTOgüncelveritabaninaerisme;
import java.sql.*;

public class eklenenistasyonlar {
            // JDBC driver ve Veritabanı URL
        static final String DB_URL = "jdbc:mysql://localhost:3306/istanbulkart";
        // Veritabanı kullanıcı adı ve şifresi
        static final String USER = "root";
        static final String PASS = "a7121523S";

        public static void main(String[] args) {
            Connection conn = null;
            Statement stmt = null;
            try {
// Baglantı acılır.
                System.out.println("Veritabanina baglaniliyor...");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println("Baglanti basarili...");
// Sorgular calıstırlır.
                System.out.println("Deyim oluşturuluyor...");
                stmt = conn.createStatement();
                String sql = "SELECT istasyon_id, istasyon_adi " + " FROM istasyon";
                ResultSet rs = stmt.executeQuery(sql);
                // Veriler ayıklanır.
                while (rs.next()) {
                    // Sutunlara göre degerlerı alıyoruz
                    int id = rs.getInt("turnike_id");
                    String adi = rs.getString("istasyon_adi");


// Verileri görüntüle - yaz
                    System.out.print("ID: " + id);
                    System.out.print(", Bakiye: " + adi);
                }
                rs.close();
            } catch (SQLException se) {
                se.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();

            } finally {
                try {
                    if (stmt != null)
                        conn.close();
                } catch (SQLException se) {
                }
                try {
                    if (conn != null)
                        conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            System.out.println("Gule gule!");
        }
    }