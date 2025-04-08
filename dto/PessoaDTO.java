package com.example.testepratico.dto;

import java.time.LocalDate;

public class PessoaDTO {
    private Integer pesId;
    private String pesNome;
    private LocalDate pesDataNascimento;
    private String pesSexo;
    private String pesMae;
    private String pesPai;

    public PessoaDTO() {}

    public PessoaDTO(Integer pesId, String pesNome, LocalDate pesDataNascimento,
                     String pesSexo, String pesMae, String pesPai) {
        this.pesId = pesId;
        this.pesNome = pesNome;
        this.pesDataNascimento = pesDataNascimento;
        this.pesSexo = pesSexo;
        this.pesMae = pesMae;
        this.pesPai = pesPai;
    }

    public Integer getPesId() { return pesId; }
    public void setPesId(Integer pesId) { this.pesId = pesId; }

    public String getPesNome() { return pesNome; }
    public void setPesNome(String pesNome) { this.pesNome = pesNome; }

    public LocalDate getPesDataNascimento() { return pesDataNascimento; }
    public void setPesDataNascimento(LocalDate pesDataNascimento) { this.pesDataNascimento = pesDataNascimento; }

    public String getPesSexo() { return pesSexo; }
    public void setPesSexo(String pesSexo) { this.pesSexo = pesSexo; }

    public String getPesMae() { return pesMae; }
    public void setPesMae(String pesMae) { this.pesMae = pesMae; }

    public String getPesPai() { return pesPai; }
    public void setPesPai(String pesPai) { this.pesPai = pesPai; }
}
