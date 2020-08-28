package br.com.mgoficina.model;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import br.com.mgoficina.Enumerators.Sexo;

public class Funcionario extends Pessoa {
	
	private String cargo;
	private Set<Servico> listaDeServicos;

	public Funcionario(Long id, String nome, String cpf, int idade, Sexo sexo, String cargo) {
		super(id, nome, cpf, idade, sexo);
		this.cargo = cargo;
		this.listaDeServicos = new TreeSet<Servico>();
	}

	public Set<Servico> getListaDeServicos() {
		return Collections.unmodifiableSet(this.listaDeServicos);
	}

	public void setListaDeServicos(Servico servico) {
		this.listaDeServicos.add(servico);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
