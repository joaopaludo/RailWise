package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.railwise.entities.relatorios.Relatorio1;
import br.edu.unoesc.railwise.entities.relatorios.Relatorio2;
import br.edu.unoesc.railwise.entities.relatorios.Relatorio3;
import br.edu.unoesc.railwise.entities.relatorios.Relatorio4;
import br.edu.unoesc.railwise.repositories.RelatorioRepository;

/**
 * Controller responsável pelos relatórios
 */
@RestController
@RequestMapping("/relatorio")
public class RelatorioController {

	@Autowired
	private RelatorioRepository relatorioRepository;

	/**
	 * Busca as informações do relatório 1
	 * 
	 * @return lista de objetos de Relatorio1, que mapeia as colunas definidas na
	 *         view do relatório 1
	 */
	@GetMapping("/1")
	public ResponseEntity<List<Relatorio1>> relatorio1() {

		List<Relatorio1> r1 = relatorioRepository.getR1();

		return ResponseEntity.ok(r1);
	}

	/**
	 * Busca as informações do relatório 2
	 * 
	 * @return lista de objetos de Relatorio2, que mapeia as colunas definidas na
	 *         view do relatório 2
	 */
	@GetMapping("/2")
	public ResponseEntity<List<Relatorio2>> relatorio2() {

		List<Relatorio2> r2 = relatorioRepository.getR2();

		return ResponseEntity.ok(r2);
	}

	/**
	 * Busca as informações do relatório 3
	 * 
	 * @return lista de objetos de Relatorio3, que mapeia as colunas definidas na
	 *         view do relatório 3
	 */
	@GetMapping("/3")
	public ResponseEntity<List<Relatorio3>> relatorio3() {

		List<Relatorio3> r3 = relatorioRepository.getR3();

		return ResponseEntity.ok(r3);
	}

	/**
	 * Busca as informações do relatório 4
	 * 
	 * @return lista de objetos de Relatorio4, que mapeia as colunas definidas na
	 *         view do relatório 4
	 */
	@GetMapping("/4")
	public ResponseEntity<List<Relatorio4>> relatorio4() {

		List<Relatorio4> r4 = relatorioRepository.getR4();

		return ResponseEntity.ok(r4);
	}

}
