package com.exemplo.testepratico.service;

import com.exemplo.testepratico.model.PessoaEndereco;
import com.exemplo.testepratico.repository.PessoaEnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaEnderecoService {
    private final PessoaEnderecoRepository repository;

    public PessoaEnderecoService(PessoaEnderecoRepository repository) {
        this.repository = repository;
    }

    public List<PessoaEndereco> listarTodos() {
        return repository.findAll();
    }

    public PessoaEndereco salvar(PessoaEndereco pessoaEndereco) {
        return repository.save(pessoaEndereco);
    }
}
