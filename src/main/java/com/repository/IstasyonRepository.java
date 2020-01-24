package com.repository;

import com.repository.IstasyonRepository;
import com.domain.istasyon;
import java.util.UUID;

public interface IstasyonRepository {

    static istasyon save(istasyon station) {
        return null;
    }

    istasyon update(istasyon station);
    istasyon findOne(UUID stationId);
    Void delete(istasyon station);
    istasyon findByName(String name);
}
