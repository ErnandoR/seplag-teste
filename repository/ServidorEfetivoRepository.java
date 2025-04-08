package com.exemplo.testepratico.repository;
import com.exemplo.servidor.dto.ServidorEfetivoDTO;
import com.exemplo.servidor.entity.ServidorEfetivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServidorEfetivoRepository extends JpaRepository<ServidorEfetivo, Integer> {

    /**
     * Lista servidores efetivos lotados em determinada unidade,
     * retornando nome, idade, nome da unidade e hash da foto.
     */
    @Query("""
      SELECT new com.exemplo.servidor.dto.ServidorEfetivoDTO(
        p.pesNome,
        FUNCTION('year', CURRENT_DATE) - FUNCTION('year', p.pesDataNascimento),
        u.unidNome,
        f.fpHash
      )
      FROM Lotacao l
      JOIN l.pessoa p
      JOIN ServidorEfetivo se ON se.pesId = p.pesId
      JOIN l.unidade u
      LEFT JOIN FotoPessoa f ON f.pessoa.pesId = p.pesId
      WHERE u.unidId = :unidId
    """)
    List<ServidorEfetivoDTO> findByUnidadeId(@Param("unidId") Integer unidId);
}
