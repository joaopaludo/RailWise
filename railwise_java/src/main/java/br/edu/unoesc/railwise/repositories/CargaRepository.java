package br.edu.unoesc.railwise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.railwise.entities.Carga;

@Repository
public interface CargaRepository extends JpaRepository<Carga, Integer> {

}
