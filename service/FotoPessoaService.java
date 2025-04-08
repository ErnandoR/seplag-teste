package com.exemplo.testepratico.service;

import com.exemplo.testepratico.model.FotoPessoa;
import com.exemplo.testepratico.repository.FotoPessoaRepository;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class FotoPessoaService {

    private final FotoPessoaRepository repository;
    private final MinioClient minioClient;

    @Value("${minio.bucket}")
    private String bucket;

    public FotoPessoaService(FotoPessoaRepository repository, MinioClient minioClient) {
        this.repository = repository;
        this.minioClient = minioClient;
    }

    public List<FotoPessoa> listarTodas() {
        return repository.findAll();
    }

    public FotoPessoa salvarFoto(MultipartFile file, int pesId) {
        try {
            String hash = UUID.randomUUID().toString();
            String nomeArquivo = hash + "_" + file.getOriginalFilename();

            InputStream inputStream = file.getInputStream();

            minioClient.putObject(
                PutObjectArgs.builder()
                    .bucket(bucket)
                    .object(nomeArquivo)
                    .stream(inputStream, file.getSize(), -1)
                    .contentType(file.getContentType())
                    .build()
            );

            FotoPessoa foto = new FotoPessoa();
            foto.setFpBucket(bucket);
            foto.setFpHash(nomeArquivo);
            foto.setFpData(LocalDate.now());
            foto.setPesId(pesId);

            return repository.save(foto);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar a foto no MinIO: " + e.getMessage(), e);
        }
    }
}
