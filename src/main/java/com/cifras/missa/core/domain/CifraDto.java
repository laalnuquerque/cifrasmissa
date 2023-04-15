package com.cifras.missa.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CifraDto {
    private String musica;
    private String tom;
    private String cantor;
}
