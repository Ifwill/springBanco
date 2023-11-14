package br.com.example.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.banco.model.Motorista;
import br.com.example.banco.repository.MotoristaRepository;

@RestController
@RequestMapping("/motoristas")
public class MotoristaController {
	
	@Autowired
	private MotoristaRepository motoristaRepository;
	
	@GetMapping
	public Iterable<Motorista> buscarMotorista(){
		return motoristaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Motorista buscarMotoristaPorId(@PathVariable Integer id) {
		return motoristaRepository.findById(id).orElse(null);
	}
	
	@GetMapping("/nome{nome}")
	public Iterable<Motorista> buscarMotoristaPorNome(@PathVariable String nome){
		return motoristaRepository.findByName(nome);
	}
	
	@PostMapping
	public Motorista adicionarMotorista(@RequestBody Motorista motorista) {
		return motoristaRepository.save(motorista);
	}
	
	@PutMapping("/{id}")
	public Motorista atualizarMotorista(@PathVariable Integer id, @RequestBody Motorista motorista) {
		return motoristaRepository.save(motorista);
	}
	
	@DeleteMapping("/{id}")
	public void deletaMotorista(@PathVariable Integer id) {
		motoristaRepository.deleteById(id);
	}
	
}
