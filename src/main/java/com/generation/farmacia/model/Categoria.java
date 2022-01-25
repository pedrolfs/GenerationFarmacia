package com.generation.farmacia.model;

/**	@author Cesar
 *  @version v1 (Desenvolvimento Model Categoria (atributos e getters and setters)
 *  @since 25/01/2022
 * */

public class Categoria {
	
	private long idCategoria;
	
	private String nomeCategoria;
	
	private String descricaoCategoria;

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	
	
	
}
