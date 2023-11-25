package br.edu.unoesc.railwise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.railwise.entities.Viagem;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {

}
