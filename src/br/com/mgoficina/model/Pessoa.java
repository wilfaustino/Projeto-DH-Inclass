package br.com.mgoficina.model;

import br.com.mgoficina.Enumerators.Sexo;
import br.com.mgoficina.exceptions.NomeClienteErradoException;

public abstract class Pessoa {
	
	private long id;
	private String nome;
	private String cpf;
	private int idade;
	private Sexo sexo;
	
	public Pessoa(Long id, String nome, String cpf, int idade, Sexo sexo) throws NomeClienteErradoException {
		
		if(nome.trim().length() == 0) {
			throw new NomeClienteErradoException("Nome do cliente está errado!");
		}
		
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	
}
