package com.exemplo.testepratico.repository;
import com.exemplo.servidor.dto.EnderecoDTO;
import com.exemplo.servidor.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

    /**
     * Busca o endereço funcional (da unidade onde o servidor efetivo está lotado)
     * filtrando por parte do nome do servidor.
     */
    @Query("""
      SELECT new com.exemplo.servidor.dto.EnderecoDTO(
        e.endId,
        e.endTipoLogradouro,
        e.endLogradouro,
        e.endNumero,
        e.endBairro,
        c.cidId
      )
      FROM Lotacao l
      JOIN l.unidade u
      JOIN u.enderecos ue        /* via @OneToMany em Unidade para UnidadeEndereco */
      JOIN ue.endereco e
      JOIN e.cidade c
      JOIN l.pessoa p
      WHERE LOWER(p.pesNome) LIKE LOWER(CONCAT('%', :nome, '%'))
    """)
    List<EnderecoDTO> findFunctionalByServidorNome(@Param("nome") String nome);
}
