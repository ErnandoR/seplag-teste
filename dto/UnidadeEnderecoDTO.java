package com.example.testepratico.dto;

public class UnidadeEnderecoDTO {
    private Integer endId;
    private Integer unidId;

    public UnidadeEnderecoDTO() {}

    public UnidadeEnderecoDTO(Integer endId, Integer unidId) {
        this.endId = endId;
        this.unidId = unidId;
    }

    public Integer getEndId() { return endId; }
    public void setEndId(Integer endId) { this.endId = endId; }

    public Integer getUnidId() { return unidId; }
    public void setUnidId(Integer unidId) { this.unidId = unidId; }
}
