package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmacia.model.Categoria;

/**@author Cesar
 * @version v1 (Desenvolvimento Repository Categoria - parâmetros de JpaRepository e query method) 
 * @since 25/01/2022 
 * */

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByNomeCategoriaCotainingIgnoreCase (String nomeCategoria);
}
