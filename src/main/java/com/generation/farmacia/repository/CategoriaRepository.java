package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Categoria;

/**
 * @author Cesar Augusto
 * @author Pedro Lucas
 * @version 0.0.1 
 * @since 0.0.1 - 25/01/2022 
 * 
 * Desenvolvimento Repository Categoria: parâmetros de JpaRepository, query method e anotação.
 * 
 * */

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByNomeCategoriaContainingIgnoreCase (String nomeCategoria);
}
