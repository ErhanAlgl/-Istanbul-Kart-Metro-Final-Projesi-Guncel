package com.domain;
import java.time.LocalDate;
import java.util.UUID;

public class yolcu {
    private UUID yolcu_id;
    private String yolcu_adi;
    private String yolcu_soyadi;
    private String yolcu_tipi;
    private String cinsiyet;
    private LocalDate dogum;

    public yolcu() {
    }
    public yolcu(
            UUID yolcu_id,
            String yolcu_adi,
            String yolcu_soyadi,
            String yolcu_tipi,
            String cinsiyet,
            LocalDate dogum
    ) {
        this.yolcu_id = yolcu_id;
        this.yolcu_adi = yolcu_adi;
        this.yolcu_soyadi = yolcu_soyadi;
        this.yolcu_tipi = yolcu_tipi;
        this.cinsiyet = cinsiyet;
        this.dogum=dogum;
    }

    public UUID getYolcu_id() {
        return yolcu_id;
    }
    public void setYolcu_id(UUID yolcu_id) {
        this.yolcu_id = yolcu_id;
    }

    public String getYolcu_adi() {
        return yolcu_adi;
    }
    public void setYolcu_adi(String yolcu_adi) {
        this.yolcu_adi = yolcu_adi;
    }

    public String getYolcu_soyadi() {
        return yolcu_soyadi;
    }
    public void setYolcu_soyadi(String yolcu_soyadi) {
        this.yolcu_soyadi = yolcu_soyadi;
    }

    public String getYolcu_tipi() {
        return yolcu_tipi;
    }
    public void setYolcu_tipi(String yolcu_tipi) {
        this.yolcu_tipi = yolcu_tipi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }
    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public LocalDate getDogum() {
        return dogum;
    }
    public void setDogum(LocalDate dogum) {
        this.dogum = dogum;
    }
    }