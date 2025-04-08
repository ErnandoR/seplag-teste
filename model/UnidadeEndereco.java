package com.exemplo.testepratico.model;

import jakarta.persistence.*;

@Entity
@Table(name = "unidade_endereco")
public class UnidadeEndereco {

    @EmbeddedId
    private UnidadeEnderecoId id;

    @ManyToOne
    @MapsId("endId")
    @JoinColumn(name = "end_id")
    private Endereco endereco;

    @ManyToOne
    @MapsId("unidId")
    @JoinColumn(name = "unid_id")
    private Unidade unidade;

}
