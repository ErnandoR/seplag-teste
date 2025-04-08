package com.example.testepratico.controller;

import com.example.testepratico.dto.UnidadeEnderecoDTO;
import com.example.testepratico.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco-funcional")
public class EnderecoFuncionalController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/buscar")
    public Page<UnidadeEnderecoDTO> buscarEnderecoFuncionalPorNome(
            @RequestParam("nome") String nome,
            Pageable pageable
    ) {
        return pessoaService.buscarEnderecoFuncionalPorNome(nome, pageable);
    }
}
