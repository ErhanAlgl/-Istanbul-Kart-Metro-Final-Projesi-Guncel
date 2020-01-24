package com.controller;
import com.domain.istasyon;
import com.repository.IstasyonRepository;
import java.util.UUID;

public class SeyehatKontrol {

    private IstasyonRepository stationRepository;

    public istasyon save(istasyon istasyon) {
        if (istasyon.getIstasyon_id() == null) {
            istasyon.setId(UUID.randomUUID());
        }
        return IstasyonRepository.save(istasyon);
    }
}
