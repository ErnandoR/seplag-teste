package com.exemplo.testepratico.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "servidor_temporario")
public class ServidorTemporario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "st_data_admissao")
    private Date dataAdmissao;

    @Column(name = "st_data_demissao")
    private Date dataDemissao;

    @ManyToOne
    @JoinColumn(name = "pes_id", nullable = false)
    private Pessoa pessoa;

    
}
