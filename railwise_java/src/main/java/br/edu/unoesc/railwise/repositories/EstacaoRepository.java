package br.edu.unoesc.railwise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.railwise.entities.Estacao;

@Repository
public interface EstacaoRepository extends JpaRepository<Estacao, Integer> {

}
