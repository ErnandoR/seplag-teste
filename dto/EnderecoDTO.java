package com.example.testepratico.dto;

public class EnderecoDTO {
    private Integer endId;
    private String endTipoLogradouro;
    private String endLogradouro;
    private Integer endNumero;
    private String endBairro;
    private Integer cidId;

    public EnderecoDTO() {}

    public EnderecoDTO(Integer endId, String endTipoLogradouro, String endLogradouro,
                       Integer endNumero, String endBairro, Integer cidId) {
        this.endId = endId;
        this.endTipoLogradouro = endTipoLogradouro;
        this.endLogradouro = endLogradouro;
        this.endNumero = endNumero;
        this.endBairro = endBairro;
        this.cidId = cidId;
    }

    public Integer getEndId() { return endId; }
    public void setEndId(Integer endId) { this.endId = endId; }

    public String getEndTipoLogradouro() { return endTipoLogradouro; }
    public void setEndTipoLogradouro(String endTipoLogradouro) { this.endTipoLogradouro = endTipoLogradouro; }

    public String getEndLogradouro() { return endLogradouro; }
    public void setEndLogradouro(String endLogradouro) { this.endLogradouro = endLogradouro; }

    public Integer getEndNumero() { return endNumero; }
    public void setEndNumero(Integer endNumero) { this.endNumero = endNumero; }

    public String getEndBairro() { return endBairro; }
    public void setEndBairro(String endBairro) { this.endBairro = endBairro; }

    public Integer getCidId() { return cidId; }
    public void setCidId(Integer cidId) { this.cidId = cidId; }
}
