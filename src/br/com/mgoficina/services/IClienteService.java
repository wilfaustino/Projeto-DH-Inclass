package br.com.mgoficina.services;

import java.util.List;

import br.com.mgoficina.model.Cliente;

public interface IClienteService {

	public Cliente create(Cliente cliente);
	public Cliente findClienteById(int indice);
	public Cliente findClienteByNome(String nome);
	public List<Cliente> findAll();
	public boolean updateCliente(Cliente cliente);
	public boolean deleteCliente(int indice);
	
}