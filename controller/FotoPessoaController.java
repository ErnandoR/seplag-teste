package com.exemplo.testepratico.controller;

import com.exemplo.testepratico.model.FotoPessoa;
import com.exemplo.testepratico.service.FotoPessoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/fotos")
public class FotoPessoaController {

    private final FotoPessoaService service;

    public FotoPessoaController(FotoPessoaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FotoPessoa>> listar() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @PostMapping("/upload")
    public ResponseEntity<FotoPessoa> uploadFoto(
            @RequestParam("arquivo") MultipartFile arquivo,
            @RequestParam("pesId") int pesId
    ) {
        FotoPessoa salva = service.salvarFoto(arquivo, pesId);
        return ResponseEntity.ok(salva);
    }
}
