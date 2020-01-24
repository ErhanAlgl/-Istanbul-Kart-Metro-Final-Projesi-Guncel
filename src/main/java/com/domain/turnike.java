package com.domain;
import java.time.LocalDateTime;
import java.util.UUID;

public class turnike {
    private UUID turnike_id;
    private LocalDateTime giris;
    private LocalDateTime cikis;
    private int iade;

    public turnike() {
    }
    public turnike(
            UUID turnike_id,
            LocalDateTime giris,
            LocalDateTime cikis,
            int iade
    ) {
        this.turnike_id = turnike_id;
        this.giris = giris;
        this.cikis = cikis;
        this.iade = iade;
    }

    public UUID getTurnike_id() {return turnike_id;}
    public void setTurnike_id(UUID turnike_id) { this.turnike_id = turnike_id; }


    public LocalDateTime getGiris() {return giris;}
    public void setGiris(LocalDateTime giris) { this.giris = giris; }


    public void setCikis(LocalDateTime cikis) { this.cikis = cikis; }
    public LocalDateTime getCikis() {return cikis;}


    public void setIade(int iade) {this.iade = iade;}
    private int getIade() { return iade; }

}