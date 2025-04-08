package com.exemplo.testepratico.repository;
import com.exemplo.servidor.entity.UnidadeEndereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeEnderecoRepository extends JpaRepository<UnidadeEndereco, Void> {
    // Se sua PK for composta, use @EmbeddedId e ajuste o tipo genérico acima.
}
