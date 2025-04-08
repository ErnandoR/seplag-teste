package com.example.testepratico.controller;

import com.example.testepratico.dto.ServidorEfetivoDTO;
import com.example.testepratico.service.ServidorEfetivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servidores-efetivos")
public class ServidorEfetivoController {

    @Autowired
    private ServidorEfetivoService service;

    @PostMapping
    public ResponseEntity<ServidorEfetivoDTO> criar(@RequestBody ServidorEfetivoDTO dto) {
        return ResponseEntity.ok(service.criar(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServidorEfetivoDTO> atualizar(@PathVariable Long id, @RequestBody ServidorEfetivoDTO dto) {
        return ResponseEntity.ok(service.atualizar(id, dto));
    }

    @GetMapping
    public ResponseEntity<Page<ServidorEfetivoDTO>> listar(Pageable pageable) {
        return ResponseEntity.ok(service.listar(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServidorEfetivoDTO> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/por-unidade/{unidadeId}")
    public ResponseEntity<List<ServidorEfetivoDTO>> porUnidade(@PathVariable Long unidadeId) {
        return ResponseEntity.ok(service.buscarPorUnidade(unidadeId));
    }

    @GetMapping("/endereco-funcional")
    public ResponseEntity<List<String>> buscarEnderecoFuncionalPorNome(@RequestParam String nome) {
        return ResponseEntity.ok(service.buscarEnderecosFuncionais(nome));
    }
}
