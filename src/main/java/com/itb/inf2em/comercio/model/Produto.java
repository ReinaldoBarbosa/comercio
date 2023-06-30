package com.itb.inf2em.comercio.model;

public class Produto {
	private  Long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	private boolean status;
	
	
	//public: acesso liberdo para todas as classes 
	//private; Acesso liberado apenas dentro da propria classe, ou seja, apenas
	//					os metodos de referida classe tem acesso.~
	
	
	// Metodo Setter's - Atribuiu dados aos atributos
	
	//Id
	
	public void setId (Long id) {
		this.id = id;
	}
	
	public Long getId () {
		return id;
	}
	
	//Nome
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome () {
		return nome;
	}
	
	//Descrição
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao () {
		return descricao; 
	}
	
	//Codigo de Barras
	
	
	
	//Preço
	
	public void setPreco (double preco) {
		this.preco = preco;
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public boolean isStatus() {
		return status;
	}

	public double getPreco () {
		return preco; 
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
