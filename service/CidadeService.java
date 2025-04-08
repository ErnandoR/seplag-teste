package com.exemplo.testepratico.service;

import com.exemplo.testepratico.model.Cidade;
import com.exemplo.testepratico.repository.CidadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {
    private final CidadeRepository cidadeRepository;

    public CidadeService(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    public List<Cidade> listarTodas() {
        return cidadeRepository.findAll();
    }

    public Cidade salvar(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }
}
