package br.com.example.banco.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.example.banco.model.Carro;
import br.com.example.banco.model.Motorista;

public interface MotoristaRepository extends CrudRepository<Motorista, Integer> {
	@Query("SELECT c FROM motorista c WHERE c.nome LIKE %:nome%")
	Iterable<Motorista> findByName(String nome);
}
