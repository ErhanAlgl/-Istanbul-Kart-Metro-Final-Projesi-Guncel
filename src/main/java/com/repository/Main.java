package com.repository;
import net.bytebuddy.asm.Advice;

import java.time.LocalDateTime;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Main {

    static Connection con;

    public static void main(String[] args) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/istanbulkart", "root", "a7121523S");
        } catch (Exception e) {
            System.out.println(e);
        }
        Scanner scan = new Scanner(System.in);
        int secim;

        while (true) {
            System.out.println("1-Yolcu Bilgileri");
            System.out.println("2-Kart Bilgileri");
            System.out.println("3-Turnike Bilgileri");
            System.out.println("4-İstasyon Bilgileri");
            secim = scan.nextInt();

            if (secim == 1) YolcuEkle();
            if (secim == 2) KartEkle();
            if (secim == 3) TurnikeEkle();
            if (secim == 4) İstasyonEkle();
            if (secim == 5) {
                try {
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }

                break;
            }
        }
    }

    public static void YolcuEkle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yeni Yolcu ID    :");
        Integer yolcu_id = scan.nextInt();
        System.out.print("Yeni Yolcu Adı    :");
        String yolcu_adi = scan.next();
        System.out.print("Yeni Yolcu Soyadı :");
        String yolcu_soyadi = scan.next();
        System.out.print("Yeni Yolcu Tipi :");
        String yolcu_tipi = scan.next();
        System.out.print("Yeni Cinsiyet :");
        String cinsiyet = scan.next();
        System.out.print("Yeni Doğum :");
        String dogum = scan.next();
        try {
            Statement stmt = con.createStatement();
            String sql = String.format("INSERT INTO yolcu values( '%d', '%s', '%s','%s','%s','%s')", yolcu_id, yolcu_adi, yolcu_soyadi, yolcu_tipi, cinsiyet, dogum);
            int ekleme = stmt.executeUpdate(sql);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void KartEkle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yeni Kart ID    :");
        Integer kart_id = scan.nextInt();
        System.out.print("Yeni Bakiye    :");
        Integer bakiye = scan.nextInt();
        System.out.print("Yeni Kart Türü :");
        String kart_turu = scan.next();
        try {
            Statement stmt = con.createStatement();
            String sql = String.format("INSERT INTO kart values( '%d', '%d', '%s')", kart_id, bakiye, kart_turu);
            int ekleme1 = stmt.executeUpdate(sql);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void TurnikeEkle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yeni Turnike ID    :");
        Integer turnike_id = scan.nextInt();
        System.out.print("Yeni Giriş Zamanı    :");
        String giris = scan.next();
        System.out.print("Yeni Çıkış Zamanı :");
        String cikis = scan.next();
        System.out.print("Yeni İade :");
        Integer iade = scan.nextInt();
        try {
            Statement stmt = con.createStatement();
            String sql = String.format("INSERT INTO turnike values( '%d', '%s', '%s','%d')", turnike_id, giris, cikis, iade);
            int ekleme2 = stmt.executeUpdate(sql);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void İstasyonEkle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yeni İstasyon ID    :");
        Integer istasyon_id = scan.nextInt();
        System.out.print("Yeni İstasyon Adı    :");
        String istasyon_adi = scan.next();

        try {
            Statement stmt = con.createStatement();
            String sql = String.format("INSERT INTO istasyon values( '%d', '%s')", istasyon_id, istasyon_adi);
            int ekleme2 = stmt.executeUpdate(sql);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}