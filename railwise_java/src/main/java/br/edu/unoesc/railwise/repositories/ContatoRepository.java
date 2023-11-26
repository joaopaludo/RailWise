package br.edu.unoesc.railwise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.railwise.entities.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
