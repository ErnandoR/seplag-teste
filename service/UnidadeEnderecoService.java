package com.exemplo.testepratico.service;

import com.exemplo.testepratico.model.UnidadeEndereco;
import com.exemplo.testepratico.repository.UnidadeEnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeEnderecoService {
    private final UnidadeEnderecoRepository repository;

    public UnidadeEnderecoService(UnidadeEnderecoRepository repository) {
        this.repository = repository;
    }

    public List<UnidadeEndereco> listarTodos() {
        return repository.findAll();
    }

    public UnidadeEndereco salvar(UnidadeEndereco unidadeEndereco) {
        return repository.save(unidadeEndereco);
    }
}
