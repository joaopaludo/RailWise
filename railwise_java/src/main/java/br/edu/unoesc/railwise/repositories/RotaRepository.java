package br.edu.unoesc.railwise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.railwise.entities.Estacao;
import br.edu.unoesc.railwise.entities.Rota;

@Repository
public interface RotaRepository extends JpaRepository<Rota, Long> {

    @Query("DELETE FROM Rota WHERE (estacaoOrigem = :estacaoOrigem AND estacaoDestino = :estacaoDestino) or (estacaoOrigem = :estacaoDestino AND estacaoDestino = :estacaoOrigem)")
    void deleteByEstacaoOrigemAndEstacaoDestino(@Param("estacaoOrigem") Estacao estacaoOrigem,
            @Param("estacaoDestino") Estacao estacaoDestino);
}
