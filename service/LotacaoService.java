package com.exemplo.testepratico.service;

import com.exemplo.testepratico.model.Lotacao;
import com.exemplo.testepratico.repository.LotacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LotacaoService {
    private final LotacaoRepository repository;

    public LotacaoService(LotacaoRepository repository) {
        this.repository = repository;
    }

    public List<Lotacao> listarTodas() {
        return repository.findAll();
    }

    public Lotacao salvar(Lotacao lotacao) {
        return repository.save(lotacao);
    }
}
