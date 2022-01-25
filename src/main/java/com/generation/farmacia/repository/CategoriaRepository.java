package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Categoria;

/**@author Cesar / Pedro
 * @version v2 (Desenvolvimento Repository Categoria: parâmetros de JpaRepository, query method e anotação) 
 * @since 25/01/2022 
 * */

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByNomeCategoriaCotainingIgnoreCase (String nomeCategoria);
}
