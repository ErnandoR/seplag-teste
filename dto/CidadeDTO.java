package com.example.testepratico.dto;

public class CidadeDTO {
    private Integer cidId;
    private String cidNome;
    private String cidUf;

    public CidadeDTO() {}

    public CidadeDTO(Integer cidId, String cidNome, String cidUf) {
        this.cidId = cidId;
        this.cidNome = cidNome;
        this.cidUf = cidUf;
    }

    public Integer getCidId() { return cidId; }
    public void setCidId(Integer cidId) { this.cidId = cidId; }

    public String getCidNome() { return cidNome; }
    public void setCidNome(String cidNome) { this.cidNome = cidNome; }

    public String getCidUf() { return cidUf; }
    public void setCidUf(String cidUf) { this.cidUf = cidUf; }
}
