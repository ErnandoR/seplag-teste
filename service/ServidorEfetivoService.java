package com.exemplo.testepratico.service;

import com.exemplo.testepratico.model.ServidorEfetivo;
import com.exemplo.testepratico.repository.ServidorEfetivoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServidorEfetivoService {
    private final ServidorEfetivoRepository repository;

    public ServidorEfetivoService(ServidorEfetivoRepository repository) {
        this.repository = repository;
    }

    public List<ServidorEfetivo> listarTodos() {
        return repository.findAll();
    }

    public ServidorEfetivo salvar(ServidorEfetivo servidorEfetivo) {
        return repository.save(servidorEfetivo);
    }
}
