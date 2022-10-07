package br.com.diego.cadastroapi.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Entity
public class Produtos {
	
	@Id()
	@GeneratedValue
	private int codigo_produto;
	
	@NotBlank
	private String nome;
	
	
	@Min(value = 0)
	private double valor;
	
	@Min(value = 0)
	private int quantidade;
	
	public Produtos() {
		
	}



	public Produtos( @NotBlank String nome, @Min(0) double valor, @Min(0) int quantidade) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}



	public int getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(int condigo_produto) {
		this.codigo_produto = condigo_produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
