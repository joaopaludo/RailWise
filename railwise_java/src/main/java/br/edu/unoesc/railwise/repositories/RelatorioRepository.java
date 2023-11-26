package br.edu.unoesc.railwise.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.railwise.entities.Log;
import br.edu.unoesc.railwise.entities.relatorios.Relatorio1;
import br.edu.unoesc.railwise.entities.relatorios.Relatorio2;
import br.edu.unoesc.railwise.entities.relatorios.Relatorio3;
import br.edu.unoesc.railwise.entities.relatorios.Relatorio4;

@Repository
public interface RelatorioRepository extends JpaRepository<Log, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM relatorio_locomotivas_capacidade_vw ")
	List<Relatorio1> getR1();

	@Query(nativeQuery = true, value = "SELECT * FROM relatorio_viagens_2023_vw ")
	List<Relatorio2> getR2();

	@Query(nativeQuery = true, value = "SELECT * FROM relatorio_destinos_com_mais_cargas_vw ")
	List<Relatorio3> getR3();

	@Query(nativeQuery = true, value = "SELECT * FROM viagens_carga_valor_total_vw ")
	List<Relatorio4> getR4();

}
