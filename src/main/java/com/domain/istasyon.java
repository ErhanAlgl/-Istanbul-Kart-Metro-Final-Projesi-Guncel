package com.domain;

import java.util.UUID;

public class istasyon {
    private UUID istasyon_id;
    private String istasyon_adi;

    public istasyon() {
    }

    public istasyon(
            UUID istasyon_id,
            String istasyon_adi
            ) {
        this.istasyon_id = istasyon_id;
        this.istasyon_adi = istasyon_adi;
    }

    public UUID getIstasyon_id() { return istasyon_id; }
    public void setId(UUID istasyon_id) { this.istasyon_id = istasyon_id; }

    public String getIstasyon_adi() { return istasyon_adi; }
    public void setIstasyon_adi(String istasyon_adi) { this.istasyon_adi = istasyon_adi; }
}