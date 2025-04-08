package com.exemplo.testepratico.model;

import jakarta.persistence.*;

@Entity
@Table(name = "servidor_efetivo")
public class ServidorEfetivo {

    @Id
    @Column(name = "pes_id")
    private Integer id;

    @Column(name = "se_matricula")
    private Integer matricula;

    @OneToOne
    @MapsId
    @JoinColumn(name = "pes_id")
    private Pessoa pessoa;

}
