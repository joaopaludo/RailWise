
package br.edu.unoesc.railwise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Aplicação principal - RailWise
 * 
 * @author Fabricio, Gabriel, João Paulo, Luis
 * @version 1.0
 */
@EntityScan(basePackages = "br.edu.unoesc.railwise.entities")
@SpringBootApplication
public class RailwiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(RailwiseApplication.class, args);
    }

}
