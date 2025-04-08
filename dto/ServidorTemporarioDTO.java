package com.example.testepratico.dto;

import java.time.LocalDate;

public class ServidorTemporarioDTO {
    private Integer id;
    private LocalDate stDataAdmissao;
    private LocalDate stDataDemissao;
    private Integer pesId;

    public ServidorTemporarioDTO() {}

    public ServidorTemporarioDTO(Integer id, LocalDate stDataAdmissao,
                                 LocalDate stDataDemissao, Integer pesId) {
        this.id = id;
        this.stDataAdmissao = stDataAdmissao;
        this.stDataDemissao = stDataDemissao;
        this.pesId = pesId;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public LocalDate getStDataAdmissao() { return stDataAdmissao; }
    public void setStDataAdmissao(LocalDate stDataAdmissao) { this.stDataAdmissao = stDataAdmissao; }

    public LocalDate getStDataDemissao() { return stDataDemissao; }
    public void setStDataDemissao(LocalDate stDataDemissao) { this.stDataDemissao = stDataDemissao; }

    public Integer getPesId() { return pesId; }
    public void setPesId(Integer pesId) { this.pesId = pesId; }
}
