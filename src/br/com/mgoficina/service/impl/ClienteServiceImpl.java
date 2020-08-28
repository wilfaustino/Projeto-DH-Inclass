package br.com.mgoficina.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.service.IClienteService;

public class ClienteServiceImpl implements IClienteService {

	private Set<Cliente> clientes;
	
	public ClienteServiceImpl() {
		clientes = new TreeSet<Cliente>();
	}
	
	public ClienteServiceImpl(List<Cliente> clientes) {
		this.clientes = new TreeSet<>(clientes);
	} 
	
	@Override
	public Cliente create(Cliente cliente) {
		this.clientes.add(cliente);
		return cliente;
	}

	@Override
	public Cliente findClienteById(long id) {
		
		for(Cliente cliente: this.clientes) {
			if(cliente.getId() == id) {
				return cliente;
			}
		}
		
		return null;
	}

	@Override
	public Cliente findClienteByNome(String nome) {
		
		for(Cliente cliente: this.clientes) {
			if(cliente.getNome().equals(nome)) {
				return cliente;
			}
		}
		
		return null;
	}

	@Override
	public Set<Cliente> findAll() {
		return Collections.unmodifiableSet(this.clientes);
	}
	
	@Override
	public boolean updateCliente(Cliente cliente) {
		
		if(!this.clientes.contains(cliente))
			return false;
		
		this.clientes.remove(cliente);
		this.clientes.add(cliente);
					
		return true;
	}

	@Override
	public boolean deleteClienteByID(long id) {
		
		for(Cliente cliente: this.clientes) {
			if(cliente.getId() == id) {
				this.clientes.remove(cliente);
				return true;
			}
		}
		
		return false;
	}
	
}