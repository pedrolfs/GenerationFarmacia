package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.farmacia.model.Produto;

/**
 * @author Pedro Lucas
 * @version 0.0.1
 * @since 0.0.1 - 25/01/2022 
 * 
 * Produto Repository com método de busca por nome do produto com base em uma string.
 * 
 * */

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase (String nomeProduto);
}
