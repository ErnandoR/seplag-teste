package com.exemplo.testepratico.service;

import com.exemplo.testepratico.model.Unidade;
import com.exemplo.testepratico.repository.UnidadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeService {
    private final UnidadeRepository unidadeRepository;

    public UnidadeService(UnidadeRepository unidadeRepository) {
        this.unidadeRepository = unidadeRepository;
    }

    public List<Unidade> listarTodas() {
        return unidadeRepository.findAll();
    }

    public Unidade salvar(Unidade unidade) {
        return unidadeRepository.save(unidade);
    }
}
