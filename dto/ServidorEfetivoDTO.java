package com.example.testepratico.dto;

public class ServidorEfetivoDTO {
    private Integer pesId;
    private Integer seMatricula;

    public ServidorEfetivoDTO() {}

    public ServidorEfetivoDTO(Integer pesId, Integer seMatricula) {
        this.pesId = pesId;
        this.seMatricula = seMatricula;
    }

    public Integer getPesId() { return pesId; }
    public void setPesId(Integer pesId) { this.pesId = pesId; }

    public Integer getSeMatricula() { return seMatricula; }
    public void setSeMatricula(Integer seMatricula) { this.seMatricula = seMatricula; }
}
