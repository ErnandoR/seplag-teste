package com.example.testepratico.dto;

public class UnidadeDTO {
    private Integer unidId;
    private String unidNome;
    private String unidSigla;

    public UnidadeDTO() {}

    public UnidadeDTO(Integer unidId, String unidNome, String unidSigla) {
        this.unidId = unidId;
        this.unidNome = unidNome;
        this.unidSigla = unidSigla;
    }

    public Integer getUnidId() { return unidId; }
    public void setUnidId(Integer unidId) { this.unidId = unidId; }

    public String getUnidNome() { return unidNome; }
    public void setUnidNome(String unidNome) { this.unidNome = unidNome; }

    public String getUnidSigla() { return unidSigla; }
    public void setUnidSigla(String unidSigla) { this.unidSigla = unidSigla; }
}
