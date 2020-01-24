package com.domain;
import java.util.UUID;

public class kart {
    private UUID kart_id;
    private int bakiye;
    private String kart_turu;

    public kart() {
    }

    public kart(
            UUID kart_id,
            int bakiye,
            String kart_turu
    ) {
        this.kart_id = kart_id;
        this.bakiye = bakiye;
        this.kart_turu = kart_turu;
    }
    public UUID getKart_id() { return kart_id; }
    public int getBakiye() { return bakiye; }
    public String getKart_turu() { return kart_turu; }
    public void setBakiye(int bakiye) { this.bakiye = bakiye; }
    public void setKart_id(UUID kart_id) { this.kart_id = kart_id; }
    public void setKart_turu(String kart_turu) { this.kart_turu = kart_turu; }
}