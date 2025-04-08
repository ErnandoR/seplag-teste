package com.exemplo.testepratico.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UnidadeEnderecoId implements Serializable {

    private Integer endId;
    private Integer unidId;

    
}
