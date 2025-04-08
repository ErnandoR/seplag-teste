package com.example.testepratico.dto;

import java.time.LocalDate;

public class FotoPessoaDTO {
    private Integer fpId;
    private Integer pesId;
    private LocalDate fpData;
    private String fpBucket;
    private String fpHash;

    public FotoPessoaDTO() {}

    public FotoPessoaDTO(Integer fpId, Integer pesId, LocalDate fpData,
                         String fpBucket, String fpHash) {
        this.fpId = fpId;
        this.pesId = pesId;
        this.fpData = fpData;
        this.fpBucket = fpBucket;
        this.fpHash = fpHash;
    }

    public Integer getFpId() { return fpId; }
    public void setFpId(Integer fpId) { this.fpId = fpId; }

    public Integer getPesId() { return pesId; }
    public void setPesId(Integer pesId) { this.pesId = pesId; }

    public LocalDate getFpData() { return fpData; }
    public void setFpData(LocalDate fpData) { this.fpData = fpData; }

    public String getFpBucket() { return fpBucket; }
    public void setFpBucket(String fpBucket) { this.fpBucket = fpBucket; }

    public String getFpHash() { return fpHash; }
    public void setFpHash(String fpHash) { this.fpHash = fpHash; }
}
