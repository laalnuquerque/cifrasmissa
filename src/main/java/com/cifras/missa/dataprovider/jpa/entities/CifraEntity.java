package com.cifras.missa.dataprovider.jpa.entities;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cifra")
public class CifraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "musica", nullable = false)
    private String musica;

    @Column(name = "tom", nullable = false)
    private String tom;

    @Column(name = "cantor", nullable = false)
    private String cantor;

}
