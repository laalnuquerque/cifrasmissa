package com.cifras.missa.dataprovider.jpa.repository;

import com.cifras.missa.core.domain.dto.CifraDto;
import com.cifras.missa.dataprovider.jpa.entities.CifraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import java.util.List;

@Repository
public interface CifraRepository extends JpaRepository<CifraEntity, Long> {
    Mono<List<CifraDto>> findAllByMusica(String musica);
}
