package com.domain;
import java.util.UUID;

public class seyehat {
    private UUID seyehat_id;
    private UUID yolcu_id;
    private UUID turnike_id;
    private UUID kart_id;
    private UUID istasyon_id;
    private int ucret;

    public seyehat() {
    }
    public seyehat(
            UUID seyehat_id,
            UUID yolcu_id,
            UUID turnike_id,
            UUID kart_id,
            UUID istasyon_id,
            int ucret
    ) {
        this.seyehat_id = seyehat_id;
        this.yolcu_id = yolcu_id;
        this.turnike_id = turnike_id;
        this.kart_id = kart_id;
        this.istasyon_id = istasyon_id;
        this.ucret = ucret;
    }

    public UUID getSeyehat_id() {
        return seyehat_id;
    }
    public void setSeyehat_id(UUID seyehat_id) {
        this.seyehat_id = seyehat_id;
    }

    public UUID getYolcu_id() {
        return yolcu_id;
    }
    public void setYolcu_id(UUID yolcu_id) {
        this.yolcu_id = yolcu_id;
    }

    public UUID getTurnike_id() {
        return turnike_id;
    }
    public void setTurnike_id(UUID turnike_id) {
        this.turnike_id = turnike_id;
    }

    public UUID getKart_id() {
        return kart_id;
    }
    public void setKart_id(UUID kart_id) {
        this.kart_id = kart_id;
    }

    public UUID getIstasyon_id() {
        return istasyon_id;
    }
    public void setIstasyon_id(UUID istasyon_id) {
        this.istasyon_id = istasyon_id;
    }

    public int getUcret() {
        return ucret;
    }
}