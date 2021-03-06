package com.generation.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.farmacia.model.Categoria;
import com.generation.farmacia.repository.CategoriaRepository;

/**
 * @author Cesar Augusto
 * @author Pedro Lucas
 * @version 0.0.1
 * @since 0.0.1 - 25/01/2022 
 * 
 * Desenvolvimento da Categoria Controller, endpoints pros métodos getAll, getbyId, getByNomeCategoria, post, put e delete.
 * 
 * */ 

@RestController
@RequestMapping ("/categoria")
@CrossOrigin ("*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{idcategoria}")
	public ResponseEntity<Categoria> GetById(@PathVariable long idcategoria) {
		return repository.findById(idcategoria).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nomecategoria/{nomecategoria}")
	public ResponseEntity<List<Categoria>> GetByNomeCategoria (@PathVariable String nomecategoria) {
		return ResponseEntity.ok(repository.findAllByNomeCategoriaContainingIgnoreCase(nomecategoria));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> put(@RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
