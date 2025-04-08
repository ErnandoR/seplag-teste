package com.example.testepratico.controller;

import com.example.testepratico.service.FotoPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/fotografias")
public class FotografiaController {

    @Autowired
    private FotoPessoaService service;

    @PostMapping("/{pessoaId}/upload")
    public ResponseEntity<String> upload(@PathVariable Long pessoaId, @RequestParam("file") MultipartFile file) {
        String fotoId = service.salvarFoto(pessoaId, file);
        return ResponseEntity.ok(fotoId);
    }

    @GetMapping("/{fotoId}")
    public ResponseEntity<String> obterLinkTemporario(@PathVariable String fotoId) {
        String urlTemporaria = service.getLinkTemporario(fotoId);
        return ResponseEntity.ok(urlTemporaria);
    }
}
