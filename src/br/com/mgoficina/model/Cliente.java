package br.com.mgoficina.model;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.mgoficina.Enumerators.Sexo;

public class Cliente extends Pessoa {
	
	private Set<Veiculo> veiculos;
	
	public Cliente(Long id, String nome, String cpf, int idade, Sexo sexo) {
		super(id, nome, cpf, idade, sexo);
	}

	public Set<Veiculo> getVeiculos() {
		return Collections.unmodifiableSet(this.veiculos);
	}

	public void addVeiculos(Veiculo veiculos) {
		this.veiculos.add(veiculos);
	}
	
	public void removeVeiculos(Veiculo veiculos) {
		this.veiculos.remove(veiculos);
	}
	
}
