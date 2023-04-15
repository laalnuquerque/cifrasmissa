package com.cifras.missa.core.usecases;

import com.cifras.missa.core.domain.CifraDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CifraUseCase {

    public Mono<CifraDto> consultarMusica(String musica){
        return null;
    }

    public Mono<CifraDto> cadastarMusica(String musica,String tom,String cantor){
        return null;
    }
}
