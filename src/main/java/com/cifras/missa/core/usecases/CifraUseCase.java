package com.cifras.missa.core.usecases;

import com.cifras.missa.core.domain.dto.CifraDto;
import com.cifras.missa.dataprovider.jpa.repository.CifraRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CifraUseCase {

    private final CifraRepository cifraRepository;

    public CifraUseCase(CifraRepository cifraRepository) {
        this.cifraRepository = cifraRepository;
    }

    public Mono<List<CifraDto>> consultarMusica(String musica){
        return cifraRepository.findAllByMusica(musica);
    }

    public Mono<CifraDto> cadastarMusica(String musica,String tom,String cantor){
        return null;
    }
}
