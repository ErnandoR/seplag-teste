package com.exemplo.testepratico.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lotacao")
public class Lotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lot_id")
    private Integer id;

    @Column(name = "lot_data_lotacao")
    private Date dataLotacao;

    @Column(name = "lot_data_remocao")
    private Date dataRemocao;

    @Column(name = "lot_portaria")
    private String portaria;

    @ManyToOne
    @JoinColumn(name = "pes_id", nullable = false)
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "unid_id", nullable = false)
    private Unidade unidade;

}
