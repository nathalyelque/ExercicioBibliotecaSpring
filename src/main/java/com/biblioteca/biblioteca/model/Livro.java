package com.biblioteca.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Livro")
public class Livro {
	
	@Id                                                         
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull                                                    
	@Size(min=2, max=200)
	private String nome;

	@NotNull
	private int numeroDaEdicao;

	@NotNull                                                    
	@Size(min=2, max=200)
	private String nomeDoAutor;

	@NotNull                                                    
	@Size(min=2, max=500)
	private String descricao;

	@NotNull                                                    
	@Size(min=2, max=200)
	private String nomeDaEditora;
	
	@NotNull                 
	private long isbn;

	@NotNull         
	private int quantidadeDePaginas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDaEdicao() {
		return numeroDaEdicao;
	}

	public void setNumeroDaEdicao(int numeroDaEdicao) {
		this.numeroDaEdicao = numeroDaEdicao;
	}

	public String getNomeDoAutor() {
		return nomeDoAutor;
	}

	public void setNomeDoAutor(String nomeDoAutor) {
		this.nomeDoAutor = nomeDoAutor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeDaEditora() {
		return nomeDaEditora;
	}

	public void setNomeDaEditora(String nomeDaEditora) {
		this.nomeDaEditora = nomeDaEditora;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public int getQuantidadeDePaginas() {
		return quantidadeDePaginas;
	}

	public void setQuantidadeDePaginas(int quantidadeDePaginas) {
		this.quantidadeDePaginas = quantidadeDePaginas;
	}
	
}
