package com.exemplo.testepratico.service;

import com.exemplo.testepratico.model.ServidorTemporario;
import com.exemplo.testepratico.repository.ServidorTemporarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServidorTemporarioService {
    private final ServidorTemporarioRepository repository;

    public ServidorTemporarioService(ServidorTemporarioRepository repository) {
        this.repository = repository;
    }

    public List<ServidorTemporario> listarTodos() {
        return repository.findAll();
    }

    public ServidorTemporario salvar(ServidorTemporario servidorTemporario) {
        return repository.save(servidorTemporario);
    }
}
