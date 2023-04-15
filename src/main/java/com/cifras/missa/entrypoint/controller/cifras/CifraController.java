package com.cifras.missa.entrypoint.controller.cifras;

import com.cifras.missa.core.domain.CifraDto;
import com.cifras.missa.core.usecases.CifraUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Signal;

import java.util.function.Consumer;

@RestController
@RequestMapping("/cifra")
public class CifraController {

    private CifraUseCase cifraUseCase;

    @Autowired
    public CifraController(CifraUseCase cifraUseCase) {
        this.cifraUseCase = cifraUseCase;
    }

    @PostMapping(value = "/{musica}/{tom}/{cantor}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Mono<CifraDto>> cadastrado(@PathVariable(name = "id") String musica,
                                                     @PathVariable(name = "id") String tom,
                                                     @PathVariable(name = "id") String cantor){
        return ResponseEntity.ok(cifraUseCase.cadastarMusica(musica,tom,cantor)
                .doOnEach((Consumer<? super Signal<CifraDto>>) ResponseEntity.status(HttpStatus.BAD_REQUEST)));
    }

    @GetMapping(value = "/{musica}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Mono<CifraDto>> consulta(@PathVariable(name = "id") String musica){
        return ResponseEntity.ok(cifraUseCase.consultarMusica(musica));
    }

}
