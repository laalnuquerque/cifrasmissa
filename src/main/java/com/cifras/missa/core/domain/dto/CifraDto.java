package com.cifras.missa.core.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CifraDto {
    private Long id;
    private String musica;
    private String tom;
    private String cantor;
}
