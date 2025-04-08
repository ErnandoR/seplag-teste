package com.exemplo.testepratico.model;

import jakarta.persistence.*;

@Entity
@Table(name = "foto_pessoa")
public class FotoPessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fp_id")
    private Integer fpId;

    @Column(name = "pes_id")
    private Integer pesId;

    @Column(name = "fp_data")
    private LocalDate fpData;

    @Column(name = "fp_bucket")
    private String fpBucket;

    @Column(name = "fp_hash")
    private String fpHash;

}
