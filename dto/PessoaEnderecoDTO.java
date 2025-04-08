package com.example.testepratico.dto;

public class PessoaEnderecoDTO {
    private Integer pesId;
    private Integer endId;

    public PessoaEnderecoDTO() {}

    public PessoaEnderecoDTO(Integer pesId, Integer endId) {
        this.pesId = pesId;
        this.endId = endId;
    }

    public Integer getPesId() { return pesId; }
    public void setPesId(Integer pesId) { this.pesId = pesId; }

    public Integer getEndId() { return endId; }
    public void setEndId(Integer endId) { this.endId = endId; }
}
