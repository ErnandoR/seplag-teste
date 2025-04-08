package com.example.testepratico.dto;

import java.time.LocalDate;

public class LotacaoDTO {
    private Integer lotId;
    private Integer pesId;
    private Integer unidId;
    private LocalDate lotDataLotacao;
    private LocalDate lotDataRemocao;
    private String lotPortaria;

    public LotacaoDTO() {}

    public LotacaoDTO(Integer lotId, Integer pesId, Integer unidId,
                      LocalDate lotDataLotacao, LocalDate lotDataRemocao,
                      String lotPortaria) {
        this.lotId = lotId;
        this.pesId = pesId;
        this.unidId = unidId;
        this.lotDataLotacao = lotDataLotacao;
        this.lotDataRemocao = lotDataRemocao;
        this.lotPortaria = lotPortaria;
    }

    public Integer getLotId() { return lotId; }
    public void setLotId(Integer lotId) { this.lotId = lotId; }

    public Integer getPesId() { return pesId; }
    public void setPesId(Integer pesId) { this.pesId = pesId; }

    public Integer getUnidId() { return unidId; }
    public void setUnidId(Integer unidId) { this.unidId = unidId; }

    public LocalDate getLotDataLotacao() { return lotDataLotacao; }
    public void setLotDataLotacao(LocalDate lotDataLotacao) { this.lotDataLotacao = lotDataLotacao; }

    public LocalDate getLotDataRemocao() { return lotDataRemocao; }
    public void setLotDataRemocao(LocalDate lotDataRemocao) { this.lotDataRemocao = lotDataRemocao; }

    public String getLotPortaria() { return lotPortaria; }
    public void setLotPortaria(String lotPortaria) { this.lotPortaria = lotPortaria; }
}
