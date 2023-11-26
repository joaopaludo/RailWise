package br.edu.unoesc.railwise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.railwise.entities.TipoVagao;

@Repository
public interface TipoVagaoRepository extends JpaRepository<TipoVagao, Integer> {

}
