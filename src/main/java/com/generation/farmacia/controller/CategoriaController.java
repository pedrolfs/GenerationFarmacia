package com.generation.farmacia.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.generation.farmacia.model.Categoria;
import com.generation.farmacia.repository.CategoriaRepository;

/**@author Cesar, Pedro Lucas
 * @version v1 - Desenvolvimento Controller Categoria (adição de getAll, getbyId e getNomecategoria)
 * @since 25/01/2022 
 * */ 

public class CategoriaController {

	
	private CategoriaRepository repository;
	
	public ResponseEntity<List<Categoria>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	public ResponseEntity<Categoria> GetById(@PathVariable long idCategoria) {
		return repository.findById(idCategoria).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	public ResponseEntity<List<Categoria>> GetByNomecategoria (@PathVariable String nomecategoria) {
		return ResponseEntity.ok(repository.findAllByNomeCategoriaCotainingIgnoreCase(nomecategoria));
	}
	
	
	public ResponseEntity<Categoria> post(@RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	
	public ResponseEntity<Categoria> put(@RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
